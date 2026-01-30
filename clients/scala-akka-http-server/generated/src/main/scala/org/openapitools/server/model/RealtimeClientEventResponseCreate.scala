package org.openapitools.server.model


/**
 * This event instructs the server to create a Response, which means triggering  model inference. When in Server VAD mode, the server will create Responses  automatically.  A Response will include at least one Item, and may have two, in which case  the second will be a function call. These Items will be appended to the  conversation history.  The server will respond with a `response.created` event, events for Items  and content created, and finally a `response.done` event to indicate the  Response is complete.  The `response.create` event includes inference configuration like  `instructions`, and `temperature`. These fields will override the Session's  configuration for this Response only. 
 *
 * @param eventId Optional client-generated ID used to identify this event. for example: ''null''
 * @param `type` The event type, must be `response.create`. for example: ''null''
 * @param response  for example: ''null''
*/
final case class RealtimeClientEventResponseCreate (
  eventId: Option[String] = None,
  `type`: String,
  response: Option[RealtimeResponseCreateParams] = None
)

