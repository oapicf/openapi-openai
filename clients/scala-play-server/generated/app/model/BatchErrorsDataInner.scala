package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Batch_errors_data_inner.
  * @param code An error code identifying the error type.
  * @param message A human-readable message providing more details about the error.
  * @param param The name of the parameter that caused the error, if applicable.
  * @param line The line number of the input file where the error occurred, if applicable.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BatchErrorsDataInner(
  code: Option[String],
  message: Option[String],
  param: Option[String],
  line: Option[Int]
)

object BatchErrorsDataInner {
  implicit lazy val batchErrorsDataInnerJsonFormat: Format[BatchErrorsDataInner] = Json.format[BatchErrorsDataInner]
}

