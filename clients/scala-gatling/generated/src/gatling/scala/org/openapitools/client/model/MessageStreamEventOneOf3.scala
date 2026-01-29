
package org.openapitools.client.model


case class MessageStreamEventOneOf3 (
    _event: String,
    _data: MessageObject
)
object MessageStreamEventOneOf3 {
    def toStringBody(var_event: Object, var_data: Object) =
        s"""
        | {
        | "event":$var_event,"data":$var_data
        | }
        """.stripMargin
}
