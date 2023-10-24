Feature: Post feature of facebook
  This will test functionality at the user wall
  Background: This is for common steps
    Given User should be logged in and should be present at its own wall

  Scenario: Post a message on user wall
    When I type the message as "My post" in the text box
    And Click on post Button
    Then the message should get posted

  Scenario: Post a video on user wall
    When User supply the youTube link as "https://www.google.com" in the text box
    And Click on the post button
    Then Then video should get posted on the user wall
    And the video should have proper thumbnail.