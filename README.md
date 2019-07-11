# Refactoring Golf Java 


Estimated Duration: 2-4 hours

Author: Jason Gorman, Codemanship (based on the SC2010 session run by Ivan Moore, Dave Cleal and Mike Hill)

Language(s)/stacks: Java

Summary:

Refactoring Golf is a game designed to **stretch your refactoring muscles** and get you to **explore your IDE** to see what's really possible using shortcuts and automation.

You will find 2 versions of every project (labeled ROUND_N_A and ROUND_N_B). The _A project_ is the before, and the _B project_ is the after.

Your goal is to safely and efficiently as possible refactor the _A code_ to look like the _B code_. You must aim to do it in as few "strokes" as possible, incurring _as few points as possible_.

A "stroke" is essentially a change made to the code, and every stroke costs you points.

Your pairing partner should carefully score you as follows:

1 point for every change made to the code using a shortcut or automated IDE feature (e.g., an automated refactoring, code template, or Find/Replace)
2 points for every line of code manually edited
Double points for every change made while the code cannot pass the tests after the previous change
Zero points for code formatting (e.g., deleting whitespace)

So, you're looking to refactor the _A code_ into the _B code_ using as few manual edits as possible, and keeping the tests passing as much as possible, scoring as few points as you can.

Allow yourselves a maximum of 2 attempts at each round to determine your best score.

HINTS: 

1. You may find that customising your IDE is useful in some of these rounds (e.g. custom code templates, or even custom refactorings.)

2. If possible, it would be a good idea to have the two versions (_A_ and _B_) of each set of source files open on different machines, as you could easily tie yourself in knots editing the wrong files! Another option is to split your screen vertically in order to see at the same time the two versions.

3. Keep that 2nd machine/splited view available as a tooling environment. Writing custom tools (scripts, templates etc) costs you zero points in refactoring golf.

(Original kata is here https://github.com/jasongorman/RefactoringGolfJava)

The C#/NUnit (VS2013) version can be found at https://github.com/jasongorman/RefactoringGolfCSharp

### Build and test

On windows use `gradlew.bat` instead of `./gradlew` to build.
You can also install gradle globally and then run just `gradle` and ignore `gradlew` script.

Test:

    ./gradlew clean test
