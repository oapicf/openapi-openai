package model

import play.api.libs.json._

/**
  * A list of files attached to a `message`.
  * @param id The identifier, which can be referenced in API endpoints.
  * @param `object` The object type, which is always `thread.message.file`.
  * @param createdAt The Unix timestamp (in seconds) for when the message file was created.
  * @param messageId The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MessageFileObject(
  id: String,
  `object`: MessageFileObject.Object.Value,
  createdAt: Int,
  messageId: String
)

object MessageFileObject {
  implicit lazy val messageFileObjectJsonFormat: Format[MessageFileObject] = Json.format[MessageFileObject]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val ThreadMessageFile = Value("thread.message.file")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

