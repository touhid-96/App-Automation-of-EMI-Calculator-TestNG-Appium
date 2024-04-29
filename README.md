# App Automation of EMI Calculator Using Selenium, TestNG & Appium

## Steps
- Open EMI Calculator App
- Navigate to the EMI calculator activity
- Input necessary fields
- Click on calculate button
- Verify the result data from dataset

## Technology and Tool Used
- Selenium Webdriver
- TestNG
- Gradle
- Node
- Allure Report
- Appium v2.0.1
- Appium Inspector v2024.3.4

## IDE
- Intellij idea v2024.1
- Android Studio v2023.2.1

## App
- [EMI Calculator](https://play.google.com/store/apps/details?id=com.continuum.emi.calculator)

## Prerequisite
- JDK 11 or higher
- NodeJS
- Configure ANDROID_HOME `<installation_path>\Android\Sdk`
- Set environment variable `<installation_path>\Android\Sdk\platform-tools`
- Configure Java GRADLE_HOME
- Configure Allure path

## Setup
- Install Appium `npm i appium@next --global`
- Install Driver `appium driver install uiautomator2`
- Install Plugin `appium plugin install execute-driver`
- Activate plugin `appium --use-plugins=execute-driver`

## GUI Assistant Tool
- Appium Inspector v2024.3.4

## How to run this project
- Clone the project
- Execute the following command on the project directory  
`gradle clean test`

## Generate Allure Report
- Execute the following commands on the project directory (after finishing the project run)  
`allure generate allure-results --clean`  
`allure serve allure-results --clean`

## Video of Automation Output
https://github.com/touhid-96/App-Automation-of-EMI-Calculator-TestNG-Appium/assets/29010371/451a44d8-b28e-443a-8cfe-fb1ffd10bbe4

## Allure Reports
![1 overview](https://github.com/touhid-96/App-Automation-of-EMI-Calculator-TestNG-Appium/assets/29010371/2c8c751d-333b-40d3-aca3-a1b8e5546299)

![2 suites](https://github.com/touhid-96/App-Automation-of-EMI-Calculator-TestNG-Appium/assets/29010371/9b32ef89-e58e-403a-9519-8ce98038c824)

![3 graphs](https://github.com/touhid-96/App-Automation-of-EMI-Calculator-TestNG-Appium/assets/29010371/2a3224a5-55ed-4bd6-a522-38920c892e89)

![4 behaviors](https://github.com/touhid-96/App-Automation-of-EMI-Calculator-TestNG-Appium/assets/29010371/62b13c9e-3115-445c-b789-3ae99d2fcafc)

![5 packages](https://github.com/touhid-96/App-Automation-of-EMI-Calculator-TestNG-Appium/assets/29010371/a5653b21-c070-4836-ad27-4cda3b206cc0)

## Gradle Report
![6 gradle](https://github.com/touhid-96/App-Automation-of-EMI-Calculator-TestNG-Appium/assets/29010371/9902cf4d-e6a0-4249-a4f8-78141a371e1e)
