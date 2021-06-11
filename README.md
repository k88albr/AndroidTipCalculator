# AndroidTipCalculator
Learning project for JetBrains Academy.  
This demonstrates usage of the following controls:
* EditText
* Material Design Discrete Slider
* TextView

In addition, event listeners are hooked up to respond to user input.

The course required certain hard-coded control names and layout.
Otherwise I would have named the controls what they are (bill, tipPercent, tipAmount). 

Simple functional app that allows one to enter the bill amount and desired tip percent, on any change of inputs the tip amount is recalculated and displayed.

Work done beyond the lesson
* added hint text to the EditText control (to guide user)
* tweaked the margins to line up better
* adjusted font size of display text
* addressed all warnings so code is clean.
* added KDoc style comment to central function updateTip

## Code of interest
| Area         | Filename            | path
| ------------ | ------------------- | ----------------------------------------
| UI Layout    | activity_main.xml   | Tip Calculator/task/src/main/res/layout/
| MainActivity | MainActivity.kt     | Tip Calculator/task/src/main/java/org/hyperskill/calculator/tip/

## Building
This uses Android Studio, in addition you will need Jave 8.  You can use OpenJDK or one of the Amazon Correto packages


