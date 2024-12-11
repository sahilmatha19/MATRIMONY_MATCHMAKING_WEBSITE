import { HttpClient } from '@angular/common/http';
import { Component, } from '@angular/core';
import { Router } from '@angular/router';

import Swal from 'sweetalert2'

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrl: './login-form.component.css'
})
export class LoginFormComponent {

  Swal:any = ('sweetalert2')

  listOfData:any
  emailId:string = ""
  password:string = ""
  
  constructor(private http:HttpClient, private rout:Router){
    
    // Initialize localstorage variable 
    localStorage.setItem('userEmail', 'GUEST');
    this.handleLogin()
    
  }

  handleLogin(){
    this.http.get("http://localhost:8080/Customer/login/"+this.emailId+"/"+this.password).subscribe(
      data=>{
        console.log(data)
        this.listOfData = data

        if(this.listOfData != null){

          // Session assigned for user by emailId
          localStorage.setItem('userEmail', this.listOfData.emailId);

          this.rout.navigateByUrl('/uhome')
        }
        else{
          Swal.fire({
            title: "Login Failed",
            text: "Incorrect EmailId or Password. Try again.",
            icon: "warning"
          })
        }
        
      },error=>{
        console.log(error);
      }
    )
  }
}
