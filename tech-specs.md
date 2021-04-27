# Rules-Test-Engine:

Conditional Rules uses “If This, Then That” statements to add intelligent automation into forms, guiding users of a form through a workflow depending on their context. The condition forms “If NO then add details below”. These conditional logics improve the speed and quality of data collection in the field by guiding the user through a workflow relevant to the job’s context and require less training and spend less time.

The Main features in our product includes:

• Create Rule
• “If” Statements
• “Then” Statements
• “Else” Statements
• “Else if” Statements

Front End: ReactJs, HTML, CSS

Back End: Java, Springboot

Database: MongoDB Atlas

SYSTEM FEATURE 1:

DESCRIPTION AND PRIORITY: Create Rule for Conditional Logic Rule

STIMULUS / RESPONSE SEQUENCES: Save the rule into DB and Assign ID which is Auto generated and store into the DataBase 

FUNCTIONAL REQUIREMENTS:
1) Click on the Add a Rule Button
2) Add Rule name
3) Select the IF, Then and ELSE statement from the drop down Provided

SYSTEM FEATURE 2:

DESCRIPTION AND PRIORITY: Conditional Rule statements (IF, Else, Else If) and operation/Operands (Less than, Greater, equals)

STIMULUS / RESPONSE SEQUENCES: Dropdown to select the Condition Statements and Operations/ Operands

FUNCTIONAL REQUIREMENTS: 	
1) User has to select from the dropdown (IF, If else, Else If) 
2) Then the textboxes will be showed up based on the selected rule
3) User enters the Values and selects the operations (Less than, equals, greater than) which needs to be executed. 
4) And the rule will be created and Selected in the Database.

SYSTEM FEATURE 3

DESCRIPTION AND PRIORITY: Testing or Executing the Rule

STIMULUS / RESPONSE SEQUENCES: Execute the Rule by API call and returns the output

FUNCTIONAL REQUIREMENTS:	
1) The User has to click the Test the Rule button.
2) The User has the drop down to select from the Auto generated IDs
3) Once the User selects the Rule Id, it will show up the Rule.
4) And to test the existing rule, Click on the “Execute Rule”
5) The output will be in the Boolean (Y or N)

______________________________________________________________________________________________________________________________________
ADDITIONAL NONFUNCTIONAL REQUIREMENTS

PERFORMANCE

SAFETY

SECURITY

SOFTWARE QUALITY

REQUIREMENTS OF EXTERNAL INTERFACE

USER INTERFACES

HARDWARE INTERFACES

SOFTWARE INTERFACES
   
COMMUNICATION INTERFACES

APPENDICES

APPENDIX A:  GLOSSARY OF TERMS
Define all terms and unique acronyms employed throughout document and specific to project.



APPENDIX B:  ANALYSIS DOCUMENTATION
List file / document names / provided links to all diagrams, models, additional findings pertinent to technical specification development.
	

APPENDIX C:  ISSUES
List all unresolved issues, TBDs, pending decisions, findings required, conflicts, etc.
