package org.openapitools.server.model


/**
 * @param language The language of the output translation (always `english`). for example: ''null''
 * @param duration The duration of the input audio. for example: ''null''
 * @param text The translated text. for example: ''null''
 * @param segments Segments of the translated text and their corresponding details. for example: ''null''
*/
final case class CreateTranslationResponseVerboseJson (
  language: String,
  duration: String,
  text: String,
  segments: Option[Seq[TranscriptionSegment]] = None
)

