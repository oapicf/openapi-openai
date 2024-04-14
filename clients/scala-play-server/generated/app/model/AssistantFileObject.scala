package model

import play.api.libs.json._

/**
  * A list of [Files](/docs/api-reference/files) attached to an `assistant`.
  * @param id The identifier, which can be referenced in API endpoints.
  * @param `object` The object type, which is always `assistant.file`.
  * @param createdAt The Unix timestamp (in seconds) for when the assistant file was created.
  * @param assistantId The assistant ID that the file is attached to.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AssistantFileObject(
  id: String,
  `object`: AssistantFileObject.Object.Value,
  createdAt: Int,
  assistantId: String
)

object AssistantFileObject {
  implicit lazy val assistantFileObjectJsonFormat: Format[AssistantFileObject] = Json.format[AssistantFileObject]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val AssistantFile = Value("assistant.file")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

