
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginForm!:FormGroup;



  
  //private status: Status = new Status;

  constructor(private router:Router,private loginService:LoginService, private formBuilder: FormBuilder) { 
    console.log("Inside Login Component")
    
  }

 

  onLogIn(){
     
   
    this.loginService.getJwtToken(this.username,this.password).subscribe(
      (res)=>{
        // console.log(res)
       
        this.router.navigate(['/home'])
      },
      (err)=>{
        this.message = "Invalid credentials!!!";
      }
    )
  }



  ngOnInit(): void {

    this.loginForm=this.formBuilder.group({
      username: ['', [Validators.required,Validators.minLength(3)]],
      password:['', [Validators.required,Validators.minLength(3)]]
    });
  }

}
