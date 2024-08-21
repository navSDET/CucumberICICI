Feature:ICIC Bank

  @Integration
  Scenario:ICICI Bank Car Loan
    Given User enters Application URL
    When  User enters car loan in search box
    And   User clicks on calculator button
    Then  User navigates to 1 page
    And   User enters loan 210000
    And   User Enters rate of 9.45
    And   User enters tenure as 3
#    Then  User prints respective values
