---
Title: Einführung in MCreator
Draft: false
Description: In diesem Kapitel erstellst Du das erste Projekt in MCreator und wir schauen uns einzelnen Elemente des Programms an.
Weight: 10

---


# Mods, MCreator, Java - eine kleine Einführung

Wenn Du gerne Minecraft spielst, ist dir bestimmt schon mal aufgefallen, dass es verschiedene Versionen gibt: es gibt eine Java- und eine Bedrock-Version. Die Java-Version ist die ursprüngliche Minecraft Version, die "Notch", der Erfinder von Minecraft, 2009 programmiert hat.

{{< notice note Überschift>}}
**Wusstest Du schon...**
Notch hat die erste Version in nur wenigen Tagen programmiert: nach nur 6 Tagen, am 16. Mai 2009, erblickt die erste wirkliche Minecraft-Version 0.0.9a das Licht der Welt!
{{< /notice >}}

## Was ist MCreator? 

"MCreator ist eine Open-Source-Software, mit der Minecraft Java Edition Mods, Bedrock Edition Add-Ons und Data Packs über eine intuitive, leicht zu erlernende Oberfläche oder mit einem integrierten Code-Editor erstellt werden können. Sie wird weltweit von Minecraft-Spielern, Mod-Entwicklern, in der Ausbildung und in MINT-Workshops eingesetzt." (Quelle: https://mcreator.net/)

## Mods?

Minecraft hat seinen großen Erfolg nicht nur den Entwicklern von Mohjang zu verdanken - schon sehr früh konnten externe Programmierer eigenen Erweiterungen zu Minecraft hinzufügen: sogenannte Modifikationen oder kurz ["Mods"](https://de.wikipedia.org/wiki/Mod_(Computerspiele))

Mods gibt es nur in der Java-Version. Mods sind grundsätzlich kostenlos und es gibt jede Menge davon: auf [CurseForge](https://www.curseforge.com/minecraft/mc-mods) sind aktuell über 100.000 Mods gelistet!

So hat die Community das Spiel für andere Spieler immer weiterentwickelt und die verrücktesten Ideen umgesetezt - ganz kostenlos gibt es so immer neuen Spielspaß ohne jegliche In-App-Käufe oder ähnliches!

Die Mods in Minecraft Java sind dann jeweils eine sog. JAR Datai (JAR, englisch für "Krug" - oder Java ARchive). Wenn die an der richtigen Stelle liegen, ist dein Minecraft gemodded!

{{< notice task >}}
Lust mal ne Mod zu installieren? Ich würde Dir dazu den [ATLauncher](https://atlauncher.com) empfehlen - er macht es viel einfacher, mit den verschiedenen Minecraft-Versionen umzugehen und erleichtert die Installation von Mods.
In diesem Video wirst Du Schritt für Schritt durchgeführt - und danach kannst Du es mal **richtig** krachen lassen :)
[So installierst Du Deine erste Mod! (WorldEdit) - mit Knalleffekt :)](https://youtu.be/dGDRotz0VEA)
{{< /notice >}}


# Eigene Mod in MCreator erstellen - Projekt anlegen

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

{{< notice warning Achtung >}}  
Manchmal wartet man ewig und es war eigentlich schon fertig. Wenn man in der Konsole eine erfolgsnachricht sieht, und nichts mehr passiert, kann es sein, dass man das Popup fenster schließen kann und trotzdem alles fertig installiert ist.  
{{< /notice >}}

## Übersicht über die IDE

{{< notice note Überschift>}}
**ID.... was?**

[IDE](https://de.wikipedia.org/wiki/Integrierte_Entwicklungsumgebung) steht für Integrated Development Editor oder Integrierte Entwicklungsemgebung. Das ist ein Programm, dass alle nötigen Tools zum Programmieren zusammenfasst - unsere Arbeitsumgebung für dieses Tutorial. 

{{< /notice >}}

Hier siehst Du die Startseite der IDE und alle wichtigen Elemente:

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

{{< notice mentor >}}
**Nützliche Einstellungen im Spiel**
vanilla Einstellungen, also Dinge die ohne Mod funktiionieren:

- Zeit auf Tag setzen und auf Tag lassen  
`/time set day` & `/gamerule doDaylightCycle false`
- Wetter auf schön setzen und wetter so lassen
`/weather clear` & `/gamerule doWeatherCycle false`
 
{{< /notice >}}

{{< notice note Minecraft Wiki>}}  
Es gibt noch sehr viel weitere praktische `gamerule`s: [Minecraft Wiki Gamerules](https://minecraft.fandom.com/wiki/Game_rule)  
{{< /notice >}}