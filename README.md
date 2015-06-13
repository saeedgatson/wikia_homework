Wikia Homework
==============

*This code was quickly written in my spare time as part of the [Wikia][1] interview process*

Test written in Java using Selenium 2, TestNG, & Maven as part of the Wikia homework

To get started, make sure you have JDK 1.6+ installed, and download Maven 3.2+.

You can run the test from the command line by following these steps:

1. Go to the projects root directory.
2. run ‘mvn clean’
3. run ‘mvn compile’
4. run ‘mvn test’

The calls can also be made in one line like this: `mvn clean install`

Run test in Chrome from command line by doing the following:

1. Go to projects root directory.
2. run 'mvn clean'
3. run 'mvn compile'
4. run 'mvn test -DTestProps.browser=chrome'

The one line call is: `mvn clean install -DTestProps.browser=chrome`

[1]: http://www.wikia.com/About
