# Projekt anlegen
Wenn wir MCreator öffnen, müssen wir als aller erstes ein Projekt erstellen:
![](projekt-anlegen-0.png)
![](projekt-anlegen-1.png)
Während dem erstellen wählen wir einen Namen.  
Es öffnet sich eine Internetseite die um eine Spende bittet.
Der Download und erste Build dauert je nach Internet und Computer ein bisschen. Dadurch wird uns aber viel Arbeit abgenommen die wir sonst von Hand machen müssten, also warten wir gerne :)

{{< notice warning Achtung >}}  
  Manchmal wartet man ewig und es war eigentlich schon fertig. Wenn man in der Konsole eine erfolgsnachricht sieht, und nichts mehr passiert, kann es sein, dass man das Popup fenster schließen kann und trotzdem alles fertig installiert ist.  
{{< /notice >}}

## Übersicht über die IDE
![ide übersicht](ide-uebersicht.png)
1. mit dem + kann man neue Elemente erstellen, z.B. Blöcke, Tiere, Gegenstände ...
2. in dieser Leiste sieht man welche Elemente gerade zur Bearbeitung geöffnet sind.
3. in dem großen (noch leeren) Bereich sieht man dann eine Übersicht über alle erstellten Elemente.
4. hier sind mehrere kleine Knöpfe wichtig:  
    sind manche Symbole ausgegraut, können diese aktuell nicht gecklickt werden.
    - das grüne Dreieck: startet Minecraft mit der neu erstellten Mod
    - das rote Viereck: stoppt was gerade läuft, also z.B. wenn man Minecraft noch gestartet hat
    - die Orangene datei mit dem Pfeil: exportiert die Mod zur verwendung mit anderen Mod launchern.  
5. hier kann man Variablen erstellen, das brauchen wir später auch noch :)

## nützliche ingame einstellungen
vanilla Einstellungen, also Dinge die ohne Mod funktiionieren:
- Zeit auf Tag setzen und auf Tag lassen  
`/time set day` & `/gamerule doDaylightCycle false`
- Wetter auf schön setzen und wetter so lassen
`/weather clear` & `/gamerule doWeatherCycle false`
 
{{< notice note Minecraft Wiki>}}  
Es gibt noch sehr viel weitere praktische `gamerule`s:  
[Minecraft Wiki Gamerules](https://minecraft.fandom.com/wiki/Game_rule)  
{{< /notice >}}