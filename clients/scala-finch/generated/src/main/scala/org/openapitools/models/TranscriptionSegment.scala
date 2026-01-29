package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param id Unique identifier of the segment.
 * @param seek Seek offset of the segment.
 * @param start Start time of the segment in seconds.
 * @param end End time of the segment in seconds.
 * @param text Text content of the segment.
 * @param tokens Array of token IDs for the text content.
 * @param temperature Temperature parameter used for generating the segment.
 * @param avgUnderscorelogprob Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
 * @param compressionUnderscoreratio Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
 * @param noUnderscorespeechUnderscoreprob Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.
 */
case class TranscriptionSegment(id: Int,
                seek: Int,
                start: Float,
                end: Float,
                text: String,
                tokens: Seq[Int],
                temperature: Float,
                avgUnderscorelogprob: Float,
                compressionUnderscoreratio: Float,
                noUnderscorespeechUnderscoreprob: Float
                )

object TranscriptionSegment {
    /**
     * Creates the codec for converting TranscriptionSegment from and to JSON.
     */
    implicit val decoder: Decoder[TranscriptionSegment] = deriveDecoder
    implicit val encoder: ObjectEncoder[TranscriptionSegment] = deriveEncoder
}
