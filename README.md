# DollarShaveClubTest
Test for dollar shave club

#Maven
Make sure maven is installed on your machine

http://maven.apache.org/download.cgi

----------------------------------------
#Configuration
-- Url: Url for the Test
-- Driver: firefox

-----------------------------------------
#How to execute a specific test
  open a terminal or command line: 
  
  cd into the dir of the test Example: cd Documents/TrueCar
  
  Hit the enter key.
  
  type or Copy into termainal or window:

    mvn clean test -DsiteUrl=https://www.dollarshaveclub.com/our-products -Ddriver=firefox

-------------------------------------------

#View Results
  cd into the dir of the test Example: cd Documents/DollarShaveClubTest/target/surefire-reports
  
  open DollarShaveClubFeTest.txt

-------------------------------------------

