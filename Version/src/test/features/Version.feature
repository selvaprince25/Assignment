@VersionFeature
  Feature: Search based on environment

    Scenario Outline: Version name to be found
      Given User on Microtracker Page
      When User gives the environment name <environment>
      Then The user will land on result page
      Examples:
        | environment |
        | "Qa1"       |


    Scenario Outline: Mismatch of version in any two environment
      Given User must be on Microtracker Page
      When User gives the two environment name <enviroment1> <enviroment2>
      Then The reults will be loaded
      Examples:
        | enviroment1 | enviroment2 |
        |"Qa1"        |"QA2"        |


    Scenario Outline: To find whether environment contains SNAPSHOT
      Given User should be in the Microtracker Page
      When User gives the environment name as <environment>
      Then User will land on the result page
      Examples:
        | environment |
     #  |"Qa1"        |
        |"QA2"        |
       #|"Preprod"        |



