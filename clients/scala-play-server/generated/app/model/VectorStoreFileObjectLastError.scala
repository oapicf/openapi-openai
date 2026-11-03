package model

import play.api.libs.json._

/**
  * The last error associated with this vector store file. Will be `null` if there are no errors.
  * @param code One of `server_error` or `rate_limit_exceeded`.
  * @param message A human-readable description of the error.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class VectorStoreFileObjectLastError(
  code: VectorStoreFileObjectLastError.Code.Value,
  message: String
)

object VectorStoreFileObjectLastError {
  implicit lazy val vectorStoreFileObjectLastErrorJsonFormat: Format[VectorStoreFileObjectLastError] = Json.format[VectorStoreFileObjectLastError]

  // noinspection TypeAnnotation
  object Code extends Enumeration {
    val ServerError = Value("server_error")
    val UnsupportedFile = Value("unsupported_file")
    val InvalidFile = Value("invalid_file")

    type Code = Value
    implicit lazy val CodeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

