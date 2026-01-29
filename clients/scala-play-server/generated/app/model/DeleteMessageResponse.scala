package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeleteMessageResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class DeleteMessageResponse(
  id: String,
  deleted: Boolean,
  `object`: DeleteMessageResponse.Object.Value
)

object DeleteMessageResponse {
  implicit lazy val deleteMessageResponseJsonFormat: Format[DeleteMessageResponse] = Json.format[DeleteMessageResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val ThreadMessageDeleted = Value("thread.message.deleted")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

