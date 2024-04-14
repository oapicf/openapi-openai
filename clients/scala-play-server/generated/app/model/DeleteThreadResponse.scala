package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeleteThreadResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class DeleteThreadResponse(
  id: String,
  deleted: Boolean,
  `object`: DeleteThreadResponse.Object.Value
)

object DeleteThreadResponse {
  implicit lazy val deleteThreadResponseJsonFormat: Format[DeleteThreadResponse] = Json.format[DeleteThreadResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val ThreadDeleted = Value("thread.deleted")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

