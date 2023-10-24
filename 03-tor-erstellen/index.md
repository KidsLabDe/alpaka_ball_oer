---
Title: "Level 2: Tor! Oder: da muss der Ball rein"
Draft: false
Weight: 30

---


# Level 2: Tor! Oder: da muss der Ball rein

Unser Tor soll aus Blöcken gebaut werden können. 

In diesem Level erstellst du also einen eigenen Block, mit dem dann das Tor im Spiel gebaut werden kann.

![Erstelle einen neuen Block](block-erstellen-0.png)

![Gib dem neuen Block einen (sinnvollen) Namen](block-namen-geben.png)

Jetzt kannst du die Eigenschaften des Blocks anpassen - das kennst du schon aus unserem ersten Level, dort haben wir die Eigenschaften des "Lebewesens" Ball angepasst. 

![Die optischen Eigenschaften des Blocks](block-eigenschaften-optisch.png)

1. Wähle hier aus, dass auf allen Seiten die gleiche Textur verwendet werden soll, das spart uns Arbeit
2. Die Beispieltextur (Schritt 4) ist halb transparent, deshalb wähle hier aus, dass der Block transparente Teile enthält
3. Setze den Transparenztyp auf `Translucent`

4. Hier kannst du die Textur für den Block importieren und auswählen.
   Als Beispieltextur für das Tor kannst du diese Vorlage verwenden:  
   ![Textur des Tors](tor_block_orange.png)  
   [Gimp-Projekt "Tor_block_rahmen"](tor_block_rahmen.xcf)  
   [Von GitHub herunterladen](https://raw.githubusercontent.com/KidsLabDe/alpaka_ball_oer/main/03-tor-erstellen/tor_block_rahmen.xcf)  
   Natürlich kannst du auch selbst kreativ werden und deine eigene Textur erstellen!

Gib dem Block jetzt glasähnliche Eigenschaften:

![Eigenschaft: Glass-ähnlich](block-eigenschaften-glas.png)

Wir haben verschiedene Möglichkeiten getestet und haben uns entschieden, den Block so zu konfigurieren, dass man durch ihn laufen kann. 

{{% notice task "Probier es aus!"%}}
Beim Programmieren ist es immer gut, wenn man zwischendurch immer mal wieder testet und ausprobiert. Jetzt ist ein guter Zeitpunkt: Drücke den grünen Play-Knopf (rechts oben) und teste das Ganze!
{{% /notice %}}


## Anzeige des Spielstandes - Wieviele Tore wurden geschossen?

Wie könnte man jetzt die erzielten Tore anzeigen? Wir haben uns an die Boss-Bar erinnert: in Minecraft Vanilla (ohne Mods) kann man mit bordeigenen Mitteln eine Bossbar hinzufügen. 

Dafür gibt es diese Befehle: 

<!-- all those empty lines to help pandoc make the correct line breaks (i hope)-->

1. Neue Bossbar erstellen

   `/bossbar add orange  {"text":"Team Orange"}`

2. Farbe festlegen

   `/bossbar set orange color yellow`

3. Maximalwert der BossBar (12 bedeutet, wer 12 Tore hat, hat gewonnen)

   `/bossbar set orange max 12`

4. Stiel auswählen (schön, passend zum Max-wert)  

   `/bossbar set orange style notched_12`

5. ... und jetzt noch anzeigen:  

   `/bossbar set orange players @a`

{{% notice task "Probiere es aus!"%}}
Öffne Minecraft (am einfachsten wieder über MCreator, grüner Knopf...) und starte eine Kreativ-Welt. Öffne mit `T` die Chat Zeile. Gib die Befehle wie oben nacheinander in dieser Zeile ein und bestätige jeden mit Enter. Klappt es? Dann solltest du jetzt eine Boss-Bar sehen! 
{{% /notice %}}

## Wie werden die Tore gezählt? Auslöser!
Jetzt muss das Tor ja wissen, dass ein Ball rein geflogen kommt. Wie könnte man das am besten anstellen? 
**Auslöser** bieten die Möglichkeit, auf gewisse Ereignisse in Minecraft zu reagieren und unseren Code auszuführen, z.B. wenn ein Block gesetzt wird. 
Gehe noch mal in die Eigenschaften des Tor-Blocks und wähle unten "Auslöser" aus.
Jetzt schreibst du deinen ersten Code für die Mod: Wähle im Bereich **Wenn Block hinzugefügt** aus, dass du eine neue Prozedur erstellen willst - wie gewohnt mit dem **+ Plus** Knopf.

Wir erstellen also eine Prozedur, ein Stück Code, das ausgeführt werden soll, wenn der Block eine Entität (Entity) berührt:

![Auslöser hinzufügen - erzeugt ein Ereignis](block-auslöser.png)

Der Name der Prozedur wird automatisch generiert (den kannst du so lassen).
Jetzt sollten die 4 Minecraft-Befehle von oben ausgeführt werden, wenn das Tor gebaut wird. Also suchen wir den Baustein, der uns ermöglicht einen Minecraft-Befehl auszuführen.

![Wie können Minecraft-Befehle ausgeführt werden?](prozedur-minecraft-befehl.png)

- Wähle links die Kategorie *Welt Management* 
- Nimm den Programmier-Block ganz oben: `Führe Befehl ... aus ...`
- Ziehe ihn in die Programmier-Oberfläche und docke ihn unter dem Event-Auslöser an
- Füge jeweils in den Anführungszeichen die Befehle von oben ein.

So sieht es aus, wenn die Befehle von oben alle ausgeführt werden sollen:

![Minecraft Befehle in MCreator für bossbar](code-torblock-setzen.png)

Speichern nicht vergessen. Drücke dazu rechts oben auf **Mod Element speichern**

Gerne mal testen. Falls du es nochmal testen willst, kannst du die Bossbar mit 
`/bossbar remove orange`  
wieder entfernen vor dem neuen Test.

{{% notice success "Mal Nachschauen:"%}}  
Jetzt sollte es so aussehen, nachdem man einen orangenen Torblock gesetzt hat:

![Bossbar für Team Orange](ingame-bossbar-orange.png)  
{{% /notice %}}


## Was ist mit der gegnerischen Manschafft? 
Jetzt natürlich das Ganze noch für das zweite Team: Team Blau.
Weil wir nicht alles nochmal neu machen wollen, können wir die bestehenden Elemente kopieren:

![Arbeit sparen: so kannst du bestehende Elemente duplizieren](element-duplizieren.png)

Du musst jetzt einen neuen Namen vergeben, z.B. *TorBlockBlue*   

Erstelle jetzt - wie vorher beim ersten Block - einen neuen Auslöser und eine neue Prozedur: 

- Rechtsklick
- *Mod-Element duplizieren*
- Neuer Name *TorBlockBlueWennBlockHinzugefügt*

Und in beiden Elementen musst du die IDs und farbrelevanten Eigenschaften anpassen:

![Tausche die Textur des Blockes aus](block-textur-austauschen.png)

- Tausche die Blocktextur aus
- In der Kategorie *Eigenschaften* von dem Block solltest du noch den Namen von *Tor Block Orange* auf *Tor Block Blau* ändern.
- Und natürlich den Auslöser auch anpassen, damit die Funktion für die blaue Bossbar aufgerufen wird:  
![Tausche die Farbe aus](code-farbe-austauschen.png)

- Tausche den Code für die Farbe aus  
  *orange* hier war die ID der Bossbar und *yellow* war die Farbe,  
  kann beides zu *blue* geändert werden

{{% notice success "Geschafft!"%}}  
Wow - du hast schon eine Menge geschafft:
Bälle gibt's, Tore - und sogar die Tor-Anzeige!
![Tor und Ball sind da: das Spiel kann bald beginnen!](ingame-so-siehts-bis-jetzt-aus-2.png)  
{{% /notice %}}
