import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterFormComponent } from './Registration/register-form/register-form.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { LoginFormComponent } from './Login/login-form/login-form.component';
import { HomeComponent } from './Login/home/home.component';
import { HttpClientModule } from '@angular/common/http';
import { UserhomeComponent } from './UserProfile/userhome/userhome.component';
import { CreateProfileComponent } from './UserProfile/create-profile/create-profile.component';
import { ProfilePageComponent } from './UserProfile/profile-page/profile-page.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { MembershipComponent } from './membership/membership.component';
import { DefaultNavbarComponent } from './default-navbar/default-navbar.component';
import { UserNavbarComponent } from './UserProfile/user-navbar/user-navbar.component';
import { MatchesComponent } from './matches/matches.component';
import { FooterComponent } from './footer/footer.component';
import { UserProfileComponent } from './user-profile/user-profile.component';

@NgModule({
  declarations: [
    AppComponent,
    RegisterFormComponent,
    HomeComponent,
    LoginFormComponent,
    UserhomeComponent,
    CreateProfileComponent,
    ProfilePageComponent,
    ContactUsComponent,
    AboutUsComponent,
    MembershipComponent,
    DefaultNavbarComponent,
    UserNavbarComponent,
    MatchesComponent,
    FooterComponent,
    UserProfileComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    NgbModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
