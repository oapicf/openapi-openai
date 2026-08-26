@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateFineTuningJobRequestIntegrationsInnerWandb(
    @field:JsonProperty("project")
    val project: kotlin.String,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("entity")
    val entity: kotlin.String? = null,

    @field:JsonProperty("tags")
    val tags: kotlin.collections.List<kotlin.String>? = null,

)
