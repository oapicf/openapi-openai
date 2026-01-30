package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AuditLogActorServiceAccount
import org.openapitools.models.AuditLogActorUser

/**
 * The API Key used to perform the audit logged action.
 * @param id The tracking id of the API key.
 * @param _type The type of API key. Can be either `user` or `service_account`.
 * @param user 
 * @param serviceUnderscoreaccount 
 */
case class AuditLogActorApiKey(id: Option[String],
                _type: Option[String],
                user: Option[AuditLogActorUser],
                serviceUnderscoreaccount: Option[AuditLogActorServiceAccount]
                )

object AuditLogActorApiKey {
    /**
     * Creates the codec for converting AuditLogActorApiKey from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogActorApiKey] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogActorApiKey] = deriveEncoder
}
