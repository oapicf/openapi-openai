package org.openapitools.server.model


/**
 * = UploadPart =
 *
 * The upload Part represents a chunk of bytes we can add to an Upload object. 
 *
 * @param id The upload Part unique identifier, which can be referenced in API endpoints. for example: ''null''
 * @param createdAt The Unix timestamp (in seconds) for when the Part was created. for example: ''null''
 * @param uploadId The ID of the Upload object that this Part was added to. for example: ''null''
 * @param `object` The object type, which is always `upload.part`. for example: ''null''
*/
final case class UploadPart (
  id: String,
  createdAt: Int,
  uploadId: String,
  `object`: String
)

