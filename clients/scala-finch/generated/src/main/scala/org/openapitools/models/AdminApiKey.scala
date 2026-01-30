package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdminApiKeyOwner

/**
 * 
 * @param _object 
 * @param id 
 * @param name 
 * @param redactedUnderscorevalue 
 * @param value 
 * @param createdUnderscoreat 
 * @param owner 
 */
case class AdminApiKey(_object: Option[String],
                id: Option[String],
                name: Option[String],
                redactedUnderscorevalue: Option[String],
                value: Option[String],
                createdUnderscoreat: Option[Long],
                owner: Option[AdminApiKeyOwner]
                )

object AdminApiKey {
    /**
     * Creates the codec for converting AdminApiKey from and to JSON.
     */
    implicit val decoder: Decoder[AdminApiKey] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdminApiKey] = deriveEncoder
}
