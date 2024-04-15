/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model


case class CreateTranscription200Response(
  /* The transcribed text. */
  text: String,
  /* The language of the input audio. */
  language: String,
  /* The duration of the input audio. */
  duration: String,
  /* Extracted words and their corresponding timestamps. */
  words: Option[Seq[TranscriptionWord]] = None,
  /* Segments of the transcribed text and their corresponding details. */
  segments: Option[Seq[TranscriptionSegment]] = None
)
