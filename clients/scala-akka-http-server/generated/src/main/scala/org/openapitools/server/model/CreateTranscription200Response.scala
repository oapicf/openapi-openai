package org.openapitools.server.model


/**
 * @param text The transcribed text. for example: ''null''
 * @param language The language of the input audio. for example: ''null''
 * @param duration The duration of the input audio. for example: ''null''
 * @param words Extracted words and their corresponding timestamps. for example: ''null''
 * @param segments Segments of the transcribed text and their corresponding details. for example: ''null''
*/
final case class CreateTranscription200Response (
  text: String,
  language: String,
  duration: String,
  words: Option[Seq[TranscriptionWord]] = None,
  segments: Option[Seq[TranscriptionSegment]] = None
)

