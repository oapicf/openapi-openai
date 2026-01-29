package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateThreadAndRunRequestToolsInner._

case class CreateThreadAndRunRequestToolsInner (
  /* The type of tool being defined: `code_interpreter` */
  `type`: `Type`,
function: FunctionObject)

object CreateThreadAndRunRequestToolsInner {
  import DateTimeCodecs._
  sealed trait `Type`
  case object CodeInterpreter extends `Type`
  case object Retrieval extends `Type`
  case object Function extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "CodeInterpreter" => Some(CodeInterpreter)
      case "Retrieval" => Some(Retrieval)
      case "Function" => Some(Function)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case CodeInterpreter => "CodeInterpreter"
      case Retrieval => "Retrieval"
      case Function => "Function"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val CreateThreadAndRunRequestToolsInnerCodecJson: CodecJson[CreateThreadAndRunRequestToolsInner] = CodecJson.derive[CreateThreadAndRunRequestToolsInner]
  implicit val CreateThreadAndRunRequestToolsInnerDecoder: EntityDecoder[CreateThreadAndRunRequestToolsInner] = jsonOf[CreateThreadAndRunRequestToolsInner]
  implicit val CreateThreadAndRunRequestToolsInnerEncoder: EntityEncoder[CreateThreadAndRunRequestToolsInner] = jsonEncoderOf[CreateThreadAndRunRequestToolsInner]
}
