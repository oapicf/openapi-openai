package org.openapitools.server.model


/**
 * = Upload =
 *
 * The Upload object can accept byte chunks in the form of Parts. 
 *
 * @param id The Upload unique identifier, which can be referenced in API endpoints. for example: ''null''
 * @param createdAt The Unix timestamp (in seconds) for when the Upload was created. for example: ''null''
 * @param filename The name of the file to be uploaded. for example: ''null''
 * @param bytes The intended number of bytes to be uploaded. for example: ''null''
 * @param purpose The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values. for example: ''null''
 * @param status The status of the Upload. for example: ''null''
 * @param expiresAt The Unix timestamp (in seconds) for when the Upload was created. for example: ''null''
 * @param `object` The object type, which is always \"upload\". for example: ''null''
 * @param file  for example: ''null''
*/
final case class Upload (
  id: String,
  createdAt: Int,
  filename: String,
  bytes: Int,
  purpose: String,
  status: String,
  expiresAt: Int,
  `object`: Option[String] = None,
  file: Option[OpenAIFile] = None
)

