package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Batch_errors.
  * @param `object` The object type, which is always `list`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BatchErrors(
  `object`: Option[String],
  data: Option[List[BatchErrorsDataInner]]
)

object BatchErrors {
  implicit lazy val batchErrorsJsonFormat: Format[BatchErrors] = Json.format[BatchErrors]
}

