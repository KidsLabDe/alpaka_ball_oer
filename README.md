# Alpaka-Ball – Erstelle deine eigene Minecraft-Mod!

![Titelbild](assets/Titelbild.png)

**Alpaka-Ball** ist ein Open Educational Resource (OER) Workshop, in dem Kinder und Jugendliche ab 10 Jahren lernen, mit [MCreator](https://mcreator.net/) ihre eigene Minecraft-Mod zu erstellen – ganz ohne Programmierkenntnisse!

Die Spielidee ist angelehnt an Quidditch aus Harry Potter und eingebettet in den [Jugend hackt](https://jugendhackt.org/)-Kontext, mit dem Alpaka als Maskottchen.

**Video-Einführung:** In diesem Video lernst du die Basics – in 30 Minuten ist MCreator installiert und die erste eigene Mod fertig:
[MCreator Einführung auf YouTube](https://www.youtube.com/watch?v=QeViHXM0aFQ)

## Downloads

|  | Format | Link |
|--|--------|------|
| 📄 | **PDF** | [OER mCreator Mod - Alpaka-Ball.pdf](https://github.com/KidsLabDe/alpaka_ball_oer/raw/main/docs/OER%20mCreator%20Mod%20-%20Alpaka-Ball.pdf) |
| 📄 | **PDF (A5 Druckversion)** | [OER mCreator Mod - Alpaka-Ball A5 Druck ver 1.pdf](https://github.com/KidsLabDe/alpaka_ball_oer/raw/main/docs/OER%20mCreator%20Mod%20-%20Alpaka-Ball%20A5%20Druck%20ver%201.pdf) |
| 📖 | **EPUB** | [OER mCreator Mod - Alpaka-Ball.epub](https://github.com/KidsLabDe/alpaka_ball_oer/raw/main/docs/OER%20mCreator%20Mod%20-%20Alpaka-Ball.epub) |
| 📝 | **DOCX** | [OER mCreator Mod - Alpaka-Ball.docx](https://github.com/KidsLabDe/alpaka_ball_oer/raw/main/docs/OER%20mCreator%20Mod%20-%20Alpaka-Ball.docx) |
| 🌐 | **Online** | [kidslab.de/handbuch/mcreator](http://kidslab.de/handbuch/mcreator/index.html) |

## Workshop-Inhalt

Der Workshop ist in 8 Kapitel gegliedert, die als Einzel-Workshops (je 1–2h) oder als Tages-Workshop durchgeführt werden können:

| Nr. | Kapitel |
|-----|---------|
| 00 | Einführung in MCreator & unser Projekt |
| 01 | Projekt erstellen |
| 02 | Ball erstellen |
| 03 | Tor erstellen |
| 04 | Punkte zählen |
| 05 | Punkte anzeigen & Zurücksetzen |
| 06 | Gegenstand erstellen (Schläger) |
| 07 | Arena bauen |
| 08 | Mod exportieren |

## Voraussetzungen

| | |
|-|-|
| **Software** | [MCreator](https://mcreator.net/download) |
| **Geräte** | Computer pro Teilnehmer\*in & Mentor\*in, Beamer |
| **Internet** | Ja, MCreator benötigt eine Internetverbindung |
| **Minecraft-Account** | Nicht nötig – Mods können auch ohne Account getestet werden |
| **Empfohlen** | 10 Teilnehmer\*innen + 2 Mentor\*innen |

## Selber bauen

Die Dokumentation kann mit Pandoc aus den Markdown-Quellen neu erzeugt werden:

```bash
./build.sh
```

Erzeugt `output.pdf`, `output.docx` und `output.epub`. Benötigt [Pandoc](https://pandoc.org/), LaTeX mit dem [Eisvogel-Template](https://github.com/Wandmalfarbe/pandoc-latex-template) und den `pandoc-latex-environment`-Filter.

## MCreator-Workspace

Der Ordner `MCreatorWorkspaces/alpaka_ball/` enthält den vollständigen MCreator-Workspace mit der fertigen Mod. Dieser kann direkt in MCreator geöffnet werden.

## Lizenz

**CC BY 4.0** – [KidsLab.de gGmbH](https://kidslab.de)

Autoren: MatzE, KingBBQ
