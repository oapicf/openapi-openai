
package org.openapitools.client.model


case class AuditLogLoginFailed (
    /* The error code of the failure. */
    _errorCode: Option[String],
    /* The error message of the failure. */
    _errorMessage: Option[String]
)
object AuditLogLoginFailed {
    def toStringBody(var_errorCode: Object, var_errorMessage: Object) =
        s"""
        | {
        | "errorCode":$var_errorCode,"errorMessage":$var_errorMessage
        | }
        """.stripMargin
}
