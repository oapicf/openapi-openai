package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param _type 
 * @param id 
 * @param name 
 * @param createdUnderscoreat 
 * @param role 
 */
case class AdminApiKeyOwner(_type: Option[String],
                id: Option[String],
                name: Option[String],
                createdUnderscoreat: Option[Long],
                role: Option[String]
                )

object AdminApiKeyOwner {
    /**
     * Creates the codec for converting AdminApiKeyOwner from and to JSON.
     */
    implicit val decoder: Decoder[AdminApiKeyOwner] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdminApiKeyOwner] = deriveEncoder
}
