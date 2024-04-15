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


case class ChatCompletionRequestAssistantMessage(
  /* The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified.  */
  content: Option[String] = None,
  /* The role of the messages author, in this case `assistant`. */
  role: ChatCompletionRequestAssistantMessageEnums.Role,
  /* An optional name for the participant. Provides the model information to differentiate between participants of the same role. */
  name: Option[String] = None,
  /* The tool calls generated by the model, such as function calls. */
  toolCalls: Option[Seq[ChatCompletionMessageToolCall]] = None,
  functionCall: Option[ChatCompletionRequestAssistantMessageFunctionCall] = None
)

object ChatCompletionRequestAssistantMessageEnums {

  type Role = Role.Value
  object Role extends Enumeration {
    val Assistant = Value("assistant")
  }

}