
package org.openapitools.client.model


case class RunStepDeltaStepDetailsToolCallsFunctionObjectFunction (
    /* The name of the function. */
    _name: Option[String],
    /* The arguments passed to the function. */
    _arguments: Option[String],
    /* The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet. */
    _output: Option[String]
)
object RunStepDeltaStepDetailsToolCallsFunctionObjectFunction {
    def toStringBody(var_name: Object, var_arguments: Object, var_output: Object) =
        s"""
        | {
        | "name":$var_name,"arguments":$var_arguments,"output":$var_output
        | }
        """.stripMargin
}
