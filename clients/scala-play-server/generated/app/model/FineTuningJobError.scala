package model

import play.api.libs.json._

/**
  * For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.
  * @param code A machine-readable error code.
  * @param message A human-readable error message.
  * @param param The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class FineTuningJobError(
  code: String,
  message: String,
  param: String
)

object FineTuningJobError {
  implicit lazy val fineTuningJobErrorJsonFormat: Format[FineTuningJobError] = Json.format[FineTuningJobError]
}

