package model

import play.api.libs.json._

/**
  * For requests that failed with a non-HTTP error, this will contain more information on the cause of the failure.
  * @param code A machine-readable error code.
  * @param message A human-readable error message.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BatchRequestOutputError(
  code: Option[String],
  message: Option[String]
)

object BatchRequestOutputError {
  implicit lazy val batchRequestOutputErrorJsonFormat: Format[BatchRequestOutputError] = Json.format[BatchRequestOutputError]
}

