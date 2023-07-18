Feature: Value Verification

  Scenario: Verify Value I
    Given I am on the relevant page
    Then I should see the value "Value I" as "$122,365.24"

  Scenario: Verify Value 2
    Given I am on the relevant page
    Then I should see the value "Value 2" as "$599.00"

  Scenario: Verify Value 3
    Given I am on the relevant page
    Then I should see the value "Value 3" as "$850,139.99"

  Scenario: Verify Value 4
    Given I am on the relevant page
    Then I should see the value "Value 4" as "$23,329.50"

  Scenario: Verify Value 5
    Given I am on the relevant page
    Then I should see the value "Value 5" as "$566.27"

  Scenario: Verify Total Balance
    Given I am on the relevant page
    Then I should see the value "Total Balance" as "$1,000,000.00"