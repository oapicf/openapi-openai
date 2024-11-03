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

case class Image (
            /* The base64-encoded JSON of the generated image, if `response_format` is `b64_json`. */
                  b64Json: Option[String],
            /* The URL of the generated image, if `response_format` is `url` (default). */
                  url: Option[String],
            /* The prompt that was used to generate the image, if there was any revision to the prompt. */
                  revisedPrompt: Option[String]
)

object Image {
implicit val format: Format[Image] = Json.format
}

