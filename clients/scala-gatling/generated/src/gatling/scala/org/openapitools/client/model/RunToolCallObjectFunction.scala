
package org.openapitools.client.model


case class RunToolCallObjectFunction (
    /* The name of the function. */
    _name: String,
    /* The arguments that the model expects you to pass to the function. */
    _arguments: String
)
object RunToolCallObjectFunction {
    def toStringBody(var_name: Object, var_arguments: Object) =
        s"""
        | {
        | "name":$var_name,"arguments":$var_arguments
        | }
        """.stripMargin
}
