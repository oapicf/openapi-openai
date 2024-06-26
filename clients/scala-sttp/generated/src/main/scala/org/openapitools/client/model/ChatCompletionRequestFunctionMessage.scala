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


case class ChatCompletionRequestFunctionMessage(
  /* The role of the messages author, in this case `function`. */
  role: ChatCompletionRequestFunctionMessageEnums.Role,
  /* The contents of the function message. */
  content: String,
  /* The name of the function to call. */
  name: String
)

object ChatCompletionRequestFunctionMessageEnums {

  type Role = Role.Value
  object Role extends Enumeration {
    val Function = Value("function")
  }

}
