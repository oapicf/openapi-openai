package org.openapitools.server.model


/**
 * = Audio content part =
 *
 * Learn about [audio inputs](/docs/guides/audio). 
 *
 * @param `type` The type of the content part. Always `input_audio`. for example: ''null''
 * @param inputAudio  for example: ''null''
*/
final case class ChatCompletionRequestMessageContentPartAudio (
  `type`: String,
  inputAudio: ChatCompletionRequestMessageContentPartAudioInputAudio
)

