package org.openapitools.server.model


/**
 * @param fileId The ID of the specific File the citation is from. for example: ''null''
 * @param quote The specific quote in the file. for example: ''null''
*/
final case class MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation (
  fileId: Option[String] = None,
  quote: Option[String] = None
)

