package org.openapitools.server.model


/**
 * Details of the transcription error.
 *
 * @param `type` The type of error. for example: ''null''
 * @param code Error code, if any. for example: ''null''
 * @param message A human-readable error message. for example: ''null''
 * @param param Parameter related to the error, if any. for example: ''null''
*/
final case class RealtimeServerEventConversationItemInputAudioTranscriptionFailedError (
  `type`: Option[String] = None,
  code: Option[String] = None,
  message: Option[String] = None,
  param: Option[String] = None
)

