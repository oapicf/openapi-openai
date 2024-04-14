package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepDetailsMessageCreationObjectMessageCreation._

case class RunStepDetailsMessageCreationObjectMessageCreation (
  /* The ID of the message that was created by this run step. */
  messageId: String)

object RunStepDetailsMessageCreationObjectMessageCreation {
  import DateTimeCodecs._

  implicit val RunStepDetailsMessageCreationObjectMessageCreationCodecJson: CodecJson[RunStepDetailsMessageCreationObjectMessageCreation] = CodecJson.derive[RunStepDetailsMessageCreationObjectMessageCreation]
  implicit val RunStepDetailsMessageCreationObjectMessageCreationDecoder: EntityDecoder[RunStepDetailsMessageCreationObjectMessageCreation] = jsonOf[RunStepDetailsMessageCreationObjectMessageCreation]
  implicit val RunStepDetailsMessageCreationObjectMessageCreationEncoder: EntityEncoder[RunStepDetailsMessageCreationObjectMessageCreation] = jsonEncoderOf[RunStepDetailsMessageCreationObjectMessageCreation]
}
