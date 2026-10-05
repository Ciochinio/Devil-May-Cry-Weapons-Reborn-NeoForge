# DMC Weapons Reborn - Game Design Document (Living Draft)

This document describes the design of DMC Weapons Reborn: what each system is meant to do, how it
should feel to play, and the rules that govern it. It records the current, committed design. It
starts as a skeleton and is filled in as development progresses.

DMC Weapons Reborn is not a standalone game. It adds Devil May Cry combat to Minecraft: the player
still mines, builds, and explores, but DMC weapons turn every fight into a chance to show off.
Moves, combos, a Style meter, Devil Trigger, and Styles all live on the DMC weapons; the rest of
Minecraft is left alone.

Balance values likely to change during tuning are written in **bold**, so the numbers to revisit
are easy to spot. Anything marked **TBD** has not been designed yet.

## Table of Contents

1. [Summary](#1-summary)
2. [Combat and Controls](#2-combat-and-controls)
3. [Style Meter](#3-style-meter)
4. [Devil Trigger](#4-devil-trigger)
5. [Moves](#5-moves)
6. [Styles](#6-styles)
7. [Progression: Red Orbs and the Divinity Statue](#7-progression-red-orbs-and-the-divinity-statue)
8. [Animations](#8-animations)
9. [Content Appendix](#9-content-appendix)
10. [Open Questions](#10-open-questions)

---

## 1. Summary

### Design Pillars

- **Style over damage.** The game rewards fighting *well*, not just fighting. Varying moves, not
  getting hit, and switching Styles mid-combo is how you climb the Style rank, and rank is what
  pays out.
- **Every weapon plays differently.** A Devil Arm is not a damage number with a model. Each one
  has its own move list, its own Devil Trigger flavour, and its own rhythm.
- **Readable in the middle of a fight.** Style rank, Devil Trigger, and the active Style are always
  visible at a glance, without opening a screen.
- **No extra downloads.** Everything, including player animations, is built into the mod. No
  required library mods.
- **Content grows one move at a time.** Moves are self-contained pieces of content: a definition
  plus an effect. New moves drop in without touching the systems underneath.

### Key Features

- **DMC weapons take over combat.** With a DMC weapon in hand, attacking runs the mod's own move
  system instead of the vanilla swing.
- **Moves and combos** for every weapon, triggered by attacking with a modifier (sprinting,
  sneaking, in the air) or the skill key.
- **Style meter** from D to SSS that rises with varied, uninterrupted offence and drops when you get
  hit.
- **Devil Trigger**: a segmented gauge you fill in combat and release for a powered-up demon form.
- **Styles**: Trickster, Swordmaster, Gunslinger, and Royal Guard, each adding its own action.
- **Red Orbs** dropped by enemies, spent at the Divinity Statue on new moves and Devil Trigger
  segments.
- **Custom player animations** for moves, built into the mod.

### At a Glance

| | |
|--|--|
| Platform | Minecraft 26.x, NeoForge 26 (migration from 1.21.1 pending) |
| Tooling | MCreator (latest) with Blockly first; custom Java where Blockly can't do the job |
| Type | Content and systems addition (not a total conversion) |
| Focus | PvE. Multiplayer compatible, not balanced for PvP |
| Dependencies | None beyond NeoForge |

---

## 2. Combat and Controls

### Replacement, not addition

While a DMC weapon is in the main hand, the vanilla attack is replaced. A left-click never reaches
vanilla's attack; the mod reads the input, picks the right move, and deals its own damage. With
any other item in hand, Minecraft combat is unchanged.

### Inputs

Minecraft has no lock-on or stick directions, so moves are chosen by **context + attack**:

| Input | Meaning |
|-------|---------|
| Attack | Next step of the weapon's basic combo |
| Sprint + Attack | Dash move (e.g. Stinger) |
| Sneak + Attack | Launcher / special (e.g. High Time) |
| Airborne + Attack | Aerial move (e.g. Helm Breaker, Aerial Rave) |
| Skill key | The weapon's signature skill (e.g. Judgment Cut) |
| Style Action key | The active Style's action (see [Styles](#6-styles)) |

Basic combos are strings of attacks; pausing between attacks inside a timing window can branch
into a different string. Exact windows are **TBD**.

### Keybinds

| Key | Action | Default |
|-----|--------|---------|
| Devil Trigger | Activate / deactivate DT | **TBD** |
| Taunt | Taunt (builds Style and DT) | **TBD** |
| Skill | Weapon signature skill | **TBD** |
| Style Action | Active Style's action | **TBD** |
| Cycle Style | Switch to the next Style | **TBD** |
| Trickster / Swordmaster / Gunslinger / Royal Guard | Switch directly to that Style | Unbound |

The four direct Style keys ship unbound so new players aren't flooded with keys; the cycle key
covers them until a player chooses to bind direct keys.

### Damage

DMC weapons deal damage through the mod's own damage handling rather than the vanilla attack. Each
move sets its own damage. How move damage, Style rank, and Devil Trigger combine is **TBD**.

---

## 3. Style Meter

### The Fantasy

The Style meter is DMC's judge. It watches how you fight and grades you live, from **D** to
**SSS**. Fighting well makes the letter climb; getting hit knocks it down. The rank letter on
screen, sliding in and shaking as it climbs, is the single strongest "this is Devil May Cry"
signal in the mod.

### Ranks

| Rank | Name |
|------|------|
| D | Dismal |
| C | Crazy |
| B | Badass |
| A | Apocalyptic |
| S | Savage! |
| SS | Sick Skills!! |
| SSS | Smokin' Sexy Style!! |

### Rules

- **Gaining points.** Every hit adds Style points. Each move has its own Style value.
- **Variety.** Repeating the same move gives less and less. A move you haven't used recently gives
  full value. Switching Styles mid-fight also counts as variety.
- **Taunting** adds Style points.
- **Decay.** Points drain over time when you aren't landing hits. Higher ranks drain faster.
- **Getting hit** drops your rank sharply (**TBD**: one full rank, or more).
- **Leaving combat** resets the meter.

### What rank gives you

- More Red Orbs from kills.
- Faster Devil Trigger gain.
- Possibly a small damage bonus at high ranks (**TBD**).

### HUD

The rank letter and its fill bar sit on the right side of the screen. It appears when you enter
combat, animates on rank-up and rank-down, and fades out after combat ends.

---

## 4. Devil Trigger

### The Fantasy

Devil Trigger is the demon inside letting loose. You build it by fighting with style, then release
it to become faster, tougher, and stronger for a short, explosive stretch.

### The Gauge

- Shown as **segments**. Players start with **3** segments and can buy more, up to **10**, with
  Red Orbs.
- **Fills** from dealing damage (scaled by Style rank), taunting, and slightly from taking damage.
- **Activation** needs at least **3** full segments. Press the DT key to activate, again to end it
  early.
- **Drains** every second while active (**TBD** rate). DT ends when the gauge is empty.

### Effects While Active

- **Super armor**: no knockback and no hit-stagger.
- More damage and faster attacks.
- Health regeneration.
- **DT burst** on activation: a shockwave that knocks back nearby enemies, so activating DT is also
  an escape.
- **DT versions of moves**: some moves change while in DT (e.g. Stinger hits several times,
  Judgment Cut covers a larger area).

All magnitudes are **TBD**.

### Forms

The weapon in hand decides the Devil Trigger form: Rebellion gives Dante's, Yamato gives Vergil's,
Devil Sword Sparda gives the Sparda form, and so on. Each form looks different and may carry its
own small perk (e.g. Yamato DT makes Judgment Cut free). Per-weapon perks are **TBD**.

### Visuals

The demon form is drawn as an extra layer over the player, the way armor is drawn, with its own
model and texture per form. It is combined with an aura (red or blue), glowing eyes, and an
activation sound sting.

---

## 5. Moves

### How moves work

Every move is one self-contained piece of content:

- **Definition**: which weapon, which input, ground or air, Style value, cooldown, Red Orb unlock
  cost, animation, and whether it has a DT version.
- **Effect**: what the move actually does: dash, launch, area damage, knockback, projectiles. The
  effect is a Blockly procedure wherever possible.

The move system itself (reading inputs, picking the move, cancelling vanilla, timing windows,
playing animations, syncing to other players) is built once in Java. Adding a move after that is
a definition, an effect, and an animation.

### Unlocking

Each weapon starts with its basic combo and **1** move. The rest are bought at the
[Divinity Statue](#7-progression-red-orbs-and-the-divinity-statue).

### Gun moves and juggling

Guns get their own moves (charge shots, spin fire). Shooting an enemy that is in the air keeps it
in the air longer, so guns can juggle launched enemies. Rules are **TBD**.

Per-weapon move lists are in the [Content Appendix](#move-lists).

---

## 6. Styles

### The Fantasy

Styles are fighting modes the player switches between, even mid-combo. Each Style adds one action
on the Style Action key. Switching between them is part of fighting with style, and the Style meter
rewards it.

### Selecting

- One key per Style switches straight to it (unbound by default).
- A cycle key steps through the Styles in order.
- Switching is instant and doesn't interrupt the current move.
- The active Style is shown on the HUD.

### The Four Styles

| Style | Style Action | Feel |
|-------|--------------|------|
| **Trickster** | Dash in the direction you're moving; air-dash while airborne | Mobility, dodging |
| **Swordmaster** | An extra sword move, different for each melee weapon | More melee moves |
| **Gunslinger** | An extra gun move, different for each gun | Ranged and juggling |
| **Royal Guard** | Block; pressed just before a hit, it becomes a parry. Blocking builds a gauge released as a counter | High risk, high reward |

Exact actions and numbers are **TBD**.

---

## 7. Progression: Red Orbs and the Divinity Statue

### Red Orbs

- Enemies drop Red Orbs when killed. Higher Style rank at the time of the kill means more orbs.
- Orbs are a currency tracked on the player (not inventory items) and shown on the HUD when they
  change. Whether orbs are kept on death is **TBD**.

### Divinity Statue

- A placeable block. Using it opens the shop.
- The shop sells **moves** for each weapon and **Devil Trigger segments**.
- Prices rise as you buy more (**TBD**).
- How players get a Divinity Statue (crafting, world generation, or both) is **TBD**.

---

## 8. Animations

- Moves play custom player animations: arms, body, legs, head, and the held weapon.
- The animation system is built into the mod. No extra mods are needed.
- Animations are stored in Blockbench's format, so any of them can be opened and polished in
  Blockbench later.
- Other players see your animations in multiplayer.
- The goal is readable, punchy motion that fits Minecraft, not cinematic smoothness.
- A test command replays and reloads animations in-game for fast tuning.

---

## 9. Content Appendix

### Current Weapons

**Swords**

| Weapon | Wielder | Notes |
|--------|---------|-------|
| Rebellion | Dante | |
| Yamato | Vergil | |
| Devil Sword Dante | Dante | |
| Devil Sword Sparda | Sparda | |
| Red Queen | Nero | Has Exceed (rev) in DMC |

**Guns**

| Weapon | Ammo |
|--------|------|
| Ebony | None |
| Ivory | None |
| Blue Rose | Blue Rose Bullet |
| Coyote-A | None (spread shot) |
| Kalina Ann I | Kalina Ann 1 Bullet |
| Kalina Ann II | Kalina Ann 2 Bullet |

**Other**

| Item | Notes |
|------|-------|
| Dr. Faust | Helmet. Joke item for now: grants massive Strength while worn |

### Move Lists

First drafts, to be extended. Inputs refer to [Inputs](#inputs).

| Weapon | Sprint + Attack | Sneak + Attack | Airborne + Attack | Skill |
|--------|-----------------|----------------|-------------------|-------|
| Rebellion | Stinger | High Time | Helm Breaker | Million Stab |
| Yamato | Rapid Slash | Upper Slash | Aerial Rave | Judgment Cut |
| Red Queen | Streak | High Roller | Split | Exceed |
| Devil Sword Dante | **TBD** | **TBD** | **TBD** | **TBD** |
| Devil Sword Sparda | **TBD** | **TBD** | **TBD** | **TBD** |
| Guns | **TBD** | | | |

---

## 10. Open Questions

- Default keys for DT, taunt, skill, Style Action, and cycle Style.
- Combo timing windows and how pauses branch a combo.
- How move damage, Style rank, and DT combine.
- Do Red Orbs survive death?
- How players get a Divinity Statue.
- Dr. Faust is a joke item for now. Should it later become a real item in its DMC5 role (spending
  Red Orbs for big damage)?
- Do guns use the same Style meter values as swords, or their own?
