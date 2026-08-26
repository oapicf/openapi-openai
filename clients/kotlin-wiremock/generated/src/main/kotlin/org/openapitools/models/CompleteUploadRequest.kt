@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CompleteUploadRequest(
    @field:JsonProperty("part_ids")
    val partIds: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("md5")
    val md5: kotlin.String? = null,

)
