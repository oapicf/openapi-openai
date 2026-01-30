package org.openapitools.server.model


/**
 * The conversation resource.
 *
 * @param id The unique ID of the conversation. for example: ''null''
 * @param `object` The object type, must be `realtime.conversation`. for example: ''null''
*/
final case class RealtimeServerEventConversationCreatedConversation (
  id: Option[String] = None,
  `object`: Option[String] = None
)

