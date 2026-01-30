package org.openapitools.server.model


/**
 * The content part that was added.
 *
 * @param `type` The content type (\"text\", \"audio\"). for example: ''null''
 * @param text The text content (if type is \"text\"). for example: ''null''
 * @param audio Base64-encoded audio data (if type is \"audio\"). for example: ''null''
 * @param transcript The transcript of the audio (if type is \"audio\"). for example: ''null''
*/
final case class RealtimeServerEventResponseContentPartAddedPart (
  `type`: Option[String] = None,
  text: Option[String] = None,
  audio: Option[String] = None,
  transcript: Option[String] = None
)

