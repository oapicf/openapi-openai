package org.openapitools.server.api.model

import org.openapitools.server.api.model.CostsResult
import org.openapitools.server.api.model.CostsResultAmount
import org.openapitools.server.api.model.UsageAudioSpeechesResult
import org.openapitools.server.api.model.UsageAudioTranscriptionsResult
import org.openapitools.server.api.model.UsageCodeInterpreterSessionsResult
import org.openapitools.server.api.model.UsageCompletionsResult
import org.openapitools.server.api.model.UsageEmbeddingsResult
import org.openapitools.server.api.model.UsageImagesResult
import org.openapitools.server.api.model.UsageModerationsResult
import org.openapitools.server.api.model.UsageVectorStoresResult
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UsageTimeBucketResultInner(
    val `object`: kotlin.String,
    /** The aggregated number of input tokens used. */
    val inputTokens: kotlin.Int,
    /** The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. */
    val outputTokens: kotlin.Int,
    /** The count of requests made to the model. */
    val numModelRequests: kotlin.Int,
    /** The number of images processed. */
    val images: kotlin.Int,
    /** The number of characters processed. */
    val characters: kotlin.Int,
    /** The number of seconds processed. */
    val seconds: kotlin.Int,
    /** The vector stores usage in bytes. */
    val usageBytes: kotlin.Int,
    /** The number of code interpreter sessions. */
    val sessions: kotlin.Int,
    /** The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. */
    val inputCachedTokens: kotlin.Int? = null,
    /** The aggregated number of audio input tokens used, including cached tokens. */
    val inputAudioTokens: kotlin.Int? = null,
    /** The aggregated number of audio output tokens used. */
    val outputAudioTokens: kotlin.Int? = null,
    /** When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped costs result. */
    val projectId: kotlin.String? = null,
    /** When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. */
    val userId: kotlin.String? = null,
    /** When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. */
    val apiKeyId: kotlin.String? = null,
    /** When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. */
    val model: kotlin.String? = null,
    /** When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not. */
    val batch: kotlin.Boolean? = null,
    /** When &#x60;group_by&#x3D;source&#x60;, this field provides the source of the grouped usage result, possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60;. */
    val source: kotlin.String? = null,
    /** When &#x60;group_by&#x3D;size&#x60;, this field provides the image size of the grouped usage result. */
    val propertySize: kotlin.String? = null,
    val amount: CostsResultAmount? = null,
    /** When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result. */
    val lineItem: kotlin.String? = null
)
