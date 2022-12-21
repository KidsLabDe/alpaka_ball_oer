# Punkte zurücksetzen erweitern:
Weil ja noch jede\*r dem gegnerischen Team einfach Punkte klauen könnte ohne dass mans merkt können wir der logik noch was hinzufügen:
![erweiterung](code-erweitern.png)
1. Wir setzen aus vielen Bauteilen die Nachricht für den Chat zusammen
    - Spielername mit *Erhalte den (Anzeige-)Name von > Event/target entity*
    - " hat " (Leerzeichen nicht vergessen)
    - *runde* ]> *Erhalte Global punktzahl_blau*
    - " Punkte von Blau zurückgesetzt!"
2. Aufpassen, dass die Punkte erst danach auf 0 gesetzt werden, ansonsten wird im Chat immer 0 angezeigt.

{{< notice note Aufgepasst! Platz lassen>}}
Wenn wir mehrere Textbausteine aneinander hängen, müssen wir drauf achten wo die Leerzeichen stehen, sonst wird der Text schwer lesbar ;)  
z.B. vor und nach *hat* ist jeweils ein Leerzeichen.
{{< /notice >

Das gleiche natürlich auch noch in dem Code für Orange, damit es für beide Farben passt.
