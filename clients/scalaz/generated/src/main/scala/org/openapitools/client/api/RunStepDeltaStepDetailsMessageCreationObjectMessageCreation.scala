package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepDeltaStepDetailsMessageCreationObjectMessageCreation._

case class RunStepDeltaStepDetailsMessageCreationObjectMessageCreation (
  /* The ID of the message that was created by this run step. */
  messageId: Option[String])

object RunStepDeltaStepDetailsMessageCreationObjectMessageCreation {
  import DateTimeCodecs._

  implicit val RunStepDeltaStepDetailsMessageCreationObjectMessageCreationCodecJson: CodecJson[RunStepDeltaStepDetailsMessageCreationObjectMessageCreation] = CodecJson.derive[RunStepDeltaStepDetailsMessageCreationObjectMessageCreation]
  implicit val RunStepDeltaStepDetailsMessageCreationObjectMessageCreationDecoder: EntityDecoder[RunStepDeltaStepDetailsMessageCreationObjectMessageCreation] = jsonOf[RunStepDeltaStepDetailsMessageCreationObjectMessageCreation]
  implicit val RunStepDeltaStepDetailsMessageCreationObjectMessageCreationEncoder: EntityEncoder[RunStepDeltaStepDetailsMessageCreationObjectMessageCreation] = jsonEncoderOf[RunStepDeltaStepDetailsMessageCreationObjectMessageCreation]
}
