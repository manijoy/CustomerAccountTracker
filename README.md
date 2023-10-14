# CustomerAccountTracker
Customer Account Tracker

Learning Case Study

A Leading private bank looking for solution to track customers and their account details. As part of requirements, the below mentioned specification has been given to the partner to implement.

Requirements Specification:

1. Able to create new account for a customer (only one account type /customer)

a. Account type may be savings (Individual/joint) & current etc. 2. Able to edit customer personal detalls 3. Able to fetch one or more customer personal detalls including account details too

4. Customers can transfer funds from one account to another account, if enough fund exists

5. Refer Appendix for more details

Expected Deliverables

1. Maven project-solution code base, unit test scripts, pom.xml & properties file(s) 2. Read Me file (read.txt)-Explaining end points

3. Test cases execution log report-Unit Test for End Points & Services Maven test report)

Note: Find below recommended naming conventions to consider

1. groupid: <ADID> <phase> <project>

2.

Example: avitepa foundation.bank <ADID> <casestudy>

Example: AVITEPA bank

artifactid:

Steps to follow / Check point for self-review (indicative only)

A. Set up Dev environment Note: You may refer the WASP portal https://wasp.wipro.com/esd to get the required

software/tools

1. Git Version 2-

2. OpenJDK Version 8+

3. Maven Version 3-

4. Spring Tool Suite (OR You may use any alternative (DE) 5. You may use H2 DB (or MySQL Workbench Version 8.0.CE)

5. Getting started with Creating Spring Boot Application 1. Configure pom.xml with all required dependencies

2. Configure application.properties (server port, DB details, logging and any other)

3. Configure application-integrationtest.properties (for testing)

C. Build your solution with suitable design/sequence of steps with your plan /assumptions 1. Identify Model(s) and configure attributes with JPA 2.

Create Repository Interface and test sample CRUD operations for identified Model(s)

Test for Empty records Test for saving

Test for findAll Iv. Test for findByld

v. Test for findBy<Any>

Test for deleteByld VIL Test for deleteAll

vill. Test for update <using serialized field>

Ix. Test for update using non-serialized field>

Note: If required append/define customized method with Query

3. Create "@RestController and test for all identified end points

Create methods for all identified end points

Test all end points with hard coded Response body

a) Test for GetMapping

a. for String b. Object

d. ResponseEntity<HttpStatus>

b) Test for PostMapping c) Test for PutMapping

d) Test for DeleteMapping

4. Create

a) Login to https://topgear-training-altlab.wipro.com

"Service" and test for all identified business requirements

Create Interface and declare all required methods

Implement a class with business logic

Test for identified services

5. Integrate "@RestController". "Service" and "Repository"

Replace hardcoded data in "@RestController" with service(s) execution Re-Test your end point execution

Run the application

a) Test with Postman

b) Rest client (optional)

c) UI (optional)

Iv. Build package with maven a) Check/review your test log

b) Run jar file and validate completeness & correctness of solution

5. Share your code base with below options

if you were able to connect wipro network

b) Create new project c) Push your code

d) Give permission to "AVITEPA"

