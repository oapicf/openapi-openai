package org.openapitools.server.api.model

import org.openapitools.server.api.model.CostsResultAmount
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CostsResult(
    val `object`: kotlin.String,
    val amount: CostsResultAmount? = null,
    /** When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result. */
    val lineItem: kotlin.String? = null,
    /** When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped costs result. */
    val projectId: kotlin.String? = null
)
