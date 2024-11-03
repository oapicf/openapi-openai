package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
 */
case class ModifyThreadRequest(metadata: Option[Object]
                )

object ModifyThreadRequest {
    /**
     * Creates the codec for converting ModifyThreadRequest from and to JSON.
     */
    implicit val decoder: Decoder[ModifyThreadRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[ModifyThreadRequest] = deriveEncoder
}
