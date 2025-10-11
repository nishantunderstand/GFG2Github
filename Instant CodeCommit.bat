@echo off
echo ==== Begin Git Auto Push ====

set "repoLocation=%~dp0"
for %%I in ("%repoLocation:~0,-1%") do set "ParentFolderName=%%~nxI"
set "gitPath=C:\Program Files\Git\cmd\git.exe"

cd /d "%repoLocation%"

REM Check if .git exists, if not initialize and set up remote
if not exist "%repoLocation%\.git" (
    echo Initializing new Git repository...
    "%gitPath%" init
    "%gitPath%" add .
    "%gitPath%" commit -m "Initial commit"
    
    echo.
    echo NOTE: You need to manually create the repository on GitHub first!
    echo Repository should be named: %ParentFolderName%
    echo GitHub URL: https://github.com/nishantunderstand/%ParentFolderName%
    echo.
    pause
)

"%gitPath%" add .
set "commitMessage=Auto commit %date% %time%"
"%gitPath%" commit -m "%commitMessage%"
"%gitPath%" push

start "" /max "C:\Program Files\Google\Chrome\Application\chrome.exe" "https://github.com/nishantunderstand/%ParentFolderName%"

echo ==== End ====
exit