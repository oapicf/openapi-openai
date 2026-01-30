package model

import play.api.libs.json._

/**
  * The last error associated with this run step. Will be `null` if there are no errors.
  * @param code One of `server_error` or `rate_limit_exceeded`.
  * @param message A human-readable description of the error.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunStepObjectLastError(
  code: RunStepObjectLastError.Code.Value,
  message: String
)

object RunStepObjectLastError {
  implicit lazy val runStepObjectLastErrorJsonFormat: Format[RunStepObjectLastError] = Json.format[RunStepObjectLastError]

  // noinspection TypeAnnotation
  object Code extends Enumeration {
    val ServerError = Value("server_error")
    val RateLimitExceeded = Value("rate_limit_exceeded")

    type Code = Value
    implicit lazy val CodeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

