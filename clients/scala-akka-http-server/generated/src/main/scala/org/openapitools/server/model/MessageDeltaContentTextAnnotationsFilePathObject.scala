package org.openapitools.server.model


/**
 * = File path =
 *
 * A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
 *
 * @param index The index of the annotation in the text content part. for example: ''null''
 * @param `type` Always `file_path`. for example: ''null''
 * @param text The text in the message content that needs to be replaced. for example: ''null''
 * @param filePath  for example: ''null''
 * @param startIndex  for example: ''null''
 * @param endIndex  for example: ''null''
*/
final case class MessageDeltaContentTextAnnotationsFilePathObject (
  index: Int,
  `type`: String,
  text: Option[String] = None,
  filePath: Option[MessageDeltaContentTextAnnotationsFilePathObjectFilePath] = None,
  startIndex: Option[Int] = None,
  endIndex: Option[Int] = None
)

