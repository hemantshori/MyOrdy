Feature: To test different ordering combinations of myordy ordering system

  Scenario Outline: Create a new customer and do a search on newly created customer
    Given I am  on "<Shop>" POS
    And I click on "Customer" option
    And I click on " New" button
    And I enter "<customerNameDetail>" details as "<NameOfNewCustomer>"
    And I enter "<customerEmail>" details as "<CustomerEmail>"
    And I click on "Save Customer" button
    And I enter "<customerPhone>" details as "<customerPhoneNO>"
    And I click on "Search" button
    Then I should view message "<Message>"

    Examples: 
      | Shop       | customerNameDetail | NameOfNewCustomer | customerEmail | CustomerEmail           |customerName|Message|
      | Sylvesters | customerNameDetail | HemantTest        | customerEmail | CustomerEmail@gmail.com |HemantTest|HemantTest|
