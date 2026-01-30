package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param name 
 */
case class AdminApiKeysCreateRequest(name: String
                )

object AdminApiKeysCreateRequest {
    /**
     * Creates the codec for converting AdminApiKeysCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[AdminApiKeysCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdminApiKeysCreateRequest] = deriveEncoder
}
