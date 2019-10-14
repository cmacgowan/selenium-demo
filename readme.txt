
Minnebar Selenium Demo Readme File
Automation Notes
Chris Macgowan (chris@macgowan.com)
18 Mar 2017
readme.txt


Description: 

The following are notes used during the building of the Selenium Demo for the MinneBar Demo. These notes were taken from the general notes (automation_minnebar_notes_20170318_1234.txt). 

A couple people have expressed interest in this project. These notes have been compiled for them. :--) 

Note:  This demo will logon to the MinneBar site with my username and password. We have changed the username and password in this file. You can try to create a username and password of your own or you can change the test. 

Another good test is to use the Google page, open google mail, then create a new good email account. This will require you to navigate three (3) pages. 

The following steps to create this demo are noted below: 

- Install Java SDK (not documented here)
- Install Maven
- Install IntelliJ
- Create a maven project using IntelliJ
- Selenium and Maven

Note: some of the documentation below is focused on my platform (Mac OSX) You can find documentation online to support all the processed on Windows or Linux. 

-----------------------------------------------------------------------------
Install Maven  

https://www.mkyong.com/maven/install-maven-on-mac-osx/

2. Install Maven Manually

After the upgrade of Mac OS X Mavericks, Maven was removed (no idea why). So, You have to install it manually.

2.1 – Download Maven
Download the Maven, for example apache-maven-3.1.1-bin.tar.gz. Extracts it,

tar -xvf apache-maven-3.1.1-bin.tar.gz

$pwd
/Users/mkyong/apache-maven-3.1.1

2.2 – Set Maven command in environment variable.
Update ~/. bash_profile – create this file if doesn’t exist.

$ vim ~/.bash_profile

~/.bash_profile

export M2_HOME=/Users/mkyong/apache-maven-3.1.1
export PATH=$PATH:$M2_HOME/bin

Restart the terminal. Test it.

$mvn -version

chrismac2:~ macgowan$ mvn -version
Apache Maven 3.3.9 (bb52d8502b132ec0a5a3f4c09453c07478323dc5; 2015-11-10T10:41:47-06:00)
Maven home: /Users/macgowan/apache-maven-3.3.9
Java version: 1.8.0_51, vendor: Oracle Corporation
Java home: /Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre
Default locale: en_US, platform encoding: UTF-8
OS name: "mac os x", version: "10.11.6", arch: "x86_64", family: "mac"
chrismac2:~ macgowan$ 

-----------------------------------------------------------------------------
Unsing IntelliJ 
Create a Maven Project 

So we have created the old hello world using maven. We followed some onf the steps below. 

Meet IntelliJ IDEA
https://www.jetbrains.com/help/idea/2017.1/meet-intellij-idea.html

https://www.jetbrains.com/help/idea/2017.1/creating-running-and-packaging-your-first-java-application.html

-----------------------------------------------------------------------------
Selenium and Maven

http://www.swtestacademy.com/quick-start-to-selenium-webdriver-with-java-junit-maven-intellij/

http://www.vineetmanohar.com/2009/11/3-ways-to-run-java-main-from-maven/

46.0 
Firefox Version 

We have the following version of Firefox installed on the Mac computer. Only the versions noted below will work with this test - due to driver issues. The application is appened with the version number. You will have to duplidate the app and then remove the version number to make it work.

Firefox_62.app (fail)
org.openqa.selenium.WebDriverException: Failed to connect to binary FirefoxBinary(/Applications/Firefox.app/Contents/MacOS/firefox-bin) on port 7055; process output follows:

Firefox_52.app (fail)
org.openqa.selenium.WebDriverException: Failed to connect to binary FirefoxBinary(/Applications/Firefox.app/Contents/MacOS/firefox-bin) on port 7055; process output follows:

Firefox_48.app (fail)
org.openqa.selenium.WebDriverException: Failed to connect to binary FirefoxBinary(/Applications/Firefox.app/Contents/MacOS/firefox-bin) on port 7055; process output follows:

Firefox_46.app (pass)

Radiohead - Creep (Mimi & Josefin) | Blind Auditions | The Voice Kids 2019 | SAT.1

Radiohead - Creep

Turns Out Radiohead’s ‘Creep’ Was Lifted from a 1972 Song by The Hollies

The Air That I Breathe By The Hollies

Olivia Newton-John - The Air That I Breathe






-----------------------------------------------------------------------------
Selenium and Cucumber 

http://blog.czeczotka.com/2014/07/22/cucumber-jvm-with-maven-in-minutes/

We are going to work on jamming Cucumber into the mix !!! 

mvn clean verify -DskipTests=false "-Dcucumber.options=--tags @odis-smoke-tests"

mvn clean verify -DskipTests=false "-Dcucumber.options=--tags @RegressionLogon"

<dependency>
    <groupId>info.cukes</groupId>
    <artifactId>cucumber-java</artifactId>
    <version>${cucumber.version}</version>
</dependency>
<dependency>
    <groupId>info.cukes</groupId>
    <artifactId>cucumber-junit</artifactId>
    <version>${cucumber.version}</version>
</dependency>
<dependency>
    <groupId>info.cukes</groupId>
    <artifactId>cucumber-spring</artifactId>
    <version>${cucumber.version}</version>
</dependency>
<dependency>
    <groupId>info.cukes</groupId>
    <artifactId>cucumber-html</artifactId>
    <version>0.2.3</version>
</dependency>




End of document

























