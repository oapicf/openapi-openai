
package org.openapitools.client.model


case class MessageStreamEventOneOf (
    _event: String,
    _data: MessageObject
)
object MessageStreamEventOneOf {
    def toStringBody(var_event: Object, var_data: Object) =
        s"""
        | {
        | "event":$var_event,"data":$var_data
        | }
        """.stripMargin
}
