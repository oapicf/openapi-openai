package org.openapitools.server.model


/**
 * Parameters for audio output. Required when audio output is requested with `modalities: [\"audio\"]`. [Learn more](/docs/guides/audio). 
 *
 * @param voice The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive).  for example: ''null''
 * @param format Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`.  for example: ''null''
*/
final case class CreateChatCompletionRequestAudio (
  voice: String,
  format: String
)

