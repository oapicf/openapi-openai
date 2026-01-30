package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TranscriptionSegment.
  * @param id Unique identifier of the segment.
  * @param seek Seek offset of the segment.
  * @param start Start time of the segment in seconds.
  * @param end End time of the segment in seconds.
  * @param text Text content of the segment.
  * @param tokens Array of token IDs for the text content.
  * @param temperature Temperature parameter used for generating the segment.
  * @param avgLogprob Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
  * @param compressionRatio Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
  * @param noSpeechProb Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TranscriptionSegment(
  id: Int,
  seek: Int,
  start: Float,
  end: Float,
  text: String,
  tokens: List[Int],
  temperature: Float,
  avgLogprob: Float,
  compressionRatio: Float,
  noSpeechProb: Float
)

object TranscriptionSegment {
  implicit lazy val transcriptionSegmentJsonFormat: Format[TranscriptionSegment] = Json.format[TranscriptionSegment]
}

