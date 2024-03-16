
package org.openapitools.client.model


case class Error (
    _type: String,
    _message: String,
    _param: String,
    _code: String
)
object Error {
    def toStringBody(var_type: Object, var_message: Object, var_param: Object, var_code: Object) =
        s"""
        | {
        | "type":$var_type,"message":$var_message,"param":$var_param,"code":$var_code
        | }
        """.stripMargin
}
