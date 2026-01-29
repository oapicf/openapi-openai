package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepDeltaObjectDeltaStepDetails._

case class RunStepDeltaObjectDeltaStepDetails (
  /* Always `message_creation`. */
  `type`: `Type`,
messageCreation: Option[RunStepDeltaStepDetailsMessageCreationObjectMessageCreation],
/* An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`.  */
  toolCalls: Option[List[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner]])

object RunStepDeltaObjectDeltaStepDetails {
  import DateTimeCodecs._
  sealed trait `Type`
  case object MessageCreation extends `Type`
  case object ToolCalls extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "MessageCreation" => Some(MessageCreation)
      case "ToolCalls" => Some(ToolCalls)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case MessageCreation => "MessageCreation"
      case ToolCalls => "ToolCalls"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RunStepDeltaObjectDeltaStepDetailsCodecJson: CodecJson[RunStepDeltaObjectDeltaStepDetails] = CodecJson.derive[RunStepDeltaObjectDeltaStepDetails]
  implicit val RunStepDeltaObjectDeltaStepDetailsDecoder: EntityDecoder[RunStepDeltaObjectDeltaStepDetails] = jsonOf[RunStepDeltaObjectDeltaStepDetails]
  implicit val RunStepDeltaObjectDeltaStepDetailsEncoder: EntityEncoder[RunStepDeltaObjectDeltaStepDetails] = jsonEncoderOf[RunStepDeltaObjectDeltaStepDetails]
}
