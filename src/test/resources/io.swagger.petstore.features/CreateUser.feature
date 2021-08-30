
 Feature: Create user service
   Scenario: Successful creation of a user in petStore
     Given  A user send the request to create a new user in the endpoint "https://petstore.swagger.io/v2/user"
     |id|2115|
     |username|Juancholo|
     |firstName|Juan|
     |lastName|Moreno|
     |email|juanpa6474@gmail.com|
     |password|12345678|
     |phone|3103876637|

     Then Validate that the status code is 200
     And Validate that the response contains the key "type" must be "unknown"
     And Validate that the response  "message" must be "2115"


