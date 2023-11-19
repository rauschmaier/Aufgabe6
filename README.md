# Aufgabe6: Refactoring mit Branches
In dieser Aufgabe soll eine Code verbessert werden. Hierfür soll ein neuer Zweig (Branch) erzeugt werden, damit der neue Code unabhängig vom Orinal verbessert werden kann. Sobald der Code fertig ´gestellt wurde, kann der Hauptzweig (main) aktuallisiert werden.

1. Legen Sie ein neues Java-Projekt an
2. 	Git-Projekt lokal anlegen und mit online- Repository verknüpfen: --> Mit Konsole in das Projektverzeichnis wechseln:

-	git init  --> Initialisiert ein neues lokales Git-Repository im aktuellen Verzeichnis.
- git commit -m "first commit" --> Erstellt einen Commit mit den Änderungen im Staging-Bereich. Die Option -m ermöglicht das Hinzufügen einer Commit-Nachricht in einer Zeichenkette.
- git remote add origin git@github.com:sttoraus/refactor.git --> Fügt ein "Remote" mit dem Namen "origin" hinzu, das auf die angegebene GitHub-Repository-URL zeigt (anpassen!!!) . Das Remote ist eine Verknüpfung zu einem entfernten Repository.
7.	git push -u origin main:
o	Sendet die lokalen Commits zum entfernten Repository auf GitHub. Die Option -u (oder --set-upstream) verknüpft den lokalen Branch "main" mit dem entfernten Branch "main" auf "origin". Dies ermöglicht es, in Zukunft einfach git push ohne die spezifischen Argumente auszuführen.
4.	Neue Klasse anlegen, mit add hinzufügen,commiten und pushen.
5.	Neuen Branch anlegen +*
