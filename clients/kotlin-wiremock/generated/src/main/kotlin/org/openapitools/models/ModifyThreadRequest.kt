@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ModifyThreadRequest(
    @field:JsonProperty("tool_resources")
    val toolResources: ModifyThreadRequestToolResources? = null,

    @field:JsonProperty("metadata")
    val metadata: kotlin.Any? = null,

)
