package org.openapitools.server.model


/**
 * @param word The text content of the word. for example: ''null''
 * @param start Start time of the word in seconds. for example: ''null''
 * @param end End time of the word in seconds. for example: ''null''
*/
final case class TranscriptionWord (
  word: String,
  start: Float,
  end: Float
)

