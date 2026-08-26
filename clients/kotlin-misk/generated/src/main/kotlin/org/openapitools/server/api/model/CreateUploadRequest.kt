package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateUploadRequest(
    /** The name of the file to upload.  */
    val filename: kotlin.String,
    /** The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose).  */
    val purpose: kotlin.String,
    /** The number of bytes in the file you are uploading.  */
    val bytes: kotlin.Int,
    /** The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision.  */
    val mimeType: kotlin.String
)
