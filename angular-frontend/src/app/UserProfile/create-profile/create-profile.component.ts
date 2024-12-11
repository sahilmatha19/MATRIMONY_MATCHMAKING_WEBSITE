import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-profile',
  templateUrl: './create-profile.component.html',
  styleUrl: './create-profile.component.css'
})
export class CreateProfileComponent {

  listOfData:any[] = []

  myForm:FormGroup = new FormGroup({
    fullName:new FormControl(""),
    mobileNo: new FormControl("", [Validators.pattern(/^\d{10}$/)]),
    dob: new FormControl("", [Validators.required]),
    religion: new FormControl("", [Validators.required]),
    caste: new FormControl("", [Validators.required]),
    motherTongue: new FormControl("", [Validators.required]),
    maritalStatus: new FormControl("", [Validators.required]),
    familyStatus: new FormControl("", [Validators.required]),
    familyType: new FormControl("", [Validators.required]),
    height: new FormControl("", [Validators.required]),
    anyDisability: new FormControl("", [Validators.required]),
    city: new FormControl("", [Validators.required]),
    state: new FormControl("", [Validators.required]),
    country: new FormControl("", [Validators.required]),
    qualification: new FormControl("", [Validators.required]),
    occupation: new FormControl("", [Validators.required]),
    annualIncome: new FormControl("", [Validators.required]),
    hobbies: new FormControl("", [Validators.required]),
    aboutUser: new FormControl("", [Validators.required, Validators.minLength(30)]),
    profilePhoto: new FormControl("", [Validators.required])
  })


  // constructor(private http:HttpClient, private rout:Router){
  //   this.showAllData()
  // }

  handleSubmit(){
    console.log(this.myForm.value);
    
    // this.http.put("http://localhost:8080/Customer/update-profile", this.myForm.value).subscribe(
    //   (data:any)=>{
    //     console.log(data);
        
    //     this.rout.navigateByUrl('/profile')
    //     this.showAllData()

    //   },error=>{
    //     alert("Error...")
    //     console.log(error);
    //   }
    // )
  }

  // showAllData(){
  //   this.http.get<any[]>("http://localhost:8080/Customer/show-all").subscribe(
  //     data=>{
  //       console.log(data);
  //       this.listOfData = data

  //     },error=>{
  //       console.log(error);
  //     }
  //   )
  // }
}
