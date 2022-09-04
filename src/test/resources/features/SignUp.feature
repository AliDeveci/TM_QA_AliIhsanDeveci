@signUp
Feature: TransferMate Sign up functionality
  User Story: As a user, I should be able to sign up for TransferMate.

  Background: For the scenarios in the feature file, user is expected to be on Sign up page
    Given user is on the TransferMate Sign up page

  @positive #@wip
  Scenario: Sign up functionality with valid credentials in Education account verification
    When user clicks "Education" radio button
    And user selects Ireland on Country registration
    And user clicks First Name and enters "Jack"
    And user clicks Last Name and enters "Sparrow"
    And user clicks Email address and enters "jacks@happy.com"
    And user selects Ireland on Mobile Phone registration
    And user clicks Mobile Phone and enters "12345678"
    And user clicks Terms of Use and Privacy Policy checkbox
    And user clicks hear about news and offers checkbox
    And user enters the captcha result
    And user clicks open my free account submit button
    Then user lands on email and mobile number verification page


  @positive #@wip
  Scenario Outline: Sign up functionality with valid credentials in Individual account verification
    When user clicks "Individual" radio button
    And user selects Ireland on Nationality registration
    And user clicks First Name and enters "<firstname>"
    And user clicks Last Name and enters "<lastname>"
    And user clicks Email address and enters "<email>"
    And user selects Ireland on Mobile Phone registration
    And user clicks Mobile Phone and enters "12345678"
    And user clicks Terms of Use and Privacy Policy checkbox
    And user enters the captcha result
    And user clicks open my free account submit button
    Then user lands on email and mobile number verification page

    Examples: Sign up credentials we are going to use in this scenario
      | firstname | lastname | email               |
      | Alex      | Green    | a@happy.com |

  @positive @wip
  Scenario Outline: Sign up functionality with valid credentials in Corporate account verification
    When user clicks "Corporate" radio button
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
      | Alex      | Yellow   | al@happy.com |

  @positive #@wip
  Scenario Outline: Sign up functionality with valid credentials in Partnership account verification
    When user clicks "Partnership" radio button
    And user selects Ireland on Country of incorporation registration
    And user clicks First Name and enters "<firstname>"
    And user clicks Last Name and enters "<lastname>"
    And user clicks Email address and enters "<email>"
    And user selects Ireland on Mobile Phone registration
    And user clicks Mobile Phone and enters "12345678"
    And user clicks Terms of Use and Privacy Policy checkbox
    And user enters the captcha result
    And user clicks open my free account submit button
    Then user lands on email and mobile number verification page

    Examples: Sign up credentials we are going to use in this scenario
      | firstname | lastname | email               |
      | Alex      | Black    | alexblack@happy.com |

  @positive #@wip
  Scenario Outline: Sign up functionality with valid credentials in Sole Trader account verification
    When user clicks "Sole Trader" radio button
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

  @negative #@wip
  Scenario Outline: Sign up functionality with invalid credential in Education account verification
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
    Then user sees please enter correct information message on incorrect blank

    Examples: Sign up credentials we are going to use in this scenario
      | firstname | lastname | email               |
      | $23yyy!qw | Lastname | firstlast@happy.com |

  @negative #@wip
  Scenario Outline: Sign up functionality with invalid credential in Individual account verification
    When user clicks "Individual" radio button
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
    Then user sees please enter correct information message on incorrect blank

    Examples: Sign up credentials we are going to use in this scenario
      | firstname | lastname  | email               |
      | Alex      | $23yyy!qw | alexgreen@happy.com |

  @negative #@wip
  Scenario Outline: Sign up functionality with invalid credential in Corporate account verification
    When user clicks "Corporate" radio button
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
    Then user sees please enter correct information message on incorrect blank

    Examples: Sign up credentials we are going to use in this scenario
      | firstname | lastname | email          |
      | Alex      | Yellow   | Idon'tUseEmail |

  @negative #@wip
  Scenario Outline: Sign up functionality with invalid credential in Partnership account verification
    When user clicks "Partnership" radio button
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
    Then user sees please enter correct information message on incorrect blank

    Examples: Sign up credentials we are going to use in this scenario
      | firstname | lastname | email               |
      | Alex      | Black    | alexblack@happy.com |

  @negative #@wip
  Scenario Outline: Sign up functionality with invalid credential in Sole Trader account verification
    When user clicks "Sole Trader" radio button
    And user selects Ireland on Country of incorporation registration
    And user clicks First Name and enters "<firstname>"
    And user clicks Last Name and enters "<lastname>"
    And user clicks Email address and enters "<email>"
    And user selects Ireland on Mobile Phone registration
    And user clicks Mobile Phone and enters "12345678"
    And user clicks hear about news and offers checkbox
    And user enters the captcha result
    And user clicks open my free account submit button
    Then user can not move forward

    Examples: Sign up credentials we are going to use in this scenario
      | firstname | lastname | email               |
      | Alex      | White    | alexwhite@happy.com |

  @negative #@wip
  Scenario Outline: After some Sign up credentials are entered when user clicks refresh button, user sees warning
  message verification
    When user clicks "Sole Trader" radio button
    And user selects Ireland on Country of incorporation registration
    And user clicks First Name and enters "<firstname>"
    And user clicks Last Name and enters "<lastname>"
    And user clicks Email address and enters "<email>"
    And user clicks refresh button
    Then user sees a javascript alert

    Examples: Sign up credentials we are going to use in this scenario
      | firstname | lastname | email               |
      | Alex      | White    | alexwhite@happy.com |

  @negative #@wip
  Scenario Outline: After some Sign up credentials are entered when user clicks close button, user sees warning
  message verification
    When user clicks "Education" radio button
    And user selects Ireland on Country of incorporation registration
    And user clicks First Name and enters "<firstname>"
    And user clicks Last Name and enters "<lastname>"
    And user clicks Email address and enters "<email>"

    And user clicks close button
    Then user sees a javascript alert

    Examples: Sign up credentials we are going to use in this scenario
      | firstname | lastname | email               |
      | Alex      | White    | alexwhite@happy.com |

  @positive #@wip
  Scenario: When user clicks on "TransferMate Global Payments" user lands on home page, then when clicks on
  "Sign up" user lands on Sign up page verification
    When user clicks on TransferMate button
    And user lands on home page
    And user clicks on Sign up button
    Then user lands on Sign up page