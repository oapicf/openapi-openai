package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateModerationResponseResultsInnerCategoryAppliedInputTypes(
    /** The applied input type(s) for the category &#39;hate&#39;. */
    val hate: kotlin.collections.List<kotlin.String>,
    /** The applied input type(s) for the category &#39;hate/threatening&#39;. */
    val hateThreatening: kotlin.collections.List<kotlin.String>,
    /** The applied input type(s) for the category &#39;harassment&#39;. */
    val harassment: kotlin.collections.List<kotlin.String>,
    /** The applied input type(s) for the category &#39;harassment/threatening&#39;. */
    val harassmentThreatening: kotlin.collections.List<kotlin.String>,
    /** The applied input type(s) for the category &#39;illicit&#39;. */
    val illicit: kotlin.collections.List<kotlin.String>,
    /** The applied input type(s) for the category &#39;illicit/violent&#39;. */
    val illicitViolent: kotlin.collections.List<kotlin.String>,
    /** The applied input type(s) for the category &#39;self-harm&#39;. */
    val selfHarm: kotlin.collections.List<kotlin.String>,
    /** The applied input type(s) for the category &#39;self-harm/intent&#39;. */
    val selfHarmIntent: kotlin.collections.List<kotlin.String>,
    /** The applied input type(s) for the category &#39;self-harm/instructions&#39;. */
    val selfHarmInstructions: kotlin.collections.List<kotlin.String>,
    /** The applied input type(s) for the category &#39;sexual&#39;. */
    val sexual: kotlin.collections.List<kotlin.String>,
    /** The applied input type(s) for the category &#39;sexual/minors&#39;. */
    val sexualMinors: kotlin.collections.List<kotlin.String>,
    /** The applied input type(s) for the category &#39;violence&#39;. */
    val violence: kotlin.collections.List<kotlin.String>,
    /** The applied input type(s) for the category &#39;violence/graphic&#39;. */
    val violenceGraphic: kotlin.collections.List<kotlin.String>
)
