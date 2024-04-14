package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TranscriptionSegment._

case class TranscriptionSegment (
  /* Unique identifier of the segment. */
  id: Integer,
/* Seek offset of the segment. */
  seek: Integer,
/* Start time of the segment in seconds. */
  start: Float,
/* End time of the segment in seconds. */
  end: Float,
/* Text content of the segment. */
  text: String,
/* Array of token IDs for the text content. */
  tokens: List[Integer],
/* Temperature parameter used for generating the segment. */
  temperature: Float,
/* Average logprob of the segment. If the value is lower than -1, consider the logprobs failed. */
  avgLogprob: Float,
/* Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed. */
  compressionRatio: Float,
/* Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent. */
  noSpeechProb: Float)

object TranscriptionSegment {
  import DateTimeCodecs._

  implicit val TranscriptionSegmentCodecJson: CodecJson[TranscriptionSegment] = CodecJson.derive[TranscriptionSegment]
  implicit val TranscriptionSegmentDecoder: EntityDecoder[TranscriptionSegment] = jsonOf[TranscriptionSegment]
  implicit val TranscriptionSegmentEncoder: EntityEncoder[TranscriptionSegment] = jsonEncoderOf[TranscriptionSegment]
}
