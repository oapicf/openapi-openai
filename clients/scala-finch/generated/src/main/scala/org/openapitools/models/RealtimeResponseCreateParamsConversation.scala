package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Controls which conversation the response is added to. Currently supports `auto` and `none`, with `auto` as the default value. The `auto` value means that the contents of the response will be added to the default conversation. Set this to `none` to create an out-of-band response which  will not add items to default conversation. 
 */
case class RealtimeResponseCreateParamsConversation()

object RealtimeResponseCreateParamsConversation {
    /**
     * Creates the codec for converting RealtimeResponseCreateParamsConversation from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeResponseCreateParamsConversation] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeResponseCreateParamsConversation] = deriveEncoder
}
