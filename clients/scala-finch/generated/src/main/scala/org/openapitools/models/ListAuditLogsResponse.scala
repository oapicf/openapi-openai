package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AuditLog
import scala.collection.immutable.Seq

/**
 * 
 * @param _object 
 * @param data 
 * @param firstUnderscoreid 
 * @param lastUnderscoreid 
 * @param hasUnderscoremore 
 */
case class ListAuditLogsResponse(_object: String,
                data: Seq[AuditLog],
                firstUnderscoreid: String,
                lastUnderscoreid: String,
                hasUnderscoremore: Boolean
                )

object ListAuditLogsResponse {
    /**
     * Creates the codec for converting ListAuditLogsResponse from and to JSON.
     */
    implicit val decoder: Decoder[ListAuditLogsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ListAuditLogsResponse] = deriveEncoder
}
