package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Model(
    /** The model identifier, which can be referenced in the API endpoints. */
    val id: kotlin.String,
    /** The Unix timestamp (in seconds) when the model was created. */
    val created: kotlin.Int,
    /** The object type, which is always \&quot;model\&quot;. */
    val `object`: kotlin.String,
    /** The organization that owns the model. */
    val ownedBy: kotlin.String
)
