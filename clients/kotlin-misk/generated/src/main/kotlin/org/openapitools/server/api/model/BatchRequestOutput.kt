package org.openapitools.server.api.model

import org.openapitools.server.api.model.BatchRequestOutputError
import org.openapitools.server.api.model.BatchRequestOutputResponse
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BatchRequestOutput(
    val id: kotlin.String? = null,
    /** A developer-provided per-request id that will be used to match outputs to inputs. */
    val customId: kotlin.String? = null,
    val response: BatchRequestOutputResponse? = null,
    val error: BatchRequestOutputError? = null
)
