
package org.openapitools.client.model


case class RunStepStreamEventOneOf (
    _event: String,
    _data: RunStepObject
)
object RunStepStreamEventOneOf {
    def toStringBody(var_event: Object, var_data: Object) =
        s"""
        | {
        | "event":$var_event,"data":$var_data
        | }
        """.stripMargin
}
