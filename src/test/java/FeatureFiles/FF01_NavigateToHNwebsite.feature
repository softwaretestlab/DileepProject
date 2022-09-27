#Gherkins Language
 # while writing steps we have to start with below keywords
#  Given
#  when
#  Then
#  And
#  But
#  *
  @all
  Feature: HN Hompage
    @smokeTest
    Scenario: Navigate to HN website
      Given open the browser and enter url and navigate to HN website
      Then get the title and assert
@RegressionTest
    Scenario: Navigate to HN website
      Given open the browser and enter url and navigate to HN website
      Then get the title and assert



