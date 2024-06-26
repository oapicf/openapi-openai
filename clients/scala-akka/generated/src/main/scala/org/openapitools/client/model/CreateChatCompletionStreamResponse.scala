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

case class CreateChatCompletionStreamResponse (
  /* A unique identifier for the chat completion. Each chunk has the same ID. */
  id: String,
  /* A list of chat completion choices. Can be more than one if `n` is greater than 1. */
  choices: Seq[CreateChatCompletionStreamResponseChoicesInner],
  /* The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp. */
  created: Int,
  /* The model to generate the completion. */
  model: String,
  /* This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.  */
  systemFingerprint: Option[String] = None,
  /* The object type, which is always `chat.completion.chunk`. */
  `object`: CreateChatCompletionStreamResponseEnums.`Object`
) extends ApiModel

object CreateChatCompletionStreamResponseEnums {

  type `Object` = `Object`.Value
  object `Object` extends Enumeration {
    val ChatCompletionChunk = Value("chat.completion.chunk")
  }

}
