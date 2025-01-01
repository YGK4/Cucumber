Feature: Login functionality with multiple users
 Scenario: Login with multiple user credentials
    Given Launch the browser
    And Click on the login button
    When Enter login details for the following users:
      | username         | password     |
      | barney@gmail.com | banrey@123   |
      | alice@gmail.com  | alice@456    |
      | john@gmail.com   | john@789     |
    Then Close the browser
    
    Scenario: Login with invalid user
    Given launch "url"
    And Click "xpath" "data"
    And Click
    And Enter
    
    

