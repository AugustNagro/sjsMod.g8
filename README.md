[Modular][mod] template for [Scala.js][sjs]. This is the best solution for managing lots of npm dependencies, but causes a big increase in build time.

Use `sbt new augustnagro/sjsmod.g8` to create a project with:

* [Scala][scala] (2.12.1)
* [SBT][sbt] (>= 0.13.13)
* [Scala.js][sjs] (0.6.13)
* [scalajs-bundler][sjsbundler] (0.3.1)
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
