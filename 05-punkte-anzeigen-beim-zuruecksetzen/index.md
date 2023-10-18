---
Title: "Level 4: Erweiterte Punkteanzeige"
Draft: false
Weight: 50
---

# Level 4: Erweiterte Punkte-Anzeige / Punkte zurücksetzen

Beim Testen und Spielen, ist uns etwas aufgefallen: Jede\*r kann relativ einfach dem anderen Team Punkte klauen - einfach zum Tor schleichen und rechts klicken. Deswegen haben wir uns Folgendes überlegt: Wenn jedes mal eine Nachricht an alle Spieler\*innen gesendet wird, wenn Punkte zurückgesetzt werden, wäre der Betrug schnell enttarnt.  Schau dir mal folgenden Programm-Code an:

![Erweiterung des Codes zum Zurücksetzen](code-erweitern.png)

1. Wir setzen aus vielen Bauteilen die Nachricht für den Chat zusammen  
    - Spielername mit *Erhalte den (Anzeige-)Name von > Event/target entity*
    - " hat " (Leerzeichen nicht vergessen)
    - *runde* ]> *Erhalte Global punktzahl_blau*
    - " Punkte von Blau zurückgesetzt!"
2. Aufpassen, dass die Punkte erst danach auf 0 gesetzt werden, ansonsten wird im Chat immer 0 angezeigt.

Das gleiche auch noch in dem Code für Orange, damit es für beide Farben passt.

{{% notice warning "Aufgepasst! Platz lassen"%}}  
Wenn wir mehrere Textbausteine aneinander hängen, müssen wir drauf achten wo die Leerzeichen stehen, sonst wird der Text schwer lesbar
z.B. vor und nach *hat* ist jeweils ein Leerzeichen.  
{{% /notice %}}

{{% notice task "Testen schadet nie ;)"%}}  
Starte dein Programm und teste alles noch mal! Geht alles?  
Für beide Farben?  
{{% /notice %}}
