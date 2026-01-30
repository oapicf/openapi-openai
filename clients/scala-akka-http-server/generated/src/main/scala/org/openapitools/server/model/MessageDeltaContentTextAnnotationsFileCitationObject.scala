package org.openapitools.server.model


/**
 * = File citation =
 *
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"file_search\" tool to search files.
 *
 * @param index The index of the annotation in the text content part. for example: ''null''
 * @param `type` Always `file_citation`. for example: ''null''
 * @param text The text in the message content that needs to be replaced. for example: ''null''
 * @param fileCitation  for example: ''null''
 * @param startIndex  for example: ''null''
 * @param endIndex  for example: ''null''
*/
final case class MessageDeltaContentTextAnnotationsFileCitationObject (
  index: Int,
  `type`: String,
  text: Option[String] = None,
  fileCitation: Option[MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation] = None,
  startIndex: Option[Int] = None,
  endIndex: Option[Int] = None
)

