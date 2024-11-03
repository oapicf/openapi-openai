package org.openapitools.server.model


/**
 * @param `type` Always `file_citation`. for example: ''null''
 * @param text The text in the message content that needs to be replaced. for example: ''null''
 * @param fileCitation  for example: ''null''
 * @param startIndex  for example: ''null''
 * @param endIndex  for example: ''null''
 * @param filePath  for example: ''null''
*/
final case class MessageContentTextObjectTextAnnotationsInner (
  `type`: String,
  text: String,
  fileCitation: MessageContentTextAnnotationsFileCitationObjectFileCitation,
  startIndex: Int,
  endIndex: Int,
  filePath: MessageContentTextAnnotationsFilePathObjectFilePath
)

