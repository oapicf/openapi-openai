
package org.openapitools.client.model


case class MessageStreamEventOneOf2 (
    _event: String,
    _data: MessageDeltaObject
)
object MessageStreamEventOneOf2 {
    def toStringBody(var_event: Object, var_data: Object) =
        s"""
        | {
        | "event":$var_event,"data":$var_data
        | }
        """.stripMargin
}
