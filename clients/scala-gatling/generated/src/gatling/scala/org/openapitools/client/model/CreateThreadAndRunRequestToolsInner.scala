
package org.openapitools.client.model


case class CreateThreadAndRunRequestToolsInner (
    /* The type of tool being defined: `code_interpreter` */
    _type: String,
    _function: FunctionObject
)
object CreateThreadAndRunRequestToolsInner {
    def toStringBody(var_type: Object, var_function: Object) =
        s"""
        | {
        | "type":$var_type,"function":$var_function
        | }
        """.stripMargin
}
