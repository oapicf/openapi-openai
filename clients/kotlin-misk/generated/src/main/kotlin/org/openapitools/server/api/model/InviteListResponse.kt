package org.openapitools.server.api.model

import org.openapitools.server.api.model.Invite
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class InviteListResponse(
    /** The object type, which is always &#x60;list&#x60; */
    val `object`: kotlin.String,
    val `data`: kotlin.collections.List<Invite>,
    /** The first &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60; */
    val firstId: kotlin.String? = null,
    /** The last &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60; */
    val lastId: kotlin.String? = null,
    /** The &#x60;has_more&#x60; property is used for pagination to indicate there are additional results. */
    val hasMore: kotlin.Boolean? = null
)
