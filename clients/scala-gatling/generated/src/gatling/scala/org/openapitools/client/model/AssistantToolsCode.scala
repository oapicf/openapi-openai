
package org.openapitools.client.model


case class AssistantToolsCode (
    /* The type of tool being defined: `code_interpreter` */
    _type: String
)
object AssistantToolsCode {
    def toStringBody(var_type: Object) =
        s"""
        | {
        | "type":$var_type
        | }
        """.stripMargin
}
