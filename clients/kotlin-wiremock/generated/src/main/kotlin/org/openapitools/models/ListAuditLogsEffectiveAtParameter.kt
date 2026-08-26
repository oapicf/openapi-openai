@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ListAuditLogsEffectiveAtParameter(
    @field:JsonProperty("gt")
    val gt: kotlin.Int? = null,

    @field:JsonProperty("gte")
    val gte: kotlin.Int? = null,

    @field:JsonProperty("lt")
    val lt: kotlin.Int? = null,

    @field:JsonProperty("lte")
    val lte: kotlin.Int? = null,

)
