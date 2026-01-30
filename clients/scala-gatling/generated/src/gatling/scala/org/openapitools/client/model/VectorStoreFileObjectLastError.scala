
package org.openapitools.client.model


case class VectorStoreFileObjectLastError (
    /* One of `server_error` or `rate_limit_exceeded`. */
    _code: String,
    /* A human-readable description of the error. */
    _message: String
)
object VectorStoreFileObjectLastError {
    def toStringBody(var_code: Object, var_message: Object) =
        s"""
        | {
        | "code":$var_code,"message":$var_message
        | }
        """.stripMargin
}
