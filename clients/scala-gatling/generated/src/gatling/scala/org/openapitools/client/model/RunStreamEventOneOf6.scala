
package org.openapitools.client.model


case class RunStreamEventOneOf6 (
    _event: String,
    _data: RunObject
)
object RunStreamEventOneOf6 {
    def toStringBody(var_event: Object, var_data: Object) =
        s"""
        | {
        | "event":$var_event,"data":$var_data
        | }
        """.stripMargin
}
