package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Batch_errors.
  * @param `object` The object type, which is always `list`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BatchErrors(
  `object`: Option[String],
  data: Option[List[BatchErrorsDataInner]]
)

object BatchErrors {
  implicit lazy val batchErrorsJsonFormat: Format[BatchErrors] = Json.format[BatchErrors]
}

