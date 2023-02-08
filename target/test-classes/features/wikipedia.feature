Feature: Wikipedia Search

  Scenario Outline: Validate Elon Musk search
  Given user navigates to "https://www.wikipedia.org/"
  When user searches for "<name>" on Wikipedia
  Then user should see "<name>" in the title
  And user should see "<name>" in the url
  And user should see "<name>" in the first heading

  Examples:
    |name|
    |Elon Musk|
    |Bill Gates|
    |Johnny Depp|
