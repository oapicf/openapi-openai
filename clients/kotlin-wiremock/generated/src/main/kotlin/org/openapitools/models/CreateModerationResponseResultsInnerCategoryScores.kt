@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateModerationResponseResultsInnerCategoryScores(
    @field:JsonProperty("hate")
    val hate: java.math.BigDecimal,

    @field:JsonProperty("hate/threatening")
    val hateThreatening: java.math.BigDecimal,

    @field:JsonProperty("harassment")
    val harassment: java.math.BigDecimal,

    @field:JsonProperty("harassment/threatening")
    val harassmentThreatening: java.math.BigDecimal,

    @field:JsonProperty("illicit")
    val illicit: java.math.BigDecimal,

    @field:JsonProperty("illicit/violent")
    val illicitViolent: java.math.BigDecimal,

    @field:JsonProperty("self-harm")
    val selfHarm: java.math.BigDecimal,

    @field:JsonProperty("self-harm/intent")
    val selfHarmIntent: java.math.BigDecimal,

    @field:JsonProperty("self-harm/instructions")
    val selfHarmInstructions: java.math.BigDecimal,

    @field:JsonProperty("sexual")
    val sexual: java.math.BigDecimal,

    @field:JsonProperty("sexual/minors")
    val sexualMinors: java.math.BigDecimal,

    @field:JsonProperty("violence")
    val violence: java.math.BigDecimal,

    @field:JsonProperty("violence/graphic")
    val violenceGraphic: java.math.BigDecimal,

)
