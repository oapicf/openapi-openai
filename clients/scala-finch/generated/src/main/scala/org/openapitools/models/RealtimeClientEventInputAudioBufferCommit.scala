package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Send this event to commit the user input audio buffer, which will create a  new user message item in the conversation. This event will produce an error  if the input audio buffer is empty. When in Server VAD mode, the client does  not need to send this event, the server will commit the audio buffer  automatically.  Committing the input audio buffer will trigger input audio transcription  (if enabled in session configuration), but it will not create a response  from the model. The server will respond with an `input_audio_buffer.committed`  event. 
 * @param eventUnderscoreid Optional client-generated ID used to identify this event.
 * @param _type The event type, must be `input_audio_buffer.commit`.
 */
case class RealtimeClientEventInputAudioBufferCommit(eventUnderscoreid: Option[String],
                _type: String
                )

object RealtimeClientEventInputAudioBufferCommit {
    /**
     * Creates the codec for converting RealtimeClientEventInputAudioBufferCommit from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeClientEventInputAudioBufferCommit] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeClientEventInputAudioBufferCommit] = deriveEncoder
}
