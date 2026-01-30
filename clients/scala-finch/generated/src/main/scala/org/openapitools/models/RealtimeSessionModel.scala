package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The Realtime model used for this session. 
 */
case class RealtimeSessionModel()

object RealtimeSessionModel {
    /**
     * Creates the codec for converting RealtimeSessionModel from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeSessionModel] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeSessionModel] = deriveEncoder
}
