
package org.openapitools.client.model


case class Error (
    _code: String,
    _message: String,
    _param: String,
    _type: String
)
object Error {
    def toStringBody(var_code: Object, var_message: Object, var_param: Object, var_type: Object) =
        s"""
        | {
        | "code":$var_code,"message":$var_message,"param":$var_param,"type":$var_type
        | }
        """.stripMargin
}
