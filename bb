@echo off
set TARGET=D:\target\dir

for /f "usebackq delims=" %%i in ("list.txt") do (
    if exist "%%i" (
        copy "%%i" "%TARGET%"
    ) else (
        echo NOT FOUND: %%i
    )
)

pause
