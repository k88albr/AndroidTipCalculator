# AndroidTipCalculator
Learning project for JetBrains Academy.  
Decent learning platform if you are an existing coder looking to get up to speed quickly with Android app development.  
Check it out [here](https://hyperskill.org/tracks)

This project demonstrates usage of the following controls:
* EditText
* Material Design Discrete Slider
* TextView

In addition, event listeners are hooked up to respond to user input.

The course required certain hard-coded control names and layout.
Otherwise I would have named the controls what they are (bill, tipPercent, tipAmount). 

Simple functional app that allows one to enter the bill amount and desired tip percent. On any change of inputs, the tip amount is recalculated and displayed.

Work done beyond the lesson
* added hint text to the EditText control (to guide user)
* tweaked the margins to line up better
* adjusted font size of display text
* addressed all warnings so code is clean.
* added KDoc style comment to central function updateTip
* this repo *just* has the core code needed for the application without all the lesson overhead.

## Code of interest
| Area         | Filename            | path
| ------------ | ------------------- | ----------------------------------------
| UI Layout    | activity_main.xml   | Tip Calculator/task/src/main/res/layout/
| MainActivity | MainActivity.kt     | Tip Calculator/task/src/main/java/org/hyperskill/calculator/tip/

## Building and Running
This uses Android Studio, in addition you will need Java 8.  You can use Java 8, or OpenJDK or one of the Amazon Correto [packages](https://aws.amazon.com/corretto/)
* Open Android Studio
* Open the folder where this project is cloned
* Click Sync Project with Gradle Files
* Configure the root module's settings to set the path to the JDK (right click top most folder in Project and choose Open Module Settings, then SDK Location)
* Click AVD Manager and pick an emulator to use such as Pixel 3 if you haven't configured one.
* Check the Project Configuration and ensure that Before Launch has Gradle-aware Make added.
* Now you should be able to click Run and see the application in the emulator.

Note: To get unit tests running
* find the ExampleUnitTest.kt file (switch view to Tests and expand Tip Calculator/task/src/test/java/org/hyperskill/calculator/tip/ 
* right click the ExampleUnitTest.kt file and choose Run 'ExampleUnitTest'
* if you receive these errors: WARNING: An illegal reflective access operation has occurred
  * the Java version for the test configuration isn't matching.  If the configuration is not listed, click Save Configuration in the list for the Edit Run/Debug Configuration Settings.
  * choose Edit Configurations...
  * inspect the JRE drop down and make sure it is set to 1.8 not API Level 28.
  * now tests will run to completion.




