package model

import play.api.libs.json._

/**
  * The last error associated with this run. Will be `null` if there are no errors.
  * @param code One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.
  * @param message A human-readable description of the error.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunObjectLastError(
  code: RunObjectLastError.Code.Value,
  message: String
)

object RunObjectLastError {
  implicit lazy val runObjectLastErrorJsonFormat: Format[RunObjectLastError] = Json.format[RunObjectLastError]

  // noinspection TypeAnnotation
  object Code extends Enumeration {
    val ServerError = Value("server_error")
    val RateLimitExceeded = Value("rate_limit_exceeded")
    val InvalidPrompt = Value("invalid_prompt")

    type Code = Value
    implicit lazy val CodeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

