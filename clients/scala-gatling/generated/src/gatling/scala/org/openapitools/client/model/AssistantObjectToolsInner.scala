
package org.openapitools.client.model


case class AssistantObjectToolsInner (
    /* The type of tool being defined: `code_interpreter` */
    _type: String,
    _fileSearch: Option[AssistantToolsFileSearchFileSearch],
    _function: FunctionObject
)
object AssistantObjectToolsInner {
    def toStringBody(var_type: Object, var_fileSearch: Object, var_function: Object) =
        s"""
        | {
        | "type":$var_type,"fileSearch":$var_fileSearch,"function":$var_function
        | }
        """.stripMargin
}
