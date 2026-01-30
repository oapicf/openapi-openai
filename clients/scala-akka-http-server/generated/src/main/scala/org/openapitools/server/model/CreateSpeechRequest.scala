package org.openapitools.server.model


/**
 * @param model  for example: ''null''
 * @param input The text to generate audio for. The maximum length is 4096 characters. for example: ''null''
 * @param voice The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options). for example: ''null''
 * @param responseFormat The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`. for example: ''null''
 * @param speed The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default. for example: ''null''
*/
final case class CreateSpeechRequest (
  model: CreateSpeechRequestModel,
  input: String,
  voice: String,
  responseFormat: Option[String] = None,
  speed: Option[Double] = None
)

