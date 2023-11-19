# Aufgabe 6: Refactoring mit Branches

In dieser Aufgabe soll Code verbessert werden. Hierfür soll ein neuer Zweig (Branch) erzeugt werden, damit der neue Code unabhängig vom Original verbessert werden kann. Sobald der Code fertiggestellt wurde, kann der Hauptzweig (main) aktualisiert werden.

1. Legen Sie ein neues Java-Projekt an.

2. Git-Projekt lokal anlegen und mit dem Online-Repository verknüpfen: --> Mit der Konsole in das Projektverzeichnis wechseln:

   - `git init`  --> Initialisiert ein neues lokales Git-Repository im aktuellen Verzeichnis.
   - `git add .`  --> Fügt alle Dateien im Verzeichnis dem Staging-Bereich hinzu.
   - `git commit -m "first commit"` --> Erstellt einen Commit mit den Änderungen im Staging-Bereich. Die Option -m ermöglicht das Hinzufügen einer Commit-Nachricht in einer Zeichenkette.
   - `git remote add origin git@github.com:javaest/aufgabe-6-sttoraus.git` --> Fügt ein "Remote" mit dem Namen "origin" hinzu, das auf die angegebene GitHub-Repository-URL zeigt **(URL anpassen!)**. Das Remote ist eine Verknüpfung zu einem entfernten Repository.
   - `git pull origin main`  --> Synchronisiert den lokalen origin-Zweig mit dem entfernten main-Zweig. SchlechterCode.java sollte nun im lokalen src-Verzeichnis sein.

3. Projekt in der IDE aktualisieren. (Eclipse: Rechtsklick auf das Projekt --> Refresh)

4. `git branch NeuerBranch`  --> Erzeuge einen neuen Zweig mit dem Namen "NeuerBranch".

5. `git checkout NeuerBranch`  --> Wechsel zum neuen Branch. Ab jetzt wird auf dem neuen Branch gearbeitet.

6. Code verbessern und testen.

7. `git add src/*`  --> Fügt den gesamten src-Ordner zum Staging hinzu.

8. `git commit -m "Beschreibung"`  --> Erstelle einen Commit mit einer aussagekräftigen Beschreibung.

9. `git push origin NeuerBranch`  --> Lade den Branch online hoch und synchronisiere diesen mit dem lokalen.

10. Prüfe online, ob der Branch angelegt wurde und ob der neue Code online verfügbar ist. Prüfe auch, ob der main Branch mit dem "schlechten Code" noch vorhanden ist.

  
