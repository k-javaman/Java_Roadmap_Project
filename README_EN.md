# Java Developer Roadmap Website

This project is a roadmap for Java developers which I compiled while teaching myself Java. It is meant to guide you on what to learn and in what order. The website was developed in two weeks, and there is still plenty of room for improvement. Therefore, if you notice anything that could be improved, your feedback is most welcome!

> **Note:** The arrangement of resources and order of study were done by me, but the content was written by GPT-4. So i hope you would understand if ther is something unnatural in this website.
## Stack

- Frontend: HTML, CSS, Bootstrap
- Backend: Java, Spring Boot, Thymeleaf, Maven
- Deployment: AWS Beanstalk

## Lessons Learned

Through this project, I learned the following:

1. How to use Bootstrap modals and integrate them with Spring Boot. [link](https://medium.com/@kjavaman12/how-to-apply-bootstrap-modal-in-thymeleaf-439a37ac1b9d)
2. How to layout a site with Bootstrap.
3. The importance of setting up a project correctly from the start. I started this project with Bootstrap4 and i wanted to update it to version 5. but some features became deactivated so it got confuseed
4. The need for Test-Driven Development (TDD), as I noticed how easily errors can accumulate, especially when i try to implement the code from chatgpt4.
5. How to implement Exception Code, using GlobalExceptionHandler and ResourceNotFoundException to intricate specific information (later i will add 400, 403 errors more after i studied about the process of exception more)
6. How to handle localization, and i found that to process localization with thymeleaf - messages.properties is better than create en/ ko/ folder and connect the folder with languagecode. cause i used languagecode without enough knowledgement so it has found the en/css/styles.css file not /css/styles.css file. That's not what i've expected!  
7. I wanted to use LocaleChangeInterceptor and addInterceptors to handle localization but it got error so i use AcceptHeaderResolver which sets the language automatically by Accept-Language
8. The importance of naming conventions. Actually i just named like 'NavbarController' but i cannot find the intention of that controller easily at a glance. So i changed like 'PageViewController'
9. The importance of committing changes frequently. So i will commit everytime i add new features otherwise i have to press ctrl+z a lot of times and waste of a lot of time.

## Future Goals

In future CRUD projects, I plan to:

1. Learn HTML and CSS in-depth.
2. Apply Test-Driven Development (TDD).
3. Apply principles of clean code.
4. Learn and apply refactoring techniques.
5. Learn and apply design patterns.
6. Use MySQL.
7. Use Querydsl.
8. Write API specifications with Swagger.
9. Implement a payment feature.
10. Learn debugging techniques.
11. Implement paging and sorting features.
12. Document projects with Notion.
13. Use Spring JPA.
14. Use Spring Security.

