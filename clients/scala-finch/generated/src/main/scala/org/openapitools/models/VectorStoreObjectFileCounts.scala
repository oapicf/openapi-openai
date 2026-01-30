package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param inUnderscoreprogress The number of files that are currently being processed.
 * @param completed The number of files that have been successfully processed.
 * @param failed The number of files that have failed to process.
 * @param cancelled The number of files that were cancelled.
 * @param total The total number of files.
 */
case class VectorStoreObjectFileCounts(inUnderscoreprogress: Int,
                completed: Int,
                failed: Int,
                cancelled: Int,
                total: Int
                )

object VectorStoreObjectFileCounts {
    /**
     * Creates the codec for converting VectorStoreObjectFileCounts from and to JSON.
     */
    implicit val decoder: Decoder[VectorStoreObjectFileCounts] = deriveDecoder
    implicit val encoder: ObjectEncoder[VectorStoreObjectFileCounts] = deriveEncoder
}
