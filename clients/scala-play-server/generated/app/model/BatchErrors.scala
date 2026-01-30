package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Batch_errors.
  * @param `object` The object type, which is always `list`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BatchErrors(
  `object`: Option[String],
  data: Option[List[BatchErrorsDataInner]]
)

object BatchErrors {
  implicit lazy val batchErrorsJsonFormat: Format[BatchErrors] = Json.format[BatchErrors]
}

