@echo off
echo Compiling Java source files...
javac *.java
if %errorlevel% neq 0 (
    echo Compilation failed. Make sure you have Java JDK installed.
    pause
    exit /b %errorlevel%
)
echo Compilation successful. Running the application...
echo --------------------------------------------------
