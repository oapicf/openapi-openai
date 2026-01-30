package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * The payload used to create the API key.
 * @param scopes A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`
 */
case class AuditLogApiKeyCreatedData(scopes: Option[Seq[String]]
                )

object AuditLogApiKeyCreatedData {
    /**
     * Creates the codec for converting AuditLogApiKeyCreatedData from and to JSON.
     */
    implicit val decoder: Decoder[AuditLogApiKeyCreatedData] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLogApiKeyCreatedData] = deriveEncoder
}
