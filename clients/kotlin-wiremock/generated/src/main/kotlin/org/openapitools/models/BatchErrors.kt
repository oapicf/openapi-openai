@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BatchErrors(
    @field:JsonProperty("object")
    val `object`: kotlin.String? = null,

    @field:JsonProperty("data")
    val `data`: kotlin.collections.List<BatchErrorsDataInner>? = null,

)
