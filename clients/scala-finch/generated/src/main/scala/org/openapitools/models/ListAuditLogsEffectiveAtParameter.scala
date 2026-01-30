package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param gt Return only events whose `effective_at` (Unix seconds) is greater than this value.
 * @param gte Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value.
 * @param lt Return only events whose `effective_at` (Unix seconds) is less than this value.
 * @param lte Return only events whose `effective_at` (Unix seconds) is less than or equal to this value.
 */
case class ListAuditLogsEffectiveAtParameter(gt: Option[Int],
                gte: Option[Int],
                lt: Option[Int],
                lte: Option[Int]
                )

object ListAuditLogsEffectiveAtParameter {
    /**
     * Creates the codec for converting ListAuditLogsEffectiveAtParameter from and to JSON.
     */
    implicit val decoder: Decoder[ListAuditLogsEffectiveAtParameter] = deriveDecoder
    implicit val encoder: ObjectEncoder[ListAuditLogsEffectiveAtParameter] = deriveEncoder
}
