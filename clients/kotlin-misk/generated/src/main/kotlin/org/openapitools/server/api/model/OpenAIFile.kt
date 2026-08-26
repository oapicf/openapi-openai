package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OpenAIFile(
    /** The file identifier, which can be referenced in the API endpoints. */
    val id: kotlin.String,
    /** The size of the file, in bytes. */
    val bytes: kotlin.Int,
    /** The Unix timestamp (in seconds) for when the file was created. */
    val createdAt: kotlin.Int,
    /** The name of the file. */
    val filename: kotlin.String,
    /** The object type, which is always &#x60;file&#x60;. */
    val `object`: kotlin.String,
    /** The intended purpose of the file. Supported values are &#x60;assistants&#x60;, &#x60;assistants_output&#x60;, &#x60;batch&#x60;, &#x60;batch_output&#x60;, &#x60;fine-tune&#x60;, &#x60;fine-tune-results&#x60; and &#x60;vision&#x60;. */
    val purpose: kotlin.String,
    /** Deprecated. The current status of the file, which can be either &#x60;uploaded&#x60;, &#x60;processed&#x60;, or &#x60;error&#x60;. */
    val status: kotlin.String,
    /** Deprecated. For details on why a fine-tuning training file failed validation, see the &#x60;error&#x60; field on &#x60;fine_tuning.job&#x60;. */
    val statusDetails: kotlin.String? = null
)
