
package org.openapitools.client.model


case class RunObjectLastError (
    /* One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`. */
    _code: String,
    /* A human-readable description of the error. */
    _message: String
)
object RunObjectLastError {
    def toStringBody(var_code: Object, var_message: Object) =
        s"""
        | {
        | "code":$var_code,"message":$var_message
        | }
        """.stripMargin
}
