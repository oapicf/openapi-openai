
package org.openapitools.client.model


case class MessageStreamEventOneOf1 (
    _event: String,
    _data: MessageObject
)
object MessageStreamEventOneOf1 {
    def toStringBody(var_event: Object, var_data: Object) =
        s"""
        | {
        | "event":$var_event,"data":$var_data
        | }
        """.stripMargin
}
