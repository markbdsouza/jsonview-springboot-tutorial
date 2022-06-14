# jsonview-springboot-tutorial
A tutorial for JsonView annotation by Jackson in Spring Boot 
Entire tutorial can be found at : 

## Endpoints for Unit Testing
Below are the endpoints for testing.

### Level 1 
GET and POST for a single Class with multiple views
1.HTTP GET Request: http://localhost:8080/levelOne/default 
Response:
   {
   "userId": 1,
   "firstName": "Mark",
   "lastName": "Dsouza",
   "email": "mark.benjamin.dsouza@google.com",
   "organization": "DEV.TO",
   "isActive": true
   }

2. HTTP GET Request: http://localhost:8080/levelOne/public
Response:
   {
   "userId": 1
   }
   
3. HTTP GET Request: http://localhost:8080/levelOne/name
Response:
   {
   "userId": 1,
   "firstName": "Mark",
   "lastName": "Dsouza"
   }
   
4. HTTP GET Request: http://localhost:8080/levelOne/details
Response:
   {
   "userId": 1,
   "firstName": "Mark",
   "lastName": "Dsouza",
   "email": "mark.benjamin.dsouza@google.com",
   "organization": "DEV.TO"
   }

5. HTTP GET Request: http://localhost:8080/levelOne/other
Response:
   {
   "userId": 1,
   "email": "mark.benjamin.dsouza@google.com",
   "organization": "DEV.TO"
   }
   
6. HTTP POST Request: http://localhost:8080/levelOne/default
Request Body :
   {
   "userId": 1,
   "firstName": "Mark",
   "lastName": "Dsouza",
   "email": "mark.benjamin.dsouza@google.com",
   "organization": "DEV.TO",
   "isActive": true
   }
Response:
   {
   "userId": 1,
   "firstName": "Mark",
   "lastName": "Dsouza",
   "email": "mark.benjamin.dsouza@google.com",
   "organization": "DEV.TO",
   "isActive": true
   }
   
7. HTTP POST Request: http://localhost:8080/levelOne/name
Request Body :
   {
   "userId": 1,
   "firstName": "Mark",
   "lastName": "Dsouza",
   "email": "mark.benjamin.dsouza@google.com",
   "organization": "DEV.TO",
   "isActive": true
   } 
Response:
   {
   "userId": 1,
   "firstName": "Mark",
   "lastName": "Dsouza",
   "email": null,
   "organization": null,
   "isActive": null
   }

### Level 2
GET and POST for a multiple Classes with multiple views
1. HTTP GET Request: http://localhost:8080/levelTwo/default
Response:
   {
   "fullName": "Mark Dsouza",
   "height": 150,
   "weight": 49,
   "age": 15,
   "className": "VIII",
   "scores": [
   {
   "subject": "Math",
   "score": 80,
   "teacher": "Mr. John Watts"
   },
   {
   "subject": "English",
   "score": 80,
   "teacher": "Mrs. Mary Johnson"
   }
   ],
   "school": {
   "schoolName": "Indian Public School"
   }
   }
   
2. HTTP GET Request: http://localhost:8080/levelTwo/public
Response:
   {
   "fullName": "Mark Dsouza",
   "age": 15
   }
   
3. HTTP GET Request: http://localhost:8080/levelTwo/basic
Response:
   {
   "fullName": "Mark Dsouza",
   "height": 150,
   "weight": 49,
   "age": 15,
   "className": "VIII",
   "school": {
   "schoolName": "Indian Public School"
   }
   }
   
4. HTTP GET Request: http://localhost:8080/levelTwo/all
Response:
   {
   "fullName": "Mark Dsouza",
   "height": 150,
   "weight": 49,
   "age": 15,
   "className": "VIII",
   "scores": [
   {
   "subject": "Math",
   "score": 80
   },
   {
   "subject": "English",
   "score": 80
   }
   ],
   "school": {
   "schoolName": "Indian Public School"
   }
   }
   
5. HTTP POST Request: http://localhost:8080/levelTwo/default
Request Body:
   {
   "fullName": "Mark Dsouza",
   "height": 150,
   "weight": 49,
   "age": 15,
   "className": "VIII",
   "scores": [
   {
   "subject": "Math",
   "score": 80,
   "teacher": "Mr. John Watts"
   },
   {
   "subject": "English",
   "score": 80,
   "teacher": "Mrs. Mary Johnson"
   }
   ],
   "school": {
   "schoolName": "Indian Public School"
   }
   }
   
Response Body:
   {
   "fullName": "Mark Dsouza",
   "height": 150.0,
   "weight": 49.0,
   "age": 15,
   "className": "VIII",
   "scores": [
   {
   "subject": "Math",
   "score": 80,
   "teacher": "Mr. John Watts"
   },
   {
   "subject": "English",
   "score": 80,
   "teacher": "Mrs. Mary Johnson"
   }
   ],
   "school": {
   "schoolName": "Indian Public School"
   }
   }

6. HTTP POST Request: http://localhost:8080/levelTwo/public
Request Body:    {
   "fullName": "Mark Dsouza",
   "height": 150,
   "weight": 49,
   "age": 15,
   "className": "VIII",
   "scores": [
   {
   "subject": "Math",
   "score": 80,
   "teacher": "Mr. John Watts"
   },
   {
   "subject": "English",
   "score": 80,
   "teacher": "Mrs. Mary Johnson"
   }
   ],
   "school": {
   "schoolName": "Indian Public School"
   }
   }
   
Response:
   {
   "fullName": "Mark Dsouza",
   "height": 0.0,
   "weight": 0.0,
   "age": 15,
   "className": null,
   "scores": null,
   "school": null
   }

### Level 3
GET Call with entities. Data fetched from the H2 Database using Spring Data JPA.
1. HTTP GET Request: http://localhost:8080/levelThree/default
Response: [
   {
   "id": 1,
   "customerId": "6252fcab-a17e-4af4-aa70-0fda826e67cf",
   "firstName": "Dorine",
   "lastName": "McGrouther"
   },
   {
   "id": 2,
   "customerId": "f787ce02-06b7-4fc6-be83-408c652e924b",
   "firstName": "Gerianna",
   "lastName": "Capstack"
   },
   {
   "id": 3,
   "customerId": "4ac787e6-2534-43ea-a86e-16957b7410a2",
   "firstName": "Rosemarie",
   "lastName": "Salerno"
   },
   {
   "id": 4,
   "customerId": "493cf683-6d31-441b-bac8-52e78d800016",
   "firstName": "Averell",
   "lastName": "Polle"
   },
   {
   "id": 5,
   "customerId": "c93a656d-eff3-4c77-a8e0-5f29214c2b51",
   "firstName": "Griffy",
   "lastName": "Crownshaw"
   }
   ]
   
2. HTTP GET Request: http://localhost:8080/levelThree/public
Response:
   [
   {
   "customerId": "6252fcab-a17e-4af4-aa70-0fda826e67cf"
   },
   {
   "customerId": "f787ce02-06b7-4fc6-be83-408c652e924b"
   },
   {
   "customerId": "4ac787e6-2534-43ea-a86e-16957b7410a2"
   },
   {
   "customerId": "493cf683-6d31-441b-bac8-52e78d800016"
   },
   {
   "customerId": "c93a656d-eff3-4c77-a8e0-5f29214c2b51"
   }
   ]
   
3. HTTP GET Request: http://localhost:8080/levelThree/details
Response:
   [
   {
   "customerId": "6252fcab-a17e-4af4-aa70-0fda826e67cf",
   "firstName": "Dorine",
   "lastName": "McGrouther"
   },
   {
   "customerId": "f787ce02-06b7-4fc6-be83-408c652e924b",
   "firstName": "Gerianna",
   "lastName": "Capstack"
   },
   {
   "customerId": "4ac787e6-2534-43ea-a86e-16957b7410a2",
   "firstName": "Rosemarie",
   "lastName": "Salerno"
   },
   {
   "customerId": "493cf683-6d31-441b-bac8-52e78d800016",
   "firstName": "Averell",
   "lastName": "Polle"
   },
   {
   "customerId": "c93a656d-eff3-4c77-a8e0-5f29214c2b51",
   "firstName": "Griffy",
   "lastName": "Crownshaw"
   }
   ]
   