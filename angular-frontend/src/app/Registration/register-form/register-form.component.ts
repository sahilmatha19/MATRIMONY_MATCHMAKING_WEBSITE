import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

import Swal from 'sweetalert2'

// import Swal from 'sweetalert2/dist/sweetalert2.js'
// import 'sweetalert2/src/sweetalert2.scss'

@Component({
  selector: 'app-register-form',
  templateUrl: './register-form.component.html',
  styleUrl: './register-form.component.css'
})
export class RegisterFormComponent {

  Swal:any = ('sweetalert2')

  myForm:FormGroup = new FormGroup({
    fullName:new FormControl("", [Validators.required]),
    password: new FormControl("", [Validators.required, Validators.pattern(/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/)]),
    emailId: new FormControl("", [Validators.required, Validators.pattern(/^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/)]),
    mobileNo: new FormControl("", [Validators.required, Validators.pattern(/^\d{10}$/)]),
    gender: new FormControl("", [Validators.required])
  })

  get inputFullName():any{
    return this.myForm.get("fullName")
  }

  get inputPassword():any{
    return this.myForm.get("password")
  }

  get inputEmailId():any{
    return this.myForm.get("emailId")
  }

  get inputMobileNo():any{
    return this.myForm.get("mobileNo")
  }

  get inputGender():any{
    return this.myForm.get("gender")
  }

  constructor(private http:HttpClient, private rout:Router){
    this.handleRegister()
  }

  handleRegister(){
      this.http.post("http://localhost:8080/Customer/add-user", this.myForm.value).subscribe(
        (data:any)=>{
          console.log(data); 

          if(data == 1){
            this.rout.navigateByUrl('/login')
            console.log(data); 
          }
          else{
            Swal.fire({
              title: "Try Logging in",
              text: "User Id already exists",
              icon: "warning"
            });
          }

        },error=>{
          console.log(error);
        }
      )
    }
}