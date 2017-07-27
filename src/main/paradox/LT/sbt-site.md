## sbt-siteと連携

[sbt-site]のversion *1.2.1* でのデフォルトのディレクトリが`src/paradox`のため、
設定を以下のように直す必要があります。

@@snip [build.sbt]($root$/build.sbt) { #for_sbt_site }

また、scaladocも併せて見たい場合は、`build.sbt`に以下のpluginを追加することで、`target/site/latest/api`が生成されます。

```scala
enablePlugins(SiteScaladocPlugin)
```

詳細は、[Scaladoc]を参照してください。

paradoxで生成したドキュメントとScaladocを併せて生成したい時は、以下の設定を追加します。

@@snip [build.sbt]($root$/build.sbt) { #for_api_doc }

追加すると、`@scaladoc[Fukuoka](org.grimrose.scala.fukuoka.Fukuoka$)`が @scaladoc[Fukuoka](org.grimrose.scala.fukuoka.Fukuoka$)として参照出来るようになります。

他のライブラリのscaladocへのリンクをしたい場合は、[@scaladoc directive]を参照してください。

### よく使うコマンド

`sbt previewAuto`は、ブラウザでpreviewしつつ、生成しながら作業が出来ます。

`sbt makeSite`は、全てのドキュメントを`target/site`へ生成します。

[sbt-site]: http://github.com/sbt/sbt-site
[Scaladoc]: http://www.scala-sbt.org/sbt-site/api-documentation.html#scaladoc
[@scaladoc directive]: http://developer.lightbend.com/docs/paradox/latest/features/linking.html#scaladoc-directive
