package org.openapitools.server.model


/**
 * Returned when a conversation is created. Emitted right after session creation. 
 *
 * @param eventId The unique ID of the server event. for example: ''null''
 * @param `type` The event type, must be `conversation.created`. for example: ''null''
 * @param conversation  for example: ''null''
*/
final case class RealtimeServerEventConversationCreated (
  eventId: String,
  `type`: String,
  conversation: RealtimeServerEventConversationCreatedConversation
)

