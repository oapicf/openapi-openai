package org.openapitools.server.model


/**
 * @param value The data that makes up the text. for example: ''null''
 * @param annotations  for example: ''null''
*/
final case class MessageDeltaContentTextObjectText (
  value: Option[String] = None,
  annotations: Option[Seq[MessageDeltaContentTextObjectTextAnnotationsInner]] = None
)

