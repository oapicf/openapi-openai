package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CompleteUploadRequest(
    /** The ordered list of Part IDs.  */
    val partIds: kotlin.collections.List<kotlin.String>,
    /** The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect.  */
    val md5: kotlin.String? = null
)
