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

import org.openapitools.client.core.ApiModel

case class CreateChatCompletionStreamResponseChoicesInner (
  delta: ChatCompletionStreamResponseDelta,
  logprobs: Option[CreateChatCompletionResponseChoicesInnerLogprobs] = None,
  /* The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function.  */
  finishReason: CreateChatCompletionStreamResponseChoicesInnerEnums.FinishReason,
  /* The index of the choice in the list of choices. */
  index: Int
) extends ApiModel

object CreateChatCompletionStreamResponseChoicesInnerEnums {

  type FinishReason = FinishReason.Value
  object FinishReason extends Enumeration {
    val Stop = Value("stop")
    val Length = Value("length")
    val ToolCalls = Value("tool_calls")
    val ContentFilter = Value("content_filter")
    val FunctionCall = Value("function_call")
  }

}
