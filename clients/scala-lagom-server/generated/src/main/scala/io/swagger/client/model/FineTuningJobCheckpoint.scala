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

case class FineTuningJobCheckpoint (
            /* The checkpoint identifier, which can be referenced in the API endpoints. */
                  id: String,
            /* The Unix timestamp (in seconds) for when the checkpoint was created. */
                  createdAt: Int,
            /* The name of the fine-tuned checkpoint model that is created. */
                  fineTunedModelCheckpoint: String,
            /* The step number that the checkpoint was created at. */
                  stepNumber: Int,
                  metrics: FineTuningJobCheckpointMetrics,
            /* The name of the fine-tuning job that this checkpoint was created from. */
                  fineTuningJobId: String,
                  `object`:  Option[FineTuningJobCheckpoint&#x60;object&#x60;Enum.FineTuningJobCheckpoint&#x60;object&#x60;Enum]
)

object FineTuningJobCheckpoint {
implicit val format: Format[FineTuningJobCheckpoint] = Json.format
}

object FineTuningJobCheckpoint&#x60;object&#x60;Enum extends Enumeration {
  val   fine_tuning.job.checkpoint = Value
  type FineTuningJobCheckpoint&#x60;object&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[FineTuningJobCheckpoint&#x60;object&#x60;Enum.type])
}
