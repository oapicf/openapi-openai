package org.openapitools.server.model


/**
 * @param `type` The content type (`input_text`, `input_audio`, `item_reference`, `text`).  for example: ''null''
 * @param text The text content, used for `input_text` and `text` content types.  for example: ''null''
 * @param id ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items.  for example: ''null''
 * @param audio Base64-encoded audio bytes, used for `input_audio` content type.  for example: ''null''
 * @param transcript The transcript of the audio, used for `input_audio` content type.  for example: ''null''
*/
final case class RealtimeConversationItemContentInner (
  `type`: Option[String] = None,
  text: Option[String] = None,
  id: Option[String] = None,
  audio: Option[String] = None,
  transcript: Option[String] = None
)

