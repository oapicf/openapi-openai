
package org.openapitools.client.model


case class RealtimeResponseUsage (
    /* The total number of tokens in the Response including input and output  text and audio tokens.  */
    _totalTokens: Option[Integer],
    /* The number of input tokens used in the Response, including text and  audio tokens.  */
    _inputTokens: Option[Integer],
    /* The number of output tokens sent in the Response, including text and  audio tokens.  */
    _outputTokens: Option[Integer],
    _inputTokenDetails: Option[RealtimeResponseUsageInputTokenDetails],
    _outputTokenDetails: Option[RealtimeResponseUsageOutputTokenDetails]
)
object RealtimeResponseUsage {
    def toStringBody(var_totalTokens: Object, var_inputTokens: Object, var_outputTokens: Object, var_inputTokenDetails: Object, var_outputTokenDetails: Object) =
        s"""
        | {
        | "totalTokens":$var_totalTokens,"inputTokens":$var_inputTokens,"outputTokens":$var_outputTokens,"inputTokenDetails":$var_inputTokenDetails,"outputTokenDetails":$var_outputTokenDetails
        | }
        """.stripMargin
}
