package model

import play.api.libs.json._

/**
  * For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.
  * @param code A machine-readable error code.
  * @param message A human-readable error message.
  * @param param The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class FineTuningJobError(
  code: String,
  message: String,
  param: String
)

object FineTuningJobError {
  implicit lazy val fineTuningJobErrorJsonFormat: Format[FineTuningJobError] = Json.format[FineTuningJobError]
}

