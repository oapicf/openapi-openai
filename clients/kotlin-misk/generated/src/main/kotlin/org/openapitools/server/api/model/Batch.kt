package org.openapitools.server.api.model

import org.openapitools.server.api.model.BatchErrors
import org.openapitools.server.api.model.BatchRequestCounts
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Batch(
    val id: kotlin.String,
    /** The object type, which is always &#x60;batch&#x60;. */
    val `object`: kotlin.String,
    /** The OpenAI API endpoint used by the batch. */
    val endpoint: kotlin.String,
    /** The ID of the input file for the batch. */
    val inputFileId: kotlin.String,
    /** The time frame within which the batch should be processed. */
    val completionWindow: kotlin.String,
    /** The current status of the batch. */
    val status: kotlin.String,
    /** The Unix timestamp (in seconds) for when the batch was created. */
    val createdAt: kotlin.Int,
    val errors: BatchErrors? = null,
    /** The ID of the file containing the outputs of successfully executed requests. */
    val outputFileId: kotlin.String? = null,
    /** The ID of the file containing the outputs of requests with errors. */
    val errorFileId: kotlin.String? = null,
    /** The Unix timestamp (in seconds) for when the batch started processing. */
    val inProgressAt: kotlin.Int? = null,
    /** The Unix timestamp (in seconds) for when the batch will expire. */
    val expiresAt: kotlin.Int? = null,
    /** The Unix timestamp (in seconds) for when the batch started finalizing. */
    val finalizingAt: kotlin.Int? = null,
    /** The Unix timestamp (in seconds) for when the batch was completed. */
    val completedAt: kotlin.Int? = null,
    /** The Unix timestamp (in seconds) for when the batch failed. */
    val failedAt: kotlin.Int? = null,
    /** The Unix timestamp (in seconds) for when the batch expired. */
    val expiredAt: kotlin.Int? = null,
    /** The Unix timestamp (in seconds) for when the batch started cancelling. */
    val cancellingAt: kotlin.Int? = null,
    /** The Unix timestamp (in seconds) for when the batch was cancelled. */
    val cancelledAt: kotlin.Int? = null,
    val requestCounts: BatchRequestCounts? = null,
    /** Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    val metadata: kotlin.Any? = null
)
