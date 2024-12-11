import { Component } from '@angular/core';
import { CustMatch } from '../UserProfile/userhome/CustMatch';
import { Router } from '@angular/router';

@Component({
  selector: 'app-matches',
  templateUrl: './matches.component.html',
  styleUrl: './matches.component.css'
})
export class MatchesComponent {

  u:CustMatch[]=[
    new CustMatch("Saina L", "1 Oct, 1998", "Bengaluru", "https://images.unsplash.com/photo-1524568537973-a13c60018cb3?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
    new CustMatch("Sneha A", "1 Apr, 2000", "Bengaluru", "https://images.unsplash.com/photo-1533689476487-034f57831a58?q=80&w=2071&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
    new CustMatch("Tina V", "1 Sept, 2002", "Bengaluru", "https://images.unsplash.com/photo-1438761681033-6461ffad8d80?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),

  ]

  constructor(private rout:Router){

    let storeEmail = localStorage.getItem("userEmail")

    if(storeEmail == "GUEST"){
      rout.navigateByUrl("/login")
    }

  }
}
