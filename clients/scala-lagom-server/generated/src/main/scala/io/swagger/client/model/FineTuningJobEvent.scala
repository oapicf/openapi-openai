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

case class FineTuningJobEvent (
                  id: String,
                  createdAt: Int,
                  level:  Option[FineTuningJobEventLevelEnum.FineTuningJobEventLevelEnum],
                  message: String,
                  `object`:  Option[FineTuningJobEvent&#x60;object&#x60;Enum.FineTuningJobEvent&#x60;object&#x60;Enum]
)

object FineTuningJobEvent {
implicit val format: Format[FineTuningJobEvent] = Json.format
}

object FineTuningJobEventLevelEnum extends Enumeration {
  val   info, warn, error = Value
  type FineTuningJobEventLevelEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[FineTuningJobEventLevelEnum.type])
}
object FineTuningJobEvent&#x60;object&#x60;Enum extends Enumeration {
  val   fine_tuning.job.event = Value
  type FineTuningJobEvent&#x60;object&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[FineTuningJobEvent&#x60;object&#x60;Enum.type])
}
