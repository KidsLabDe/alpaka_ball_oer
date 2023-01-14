---
Title: "Level 1: Der Ball für unser Spiel"
Draft: false
Weight: 20

---


# Level 1: Der Ball für unser Spiel 

Als erstes brauchen wir einen passenden Ball, er ist das Zentrum unseres Spiels.
Es gibt in Minecraft ja viel verschiedene "Sachen" - Blöcke, Pflanzen, Mobs. Für den Ball haben wir uns für ein **Lebewesen** als Ball entschieden. Warum gleich noch mehr... 

![Starte die IDE und erstelle neues Objekt](ide-start.png)

Du kannst neue Objekte über das "+" Plus Zeichen hinzufügen. Wähle dann "Lebewesen" aus:

![Wähle "Lebewesen"](lebewesen-erstellen-0.png)


Lebewesen sind "Entities", die sich bewegen können - anhand von Regeln und KI, die Du festlegen kannst - das passt doch perfekt!

Natürlich musst Du einen Namen vergeben:

![Name des Lebewesens: "Flugball"](lebewesen-erstellen-1.png)

Jetzt öffnen sich das Fenster, in dem Du alle Eigenschaften des neue erstellten Lebewesens festlegen kannst. 
Bei der Bearbeitung von einem Objekt gibt es verschiedene Kategorien (in der Unteren Leiste auswählbar).

Bei *Bild und Ton* ist folgendes wichtig für unseren Ball:

![Lebewesen - Bild und Ton anpassen](lebewesen-erstellen-2-bild-ton.png)


1. Name wird übernommen aus vorigem Dialog
2. Die Textur bestimmt das Aussehen Deines Balls - Du fügst die Textur mit dem **+ Plus** hinzu. Du kannst selbst eine Textur erstellen oder diese als Beispiel benutzen: ![ball textur](flugball-texture.png)  
3. Erst danach kannst Du die Textur im Dropdown auswählen
4. Wir lassen uns auch ein Spawn-Ei generieren
5. Für das Ei können wir bei den 3 Punkten neben dem Farbfeld die Farben auswählen die das Ei haben soll.
6. Zu jedem Attribut, das man hier auswählen kann gibt es bei dem fragezeichen einen Hilfetext
7. Speichern nicht vergessen!

Nach dem speichern dauert es eine kleine Weile, bis MCreator die Mod daraus erstellt hat, wenn dann das Play-Dreieck oben rechts grün ist kann man mit dem Play-Dreieck dann Minecraft direkt mit der neuen Mod starten:

![Starte Minecraft mit deiner Mod: der Play-Knopf](ide-start-play-dreieck.png)

{{% notice task "Was passiert da im Hintergrund?" %}}
Da passiert ganz viel im Hintergrund - unter **Konsole** kannst Du Dir anschauen, was MCreator alles machen muss, um die Mod zu kompilieren.
{{% /notice %}}

Wenn Minecraft gestartet ist, erstelle eine Welt im [Kreativ-Modus](https://minecraft.fandom.com/de/wiki/Kreativmodus) - damit hast Du direkt Zugriff auf alle Gegenstände und kannst den Ball am einfachsten testen.

Das erstellte Spawn-Ei versteckt sich im Kreativ Inventar:

![Inventar: hier findest Du dein erstelltes Lebewesen, bzw. dessen Ei](ingame-wo-ist-das-spawn-ei.png)

1. Wähle den Tab **"Verschiedenes"**
2. ganz nach unten scrollen
3. tadaaa! :)

{{% notice success "Geschafft: Der Ball fliegt!" %}}
Tadaaa! So sieht es bis jetzt aus:

![Übersicht - was haben wir schon geschafft](ingame-so-siehts-bis-jetzt-aus-0.png)
- der Ball fällt und fliegt noch nicht
- der Ball läuft selbst noch herum
- Ball kann noch sterben werden wenn man ihn schlägt :(

{{% /notice %}}


## Verhalten anpassen
Jetzt wollen wir aber dem Ball noch beibringen, dass er sich wie ein Ball verhalten soll. Schließe Minecraft und gehe dazu wieder in MCreater. Mit Doppelklick auf ein Element kann dieses wieder bearbeitet werden:

![Bearbeiten der Eigenschaften: Verhalten ändern](ide-start-element-bearbeiten.png)

![Hier kannst Du alles zum Verhalten anpassen](lebewesen-erstellen-2-verhalten.png)

Um das Verhalten zu verändern, wechselst Du unten auf den Verhaltens-Reiter. Jetzt kanst Du die Werte ändern:

- **creature** damit der Ball nicht angreift
- **bewegungsgeschwindigkeit** = 0, damit er uns nicht von alleine weg fliegt
- unser Ball soll nicht sterben wenn man ihn schlägt
    - **Gesundheitswert** = 1024 (höchst möglicher wert, (2er-Potenz ;)) 
    - **Rüstungsschutz** = 100 (auch höchst möglicher wert)

{{% notice success "Ball fertig - yeah!"%}}  

Das hast Du schon geschafft: 

![Stand Level 1 - Bälle sind geschafft!](ingame-so-siehts-bis-jetzt-aus-1.png)

- der Ball fällt nicht mehr, sondern fliegt
- der Ball läuft nicht mehr herum
- Ball stirbt nicht mehr ;)
- macht jetzt schon Spaß den Ball mit Schlag oder Rückstoß verzauberten Schwert und Bogen zu schubsen ;D

{{% /notice %}}
