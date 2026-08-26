@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdminApiKeysDelete200Response(
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("object")
    val `object`: kotlin.String? = null,

    @field:JsonProperty("deleted")
    val deleted: kotlin.Boolean? = null,

)
