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


  /**
   * A chat completion message generated by the model.
   */
case class ChatCompletionResponseMessage(
  /* The contents of the message. */
  content: String,
  /* The tool calls generated by the model, such as function calls. */
  toolCalls: Option[Seq[ChatCompletionMessageToolCall]] = None,
  /* The role of the author of this message. */
  role: ChatCompletionResponseMessageEnums.Role,
  functionCall: Option[ChatCompletionRequestAssistantMessageFunctionCall] = None
)

object ChatCompletionResponseMessageEnums {

  type Role = Role.Value
  object Role extends Enumeration {
    val Assistant = Value("assistant")
  }

}
