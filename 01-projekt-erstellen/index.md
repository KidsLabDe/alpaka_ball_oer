---
Title: "Vorbereitung: Neues Projekt in MCreator anlegen"
Draft: false
Description: "In diesem Kapitel erstellst Du das erste Projekt in MCreator und wir schauen uns einzelnen Elemente des Programms an."
Weight: 10
---


# Vorbereitung: Neues Projekt in MCreator anlegen

Öffne im ersten Schritt MCreator. Unter allen Betriebssystemen (Windows, macOS und Linux) ist MCreator eine normale Anwendung und kann wie jede Andere gestartet werden.

Als erstes erstellst Du jetzt ein neues Projekt:


![Neues Projekt anlegen - 1](projekt-anlegen-0.png)

![Neues Projekt anlegen - 2](projekt-anlegen-1.png)

Folgende Felder füllst Du nun aus:
- **Mod-Anzeigename** - wie soll deine Mod heißen? 
- **Mod-ID** - Interner Name, der muss ohne Leerzeichen etc. sein
- **Minecraft-Version** - Mods müssen passend zur Minecraft Version sein - hier wählst Du bitte für dieses Tutorial "Minecraft Forge for 1.19.2"

Klicke dann auf "Neue Arbeitsumgebung erstellen" - es öffnet sich eine Internetseite die um eine Spende bittet.

Der Download und erste Build dauert je nach Internet und Computer ein bisschen. Dadurch wird uns aber viel Arbeit abgenommen die wir sonst von Hand machen müssten, also warten wir gerne :)

{{< notice warning "Dauert ewig?" >}}  
Manchmal wartet man ewig und es war eigentlich schon fertig. Wenn man in der Konsole eine erfolgsnachricht sieht, und nichts mehr passiert, kann es sein, dass man das Popup fenster schließen kann und trotzdem alles fertig installiert ist.  
{{< /notice >}}

## Übersicht über die IDE

{{< notice note "ID.... was?">}}
[IDE](https://de.wikipedia.org/wiki/Integrierte_Entwicklungsumgebung) steht für Integrated Development Editor oder Integrierte Entwicklungsumgebung. Das ist ein Programm, dass alle nötigen Tools zum Programmieren zusammenfasst - unsere Arbeitsumgebung für dieses Tutorial. 

{{< /notice >}}

Hier siehst Du die Startseite der IDE und alle wichtigen Elemente:

![IDE Übersicht: das sind die wichtigsten Elemente](ide-uebersicht.png)

1. mit dem + kann man neue Elemente erstellen, z.B. Blöcke, Tiere, Gegenstände ...
2. in dieser Leiste sieht man welche Elemente gerade zur Bearbeitung geöffnet sind.
3. in dem großen (noch leeren) Bereich sieht man dann eine Übersicht über alle erstellten Elemente.
4. hier sind mehrere kleine Knöpfe wichtig:  
    sind manche Symbole ausgegraut, können diese aktuell nicht geklickt werden.
    - das grüne Dreieck: startet Minecraft mit der neu erstellten Mod
    - das rote Viereck: stoppt was gerade läuft, also z.B. wenn man Minecraft noch gestartet hat
    - die Orangene Datei mit dem Pfeil: exportiert die Mod zur Verwendung mit anderen Mod-Launchern.  
5. hier kann man Variablen erstellen, das brauchen wir später auch noch :)

{{< notice mentor "Nützliche Einstellungen im Spiel">}}
Vanilla-Einstellungen, also Dinge die ohne Mod funktionieren:

- Zeit auf Tag setzen und auf Tag lassen  
`/time set day` & `/gamerule doDaylightCycle false`
- Wetter auf schön setzen und wetter so lassen
`/weather clear` & `/gamerule doWeatherCycle false`

{{< /notice >}}

{{< notice note Minecraft Wiki>}}  
Es gibt noch sehr viel weitere praktische `gamerule`s: [Minecraft Wiki Gamerules](https://minecraft.fandom.com/wiki/Game_rule)  
{{< /notice >}}