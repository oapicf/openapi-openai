
package org.openapitools.client.model


case class DefaultProjectErrorResponse (
    _code: Integer,
    _message: String
)
object DefaultProjectErrorResponse {
    def toStringBody(var_code: Object, var_message: Object) =
        s"""
        | {
        | "code":$var_code,"message":$var_message
        | }
        """.stripMargin
}
