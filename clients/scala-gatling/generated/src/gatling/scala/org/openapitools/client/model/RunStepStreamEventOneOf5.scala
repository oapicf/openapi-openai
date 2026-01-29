
package org.openapitools.client.model


case class RunStepStreamEventOneOf5 (
    _event: String,
    _data: RunStepObject
)
object RunStepStreamEventOneOf5 {
    def toStringBody(var_event: Object, var_data: Object) =
        s"""
        | {
        | "event":$var_event,"data":$var_data
        | }
        """.stripMargin
}
