## 導入

以下の手順で、簡単に導入できます。

1. sbt-pluginを追加する。

    @@snip [plugins.sbt]($root$/project/plugins.sbt) { #snip_sbt_plugin }

1. paradox用のディレクトリ(pluginのデフォルトは`src/main/paradox`)を作る。
1. `index.md`を上記のディレクトリの直下に置く。
1. `sbt paradox`で生成する。
1. `target/paradox/site/main/index.html`をブラウザで開く。

詳細については、公式の[Setup](http://developer.lightbend.com/docs/paradox/latest/index.html#setup)を見てください。
