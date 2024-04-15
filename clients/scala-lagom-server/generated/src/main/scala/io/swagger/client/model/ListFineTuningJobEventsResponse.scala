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

case class ListFineTuningJobEventsResponse (
                  data: Seq[FineTuningJobEvent],
                  `object`:  Option[ListFineTuningJobEventsResponse&#x60;object&#x60;Enum.ListFineTuningJobEventsResponse&#x60;object&#x60;Enum]
)

object ListFineTuningJobEventsResponse {
implicit val format: Format[ListFineTuningJobEventsResponse] = Json.format
}

object ListFineTuningJobEventsResponse&#x60;object&#x60;Enum extends Enumeration {
  val   list = Value
  type ListFineTuningJobEventsResponse&#x60;object&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[ListFineTuningJobEventsResponse&#x60;object&#x60;Enum.type])
}