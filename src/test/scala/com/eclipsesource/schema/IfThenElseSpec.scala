package com.eclipsesource.schema

import com.eclipsesource.schema.drafts.Version7
import com.eclipsesource.schema.test.JsonSpec
import org.specs2.mutable.Specification

class IfThenElseSpec extends Specification with JsonSpec {
  import Version7._
  implicit val validator = SchemaValidator(Some(Version7))
  validate("if-then-else", "draft7")
}
