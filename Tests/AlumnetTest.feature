Feature: Alumnet application testing

Scenario: Alumnet Login Text

Given user opens Alumnet login page
Then user enters loginid
Then user enters password
And user clicks on sign in button
And close the browser


Scenario: Alumnet login title page

Given user opens Alumnet login page
Then get the title of Alumnet login page and verify
And close the browser

