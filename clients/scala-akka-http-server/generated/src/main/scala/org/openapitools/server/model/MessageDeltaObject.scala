package org.openapitools.server.model


/**
 * = Message delta object =
 *
 * Represents a message delta i.e. any changed fields on a message during streaming. 
 *
 * @param id The identifier of the message, which can be referenced in API endpoints. for example: ''null''
 * @param `object` The object type, which is always `thread.message.delta`. for example: ''null''
 * @param delta  for example: ''null''
*/
final case class MessageDeltaObject (
  id: String,
  `object`: String,
  delta: MessageDeltaObjectDelta
)

