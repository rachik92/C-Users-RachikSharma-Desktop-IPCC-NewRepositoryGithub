Feature: Google Search Functionality

  Background: Open browser and navigate to Google
    Given User navigates to OLA homepage

  @OLA1
  Scenario Outline: User validates the Name field on Contact Us page
    And User enter the value in the Name field "<Value>"
    Then Click on the Submit button

    Examples: 
      | Value                                                                                                            |
      | Ravhdgjgskjgksdkhskhdshfhkhfhshakjshfdkahsdfhaskhfkahsfksahfsakfhaskhfdksahfkaskhfksahfkhsakfdhakjshfdkashfdkjhs |

  @OLA2
  Scenario Outline: User validates the email field on Contact Us page
    And User enter the value in the email field "<Value1>"
    Then Click on the Submit button

    Examples: 
      | Value1           |
      | rachik@gmail.com |

  @OLA3
  Scenario Outline: User validates the Company Name field on Contact Us page
    And User enter the value in the Company Name field "<Value2>"
    Then Click on the Submit button

    Examples: 
      | Value2              |
      | N@sgfh&ijnmfhfkdmdi |

  @OLA4
  Scenario Outline: User validates the Phone Number field on Contact Us page
    And User enter the value in the Phone Number field "<Value3>"
    Then Click on the Submit button

    Examples: 
      | Value3     |
      | 0989876509 |

  @OLA5
  Scenario Outline: User validates the Comments field on Contact Us page
    And User enter the value in the Comments field "<Value4>"
    Then Click on the Submit button

    Examples: 
      | Value4              |
      | This is new comment |
