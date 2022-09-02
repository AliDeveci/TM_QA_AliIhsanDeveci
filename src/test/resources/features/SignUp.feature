@signUp
Feature: TransferMate Sign up functionality
  User Story: As a user, I should be able to sign up for TransferMate.

  Background: For the scenarios in the feature file, user is expected to be on Sign up page
    Given user is on the TransferMate Sign up page
@positive @wip
  Scenario Outline: Sign up functionality with valid credentials in Education account verification
    When user clicks "Education" radio button
    And user selects Ireland on Country registration
    And user clicks First Name and enters "<firstname>"
    And user clicks Last Name and enters "<lastname>"
    And user clicks Email address and enters "<email>"
    And user selects Ireland on Mobile Phone registration
    And user clicks Mobile Phone and enters "12345678"
    And user clicks Terms of Use and Privacy Policy checkbox
    And user clicks hear about news and offers checkbox
    And user enters the captcha result
    And user clicks open my free account submit button
    Then user lands on email and mobile number verification page

    Examples: Sign up credentials we are going to use in this scenario
      | firstname | lastname | email               |
      | Firstname | Lastname | firstlast@happy.com |

  @positive
  Scenario Outline: Sign up functionality with valid credentials in Individual account verification
    When user clicks Individual radio button
    And user selects Ireland on Nationality registration
    And user clicks First Name and enters "<firstname>"
    And user clicks Last Name and enters "<lastname>"
    And user clicks Email address and enters "<email>"
    And user selects Ireland on Mobile Phone registration
    And user clicks Mobile Phone and enters "12345678"
    And user clicks Terms of Use and Privacy Policy checkbox
    And user does not click hear about news and offers checkbox
    And user enters the captcha result
    And user clicks open my free account submit button
    Then user lands on email and mobile number verification page

    Examples: Sign up credentials we are going to use in this scenario
      | firstname | lastname | email               |
      | Alex      | Green    | alexgreen@happy.com |

  @positive
  Scenario Outline: Sign up functionality with valid credentials in Corporate account verification
    When user clicks Corporate radio button
    And user selects Ireland on Country of incorporation registration
    And user clicks First Name and enters "<firstname>"
    And user clicks Last Name and enters "<lastname>"
    And user clicks Email address and enters "<email>"
    And user selects Ireland on Mobile Phone registration
    And user clicks Mobile Phone and enters "12345678"
    And user clicks Terms of Use and Privacy Policy checkbox
    And user clicks hear about news and offers checkbox
    And user enters the captcha result
    And user clicks open my free account submit button
    Then user lands on email and mobile number verification page

    Examples: Sign up credentials we are going to use in this scenario
      | firstname | lastname | email                |
      | Alex      | Yellow   | alexyellow@happy.com |

  @positive
  Scenario Outline: Sign up functionality with valid credentials in Partnership account verification
    When user clicks Partnership radio button
    And user selects Ireland on Country of incorporation registration
    And user clicks First Name and enters "<firstname>"
    And user clicks Last Name and enters "<lastname>"
    And user clicks Email address and enters "<email>"
    And user selects Ireland on Mobile Phone registration
    And user clicks Mobile Phone and enters "12345678"
    And user clicks Terms of Use and Privacy Policy checkbox
    And user does not click hear about news and offers checkbox
    And user enters the captcha result
    And user clicks open my free account submit button
    Then user lands on email and mobile number verification page

    Examples: Sign up credentials we are going to use in this scenario
      | firstname | lastname | email               |
      | Alex      | Black    | alexblack@happy.com |

  @positive
  Scenario Outline: Sign up functionality with valid credentials in Sole Trader account verification
    When user clicks Sole Trader radio button
    And user selects Ireland on Country of incorporation registration
    And user clicks First Name and enters "<firstname>"
    And user clicks Last Name and enters "<lastname>"
    And user clicks Email address and enters "<email>"
    And user selects Ireland on Mobile Phone registration
    And user clicks Mobile Phone and enters "12345678"
    And user clicks Terms of Use and Privacy Policy checkbox
    And user clicks hear about news and offers checkbox
    And user enters the captcha result
    And user clicks open my free account submit button
    Then user lands on email and mobile number verification page

    Examples: Sign up credentials we are going to use in this scenario
      | firstname | lastname | email               |
      | Alex      | White    | alexwhite@happy.com |
@negative
  Scenario Outline: Sign up functionality with invalid credential in Education account verification
    When user clicks Education radio button
    And user selects Ireland on Country registration
    And user clicks First Name and enters "<firstname>"
    And user clicks Last Name and enters "<lastname>"
    And user clicks Email address and enters "<email>"
    And user selects Ireland on Mobile Phone registration
    And user clicks Mobile Phone and enters "12345678"
    And user clicks Terms of Use and Privacy Policy checkbox
    And user clicks hear about news and offers checkbox
    And user enters the captcha result
    And user clicks open my free account submit button
    Then user sees please enter correct information message on First Name

    Examples: Sign up credentials we are going to use in this scenario
      | firstname | lastname | email               |
      | $23yyy!qw | Lastname | firstlast@happy.com |

  Scenario Outline: Sign up functionality with invalid credential in Individual account verification
    When user clicks Individual radio button
    And user selects Ireland on Nationality registration
    And user clicks First Name and enters "<firstname>"
    And user clicks Last Name and enters "<lastname>"
    And user clicks Email address and enters "<email>"
    And user selects Ireland on Mobile Phone registration
    And user clicks Mobile Phone and enters "12345678"
    And user clicks Terms of Use and Privacy Policy checkbox
    And user clicks hear about news and offers checkbox
    And user enters the captcha result
    And user clicks open my free account submit button
    Then user sees please enter correct information message on Last Name

    Examples: Sign up credentials we are going to use in this scenario
      | firstname | lastname  | email               |
      | Alex      | $23yyy!qw | alexgreen@happy.com |

  Scenario Outline: Sign up functionality with invalid credential in Corporate account verification
    When user clicks Corporate radio button
    And user selects Ireland on Country of incorporation registration
    And user clicks First Name and enters "<firstname>"
    And user clicks Last Name and enters "<lastname>"
    And user clicks Email address and enters "<email>"
    And user selects Ireland on Mobile Phone registration
    And user clicks Mobile Phone and enters "12345678"
    And user clicks Terms of Use and Privacy Policy checkbox
    And user clicks hear about news and offers checkbox
    And user enters the captcha result
    And user clicks open my free account submit button
    Then user sees please enter correct information message on Email

    Examples: Sign up credentials we are going to use in this scenario
      | firstname | lastname | email          |
      | Alex      | Yellow   | Idon'tUseEmail |

  Scenario Outline: Sign up functionality with invalid credential in Partnership account verification
    When user clicks Partnership radio button
    And user selects Ireland on Country of incorporation registration
    And user clicks First Name and enters "<firstname>"
    And user clicks Last Name and enters "<lastname>"
    And user clicks Email address and enters "<email>"
    And user selects Ireland on Mobile Phone registration
    And user clicks Mobile Phone and enters "Idon'tUseMobilePhone"
    And user clicks Terms of Use and Privacy Policy checkbox
    And user clicks hear about news and offers checkbox
    And user enters the captcha result
    And user clicks open my free account submit button
    Then user sees please enter correct information message on Mobile Phone

    Examples: Sign up credentials we are going to use in this scenario
      | firstname | lastname | email               |
      | Alex      | Black    | alexblack@happy.com |

  Scenario Outline: Sign up functionality with invalid credential in Sole Trader account verification
    When user clicks Sole Trader radio button
    And user selects Ireland on Country of incorporation registration
    And user clicks First Name and enters "<firstname>"
    And user clicks Last Name and enters "<lastname>"
    And user clicks Email address and enters "<email>"
    And user selects Ireland on Mobile Phone registration
    And user clicks Mobile Phone and enters "12345678"
    And user does not click Terms of Use and Privacy Policy checkbox
    And user clicks hear about news and offers checkbox
    And user enters the captcha result
    And user clicks open my free account submit button
    Then user sees red lined check box and can not move forward

    Examples: Sign up credentials we are going to use in this scenario
      | firstname | lastname | email               |
      | Alex      | White    | alexwhite@happy.com |

  Scenario Outline: After Sign up credentials are entered when user clicks refresh button, user sees warning
  message verification
    When user clicks Sole Trader radio button
    And user selects Ireland on Country of incorporation registration
    And user clicks First Name and enters "<firstname>"
    And user clicks Last Name and enters "<lastname>"
    And user clicks Email address and enters "<email>"
    And user selects Ireland on Mobile Phone registration
    And user clicks Mobile Phone and enters "12345678"
    And user clicks Terms of Use and Privacy Policy checkbox
    And user clicks hear about news and offers checkbox
    And user enters the captcha result
    And user clicks refresh button
    Then user sees a javascript alert

    Examples: Sign up credentials we are going to use in this scenario
      | firstname | lastname | email               |
      | Alex      | White    | alexwhite@happy.com |

  Scenario Outline: After Sign up credentials are entered when user clicks close button, user sees warning
  message verification
    When user clicks Sole Trader radio button
    And user selects Ireland on Country of incorporation registration
    And user clicks First Name and enters "<firstname>"
    And user clicks Last Name and enters "<lastname>"
    And user clicks Email address and enters "<email>"
    And user selects Ireland on Mobile Phone registration
    And user clicks Mobile Phone and enters "12345678"
    And user clicks Terms of Use and Privacy Policy checkbox
    And user clicks hear about news and offers checkbox
    And user enters the captcha result
    And user clicks close button
    Then user sees a javascript alert

    Examples: Sign up credentials we are going to use in this scenario
      | firstname | lastname | email               |
      | Alex      | White    | alexwhite@happy.com |

  Scenario: When user clicks on "TransferMate Global Payments" user lands on home page, then when clicks on
  "Sign up" user lands on Sign up page verification
    When user clicks on TransferMate button
    And user lands on home page
    And user clicks on Sign up button
    Then user lands on Sign up page