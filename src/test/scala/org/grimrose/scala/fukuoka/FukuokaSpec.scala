// #snippet_fukuoka_spec
package org.grimrose.scala.fukuoka

import org.scalatest.{DiagrammedAssertions, FlatSpec}

class FukuokaSpec extends FlatSpec with DiagrammedAssertions {

  behavior of "Fukuoka"

  it should "be awesome" in {
    assert(Fukuoka.isAwesome)
  }

}

// #snippet_fukuoka_spec
