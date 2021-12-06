Feature: Google Search
Background:
Given Open Browser
And enter URL
@Smoke
Scenario:Google Search Valid
When user give valid input
Then Field should accept
@FT
Scenario:Google Search Invalid
When User give invalid input
Then Field should not accept
