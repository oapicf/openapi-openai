package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RealtimeResponseCreateParams

/**
 * This event instructs the server to create a Response, which means triggering  model inference. When in Server VAD mode, the server will create Responses  automatically.  A Response will include at least one Item, and may have two, in which case  the second will be a function call. These Items will be appended to the  conversation history.  The server will respond with a `response.created` event, events for Items  and content created, and finally a `response.done` event to indicate the  Response is complete.  The `response.create` event includes inference configuration like  `instructions`, and `temperature`. These fields will override the Session's  configuration for this Response only. 
 * @param eventUnderscoreid Optional client-generated ID used to identify this event.
 * @param _type The event type, must be `response.create`.
 * @param response 
 */
case class RealtimeClientEventResponseCreate(eventUnderscoreid: Option[String],
                _type: String,
                response: Option[RealtimeResponseCreateParams]
                )

object RealtimeClientEventResponseCreate {
    /**
     * Creates the codec for converting RealtimeClientEventResponseCreate from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeClientEventResponseCreate] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeClientEventResponseCreate] = deriveEncoder
}
