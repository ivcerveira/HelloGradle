@echo off
REM ================================
REM Script para executar o Ivping.jar
REM ================================

REM Caminho do diretório atual (onde o .bat está)
set DIR=%~dp0

REM Caminho do JDK local
set JAVA_HOME=%DIR%jdk-21.0.8-full

REM Executa o JAR
"%JAVA_HOME%\bin\java.exe" -jar "%DIR%Ivping.jar"

pause
