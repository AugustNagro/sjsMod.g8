[Modular][mod] template for [Scala.js][sjs]. This is the best solution for managing lots of npm dependencies, but causes a big increase in build time.

Use `sbt new augustnagro/sjsmod.g8` to create a project with:

* [Scala][scala] (2.12.2)
* [SBT][sbt] (>= 0.13.15)
* [Scala.js][sjs] (0.6.15)
* [scalajs-bundler][sjsbundler] (0.5.0)
* [ScalaCheck][scheck] (latest release)

Requires:
* npm

Reasoning for the template's settings are detailed [here][post]

License: Creative Commons Zero v1.0
http://choosealicense.com/licenses/cc0-1.0/#

[mod]: https://scalacenter.github.io/scalajs-bundler/motivation.html 
[g8]: http://www.foundweekends.org/giter8/
[sjs]: https://www.scala-js.org
[post]: https://augustnagro.com//Giter8-Scala-Templates.html
[scala]: scala-lang.org
[sbt]: http://www.scala-sbt.org/
[scheck]: http://www.scalacheck.org
[sjsbundler]: https://scalacenter.github.io/scalajs-bundler/
