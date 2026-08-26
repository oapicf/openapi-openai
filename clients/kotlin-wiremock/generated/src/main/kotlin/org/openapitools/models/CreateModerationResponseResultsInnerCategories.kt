@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateModerationResponseResultsInnerCategories(
    @field:JsonProperty("hate")
    val hate: kotlin.Boolean,

    @field:JsonProperty("hate/threatening")
    val hateThreatening: kotlin.Boolean,

    @field:JsonProperty("harassment")
    val harassment: kotlin.Boolean,

    @field:JsonProperty("harassment/threatening")
    val harassmentThreatening: kotlin.Boolean,

    @field:JsonProperty("illicit")
    val illicit: kotlin.Boolean,

    @field:JsonProperty("illicit/violent")
    val illicitViolent: kotlin.Boolean,

    @field:JsonProperty("self-harm")
    val selfHarm: kotlin.Boolean,

    @field:JsonProperty("self-harm/intent")
    val selfHarmIntent: kotlin.Boolean,

    @field:JsonProperty("self-harm/instructions")
    val selfHarmInstructions: kotlin.Boolean,

    @field:JsonProperty("sexual")
    val sexual: kotlin.Boolean,

    @field:JsonProperty("sexual/minors")
    val sexualMinors: kotlin.Boolean,

    @field:JsonProperty("violence")
    val violence: kotlin.Boolean,

    @field:JsonProperty("violence/graphic")
    val violenceGraphic: kotlin.Boolean,

)
