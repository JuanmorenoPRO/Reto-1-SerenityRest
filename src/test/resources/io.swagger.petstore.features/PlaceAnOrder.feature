Feature: Place an order service
  Scenario: Successful order for a pet
    Given  A user send the request to place an order for pet in the endpoint "https://petstore.swagger.io/v2/store/order"
      |id|257|
      |petId|242|
      |quantity|23|
      |shipDate|2021-08-30T01:27:58.820Z|
      |status|placed|
      |complete|true|


    Then Validate in the response that the status code is 200
    And Validate in the response that the response contains the key "status" must be "placed"
    And Validate in the response that the response  "complete" must be true