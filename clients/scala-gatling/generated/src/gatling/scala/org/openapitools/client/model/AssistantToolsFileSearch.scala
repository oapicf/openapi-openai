
package org.openapitools.client.model


case class AssistantToolsFileSearch (
    /* The type of tool being defined: `file_search` */
    _type: String,
    _fileSearch: Option[AssistantToolsFileSearchFileSearch]
)
object AssistantToolsFileSearch {
    def toStringBody(var_type: Object, var_fileSearch: Object) =
        s"""
        | {
        | "type":$var_type,"fileSearch":$var_fileSearch
        | }
        """.stripMargin
}
