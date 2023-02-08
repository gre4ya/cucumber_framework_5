Feature: Etsy header elements

  Scenario: Validating Etsy header elements
    Given user navigates to "https://www.etsy.com/"
    Then user should see header elements as below
      | Gifts for Every Valentine | Jewelry & Accessories | Clothing & Shoes | Home & Living | Wedding & Party | Toys & Entertainment | Art & Collectibles | Craft Supplies | Gifts & Gift Cards |
