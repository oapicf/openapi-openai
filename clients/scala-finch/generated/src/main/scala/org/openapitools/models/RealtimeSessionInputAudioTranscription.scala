package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Configuration for input audio transcription, defaults to off and can be  set to `null` to turn off once on. Input audio transcription is not native  to the model, since the model consumes audio directly. Transcription runs  asynchronously through Whisper and should be treated as rough guidance  rather than the representation understood by the model. 
 * @param model The model to use for transcription, `whisper-1` is the only currently  supported model. 
 */
case class RealtimeSessionInputAudioTranscription(model: Option[String]
                )

object RealtimeSessionInputAudioTranscription {
    /**
     * Creates the codec for converting RealtimeSessionInputAudioTranscription from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeSessionInputAudioTranscription] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeSessionInputAudioTranscription] = deriveEncoder
}
