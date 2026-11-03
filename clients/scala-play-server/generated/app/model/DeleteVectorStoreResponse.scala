package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeleteVectorStoreResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class DeleteVectorStoreResponse(
  id: String,
  deleted: Boolean,
  `object`: DeleteVectorStoreResponse.Object.Value
)

object DeleteVectorStoreResponse {
  implicit lazy val deleteVectorStoreResponseJsonFormat: Format[DeleteVectorStoreResponse] = Json.format[DeleteVectorStoreResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val VectorStoreDeleted = Value("vector_store.deleted")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

