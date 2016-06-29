  Feature: To test different ordering combinations of myordy ordering system

  Scenario Outline: single menu item order submission
    Given I am  on "<Shop>" POS
    And I click on "<Menu>" option
    And I click on Menu item category "<Menu_Item_Category>" 
    And I click on "<Product>" button
    And I click on "Add to Cart" button
    And I click on "Submit Order" button
    And I click on "Search Order" button
    And I click on "Search" button 
    
    Examples: 
      | Shop       | Menu   | Menu_Item_Category | Product | amount | Order_Total |
      | Sylvesters | Pickup | Side Orders        | Chips   | $6.00  | $6.00  |

       
  
  
  
  
  
  