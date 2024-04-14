
package org.openapitools.client.model


case class RunStepObjectLastError (
    /* One of `server_error` or `rate_limit_exceeded`. */
    _code: String,
    /* A human-readable description of the error. */
    _message: String
)
object RunStepObjectLastError {
    def toStringBody(var_code: Object, var_message: Object) =
        s"""
        | {
        | "code":$var_code,"message":$var_message
        | }
        """.stripMargin
}
