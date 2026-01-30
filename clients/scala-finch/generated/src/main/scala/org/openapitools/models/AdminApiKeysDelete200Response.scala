package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param id 
 * @param _object 
 * @param deleted 
 */
case class AdminApiKeysDelete200Response(id: Option[String],
                _object: Option[String],
                deleted: Option[Boolean]
                )

object AdminApiKeysDelete200Response {
    /**
     * Creates the codec for converting AdminApiKeysDelete200Response from and to JSON.
     */
    implicit val decoder: Decoder[AdminApiKeysDelete200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdminApiKeysDelete200Response] = deriveEncoder
}
