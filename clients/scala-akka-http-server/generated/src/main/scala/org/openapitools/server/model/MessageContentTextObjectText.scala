package org.openapitools.server.model


/**
 * @param value The data that makes up the text. for example: ''null''
 * @param annotations  for example: ''null''
*/
final case class MessageContentTextObjectText (
  value: String,
  annotations: Seq[MessageContentTextObjectTextAnnotationsInner]
)

