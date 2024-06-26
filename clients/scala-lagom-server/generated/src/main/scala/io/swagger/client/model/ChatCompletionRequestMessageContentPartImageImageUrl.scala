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
import java.net.URI

case class ChatCompletionRequestMessageContentPartImageImageUrl (
            /* Either a URL of the image or the base64 encoded image data. */
                  url: URI,
                  detail:  Option[ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum.ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum]
)

object ChatCompletionRequestMessageContentPartImageImageUrl {
implicit val format: Format[ChatCompletionRequestMessageContentPartImageImageUrl] = Json.format
}

object ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum extends Enumeration {
  val   auto, low, high = Value
  type ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum.type])
}
