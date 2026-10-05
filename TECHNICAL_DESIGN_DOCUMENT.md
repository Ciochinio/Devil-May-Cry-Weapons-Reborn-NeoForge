# DMC Weapons Reborn - Technical Design Document (Living Draft)

This document is the companion to `GAME_DESIGN_DOCUMENT.md`.

The GDD says **what** a system is for and how it should feel. This document says **how it is
built** and **how to change it** without breaking it. If you are about to touch one of these
systems, read its chapter first. When the obvious approach does not work, the reason is recorded
here so nobody rediscovers it the hard way.

Anything marked **tunable** is a value you are expected to change. Anything described as a
*contract* is load-bearing: other parts of the build assume it holds.

Chapters are added as each system is built.

## Table of Contents

1. [Project Setup](#1-project-setup)

---

## 1. Project Setup

### 1.1 Platform

| | |
|--|--|
| Minecraft | 26.x (migration from 1.21.1 pending) |
| Loader | NeoForge 26 |
| Tooling | MCreator (latest) |
| Mod id | `devil_may_cry_weapons_reborn` |
| Java package | `net.rbm.devilmaycryweaponsreborn` |

### 1.2 Blockly first, Java where needed

Content is built in MCreator Blockly wherever Blockly can do the job. Custom Java is used only
where Blockly can't, and each Java system gets a chapter here explaining why it is not Blockly.
