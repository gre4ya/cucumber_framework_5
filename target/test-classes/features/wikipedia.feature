Feature: Wikipedia Search
  Scenario: Validate Elon Musk search
  Given user navigates to "https://www.wikipedia.org/"
  When user searches for "Elon Musk" on Wikipedia
  Then user should see "Elon Musk" in the title
  And user should see "Elon Musk" in the url
  And user should see "Elon Musk" in the first heading