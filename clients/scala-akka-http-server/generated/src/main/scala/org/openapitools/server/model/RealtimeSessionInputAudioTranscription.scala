package org.openapitools.server.model


/**
 * Configuration for input audio transcription, defaults to off and can be  set to `null` to turn off once on. Input audio transcription is not native  to the model, since the model consumes audio directly. Transcription runs  asynchronously through Whisper and should be treated as rough guidance  rather than the representation understood by the model. 
 *
 * @param model The model to use for transcription, `whisper-1` is the only currently  supported model.  for example: ''null''
*/
final case class RealtimeSessionInputAudioTranscription (
  model: Option[String] = None
)

