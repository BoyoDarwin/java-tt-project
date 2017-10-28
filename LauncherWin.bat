@echo off
:MENU
 echo.
 echo    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 echo    Welcome to Toontown Java Edition! Choose a selection
 echo    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 echo    1 - Play Toontown Java Edition!
 echo    2 - Exit Toontown Java Edition!
 echo    3 - Toontown JE Release Notes!
 echo    4 - Sites
 echo    5 - *To Be Released*
 echo    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 echo        Menu made by Memeza!                          Menu v.0.5
 echo    Note you cant Save Your Toon Yet!                 Game v.0.1
 echo.
 
SET /P M=Type An Option Then Press Enter!   
	IF %M%==1 GOTO START
	IF %M%==2 GOTO EXIT
	IF %M%==3 GOTO RELEASE
	If %M%==4 GOTO SITE

:START
 echo. 
 echo    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 echo    Starting Toontown Java Edition!
 echo    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 echo.

 java -jar Toontown.jar
 
 GOTO :MENU

:EXIT
 echo.
 echo   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 echo   Thanks For Playing Toontown Java Edition! Have a Toontastic Day!
 echo   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 echo.

 PAUSE

 exit

:RELEASE
 echo.
 echo    ~~~~~~~~~~~~~
 echo    Release Notes
 echo    ~~~~~~~~~~~~~
 echo. 
 echo  - March 26, 2017 -
 echo  v.0.1 Added Non-Usable Gag Shop Files and Package
 echo  and added Playgrounds
 echo. 

 PAUSE

 GOTO :MENU

:SITE
 echo.
 echo         ~ Select a Site ~
 echo     ~~~~~~~~~~~~~~~~~~~~~~~~~
 echo     1 - Project Altis Website
 echo     2 - Discord Chat!
 echo     3 - Go Back!
 echo     ~~~~~~~~~~~~~~~~~~~~~~~~~ 
 echo.
 
SET /P N=Type An Option then Press Enter!   
	IF %N%==1 GOTO PAW
	IF %N%==2 GOTO DC
	IF %N%==3 GOTO SBACK

:PAW
 echo.
 echo    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 echo    Going To Proejct Altis Website
 echo    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 echo. 

 start "" https://projectaltis.com/

 PAUSE

 GOTO :SITE
 
:DC
 echo.
 echo    ~~~~~~~~~~~~~~~~~~~~~
 echo    Going to Discord Chat
 echo    ~~~~~~~~~~~~~~~~~~~~~
 echo. 
 
 start "" https://discord.gg/zkvsS5u

 PAUSE

 GOTO :SITE
 
 :SBACK
  GOTO :MENU