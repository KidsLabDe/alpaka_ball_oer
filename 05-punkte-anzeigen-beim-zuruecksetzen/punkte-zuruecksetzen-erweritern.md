# Punkte zurücksetzen erweitern:
Weil ja noch jede\*r dem gegnerischen Team einfach Punkte klauen könnte ohne dass mans merkt können wir der logik noch was hinzufügen:
![erweiterung](code-erweitern.png)
1. setzt aus vielen Bauteilen die Nachricht für den Chat zusammen
    - Spielername mit *Erhalte den (Anzeige-)Name von > Event/target entity*
    - " hat " (Leerzeichen nicht vergessen)
    - *runde > Erhalte Global punktzahl_blau*
    - " Punkte von Blau zurückgesetzt!"
2. Aufpassen, dass die Punkte erst danach auf 0 gesetzt werden, ansonsten wird im Chat immer 0 angezeigt.

Das gleiche natürlich auch noch in dem Code für Orange, damit es für beide Farben passt.
