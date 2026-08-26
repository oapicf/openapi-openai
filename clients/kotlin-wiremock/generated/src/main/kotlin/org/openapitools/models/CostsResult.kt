@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CostsResult(
    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("amount")
    val amount: CostsResultAmount? = null,

    @field:JsonProperty("line_item")
    val lineItem: kotlin.String? = null,

    @field:JsonProperty("project_id")
    val projectId: kotlin.String? = null,

)
