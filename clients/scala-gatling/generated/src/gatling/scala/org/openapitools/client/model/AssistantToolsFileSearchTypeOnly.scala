
package org.openapitools.client.model


case class AssistantToolsFileSearchTypeOnly (
    /* The type of tool being defined: `file_search` */
    _type: String
)
object AssistantToolsFileSearchTypeOnly {
    def toStringBody(var_type: Object) =
        s"""
        | {
        | "type":$var_type
        | }
        """.stripMargin
}
