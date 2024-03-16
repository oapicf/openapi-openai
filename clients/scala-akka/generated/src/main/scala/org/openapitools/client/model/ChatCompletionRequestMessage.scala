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

import org.openapitools.client.core.ApiModel

case class ChatCompletionRequestMessage (
  /* The role of the messages author. One of `system`, `user`, `assistant`, or `function`. */
  role: ChatCompletionRequestMessageEnums.Role,
  /* The contents of the message. `content` is required for all messages except assistant messages with function calls. */
  content: Option[String] = None,
  /* The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters. */
  name: Option[String] = None,
  functionCall: Option[ChatCompletionRequestMessageFunctionCall] = None
) extends ApiModel

object ChatCompletionRequestMessageEnums {

  type Role = Role.Value
  object Role extends Enumeration {
    val System = Value("system")
    val User = Value("user")
    val Assistant = Value("assistant")
    val Function = Value("function")
  }

}
