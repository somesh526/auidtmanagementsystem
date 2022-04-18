import { HttpClient, HttpHeaders } from '@angular/common/http';
// import { Token } from '@angular/compiler';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
// import AuditDetail from './models/AuditDetail';
import { AuthRequest } from './models/AuthRequest';
import { Question } from './models/Questions';
// import { RequestHeaderForResult } from './models/RequestHeaderForResult';
import { Result } from './models/Result';
import { Test } from './models/Test';
import { ValidateResponse } from './models/ValidatedResponse';


@Injectable({
  providedIn: 'root'
})
export class LoginService {
  
  

  test1 : Test | null = null;

  tok : string = "";

  userName:string = "";

  constructor(private httpClient:HttpClient){}

  user:AuthRequest={
    userName:'',
    password:''
  }

  setRequestBody(test:Test){
    this.test1 = test
  }


  getUsername(){
    return this.userName
  }

  setUsername(username:string){
    this.userName = username
  }

  getJwtToken(username:string,password:string){
   
    return this.httpClient.post(this.url,this.user,{ responseType : 'text'});
  }

  getQuestions(type:string):Observable<Question[]>{
    return this.httpClient.get<Question[]>(this.urlForChecklist+"/"+type,{headers:{'Authorization':'Bearer 'sss)}})
  }

  getValidatationResponse():Observable<ValidateResponse>{
    return this.httpClient.get<ValidateResponse>(this.validationUrl,{headers:{'Authorization':'Bearer 'sss)}})
  }

  getFinalRes():Observable<Result>{
    console.log(this.test1)
    return this.httpClient.post<Result>(this.urlForResult,this.test1,{headers:{'Authorization':'Bearer 'sss)}})
  }

  getResponses():Observable<Result[]>{
     return this.httpClient.get<Result[]>(this.responseUrl,{headers:{'Authorization':'Bearer 'sss)}})
  }

  
}
