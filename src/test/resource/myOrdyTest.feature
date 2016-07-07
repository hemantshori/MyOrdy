Feature: To test different ordering combinations of myordy ordering system

  Scenario Outline: single menu item order submission
    Given I am  on "<Shop>" POS
    And I click on "<Menu>" option
    And I click on Menu item category "<Menu_Item_Category>"
    And I click on "<Product>" button
    And I click on "Add to Cart" button
    And I click on "Submit Order" button
    And I click on "Search Order" button

    Examples: 
      | Shop       | Menu   | Menu_Item_Category | Product | amount | Order_Total |
      | Sylvesters | Pickup | Side Orders        | Chips   | $6.00  | $6.00       |

Scenario Outline: Customer Search by phone number
    Given I am  on "<Shop>" POS
    And I click on "Customer" option
    And I enter "<customerPhone>" details as "<customerPhoneNO>"
    And I click on "Search" button
    Then I should view message "<Message>"

    Examples: 
      | Shop       | customerPhone | customerPhoneNO | Message                            |
      | Sylvesters | customerPhone | 123456          | Good Guys Murray Road Preston 3072 |

  Scenario Outline: Customer Search by Customer Name
    Given I am  on "<Shop>" POS
    And I click on "Customer" option
    And I enter "<customerName>" details as "<NameOfCustomer>"
    And I click on "Search" button
    Then I should view message "<Message>"

    Examples: 
      | Shop       | customerName | NameOfCustomer | Message                         |
      | Sylvesters | customerName | Jiten          | 3 Bedford Street Reservoir 3073 |
