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

case class MessageObject (
            /* The identifier, which can be referenced in API endpoints. */
                  id: String,
                  `object`:  Option[MessageObject&#x60;object&#x60;Enum.MessageObject&#x60;object&#x60;Enum],
            /* The Unix timestamp (in seconds) for when the message was created. */
                  createdAt: Int,
            /* The [thread](/docs/api-reference/threads) ID that this message belongs to. */
                  threadId: String,
                  status:  Option[MessageObjectStatusEnum.MessageObjectStatusEnum],
                  incompleteDetails: MessageObjectIncompleteDetails,
            /* The Unix timestamp (in seconds) for when the message was completed. */
                  completedAt: Int,
            /* The Unix timestamp (in seconds) for when the message was marked as incomplete. */
                  incompleteAt: Int,
                  role:  Option[MessageObjectRoleEnum.MessageObjectRoleEnum],
            /* The content of the message in array of text and/or images. */
                  content: Seq[MessageObjectContentInner],
            /* If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. */
                  assistantId: String,
            /* The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints. */
                  runId: String,
            /* A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. */
                  fileIds: Seq[String],
            /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
                  metadata: Any
)

object MessageObject {
implicit val format: Format[MessageObject] = Json.format
}

object MessageObject&#x60;object&#x60;Enum extends Enumeration {
  val   thread.message = Value
  type MessageObject&#x60;object&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[MessageObject&#x60;object&#x60;Enum.type])
}
object MessageObjectStatusEnum extends Enumeration {
  val   in_progress, incomplete, completed = Value
  type MessageObjectStatusEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[MessageObjectStatusEnum.type])
}
object MessageObjectRoleEnum extends Enumeration {
  val   user, assistant = Value
  type MessageObjectRoleEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[MessageObjectRoleEnum.type])
}
