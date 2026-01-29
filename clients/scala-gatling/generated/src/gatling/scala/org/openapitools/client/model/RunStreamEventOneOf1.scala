
package org.openapitools.client.model


case class RunStreamEventOneOf1 (
    _event: String,
    _data: RunObject
)
object RunStreamEventOneOf1 {
    def toStringBody(var_event: Object, var_data: Object) =
        s"""
        | {
        | "event":$var_event,"data":$var_data
        | }
        """.stripMargin
}
