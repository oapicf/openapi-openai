package org.openapitools.server.model


/**
 * = File citation =
 *
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"retrieval\" tool to search files.
 *
 * @param `type` Always `file_citation`. for example: ''null''
 * @param text The text in the message content that needs to be replaced. for example: ''null''
 * @param fileCitation  for example: ''null''
 * @param startIndex  for example: ''null''
 * @param endIndex  for example: ''null''
*/
final case class MessageContentTextAnnotationsFileCitationObject (
  `type`: String,
  text: String,
  fileCitation: MessageContentTextAnnotationsFileCitationObjectFileCitation,
  startIndex: Int,
  endIndex: Int
)

