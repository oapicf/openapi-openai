package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UsageImagesResult(
    val `object`: kotlin.String,
    /** The number of images processed. */
    val images: kotlin.Int,
    /** The count of requests made to the model. */
    val numModelRequests: kotlin.Int,
    /** When &#x60;group_by&#x3D;source&#x60;, this field provides the source of the grouped usage result, possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60;. */
    val source: kotlin.String? = null,
    /** When &#x60;group_by&#x3D;size&#x60;, this field provides the image size of the grouped usage result. */
    val propertySize: kotlin.String? = null,
    /** When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. */
    val projectId: kotlin.String? = null,
    /** When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. */
    val userId: kotlin.String? = null,
    /** When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. */
    val apiKeyId: kotlin.String? = null,
    /** When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. */
    val model: kotlin.String? = null
)
