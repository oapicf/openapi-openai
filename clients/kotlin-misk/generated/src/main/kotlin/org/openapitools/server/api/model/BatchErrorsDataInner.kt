package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BatchErrorsDataInner(
    /** An error code identifying the error type. */
    val code: kotlin.String? = null,
    /** A human-readable message providing more details about the error. */
    val message: kotlin.String? = null,
    /** The name of the parameter that caused the error, if applicable. */
    val `param`: kotlin.String? = null,
    /** The line number of the input file where the error occurred, if applicable. */
    val line: kotlin.Int? = null
)
