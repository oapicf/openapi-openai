package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FineTuningJobEvent(
    /** The object type, which is always \&quot;fine_tuning.job.event\&quot;. */
    val `object`: kotlin.String,
    /** The object identifier. */
    val id: kotlin.String,
    /** The Unix timestamp (in seconds) for when the fine-tuning job was created. */
    val createdAt: kotlin.Int,
    /** The log level of the event. */
    val level: kotlin.String,
    /** The message of the event. */
    val message: kotlin.String,
    /** The type of event. */
    val type: kotlin.String? = null,
    /** The data associated with the event. */
    val `data`: kotlin.Any? = null
)
