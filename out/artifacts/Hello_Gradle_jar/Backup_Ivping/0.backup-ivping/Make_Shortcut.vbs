Set wsc = WScript.CreateObject("WScript.Shell")

Set lnk = wsc.CreateShortcut(wsc.SpecialFolders("desktop") & "\Ivping.LNK")
lnk.targetpath = wsc.CurrentDirectory & "\ivprunner.bat"
lnk.description = "Run Ivping"
lnk.workingdirectory = wsc.CurrentDirectory
lnk.IconLocation = wsc.CurrentDirectory & "\IvpIcon.ico, 0"
lnk.save
