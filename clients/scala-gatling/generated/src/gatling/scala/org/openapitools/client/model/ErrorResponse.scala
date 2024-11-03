
package org.openapitools.client.model


case class ErrorResponse (
    _error: Error
)
object ErrorResponse {
    def toStringBody(var_error: Object) =
        s"""
        | {
        | "error":$var_error
        | }
        """.stripMargin
}
