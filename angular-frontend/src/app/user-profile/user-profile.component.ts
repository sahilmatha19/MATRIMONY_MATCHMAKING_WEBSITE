import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-user-profile',
  templateUrl: './user-profile.component.html',
  styleUrl: './user-profile.component.css'
})

export class UserProfileComponent implements OnInit{
  Swal:any = ('sweetalert2')
  user : any
  storeEmail : any
  profileUser : any
  emailId:string | null = null

  constructor(private http: HttpClient, private rout: Router, private route: ActivatedRoute){

    // Get EmailId from localStorage (from Login)
    this.storeEmail = localStorage.getItem("userEmail")
      if(this.storeEmail == "GUEST"){
        rout.navigateByUrl("/login")
      }
  }
  
  ngOnInit(): void {
    this.emailId = this.route.snapshot.paramMap.get('emailId');
    console.log(this.emailId)
    if (this.emailId) {
      this.http.get("http://localhost:8080/Customer/search-by-id/"+this.emailId).subscribe(
        data => {
          this.profileUser = data;
        },
        error => {
          console.error('Error fetching user data', error);
        }
      );
    }
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
  
}
