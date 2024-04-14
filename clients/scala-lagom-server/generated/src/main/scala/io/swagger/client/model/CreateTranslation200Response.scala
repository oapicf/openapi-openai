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

case class CreateTranslation200Response (
            /* The translated text. */
                  text: String,
            /* The language of the output translation (always `english`). */
                  language: String,
            /* The duration of the input audio. */
                  duration: String,
            /* Segments of the translated text and their corresponding details. */
                  segments: Option[Seq[TranscriptionSegment]]
)

object CreateTranslation200Response {
implicit val format: Format[CreateTranslation200Response] = Json.format
}

