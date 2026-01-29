
package org.openapitools.client.model


case class RunStepDeltaObject (
    /* The identifier of the run step, which can be referenced in API endpoints. */
    _id: String,
    /* The object type, which is always `thread.run.step.delta`. */
    _object: String,
    _delta: RunStepDeltaObjectDelta
)
object RunStepDeltaObject {
    def toStringBody(var_id: Object, var_object: Object, var_delta: Object) =
        s"""
        | {
        | "id":$var_id,"object":$var_object,"delta":$var_delta
        | }
        """.stripMargin
}
