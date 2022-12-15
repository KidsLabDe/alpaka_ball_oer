# Punkte Zählen
Als erstes müssen wir uns die Punktzahl für jedes Team merken:
![variable erstellen](variable-erstellen.png)
das machen wir für beide team farben.

jetzt müssen wir beim Torblock neue Auslöser hinzufügen:
![neue auslöser](torblock-ausloeser.png)
- einen *Wenn Entität im Block zusammenstößt*  
  um Punkte hoch zu zählen und Ball zu entfernen
- einen *Wenn Block rechts geklickt wird*  
  um Punkte zurück zu setzen.

Die Prozedur für den Rechtsklick sieht so aus:
![code rechtsklick](code-rechtsklick.png)
1. Setzt die globale variable zum Punkte Zählen auf 0 zurück
2. führt `/bossbar set blue value 0` in Minecraft aus um die Bossbar wieder auf 0 zu setzen.

Die Prozedur für den Zusammenstoß mit einem Entity ist länger und sieht so aus:
![code zusammenstoß entität](code-zusammenstoss-entitaet.png)
1. Weil wir nur wollen, dass ein Punkt nur dann verteilt wird, wenn der Ball das Tor berührt checken wir bei ob es sich bei der Entität um einen Ball handelt
2. dazu erhalten wir den Anzeige-Namen und prüfen ob der gleich *Flugball* (muss übereinstimmen, wie der Objektname bei [Bild und Ton von *Ball erstellen*](../02-ball-erstellen/ball-erstellen.md))
3. die vom Hauptblock abgelösten Anweisungen werden nicht ausgeführt und dienen nur als Hinweis was ich probiert hab: bei der 3 wollt ich auf diese 2 weisen testen ob es sich um einen Ball handelt, was leider nicht geklappt hat.
4. verknüpfen wir den Ball-check mit einem *AND*, dass noch eine weitere Bedinung zutreffen muss (machen wir dies nicht wird der ball nach dem löschen noch weitere male erkannt)
5. verneinen wir den check
6. ob die Entität den NBT-Tag *im_tor* schon hat.  
Verneint, weil wir nur ein Punkt vergeben wollen wenn der Ball nicht schonmal in dem Tor erkannt wurde. (Alle möglichkeiten die ich probiert hab waren zu langsam um den Ball zu entfernen bevor er nochmal im Tor erkannt wird, kill: Entität existiert noch weiter bis rote Umfallanimation beendet, tp ins nichts: vergibt immernoch 2 Punkte)
7. dass der Ball nicht doppelt erkannt wird müssen wir natürlich jetzt noch den NBT-Tag *im_tor* auf *wahr* setzen, sonst bringt unsere Abfrage (6) ja garnichts.
8. Erhöht die Punktzahl von Blau:
9.  - dazu holt es sich die aktuelle *punktzahl_blau* 
    - und fügt mit *+* 
    - die Zahl *1* hinzu 
    - und Speichert das ergebnis mit *Setze Global: punktzahl zu* wieder in der Punktezahl für blau ab.
10. Wir führen den Minecraft Befehl für die Bossbar aus
11. dazu kombinieren wir den text `/bossbar set blue value ` mit der *punktzahl_blau* und runden diese, weil es sich sonst um eine Kommazahl handelt. (zwar immer ,0 aber Minecraft kennt hier keine Kommazahl, desshalb machen wir die so weg)
12. wir geben dem nächsten Spieler (`@p`) ein neues Spawn-Ei  
  `/give @p haecksen_ball:flugball_spawn_egg`
13. mit diesem Befehl können wir einen Ton abspielen lassen, wenn ein Tor geschossen wurde. Hier z.B. der gleiche Ton, wenn man XP aufsammelt: *entity.experience_orb.pickup*
14. am Schluss wollen wir den Ball natürlich los werden:  
    dazu führen wir den Minecraft Befehl `/kill @e[type=haecksen_ball:flugball,limit=1,sort=nearest]` aus.
15. die anderen 2 Varianten werden hier nicht ausgeführt und sind wie bei (3) nur da um zu veranschaulichen welche andere Möglichkeiten ich probiert hab.
16. Speichern nicht vergessen ;)

Jetzt kanns im Spiel getestet werden, und wenn ein Ball in einen blauen Torblock fliegt, dann sollte ein Ton kommen, die Punktzahl in der Bossbar erhöht werden, der Ball verschwinden und man bekommt ein neues Spawn-Ei.

## jetzt nochmal für Orange