@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AuditLogLoginFailed(
    @field:JsonProperty("error_code")
    val errorCode: kotlin.String? = null,

    @field:JsonProperty("error_message")
    val errorMessage: kotlin.String? = null,

)
