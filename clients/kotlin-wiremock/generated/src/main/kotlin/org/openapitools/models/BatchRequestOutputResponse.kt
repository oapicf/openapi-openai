@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BatchRequestOutputResponse(
    @field:JsonProperty("status_code")
    val statusCode: kotlin.Int? = null,

    @field:JsonProperty("request_id")
    val requestId: kotlin.String? = null,

    @field:JsonProperty("body")
    val body: kotlin.Any? = null,

)
