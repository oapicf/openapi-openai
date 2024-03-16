/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model


case class CreateChatCompletionStreamResponseChoicesInner(
  index: Option[Int] = None,
  delta: Option[ChatCompletionStreamResponseDelta] = None,
  finishReason: Option[CreateChatCompletionStreamResponseChoicesInnerEnums.FinishReason] = None
)

object CreateChatCompletionStreamResponseChoicesInnerEnums {

  type FinishReason = FinishReason.Value
  object FinishReason extends Enumeration {
    val Stop = Value("stop")
    val Length = Value("length")
    val FunctionCall = Value("function_call")
  }

}
