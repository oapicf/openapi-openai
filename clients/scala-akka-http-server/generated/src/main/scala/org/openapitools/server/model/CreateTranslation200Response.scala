package org.openapitools.server.model


/**
 * @param text The translated text. for example: ''null''
 * @param language The language of the output translation (always `english`). for example: ''null''
 * @param duration The duration of the input audio. for example: ''null''
 * @param segments Segments of the translated text and their corresponding details. for example: ''null''
*/
final case class CreateTranslation200Response (
  text: String,
  language: String,
  duration: String,
  segments: Option[Seq[TranscriptionSegment]] = None
)

