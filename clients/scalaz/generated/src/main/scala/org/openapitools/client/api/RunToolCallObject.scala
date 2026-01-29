package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunToolCallObject._

case class RunToolCallObject (
  /* The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint. */
  id: String,
/* The type of tool call the output is required for. For now, this is always `function`. */
  `type`: `Type`,
function: RunToolCallObjectFunction)

object RunToolCallObject {
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

  implicit val RunToolCallObjectCodecJson: CodecJson[RunToolCallObject] = CodecJson.derive[RunToolCallObject]
  implicit val RunToolCallObjectDecoder: EntityDecoder[RunToolCallObject] = jsonOf[RunToolCallObject]
  implicit val RunToolCallObjectEncoder: EntityEncoder[RunToolCallObject] = jsonEncoderOf[RunToolCallObject]
}
