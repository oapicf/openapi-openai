@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateModerationResponseResultsInnerCategoryAppliedInputTypes(
    @field:JsonProperty("hate")
    val hate: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("hate/threatening")
    val hateThreatening: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("harassment")
    val harassment: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("harassment/threatening")
    val harassmentThreatening: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("illicit")
    val illicit: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("illicit/violent")
    val illicitViolent: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("self-harm")
    val selfHarm: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("self-harm/intent")
    val selfHarmIntent: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("self-harm/instructions")
    val selfHarmInstructions: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("sexual")
    val sexual: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("sexual/minors")
    val sexualMinors: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("violence")
    val violence: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("violence/graphic")
    val violenceGraphic: kotlin.collections.List<kotlin.String>,

)
