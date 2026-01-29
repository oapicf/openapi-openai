
package org.openapitools.client.model


case class FineTuningJobError (
    /* A machine-readable error code. */
    _code: String,
    /* A human-readable error message. */
    _message: String,
    /* The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific. */
    _param: String
)
object FineTuningJobError {
    def toStringBody(var_code: Object, var_message: Object, var_param: Object) =
        s"""
        | {
        | "code":$var_code,"message":$var_message,"param":$var_param
        | }
        """.stripMargin
}
