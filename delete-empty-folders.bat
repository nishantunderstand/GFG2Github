@echo off
echo Deleting empty folders...

for /f "delims=" %%d in ('dir /s /b /ad ^| sort /r') do rd "%%d" 2>nul

echo Done!
exit