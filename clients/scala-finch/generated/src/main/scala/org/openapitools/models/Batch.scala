package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BatchErrors
import org.openapitools.models.BatchRequestCounts

/**
 * 
 * @param id 
 * @param _object The object type, which is always `batch`.
 * @param endpoint The OpenAI API endpoint used by the batch.
 * @param errors 
 * @param inputUnderscorefileUnderscoreid The ID of the input file for the batch.
 * @param completionUnderscorewindow The time frame within which the batch should be processed.
 * @param status The current status of the batch.
 * @param outputUnderscorefileUnderscoreid The ID of the file containing the outputs of successfully executed requests.
 * @param errorUnderscorefileUnderscoreid The ID of the file containing the outputs of requests with errors.
 * @param createdUnderscoreat The Unix timestamp (in seconds) for when the batch was created.
 * @param inUnderscoreprogressUnderscoreat The Unix timestamp (in seconds) for when the batch started processing.
 * @param expiresUnderscoreat The Unix timestamp (in seconds) for when the batch will expire.
 * @param finalizingUnderscoreat The Unix timestamp (in seconds) for when the batch started finalizing.
 * @param completedUnderscoreat The Unix timestamp (in seconds) for when the batch was completed.
 * @param failedUnderscoreat The Unix timestamp (in seconds) for when the batch failed.
 * @param expiredUnderscoreat The Unix timestamp (in seconds) for when the batch expired.
 * @param cancellingUnderscoreat The Unix timestamp (in seconds) for when the batch started cancelling.
 * @param cancelledUnderscoreat The Unix timestamp (in seconds) for when the batch was cancelled.
 * @param requestUnderscorecounts 
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 */
case class Batch(id: String,
                _object: String,
                endpoint: String,
                errors: Option[BatchErrors],
                inputUnderscorefileUnderscoreid: String,
                completionUnderscorewindow: String,
                status: String,
                outputUnderscorefileUnderscoreid: Option[String],
                errorUnderscorefileUnderscoreid: Option[String],
                createdUnderscoreat: Int,
                inUnderscoreprogressUnderscoreat: Option[Int],
                expiresUnderscoreat: Option[Int],
                finalizingUnderscoreat: Option[Int],
                completedUnderscoreat: Option[Int],
                failedUnderscoreat: Option[Int],
                expiredUnderscoreat: Option[Int],
                cancellingUnderscoreat: Option[Int],
                cancelledUnderscoreat: Option[Int],
                requestUnderscorecounts: Option[BatchRequestCounts],
                metadata: Option[Object]
                )

object Batch {
    /**
     * Creates the codec for converting Batch from and to JSON.
     */
    implicit val decoder: Decoder[Batch] = deriveDecoder
    implicit val encoder: ObjectEncoder[Batch] = deriveEncoder
}
