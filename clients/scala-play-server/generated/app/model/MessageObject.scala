package model

import play.api.libs.json._

/**
  * Represents a message within a [thread](/docs/api-reference/threads).
  * @param id The identifier, which can be referenced in API endpoints.
  * @param `object` The object type, which is always `thread.message`.
  * @param createdAt The Unix timestamp (in seconds) for when the message was created.
  * @param threadId The [thread](/docs/api-reference/threads) ID that this message belongs to.
  * @param status The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.
  * @param completedAt The Unix timestamp (in seconds) for when the message was completed.
  * @param incompleteAt The Unix timestamp (in seconds) for when the message was marked as incomplete.
  * @param role The entity that produced the message. One of `user` or `assistant`.
  * @param content The content of the message in array of text and/or images.
  * @param assistantId If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
  * @param runId The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints.
  * @param fileIds A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
  * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class MessageObject(
  id: String,
  `object`: MessageObject.Object.Value,
  createdAt: Int,
  threadId: String,
  status: MessageObject.Status.Value,
  incompleteDetails: MessageObjectIncompleteDetails,
  completedAt: Int,
  incompleteAt: Int,
  role: MessageObject.Role.Value,
  content: List[MessageObjectContentInner],
  assistantId: String,
  runId: String,
  fileIds: List[String],
  metadata: JsObject
)

object MessageObject {
  implicit lazy val messageObjectJsonFormat: Format[MessageObject] = Json.format[MessageObject]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val ThreadMessage = Value("thread.message")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Status extends Enumeration {
    val InProgress = Value("in_progress")
    val Incomplete = Value("incomplete")
    val Completed = Value("completed")

    type Status = Value
    implicit lazy val StatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Role extends Enumeration {
    val User = Value("user")
    val Assistant = Value("assistant")

    type Role = Value
    implicit lazy val RoleJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

