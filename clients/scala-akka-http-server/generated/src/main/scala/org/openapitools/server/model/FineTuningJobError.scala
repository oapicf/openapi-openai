package org.openapitools.server.model


/**
 * For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.
 *
 * @param code A machine-readable error code. for example: ''null''
 * @param message A human-readable error message. for example: ''null''
 * @param param The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific. for example: ''null''
*/
final case class FineTuningJobError (
  code: String,
  message: String,
  param: String
)

