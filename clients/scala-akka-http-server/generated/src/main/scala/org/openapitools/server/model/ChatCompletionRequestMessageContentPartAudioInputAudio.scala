package org.openapitools.server.model


/**
 * @param data Base64 encoded audio data. for example: ''null''
 * @param format The format of the encoded audio data. Currently supports \"wav\" and \"mp3\".  for example: ''null''
*/
final case class ChatCompletionRequestMessageContentPartAudioInputAudio (
  data: String,
  format: String
)

