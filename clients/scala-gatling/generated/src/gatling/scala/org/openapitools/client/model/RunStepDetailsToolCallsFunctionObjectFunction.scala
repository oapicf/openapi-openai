
package org.openapitools.client.model


case class RunStepDetailsToolCallsFunctionObjectFunction (
    /* The name of the function. */
    _name: String,
    /* The arguments passed to the function. */
    _arguments: String,
    /* The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet. */
    _output: String
)
object RunStepDetailsToolCallsFunctionObjectFunction {
    def toStringBody(var_name: Object, var_arguments: Object, var_output: Object) =
        s"""
        | {
        | "name":$var_name,"arguments":$var_arguments,"output":$var_output
        | }
        """.stripMargin
}
