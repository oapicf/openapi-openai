package org.openapitools.server.model


/**
 * @param fileId The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content. for example: ''null''
 * @param detail Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`. for example: ''null''
*/
final case class MessageContentImageFileObjectImageFile (
  fileId: String,
  detail: Option[String] = None
)

