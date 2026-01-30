package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The request counts for different statuses within the batch.
 * @param total Total number of requests in the batch.
 * @param completed Number of requests that have been completed successfully.
 * @param failed Number of requests that have failed.
 */
case class BatchRequestCounts(total: Int,
                completed: Int,
                failed: Int
                )

object BatchRequestCounts {
    /**
     * Creates the codec for converting BatchRequestCounts from and to JSON.
     */
    implicit val decoder: Decoder[BatchRequestCounts] = deriveDecoder
    implicit val encoder: ObjectEncoder[BatchRequestCounts] = deriveEncoder
}
