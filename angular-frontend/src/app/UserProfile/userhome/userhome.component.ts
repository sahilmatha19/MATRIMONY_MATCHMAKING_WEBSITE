import { Component, OnInit } from '@angular/core';
import { CustMatch } from './CustMatch';
import { Router } from '@angular/router';
import { ProfilePage } from '../profile-page/ProfilePage';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import Swal from 'sweetalert2'

@Component({
  selector: 'app-userhome',
  templateUrl: './userhome.component.html',
  styleUrl: './userhome.component.css'
})
export class UserhomeComponent implements OnInit{
  Swal:any = ('sweetalert2')
  profiles:ProfilePage[] = []
  customerGender:string | undefined
  storeEmail: any;
  user: any 

  // usr:CustMatch[]=[
  //   new CustMatch("Neha P", "1 Jan, 1999", "Bengaluru", "https://images.unsplash.com/photo-1534180477871-5d6cc81f3920?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
  //   new CustMatch("Sania B", "1 July, 2000", "Bengaluru", "https://images.unsplash.com/photo-1519648023493-d82b5f8d7b8a?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
  //   new CustMatch("Minakshi S", "1 Feb, 2001", "Bengaluru", "https://images.unsplash.com/photo-1627900352514-7f8bbb3f5edb?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
  //   new CustMatch("Saina L", "1 Oct, 1998", "Bengaluru", "https://images.unsplash.com/photo-1524568537973-a13c60018cb3?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
  //   new CustMatch("Sneha A", "1 Apr, 2000", "Bengaluru", "https://images.unsplash.com/photo-1533689476487-034f57831a58?q=80&w=2071&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
  //   new CustMatch("Tina V", "1 Sept, 2002", "Bengaluru", "https://images.unsplash.com/photo-1438761681033-6461ffad8d80?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),

  // ]

  constructor(private http: HttpClient, private rout:Router){

    // Get EmailId from localStorage (from Login)
    this.storeEmail = localStorage.getItem("userEmail")
      if(this.storeEmail == "GUEST"){
        rout.navigateByUrl("/login")
      }      
      
  }

  
  ngOnInit(): void {
    this.searchById()
  }


  searchByGender(gender: string) {
    console.log(gender)
    console.log(this.user.gender)
      return this.http.get<ProfilePage[]>("http://localhost:8080/Customer/search-by-gender/"+gender).subscribe(
        (data) => {
          console.log(data)
          this.profiles = data
        },
        (error) => {
          console.error('Error fetching customers', error);
        }
      );
  }
  


  searchById(){
    console.log("store email",this.storeEmail)
    this.http.get("http://localhost:8080/Customer/search-by-id/"+this.storeEmail).subscribe(
      data=>{
        this.user = data
        console.log(this.user)
        
        this.searchByGender(this.user.gender)

      },error=>{
        console.log(error);
      }
    )
  }


  handleShowInterest(forEmailId:string){
    console.log(this.storeEmail)
    console.log(forEmailId)

    this.http.post("http://localhost:8080/Match/add-match/"+this.storeEmail+"/"+forEmailId, null).subscribe(
      (data:any)=>{
        console.log(data); 
      }

    )
    Swal.fire({
      title: "Request Sent.",
      text: "Please wait for the user to reply to your request",
      icon: "success"
    })
  }

  handleViewUser(emailId:string){
    this.rout.navigate(['/user-profile', emailId]);
  }

}
