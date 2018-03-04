Feature: annotation
#This is how background can be used to eliminate duplicate steps
Background:  
User navigate to facebook
Given I am a facebook user


#Test case 1
#Scenerio with AND Annotation
Scenerio:
When I enter username a "groovyminstrel@yahoo.com"

And I enter password as "mondee"

Then Login should fail


#Test Case 2
#Scenerio with BUT Annotation
Scenerio:
When I enter username as "groovyminstrel@yahoo.com"
And I enter password as "LSGmonday"
Then Login should fail
But Relogin page option should be available
