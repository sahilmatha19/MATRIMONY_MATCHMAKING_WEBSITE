import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormControl, FormGroup, NgForm, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { ProfilePage } from './ProfilePage';

@Component({
  selector: 'app-profile-page',
  templateUrl: './profile-page.component.html',
  styleUrl: './profile-page.component.css'
})
export class ProfilePageComponent {

  user:any = ""
  storeEmail:any;
  profilePhoto:string | undefined
  profilePhotoValue: any;

  constructor(private http:HttpClient, private rout:Router){

     this.storeEmail = localStorage.getItem("userEmail")
    console.log(this.storeEmail)
    
    if(this.storeEmail == "GUEST"){
      rout.navigateByUrl("/login")
    }
    
    this.searchById()
  }
  
  handleSubmit(myFormFromHtml:NgForm){
    console.log(myFormFromHtml.value);
    
    this.http.put("http://localhost:8080/Customer/update-profile", myFormFromHtml.value).subscribe(
      (data:any)=>{
        console.log(data);
        
        this.rout.navigateByUrl('/profile')    

      },error=>{
        alert("Error...")
        console.log(error);
      }
    )
  }

  handleProfilePhotoUpdate(ppForm:NgForm){
    console.log("Store Email For PP : "+this.storeEmail)
    console.log(ppForm.value.profilePhoto)
    this.http.put("http://localhost:8080/Customer/update-profile-photo/"+this.storeEmail+"/"+ppForm.value.profilePhoto, this.storeEmail, ppForm.value.profilePhoto).subscribe(
      (data:any)=>{
        console.log(data);
        
        this.rout.navigateByUrl('/profile')    

      },error=>{
        alert("Error...")
        console.log(error);
      }
    )
    window.location.reload();
  }
  
  searchById(){
    console.log("store email",this.storeEmail)
    this.http.get("http://localhost:8080/Customer/search-by-id/"+this.storeEmail).subscribe(
      data=>{
        console.log(data);
        this.user = data

      },error=>{
        console.log(error);
      }
    )
  }
}
