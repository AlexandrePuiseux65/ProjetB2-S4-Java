# Projet Puissance 4 en Java

## Objectif

Ce projet vise à réaliser un jeu Puissance 4 jouable sur une interface graphique en Java, tout en intégrant la connectivité à une base de données via ODBC.

## Présentation du jeu

Le Puissance 4 est un jeu de stratégie pour deux joueurs qui se joue sur une grille de 6 lignes par 7 colonnes. L'objectif est d'aligner quatre pions consécutifs horizontalement, verticalement ou en diagonale.

### Règles du jeu

- Les joueurs jouent à tour de rôle, le premier joueur commence.
- Un joueur choisit une colonne pour y placer son pion, qui tombe dans la position la plus basse disponible.
- Le jeu se termine quand un joueur aligne quatre de ses pions ou que la grille est entièrement remplie.
- En cas de grille complète sans alignement, la partie est nulle.
- Les parties se succèdent avec alternance du joueur débutant.

## Démarrage

Au lancement, un menu interactif permet de choisir entre joueur humain ou IA, et de fournir un nom pour chaque joueur.

### Exemple de démarrage

- Joueur 1 : Humain (Joe)
- Joueur 2 : IA (Dark Vador)

## Étapes de Développement

1. **Interface Graphique** : Menu de démarrage permettant la sélection des joueurs et l'affichage de la grille de jeu.
2. **Gestionnaire de Partie** : Gestion de l'état de la grille, des tours, et enregistrement des scores.
3. **Joueurs** :
   - Humain : Interaction via l'interface graphique.
   - IA : Mouvements automatiques, choix aléatoire des colonnes.
4. **Historique de Partie** : Enregistrement des parties dans un fichier `log.txt` à la racine du projet.
5. **Gestion des Erreurs** : Détection et gestion des erreurs avec affichage des messages appropriés.
6. **Fonctionnalité Additionnelle** : Blocage temporaire de colonnes pour ajouter une dimension stratégique au jeu.

## Blocage Temporaire de Colonnes

Cette fonctionnalité permet de bloquer une colonne pour un nombre défini de tours, empêchant l'adversaire de l'utiliser.

### Exemple d'utilisation

- `bloquer 3` : Le joueur 1 bloque la colonne 3 pour 3 tours.
- Pendant ce temps, le joueur 2 peut jouer dans les autres colonnes.
- `debloquer 3` : La colonne 3 est à nouveau disponible après les 3 tours.

## Installation et Utilisation

Expliquer ici comment installer et démarrer le jeu, y compris toute dépendance nécessaire.

## Contribution

Instructions pour ceux qui souhaitent contribuer au projet.

## Licence

Spécifier la licence sous laquelle le projet est publié, s'il y en a une.
