import { Component, Host, OnInit } from '@angular/core';
import { TestBed } from '@angular/core/testing';
import { Router } from '@angular/router';
import { LoginService } from '../login.service';
import { Result } from '../models/Result';
import { Test } from '../models/Test';
import { ValidateResponse } from '../models/ValidatedResponse';

@Component({
  selector: 'app-result',
  templateUrl: './result.component.html',
  styleUrls: ['./result.component.css']
})
export class ResultComponent implements OnInit {
    
  result:Result={
   
  }
  currentUser:string = "";

  constructor(private router:Router,private loginservice:LoginService) {
    console.log("Inside result Component")

    this.loginservice.getFinalRes().subscribe(
      (res)=>{
        console.log(res)
        this.result = res
      }
       ,(err)=>{
      
        this.router.navigate(['audittype'])
       }
    )
  }

  ngOnInit(): void {
  }

  logout(){
   
    this.router.navigate(['login'])
  }

  goBackToChecklist(){
   
    this.router.navigate(['/audittype'])
  }

  backToHome(){
    
  }
  

}
