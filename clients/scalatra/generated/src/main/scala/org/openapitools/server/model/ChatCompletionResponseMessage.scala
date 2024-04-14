/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */

package org.openapitools.server.model

case class ChatCompletionResponseMessage(
  /* The contents of the message. */
  content: String,

  /* The tool calls generated by the model, such as function calls. */
  toolCalls: Option[List[ChatCompletionMessageToolCall]],

  /* The role of the author of this message. */
  role: String,

  functionCall: Option[ChatCompletionRequestAssistantMessageFunctionCall]

 )
