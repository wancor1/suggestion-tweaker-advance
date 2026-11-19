# Suggestion Tweaker Advance — Minecraft 26.2 Fabric

[日本語](#日本語)

A Fabric port of [VelizarBG’s Suggestion Tweaker](https://github.com/VelizarBG/suggestion-tweaker) for Minecraft 26.2, with abbreviation matching for command suggestions.

> [!NOTE]
> AI was used to write changes in this fork. The maintainer tried the command completion in-game but has not reviewed the source changes.

## Abbreviation matching

Type `/give @s acle` to find `minecraft:acacia_leaves`, then select the suggestion and press Tab to insert the full ID. Take as many letters as you like from the start of each word, in order:

| Input | Suggestion | Matched parts |
| --- | --- | --- |
| `acle` | `minecraft:acacia_leaves` | `ac` + `le` |
| `adoor` | `minecraft:acacia_door` | `a` + `door` |
| `pdstairs` | `minecraft:polished_deepslate_stairs` | `p` + `d` + `stairs` |
| `pdeepstai` | `minecraft:polished_deepslate_stairs` | `p` + `deep` + `stai` |

Abbreviation matching is on by default. Standard prefix matches rank ahead of abbreviation matches. The original filtering modes, case-sensitivity option, and prefix-based hiding are still available.

The settings screen is available in English, Japanese, Korean, and Chinese (Simplified, Traditional for Taiwan, and Traditional for Hong Kong).

## Installation

- Minecraft **26.2** (Fabric only), Java **25 or newer**, and Fabric Loader **0.20.1 or newer**
- Required: [Cloth Config API](https://modrinth.com/mod/cloth-config) **26.2.155 or newer**, using a Fabric build compatible with Minecraft 26.2
- Optional: [Mod Menu](https://modrinth.com/mod/modmenu) for in-game settings (built against **20.0.3**)

Put the mod JAR and its dependencies in `mods`. If upgrading, remove the old Suggestion Tweaker JAR first.

## Build from source

With JDK 25, run `./gradlew build` from the repository root (`./gradlew.bat build` in Windows PowerShell). The JAR is written to `build/libs/`.

## Credits and license

Original mod by [VelizarBG](https://github.com/VelizarBG/suggestion-tweaker), based on an idea by SnaveSutit. Licensed under the [MIT License](LICENSE).

---

## 日本語

[VelizarBG の Suggestion Tweaker](https://github.com/VelizarBG/suggestion-tweaker) を Minecraft 26.2 の Fabric 向けに移植したフォーク。コマンド補完を絞り込み、欲しい候補を短い入力で探せるようにします。

> [!NOTE]
> このフォークの変更には AI を使っています。メンテナーはゲーム内でコマンド補完を試しましたが、ソースコードの変更箇所はレビューしていません。

## 略称でコマンド補完

たとえば `/give @s acle` と入力すると、`minecraft:acacia_leaves` が候補に出ます。候補を選んで Tab を押すと、正式な ID が入ります。

| 入力 | 候補 | 一致した部分 |
| --- | --- | --- |
| `acle` | `minecraft:acacia_leaves` | `ac` + `le` |
| `adoor` | `minecraft:acacia_door` | `a` + `door` |
| `pdstairs` | `minecraft:polished_deepslate_stairs` | `p` + `d` + `stairs` |
| `pdeepstai` | `minecraft:polished_deepslate_stairs` | `p` + `deep` + `stai` |
| `pds` | `minecraft:polished_deepslate_stairs` | `p` + `d` + `s` |

各単語の先頭から好きな長さだけ取って、元の順番でつなげられます。略称検索はデフォルトでオン。先頭一致の候補は略称一致より上に表示されます。元の絞り込みモード、大文字・小文字の区別、特定の接頭辞で始まる候補の非表示も引き続き使えます。

設定画面の言語：英語、日本語、韓国語、中国語（簡体字・台湾繁体字・香港繁体字）。

## インストール

- Minecraft **26.2**（Fabric 専用）、Java **25 以上**、Fabric Loader **0.20.1 以上**
- 必須：[Cloth Config API](https://modrinth.com/mod/cloth-config) の Fabric 版 **26.2.155 以上**（Minecraft 26.2 対応版）
- 任意：[Mod Menu](https://modrinth.com/mod/modmenu)（ゲーム内で設定を変更する場合。ビルド時の参照バージョンは **20.0.3**）

Mod の JAR と依存 Mod を `mods` フォルダに入れます。更新する場合は、旧版の Suggestion Tweaker の JAR と入れ替えてください。

## ソースからビルド

JDK 25 を使い、リポジトリのルートで `./gradlew build`（Windows PowerShell では `./gradlew.bat build`）を実行します。JAR は `build/libs/` に生成されます。

## クレジット・ライセンス

オリジナルは [VelizarBG / Suggestion Tweaker](https://github.com/VelizarBG/suggestion-tweaker)。元のアイデアは SnaveSutit。ライセンスは [MIT](LICENSE) です。
