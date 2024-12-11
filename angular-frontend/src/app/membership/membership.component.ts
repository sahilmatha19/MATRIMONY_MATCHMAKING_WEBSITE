import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-membership',
  templateUrl: './membership.component.html',
  styleUrl: './membership.component.css'
})
export class MembershipComponent {

  constructor(private rout:Router){

    let storeEmail = localStorage.getItem("userEmail")

    if(storeEmail == "GUEST"){
      rout.navigateByUrl("/login")
    }

  }

  plans = [
   
    {
      name: 'SILVER',
      duration: '120 Days',
      features: [
        'Connect seamlessly with your chosen matches',
        'Access verified mobile numbers',
        'Send unlimited messages',
        'View profiles within 180-day days' 
      ],
      total: 'INR 2000',
      discount: '25% Discount',
      price: '₹ 1500'
    },
    {
      name: 'GOLD',
      duration: '240 Days',
      features: [
        'Connect with your preferred matches',
        'Contact verified mobile numbers',
        'View profiles within 240 days',
        'Send unlimited messages',
      ],
      total: 'INR 3000',
      discount: '33.5% Discount',
      price: '₹ 1995'
    },
    {
      name: 'DIAMOND',
      duration: '365 Days',
      features: [
        'Connect with your preferred matches',
        'Contact verified mobile numbers',
        'View profiles within 240 days',
        'Send unlimited messages'
      ],
      total: 'INR 6000',
      discount: '50% Discount',
      price: '₹ 3000'
    },
  ];
}
