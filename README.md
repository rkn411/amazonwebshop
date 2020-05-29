# amazonwebshop-cucumber-bdd-api-java-maven
This framework can be used for Automating WebApps, using BDD approach with TestNg Framework.

# Environment Setup:
Install Java JDK/JRE should be 8
Install Maven 
Install "cucumber" using eclipse marketplace"
Install Eclipse IDE "oxygen"  or lesser but not latest.
Install command using "mvn clean install -P jenkins"

# Plugins :
Configure and Install Following Plugins
1.Help>>Install new software *Cucumber for Java http://cucumber.github.com/cucumber-eclipse/update-site.  
2.Navigate to jenkins home and click on "Manage jenkins" tab
3.Now click on "Manage plugins"
4.In "Available plugins" tab, perform serach for "Pipeline Maven Integration" and install


# Run tests:
Project link :https://github.com/rkn411/amazonwebshop.git
Clone or import project /Download as zip.
>Navigate to project root.
>>mvn clean
>>mvn install

or 
Right Click on TestRunner class and Click Run As > TestNg Test


# View HTML Report
HTML report will be generated once execution finish---- /reports/cucumber-reports/cucumber-html-reports
Open Index.html in browser to see the reports

# Adding Git repo to jenkins 
Navigate to "Manage jenkins->Configure System" and in Github section configure github credentials

# Cucumber integration with CI/CD jenkins

Download latest jenkins.war Jenkins download link  https://updates.jenkins-ci.org/download/war/
Start jenkins.jar on default port using command 'java -jar jenkins.war'
Start jenkins.jar on specific port using command 'java -jar jenkins.war --httpPort=portnumber'
Open localhost:portnumber and login using displayed insructions on browser screens
Now install all default plugin and set user & password

Jenkins pipeline can create by scheduling job and 
Adding Maven build actions 
## mvn test -Dcucumber.options="--tags @acceptance"


# References
https://cucumber.io/docs/guides/api-automation/  
https://dzone.com/articles/cucumber-selenium-jenkins-integration

