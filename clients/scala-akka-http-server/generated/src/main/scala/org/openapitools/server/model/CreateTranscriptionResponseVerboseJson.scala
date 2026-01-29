package org.openapitools.server.model


/**
 * Represents a verbose json transcription response returned by model, based on the provided input.
 *
 * @param language The language of the input audio. for example: ''null''
 * @param duration The duration of the input audio. for example: ''null''
 * @param text The transcribed text. for example: ''null''
 * @param words Extracted words and their corresponding timestamps. for example: ''null''
 * @param segments Segments of the transcribed text and their corresponding details. for example: ''null''
*/
final case class CreateTranscriptionResponseVerboseJson (
  language: String,
  duration: String,
  text: String,
  words: Option[Seq[TranscriptionWord]] = None,
  segments: Option[Seq[TranscriptionSegment]] = None
)

