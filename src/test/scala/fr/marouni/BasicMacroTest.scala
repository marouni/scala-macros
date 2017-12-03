package fr.marouni

import org.specs2.mutable._

class BasicMacroTest extends Specification {

  "A basic macro" should {
    "be callable" in {
        MyMacros.max(1, 2) must_== 2
    }
  }

}
