
package org.openapitools.client.model


case class CreateAssistantRequestToolResourcesCodeInterpreter (
    /* A list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool.  */
    _fileIds: Option[List[String]]
)
object CreateAssistantRequestToolResourcesCodeInterpreter {
    def toStringBody(var_fileIds: Object) =
        s"""
        | {
        | "fileIds":$var_fileIds
        | }
        """.stripMargin
}
