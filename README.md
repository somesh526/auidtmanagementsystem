## AuidtManagementSystem
Web Application to automate the Audit Processing and provide organization to track and maintain records easily.

<div align="center" width="500">
 <img src="https://github.com/somesh526/auidtmanagementsystem/blob/main/AuditManagementPortal.gif" alt="application execution video!" width="900"/>
 </div>

### Development
> This Project is developed on **Microservices Architecture** where each service has its own functionality to automates the audit processing.
> 
> App provides a check list of questions(survey) based on user inputs and audit type, status of audit will be displayed for a particular project.
> 
> Implemented **JWT** Authentication to authorize, authenticate User and exchange information across the application. 
> 
> Backend of the application where each microservices are built on using **SpringBoot**.
>  * Used **Spring JPA** to process queries and transactions on the objects against the database.
>  * Implemented Circuit Breakers and FallBack mechanisms (**Spring Cloud** Functions) to make application Resilient
>  * API Endpoints are created to access the data using **Spring REST**.
>  * Implemented **Spring Security** to config the endpoints across each microservice.
>  
>  Frontend of the application is built on **Angular**.
>  * Developed individual components for each functionality and detection of change is captured via Event, Data, Two-way Binding.
>  * Implemented angular routes to navigate across the app.
>  * Implemented auth guards to secure the app.
>  
> Followed all Coding Best Practices and Implemented **Swagger** for API Documentation.
