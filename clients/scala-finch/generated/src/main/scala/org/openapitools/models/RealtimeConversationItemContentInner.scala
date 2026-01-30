package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param _type The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
 * @param text The text content, used for `input_text` and `text` content types. 
 * @param id ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items. 
 * @param audio Base64-encoded audio bytes, used for `input_audio` content type. 
 * @param transcript The transcript of the audio, used for `input_audio` content type. 
 */
case class RealtimeConversationItemContentInner(_type: Option[String],
                text: Option[String],
                id: Option[String],
                audio: Option[String],
                transcript: Option[String]
                )

object RealtimeConversationItemContentInner {
    /**
     * Creates the codec for converting RealtimeConversationItemContentInner from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeConversationItemContentInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeConversationItemContentInner] = deriveEncoder
}
