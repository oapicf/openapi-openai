package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeResponseCreateParamsToolsInner._

case class RealtimeResponseCreateParamsToolsInner (
  /* The type of the tool, i.e. `function`. */
  `type`: Option[`Type`],
/* The name of the function. */
  name: Option[String],
/* The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything).  */
  description: Option[String],
/* Parameters of the function in JSON Schema. */
  parameters: Option[Any])

object RealtimeResponseCreateParamsToolsInner {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Function extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Function" => Some(Function)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Function => "Function"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeResponseCreateParamsToolsInnerCodecJson: CodecJson[RealtimeResponseCreateParamsToolsInner] = CodecJson.derive[RealtimeResponseCreateParamsToolsInner]
  implicit val RealtimeResponseCreateParamsToolsInnerDecoder: EntityDecoder[RealtimeResponseCreateParamsToolsInner] = jsonOf[RealtimeResponseCreateParamsToolsInner]
  implicit val RealtimeResponseCreateParamsToolsInnerEncoder: EntityEncoder[RealtimeResponseCreateParamsToolsInner] = jsonEncoderOf[RealtimeResponseCreateParamsToolsInner]
}
