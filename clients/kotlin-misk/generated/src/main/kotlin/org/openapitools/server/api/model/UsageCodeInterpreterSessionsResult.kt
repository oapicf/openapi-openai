package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UsageCodeInterpreterSessionsResult(
    val `object`: kotlin.String,
    /** The number of code interpreter sessions. */
    val sessions: kotlin.Int,
    /** When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. */
    val projectId: kotlin.String? = null
)
