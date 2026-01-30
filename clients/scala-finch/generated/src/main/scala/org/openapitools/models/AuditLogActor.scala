package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AuditLogActorApiKey
import org.openapitools.models.AuditLogActorSession

/**
 * The actor who performed the audit logged action.
 * @param _type The type of actor. Is either `session` or `api_key`.
 * @param session 
 * @param apiUnderscorekey 
 */
case class AuditLogActor(_type: Option[String],
                session: Option[AuditLogActorSession],
                apiUnderscorekey: Option[AuditLogActorApiKey]
                )

object AuditLogActor {
    /**
     * Creates the codec for converting AuditLogActor from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogActor] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogActor] = deriveEncoder
}
