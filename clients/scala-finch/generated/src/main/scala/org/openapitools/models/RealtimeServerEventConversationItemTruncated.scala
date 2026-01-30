package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Returned when an earlier assistant audio message item is truncated by the  client with a `conversation.item.truncate` event. This event is used to  synchronize the server's understanding of the audio with the client's playback.  This action will truncate the audio and remove the server-side text transcript  to ensure there is no text in the context that hasn't been heard by the user. 
 * @param eventUnderscoreid The unique ID of the server event.
 * @param _type The event type, must be `conversation.item.truncated`.
 * @param itemUnderscoreid The ID of the assistant message item that was truncated.
 * @param contentUnderscoreindex The index of the content part that was truncated.
 * @param audioUnderscoreendUnderscorems The duration up to which the audio was truncated, in milliseconds. 
 */
case class RealtimeServerEventConversationItemTruncated(eventUnderscoreid: String,
                _type: String,
                itemUnderscoreid: String,
                contentUnderscoreindex: Int,
                audioUnderscoreendUnderscorems: Int
                )

object RealtimeServerEventConversationItemTruncated {
    /**
     * Creates the codec for converting RealtimeServerEventConversationItemTruncated from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventConversationItemTruncated] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventConversationItemTruncated] = deriveEncoder
}
