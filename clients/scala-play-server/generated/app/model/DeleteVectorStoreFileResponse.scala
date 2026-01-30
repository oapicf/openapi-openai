package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeleteVectorStoreFileResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class DeleteVectorStoreFileResponse(
  id: String,
  deleted: Boolean,
  `object`: DeleteVectorStoreFileResponse.Object.Value
)

object DeleteVectorStoreFileResponse {
  implicit lazy val deleteVectorStoreFileResponseJsonFormat: Format[DeleteVectorStoreFileResponse] = Json.format[DeleteVectorStoreFileResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val VectorStoreFileDeleted = Value("vector_store.file.deleted")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

