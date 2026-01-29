
package org.openapitools.client.model


case class AssistantToolsFunction (
    /* The type of tool being defined: `function` */
    _type: String,
    _function: FunctionObject
)
object AssistantToolsFunction {
    def toStringBody(var_type: Object, var_function: Object) =
        s"""
        | {
        | "type":$var_type,"function":$var_function
        | }
        """.stripMargin
}
