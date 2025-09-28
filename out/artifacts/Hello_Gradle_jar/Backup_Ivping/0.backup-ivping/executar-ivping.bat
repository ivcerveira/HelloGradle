@echo off
REM ================================
REM Script para executar o Ivping.jar
REM ================================

set DIR=%~dp0
set JAVA_HOME=%DIR%jdk-21.0.8-full

"%JAVA_HOME%\bin\java.exe" -jar "%DIR%Ivping.jar"

pause
