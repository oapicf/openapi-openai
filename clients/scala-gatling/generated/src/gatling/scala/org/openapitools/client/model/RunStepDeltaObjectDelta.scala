
package org.openapitools.client.model


case class RunStepDeltaObjectDelta (
    _stepDetails: Option[RunStepDeltaObjectDeltaStepDetails]
)
object RunStepDeltaObjectDelta {
    def toStringBody(var_stepDetails: Object) =
        s"""
        | {
        | "stepDetails":$var_stepDetails
        | }
        """.stripMargin
}
