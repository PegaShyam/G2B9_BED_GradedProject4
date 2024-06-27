Screenshots of Operations:

1.Your application should be able to add roles in the database dynamically in the db.

Ex-
	{
    "name":"USER"
}
Where name specifies a role which can be assigned to a user that will be used for authentication purposes while interacting with the api.

![EMS 1 1](https://github.com/PegaShyam/G2B9_BED_GradedProject4/assets/106013711/516f370b-3f3e-4417-8871-98da3094d0af)

![EMS 1 2](https://github.com/PegaShyam/G2B9_BED_GradedProject4/assets/106013711/4e3fbefe-48ff-4f51-9847-db47e7de958e)

2. Your application should be able to add Users in the db which can be used for authentication purposes.

Ex-
	{
    "username":"temp",
    "password":"12345",
    "roles":[{
        "id":2,
        "name":"USER"
    }]
}

![EMS 2 1](https://github.com/PegaShyam/G2B9_BED_GradedProject4/assets/106013711/9771c402-e8f2-4dd5-9a65-f01829900145)

3. Now Your application should be able to add employees data in the db if and only if the authenticated user is ADMIN-
Ex-
	{
    "firstName":"gl",
    "lastName":"postman",
    "email":"postman@gamil.com"
}

![3 1](https://github.com/PegaShyam/G2B9_BED_GradedProject4/assets/106013711/a2fe82fe-29ab-460e-a1ca-a88e221f22fa)

When a user who is not an admin tries to add data :

![3 2](https://github.com/PegaShyam/G2B9_BED_GradedProject4/assets/106013711/6774c029-0fbf-4f6c-bf80-7b66e183d3b2)

4. Your application should provide an endpoint to list all the employees stored in the database.

Ex- 
	Response Body-
[
    {
        "id": 1,
        "firstName": "Ujjawal",
        "lastName": "Sharma",
        "email": "fdfdfd@gmail.com"
    },
    {
        "id": 2,
        "firstName": "temp",
        "lastName": "kaushik",
        "email": "jdfdkfdjj@gmail.com"
    },
    {
        "id": 3,
        "firstName": "postman",
        "lastName": "postman",
        "email": "postman@gamil.com"
    }
]

![4 1](https://github.com/PegaShyam/G2B9_BED_GradedProject4/assets/106013711/47ce9d70-7e45-4d86-88c0-c3e50f0bbeec)

5. Your application should provide endpoint to fetch or get an employee record specifically based on the id of that employee-

Ex- 	Url- http://localhost:8080/api/employees/3
	Response Body-
{
    "id": 3,
    "firstName": "postman",
    "lastName": "postman",
    "email": "postman@gamil.com"
}

![5 1](https://github.com/PegaShyam/G2B9_BED_GradedProject4/assets/106013711/dbc13af3-64e7-4c02-9f64-1478376999c0)

6. Your application should provide an endpoint to update an existing employee record with the given updated json object.

Ex-
	Object to be updated(raw->Json)- 
{
    "id":1,
    "firstName":"postman",
    "lastName":"postman",
    "email":"postman@gamil.com"
}

Response Body after updation-
{
    "id": 1,
    "firstName": "postman",
    "lastName": "postman",
    "email": "postman@gamil.com"
}

![6 1](https://github.com/PegaShyam/G2B9_BED_GradedProject4/assets/106013711/c88b0030-b180-4590-bc3a-1095730fde9b)

7. Your application should also provide an endpoint to delete an existing employee record based on the id of the employee-

Ex-
	Url- http://localhost:8080/api/employees/4
	Response Body-
"Deleted employee id - 4”

![7 1](https://github.com/PegaShyam/G2B9_BED_GradedProject4/assets/106013711/26db35f8-0b88-438a-bfda-0d0104413084)

8.  Your application should provide an endpoint to fetch an employee by his/her first name and if found more than one record then list them all-

Ex-
	Url- http://localhost:8080/api/employees/search/gl
	Response Body-
[
    {
        "id": 11,
        "firstName": "gl",
        "lastName": "postman",
        "email": "postman@gamil.com"
    }
]

![8 1](https://github.com/PegaShyam/G2B9_BED_GradedProject4/assets/106013711/400aac70-a77c-4172-a0d9-9afe0ea19201)

9. Your application should be able to list all employee records sorted on their first name in either ascending order or descending order .

Ex- 
	Url- http://localhost:8080/api/employees/sort?order=”asc”  
		   OR
	Url- http://localhost:8080/api/employees/sort?order=”desc”

Ascending:
![9 1](https://github.com/PegaShyam/G2B9_BED_GradedProject4/assets/106013711/1d241cc7-ba05-433d-8818-e96b152251a5)
Descending:
![9 2](https://github.com/PegaShyam/G2B9_BED_GradedProject4/assets/106013711/7bf50486-21d9-45dd-9cf7-a85f5da9f59f)






