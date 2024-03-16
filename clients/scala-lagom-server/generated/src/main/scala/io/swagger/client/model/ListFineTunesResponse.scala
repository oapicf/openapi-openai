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

package io.swagger.client.model
import play.api.libs.json._

case class ListFineTunesResponse (
                  `object`: String,
                  data: Seq[FineTune]
)

object ListFineTunesResponse {
implicit val format: Format[ListFineTunesResponse] = Json.format
}
