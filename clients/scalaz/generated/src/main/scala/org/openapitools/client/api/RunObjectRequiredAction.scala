package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunObjectRequiredAction._

case class RunObjectRequiredAction (
  /* For now, this is always `submit_tool_outputs`. */
  `type`: `Type`,
submitToolOutputs: RunObjectRequiredActionSubmitToolOutputs)

object RunObjectRequiredAction {
  import DateTimeCodecs._
  sealed trait `Type`
  case object SubmitToolOutputs extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "SubmitToolOutputs" => Some(SubmitToolOutputs)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case SubmitToolOutputs => "SubmitToolOutputs"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RunObjectRequiredActionCodecJson: CodecJson[RunObjectRequiredAction] = CodecJson.derive[RunObjectRequiredAction]
  implicit val RunObjectRequiredActionDecoder: EntityDecoder[RunObjectRequiredAction] = jsonOf[RunObjectRequiredAction]
  implicit val RunObjectRequiredActionEncoder: EntityEncoder[RunObjectRequiredAction] = jsonEncoderOf[RunObjectRequiredAction]
}
