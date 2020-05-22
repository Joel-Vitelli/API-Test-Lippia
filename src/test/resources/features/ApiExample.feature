Feature: Api example
  As an api user I want to execute request in order to get proper responses

  @Example
  Scenario Outline: Example scenario for get user data
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then I will get the proper status code '<statusCode>'
    And The proper 'id' '<id>' returned in the response

    Examples:
      | jsonName    | statusCode | id | operation | entity |
      | exampleGET  | 200        | 1  | GET       | USER   |

