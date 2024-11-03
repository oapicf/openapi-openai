package org.openapitools.server.model


/**
 * @param index The index of the annotation in the text content part. for example: ''null''
 * @param `type` Always `file_citation`. for example: ''null''
 * @param text The text in the message content that needs to be replaced. for example: ''null''
 * @param fileCitation  for example: ''null''
 * @param startIndex  for example: ''null''
 * @param endIndex  for example: ''null''
 * @param filePath  for example: ''null''
*/
final case class MessageDeltaContentTextObjectTextAnnotationsInner (
  index: Int,
  `type`: String,
  text: Option[String] = None,
  fileCitation: Option[MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation] = None,
  startIndex: Option[Int] = None,
  endIndex: Option[Int] = None,
  filePath: Option[MessageDeltaContentTextAnnotationsFilePathObjectFilePath] = None
)

