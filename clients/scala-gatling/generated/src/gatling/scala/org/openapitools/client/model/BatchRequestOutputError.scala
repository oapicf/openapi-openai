
package org.openapitools.client.model


case class BatchRequestOutputError (
    /* A machine-readable error code. */
    _code: Option[String],
    /* A human-readable error message. */
    _message: Option[String]
)
object BatchRequestOutputError {
    def toStringBody(var_code: Object, var_message: Object) =
        s"""
        | {
        | "code":$var_code,"message":$var_message
        | }
        """.stripMargin
}
