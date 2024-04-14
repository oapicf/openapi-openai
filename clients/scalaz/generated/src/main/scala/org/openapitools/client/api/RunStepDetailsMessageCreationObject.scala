package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepDetailsMessageCreationObject._

case class RunStepDetailsMessageCreationObject (
  /* Always `message_creation`. */
  `type`: `Type`,
messageCreation: RunStepDetailsMessageCreationObjectMessageCreation)

object RunStepDetailsMessageCreationObject {
  import DateTimeCodecs._
  sealed trait `Type`
  case object MessageCreation extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "MessageCreation" => Some(MessageCreation)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case MessageCreation => "MessageCreation"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RunStepDetailsMessageCreationObjectCodecJson: CodecJson[RunStepDetailsMessageCreationObject] = CodecJson.derive[RunStepDetailsMessageCreationObject]
  implicit val RunStepDetailsMessageCreationObjectDecoder: EntityDecoder[RunStepDetailsMessageCreationObject] = jsonOf[RunStepDetailsMessageCreationObject]
  implicit val RunStepDetailsMessageCreationObjectEncoder: EntityEncoder[RunStepDetailsMessageCreationObject] = jsonEncoderOf[RunStepDetailsMessageCreationObject]
}
