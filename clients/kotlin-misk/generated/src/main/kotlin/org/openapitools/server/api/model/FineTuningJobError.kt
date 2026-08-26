package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FineTuningJobError(
    /** A machine-readable error code. */
    val code: kotlin.String,
    /** A human-readable error message. */
    val message: kotlin.String,
    /** The parameter that was invalid, usually &#x60;training_file&#x60; or &#x60;validation_file&#x60;. This field will be null if the failure was not parameter-specific. */
    val `param`: kotlin.String
)
