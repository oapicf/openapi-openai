package org.openapitools.server.api.model

import org.openapitools.server.api.model.BatchErrorsDataInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BatchErrors(
    /** The object type, which is always &#x60;list&#x60;. */
    val `object`: kotlin.String? = null,
    val `data`: kotlin.collections.List<BatchErrorsDataInner>? = null
)
