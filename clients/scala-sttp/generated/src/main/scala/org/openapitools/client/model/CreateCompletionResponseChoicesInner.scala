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


case class CreateCompletionResponseChoicesInner(
  /* The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters.  */
  finishReason: CreateCompletionResponseChoicesInnerEnums.FinishReason,
  index: Int,
  logprobs: CreateCompletionResponseChoicesInnerLogprobs,
  text: String
)

object CreateCompletionResponseChoicesInnerEnums {

  type FinishReason = FinishReason.Value
  object FinishReason extends Enumeration {
    val Stop = Value("stop")
    val Length = Value("length")
    val ContentFilter = Value("content_filter")
  }

}
