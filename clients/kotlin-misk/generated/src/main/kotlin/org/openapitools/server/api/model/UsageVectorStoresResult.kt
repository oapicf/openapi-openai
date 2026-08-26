package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UsageVectorStoresResult(
    val `object`: kotlin.String,
    /** The vector stores usage in bytes. */
    val usageBytes: kotlin.Int,
    /** When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. */
    val projectId: kotlin.String? = null
)
