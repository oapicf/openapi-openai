package org.openapitools.server.model


/**
 * @param fileId The ID of the file to attach to the message. for example: ''null''
 * @param tools The tools to add this file to. for example: ''null''
*/
final case class CreateMessageRequestAttachmentsInner (
  fileId: Option[String] = None,
  tools: Option[Seq[CreateMessageRequestAttachmentsInnerToolsInner]] = None
)

