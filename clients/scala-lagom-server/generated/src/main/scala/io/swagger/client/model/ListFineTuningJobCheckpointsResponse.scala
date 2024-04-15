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

case class ListFineTuningJobCheckpointsResponse (
                  data: Seq[FineTuningJobCheckpoint],
                  `object`:  Option[ListFineTuningJobCheckpointsResponse&#x60;object&#x60;Enum.ListFineTuningJobCheckpointsResponse&#x60;object&#x60;Enum],
                  firstId: Option[String],
                  lastId: Option[String],
                  hasMore: Boolean
)

object ListFineTuningJobCheckpointsResponse {
implicit val format: Format[ListFineTuningJobCheckpointsResponse] = Json.format
}

object ListFineTuningJobCheckpointsResponse&#x60;object&#x60;Enum extends Enumeration {
  val   list = Value
  type ListFineTuningJobCheckpointsResponse&#x60;object&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[ListFineTuningJobCheckpointsResponse&#x60;object&#x60;Enum.type])
}