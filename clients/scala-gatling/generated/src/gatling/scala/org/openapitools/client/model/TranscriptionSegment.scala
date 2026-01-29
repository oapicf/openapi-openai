
package org.openapitools.client.model


case class TranscriptionSegment (
    /* Unique identifier of the segment. */
    _id: Integer,
    /* Seek offset of the segment. */
    _seek: Integer,
    /* Start time of the segment in seconds. */
    _start: Float,
    /* End time of the segment in seconds. */
    _end: Float,
    /* Text content of the segment. */
    _text: String,
    /* Array of token IDs for the text content. */
    _tokens: List[Integer],
    /* Temperature parameter used for generating the segment. */
    _temperature: Float,
    /* Average logprob of the segment. If the value is lower than -1, consider the logprobs failed. */
    _avgLogprob: Float,
    /* Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed. */
    _compressionRatio: Float,
    /* Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent. */
    _noSpeechProb: Float
)
object TranscriptionSegment {
    def toStringBody(var_id: Object, var_seek: Object, var_start: Object, var_end: Object, var_text: Object, var_tokens: Object, var_temperature: Object, var_avgLogprob: Object, var_compressionRatio: Object, var_noSpeechProb: Object) =
        s"""
        | {
        | "id":$var_id,"seek":$var_seek,"start":$var_start,"end":$var_end,"text":$var_text,"tokens":$var_tokens,"temperature":$var_temperature,"avgLogprob":$var_avgLogprob,"compressionRatio":$var_compressionRatio,"noSpeechProb":$var_noSpeechProb
        | }
        """.stripMargin
}
