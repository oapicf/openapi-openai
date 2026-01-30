package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Send this event to truncate a previous assistant message’s audio. The server  will produce audio faster than realtime, so this event is useful when the user  interrupts to truncate audio that has already been sent to the client but not  yet played. This will synchronize the server's understanding of the audio with  the client's playback.  Truncating audio will delete the server-side text transcript to ensure there  is not text in the context that hasn't been heard by the user.  If successful, the server will respond with a `conversation.item.truncated`  event.  
 * @param eventUnderscoreid Optional client-generated ID used to identify this event.
 * @param _type The event type, must be `conversation.item.truncate`.
 * @param itemUnderscoreid The ID of the assistant message item to truncate. Only assistant message  items can be truncated. 
 * @param contentUnderscoreindex The index of the content part to truncate. Set this to 0.
 * @param audioUnderscoreendUnderscorems Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error. 
 */
case class RealtimeClientEventConversationItemTruncate(eventUnderscoreid: Option[String],
                _type: String,
                itemUnderscoreid: String,
                contentUnderscoreindex: Int,
                audioUnderscoreendUnderscorems: Int
                )

object RealtimeClientEventConversationItemTruncate {
    /**
     * Creates the codec for converting RealtimeClientEventConversationItemTruncate from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeClientEventConversationItemTruncate] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeClientEventConversationItemTruncate] = deriveEncoder
}
