package model

import play.api.libs.json._

/**
  * The delta containing the fields that have changed on the Message.
  * @param role The entity that produced the message. One of `user` or `assistant`.
  * @param content The content of the message in array of text and/or images.
  * @param fileIds A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class MessageDeltaObjectDelta(
  role: Option[MessageDeltaObjectDelta.Role.Value],
  content: Option[List[MessageDeltaObjectDeltaContentInner]],
  fileIds: Option[List[String]]
)

object MessageDeltaObjectDelta {
  implicit lazy val messageDeltaObjectDeltaJsonFormat: Format[MessageDeltaObjectDelta] = Json.format[MessageDeltaObjectDelta]

  // noinspection TypeAnnotation
  object Role extends Enumeration {
    val User = Value("user")
    val Assistant = Value("assistant")

    type Role = Value
    implicit lazy val RoleJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

