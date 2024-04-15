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

package io.swagger.client.model
import play.api.libs.json._

case class ChatCompletionRequestSystemMessage (
            /* The contents of the system message. */
                  content: String,
                  role:  Option[ChatCompletionRequestSystemMessageRoleEnum.ChatCompletionRequestSystemMessageRoleEnum],
            /* An optional name for the participant. Provides the model information to differentiate between participants of the same role. */
                  name: Option[String]
)

object ChatCompletionRequestSystemMessage {
implicit val format: Format[ChatCompletionRequestSystemMessage] = Json.format
}

object ChatCompletionRequestSystemMessageRoleEnum extends Enumeration {
  val   system = Value
  type ChatCompletionRequestSystemMessageRoleEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[ChatCompletionRequestSystemMessageRoleEnum.type])
}