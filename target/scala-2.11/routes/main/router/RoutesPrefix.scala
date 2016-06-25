
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/bgi056/IdeaProjects/play-java-intro/conf/routes
// @DATE:Sat Jun 18 21:02:05 EDT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
