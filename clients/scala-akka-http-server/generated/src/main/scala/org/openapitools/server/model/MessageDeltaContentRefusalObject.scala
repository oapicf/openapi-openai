package org.openapitools.server.model


/**
 * = Refusal =
 *
 * The refusal content that is part of a message.
 *
 * @param index The index of the refusal part in the message. for example: ''null''
 * @param `type` Always `refusal`. for example: ''null''
 * @param refusal  for example: ''null''
*/
final case class MessageDeltaContentRefusalObject (
  index: Int,
  `type`: String,
  refusal: Option[String] = None
)

