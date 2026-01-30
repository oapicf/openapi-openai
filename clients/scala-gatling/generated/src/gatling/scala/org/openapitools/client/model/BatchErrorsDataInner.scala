
package org.openapitools.client.model


case class BatchErrorsDataInner (
    /* An error code identifying the error type. */
    _code: Option[String],
    /* A human-readable message providing more details about the error. */
    _message: Option[String],
    /* The name of the parameter that caused the error, if applicable. */
    _param: Option[String],
    /* The line number of the input file where the error occurred, if applicable. */
    _line: Option[Integer]
)
object BatchErrorsDataInner {
    def toStringBody(var_code: Object, var_message: Object, var_param: Object, var_line: Object) =
        s"""
        | {
        | "code":$var_code,"message":$var_message,"param":$var_param,"line":$var_line
        | }
        """.stripMargin
}
