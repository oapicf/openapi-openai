package org.openapitools.server.model


/**
 * @param id Unique identifier of the segment. for example: ''null''
 * @param seek Seek offset of the segment. for example: ''null''
 * @param start Start time of the segment in seconds. for example: ''null''
 * @param end End time of the segment in seconds. for example: ''null''
 * @param text Text content of the segment. for example: ''null''
 * @param tokens Array of token IDs for the text content. for example: ''null''
 * @param temperature Temperature parameter used for generating the segment. for example: ''null''
 * @param avgLogprob Average logprob of the segment. If the value is lower than -1, consider the logprobs failed. for example: ''null''
 * @param compressionRatio Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed. for example: ''null''
 * @param noSpeechProb Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent. for example: ''null''
*/
final case class TranscriptionSegment (
  id: Int,
  seek: Int,
  start: Float,
  end: Float,
  text: String,
  tokens: Seq[Int],
  temperature: Float,
  avgLogprob: Float,
  compressionRatio: Float,
  noSpeechProb: Float
)

