Feature: Category
  As an User
  Can get the category
  Can create new category and delete category

  Scenario: GET - Get all categories
    Given I set GET api endpoints all category
    When I send GET HTTP Request
    Then I receive valid HTTP response code 200
    And I receive valid data

  Scenario: GET - Get category by ID
    Given I set GET api endpoints category by ID
    When I send GET HTTP Request
    Then I receive valid HTTP response code 200
    And I receive valid data

  Scenario: GET - Get category by invalid ID
    Given I set GET api endpoints category by invalid ID
    When I send GET HTTP Request
    Then I receive valid HTTP response code 400
    And I not receive valid data

  Scenario: POST - Post create a category
    Given I set POST api endpoint new category
    When I send POST HTTP request
    Then I receive Post valid HTTP response code 200
    And I receive valid data post

  Scenario: POST - Post create a new category with invalid data
    Given I set POST api endpoint invalid new category
    When I send POST HTTP request invalid
    Then I receive valid HTTP response code 500
    And I not receive valid data post

  Scenario: Delete - Delete a category
    Given I set DELETE api endpoint
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 200 for delete