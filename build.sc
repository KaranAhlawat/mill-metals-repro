import mill._
import mill.scalalib._

object root extends RootModule with ScalaModule {
  def scalaVersion: T[String] = "3.3.1"
}
