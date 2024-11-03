package model

import play.api.libs.json._

/**
  * Represents a thread that contains [messages](/docs/api-reference/messages).
  * @param id The identifier, which can be referenced in API endpoints.
  * @param `object` The object type, which is always `thread`.
  * @param createdAt The Unix timestamp (in seconds) for when the thread was created.
  * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class ThreadObject(
  id: String,
  `object`: ThreadObject.Object.Value,
  createdAt: Int,
  metadata: JsObject
)

object ThreadObject {
  implicit lazy val threadObjectJsonFormat: Format[ThreadObject] = Json.format[ThreadObject]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val Thread = Value("thread")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

