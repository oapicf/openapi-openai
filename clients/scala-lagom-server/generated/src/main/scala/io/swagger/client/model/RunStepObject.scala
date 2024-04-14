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

case class RunStepObject (
            /* The identifier of the run step, which can be referenced in API endpoints. */
                  id: String,
                  `object`:  Option[RunStepObject&#x60;object&#x60;Enum.RunStepObject&#x60;object&#x60;Enum],
            /* The Unix timestamp (in seconds) for when the run step was created. */
                  createdAt: Int,
            /* The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. */
                  assistantId: String,
            /* The ID of the [thread](/docs/api-reference/threads) that was run. */
                  threadId: String,
            /* The ID of the [run](/docs/api-reference/runs) that this run step is a part of. */
                  runId: String,
                  `type`:  Option[RunStepObject&#x60;type&#x60;Enum.RunStepObject&#x60;type&#x60;Enum],
                  status:  Option[RunStepObjectStatusEnum.RunStepObjectStatusEnum],
                  stepDetails: RunStepObjectStepDetails,
                  lastError: RunStepObjectLastError,
            /* The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. */
                  expiredAt: Int,
            /* The Unix timestamp (in seconds) for when the run step was cancelled. */
                  cancelledAt: Int,
            /* The Unix timestamp (in seconds) for when the run step failed. */
                  failedAt: Int,
            /* The Unix timestamp (in seconds) for when the run step completed. */
                  completedAt: Int,
            /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
                  metadata: Any,
                  usage: RunStepCompletionUsage
)

object RunStepObject {
implicit val format: Format[RunStepObject] = Json.format
}

object RunStepObject&#x60;object&#x60;Enum extends Enumeration {
  val   thread.run.step = Value
  type RunStepObject&#x60;object&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[RunStepObject&#x60;object&#x60;Enum.type])
}
object RunStepObject&#x60;type&#x60;Enum extends Enumeration {
  val   message_creation, tool_calls = Value
  type RunStepObject&#x60;type&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[RunStepObject&#x60;type&#x60;Enum.type])
}
object RunStepObjectStatusEnum extends Enumeration {
  val   in_progress, cancelled, failed, completed, expired = Value
  type RunStepObjectStatusEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[RunStepObjectStatusEnum.type])
}
