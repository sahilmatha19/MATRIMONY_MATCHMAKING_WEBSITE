import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegisterFormComponent } from './Registration/register-form/register-form.component';
import { HomeComponent } from './Login/home/home.component';
import { LoginFormComponent } from './Login/login-form/login-form.component';
import { UserhomeComponent } from './UserProfile/userhome/userhome.component';
import { ProfilePageComponent } from './UserProfile/profile-page/profile-page.component';
import { CreateProfileComponent } from './UserProfile/create-profile/create-profile.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { MembershipComponent } from './membership/membership.component';
import { MatchesComponent } from './matches/matches.component';
import { UserProfileComponent } from './user-profile/user-profile.component';


const routes: Routes = [
  {path:"", component:HomeComponent},
  {path:"home", component:HomeComponent},
  {path:"login", component:LoginFormComponent},
  {path:"register", component:RegisterFormComponent},
  {path:"uhome", component:UserhomeComponent},
  {path:"profile", component:ProfilePageComponent},
  {path:"createProfile", component:CreateProfileComponent},
  {path:"contUs", component:ContactUsComponent},
  {path:"aboutUs", component:AboutUsComponent},
  {path:"membership", component:MembershipComponent},
  {path:"matches", component:MatchesComponent},
  {path:"user-profile/:emailId", component:UserProfileComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
