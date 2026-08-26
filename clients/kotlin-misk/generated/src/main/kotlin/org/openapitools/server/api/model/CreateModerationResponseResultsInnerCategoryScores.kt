package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateModerationResponseResultsInnerCategoryScores(
    /** The score for the category &#39;hate&#39;. */
    val hate: java.math.BigDecimal,
    /** The score for the category &#39;hate/threatening&#39;. */
    val hateThreatening: java.math.BigDecimal,
    /** The score for the category &#39;harassment&#39;. */
    val harassment: java.math.BigDecimal,
    /** The score for the category &#39;harassment/threatening&#39;. */
    val harassmentThreatening: java.math.BigDecimal,
    /** The score for the category &#39;illicit&#39;. */
    val illicit: java.math.BigDecimal,
    /** The score for the category &#39;illicit/violent&#39;. */
    val illicitViolent: java.math.BigDecimal,
    /** The score for the category &#39;self-harm&#39;. */
    val selfHarm: java.math.BigDecimal,
    /** The score for the category &#39;self-harm/intent&#39;. */
    val selfHarmIntent: java.math.BigDecimal,
    /** The score for the category &#39;self-harm/instructions&#39;. */
    val selfHarmInstructions: java.math.BigDecimal,
    /** The score for the category &#39;sexual&#39;. */
    val sexual: java.math.BigDecimal,
    /** The score for the category &#39;sexual/minors&#39;. */
    val sexualMinors: java.math.BigDecimal,
    /** The score for the category &#39;violence&#39;. */
    val violence: java.math.BigDecimal,
    /** The score for the category &#39;violence/graphic&#39;. */
    val violenceGraphic: java.math.BigDecimal
)
