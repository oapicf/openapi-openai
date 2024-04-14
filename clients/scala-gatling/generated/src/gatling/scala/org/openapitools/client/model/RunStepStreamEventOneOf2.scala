
package org.openapitools.client.model


case class RunStepStreamEventOneOf2 (
    _event: String,
    _data: RunStepDeltaObject
)
object RunStepStreamEventOneOf2 {
    def toStringBody(var_event: Object, var_data: Object) =
        s"""
        | {
        | "event":$var_event,"data":$var_data
        | }
        """.stripMargin
}
