# Aufgabe6: Refactoring mit Branches
In dieser Aufgabe soll eine Code verbessert werden. Hierfür soll ein neuer Zweig (Branch) erzeugt werden, damit der neue Code unabhängig vom Orinal verbessert werden kann. Sobald der Code fertig ´gestellt wurde, kann der Hauptzweig (main) aktuallisiert werden.

1. Legen Sie ein neues Java-Projekt an
2. 	Git-Projekt lokal anlegen und mit online- Repository verknüpfen: --> Mit Konsole in das Projektverzeichnis wechseln:

-	git init  --> Initialisiert ein neues lokales Git-Repository im aktuellen Verzeichnis.
- git commit -m "first commit" --> Erstellt einen Commit mit den Änderungen im Staging-Bereich. Die Option -m ermöglicht das Hinzufügen einer Commit-Nachricht in einer Zeichenkette.
- git remote add origin git@github.com:sttoraus/refactor.git --> Fügt ein "Remote" mit dem Namen "origin" hinzu, das auf die angegebene GitHub-Repository-URL zeigt (anpassen!!!) . Das Remote ist eine Verknüpfung zu einem entfernten Repository.
- git pull origin main  --> Lokalen orogin Zweig mit dem entfernten main Zweig synchronisieren. SchlechterCode.java sollte nun im lokalen src Verzeichnis sein.
3.	Projekt in IDE aktualisieren. (Eclipse: Rechtsklick auf Projekt --> refresh
4.	git branch NeuerBranch  --> anlegen eines neuen Zweigs mit dem Namen "NeuerBranch"
5. git checkout Neuer Branch  --> Ab jetzt wird erst auf dem neuen Branch gearbeitet
6. Code verbessern und testen.
7. git add src/* --> Fügt den ganzen src Ordner zum Staging hinzu
8. git commit -m "Beschreibung"
9. git push origin NeuerBranch  --> Legt den Branch online an und synchronisiert diesen mit dem lokalen.
  
