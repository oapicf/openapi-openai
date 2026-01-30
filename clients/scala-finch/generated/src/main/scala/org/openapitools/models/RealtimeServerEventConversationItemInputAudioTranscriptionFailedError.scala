package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Details of the transcription error.
 * @param _type The type of error.
 * @param code Error code, if any.
 * @param message A human-readable error message.
 * @param param Parameter related to the error, if any.
 */
case class RealtimeServerEventConversationItemInputAudioTranscriptionFailedError(_type: Option[String],
                code: Option[String],
                message: Option[String],
                param: Option[String]
                )

object RealtimeServerEventConversationItemInputAudioTranscriptionFailedError {
    /**
     * Creates the codec for converting RealtimeServerEventConversationItemInputAudioTranscriptionFailedError from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventConversationItemInputAudioTranscriptionFailedError] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventConversationItemInputAudioTranscriptionFailedError] = deriveEncoder
}
