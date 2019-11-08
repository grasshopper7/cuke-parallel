Feature: Scenario Outline Only

  Scenario Outline: Scenario Outline 2
    Given this is "<num> EXAMPLE FIRST" step
    When this is "<num> EXAMPLE SECOND" step

    Examples: 
      | num    |
      | FIRST  |
      | SECOND |