package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RealtimeSessionCreateRequest

/**
 * Send this event to update the session’s default configuration. The client may  send this event at any time to update the session configuration, and any  field may be updated at any time, except for \"voice\". The server will respond  with a `session.updated` event that shows the full effective configuration.  Only fields that are present are updated, thus the correct way to clear a  field like \"instructions\" is to pass an empty string. 
 * @param eventUnderscoreid Optional client-generated ID used to identify this event.
 * @param _type The event type, must be `session.update`.
 * @param session 
 */
case class RealtimeClientEventSessionUpdate(eventUnderscoreid: Option[String],
                _type: String,
                session: RealtimeSessionCreateRequest
                )

object RealtimeClientEventSessionUpdate {
    /**
     * Creates the codec for converting RealtimeClientEventSessionUpdate from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeClientEventSessionUpdate] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeClientEventSessionUpdate] = deriveEncoder
}
