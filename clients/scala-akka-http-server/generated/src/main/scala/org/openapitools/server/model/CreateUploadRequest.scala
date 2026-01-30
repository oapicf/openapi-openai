package org.openapitools.server.model


/**
 * @param filename The name of the file to upload.  for example: ''null''
 * @param purpose The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose).  for example: ''null''
 * @param bytes The number of bytes in the file you are uploading.  for example: ''null''
 * @param mimeType The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision.  for example: ''null''
*/
final case class CreateUploadRequest (
  filename: String,
  purpose: String,
  bytes: Int,
  mimeType: String
)

