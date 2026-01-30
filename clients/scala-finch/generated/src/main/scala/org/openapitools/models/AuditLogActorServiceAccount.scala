package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The service account that performed the audit logged action.
 * @param id The service account id.
 */
case class AuditLogActorServiceAccount(id: Option[String]
                )

object AuditLogActorServiceAccount {
    /**
     * Creates the codec for converting AuditLogActorServiceAccount from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogActorServiceAccount] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogActorServiceAccount] = deriveEncoder
}
