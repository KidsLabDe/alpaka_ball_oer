# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Projekt-Übersicht

OER (Open Educational Resource) für einen Minecraft-Mod-Workshop "Alpaka-Ball" mit MCreator. Das Repo enthält:
- Markdown-basierte Workshop-Anleitung (Kapitel 00–08) im Hugo-Format (mit `{{% notice %}}` Shortcodes)
- Einen MCreator-Workspace (`MCreatorWorkspaces/alpaka_ball/`) mit der fertigen Mod
- Ein Build-Script zur PDF/DOCX/EPUB-Erzeugung

## Build-Kommandos

### Dokumentation bauen (PDF, DOCX, EPUB)

```bash
./build.sh
```

Erzeugt `output.pdf`, `output.docx` und `output.epub` aus den Markdown-Dateien. Benötigt:
- **pandoc** mit `pandoc-latex-environment` Filter
- **LaTeX** mit `eisvogel.latex` Template (muss im Root liegen)
- Das `awesomebox` LaTeX-Paket

## Architektur

### Dokumentationsstruktur
- `_index.md` — Titelseite und Einführung (Hugo-Frontmatter mit Pandoc/Eisvogel-Metadaten)
- `00-Einführung/` bis `08-mod-exportieren/` — Kapitel, jeweils mit `index.md`
- Hugo-Shortcodes (`{{% notice note/task/warning/success %}}`) werden im Build-Script per `sed` in Pandoc-Fenced-Divs (`::: note`, `::: warning`, `::: tip`) konvertiert
- Sprache: Deutsch (`lang: "de"`)

### MCreator-Workspace
- `MCreatorWorkspaces/alpaka_ball/` — vollständiger MCreator-Workspace
- `elements/` — Mod-Elemente als `.mod.json` (Blöcke, Items, Entities, Prozeduren)
- `src/main/` — generierter Java-Quellcode und Ressourcen (Texturen, Blockstates, Models)

## Hinweise

- Alle Inhalte sind auf Deutsch, Lizenz: CC BY 4.0 KidsLab
- Die Online-Version liegt unter: http://kidslab.de/handbuch/mcreator/index.html
- Rechtschreibprüfung ist auf Deutsch konfiguriert (`.vscode/settings.json`)
