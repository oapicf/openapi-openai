package org.openapitools.server.model


/**
 * = File path =
 *
 * A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
 *
 * @param `type` Always `file_path`. for example: ''null''
 * @param text The text in the message content that needs to be replaced. for example: ''null''
 * @param filePath  for example: ''null''
 * @param startIndex  for example: ''null''
 * @param endIndex  for example: ''null''
*/
final case class MessageContentTextAnnotationsFilePathObject (
  `type`: String,
  text: String,
  filePath: MessageContentTextAnnotationsFilePathObjectFilePath,
  startIndex: Int,
  endIndex: Int
)

