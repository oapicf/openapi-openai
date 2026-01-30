
package org.openapitools.client.model


case class CreateThreadAndRunRequestToolResources (
    _codeInterpreter: Option[CreateAssistantRequestToolResourcesCodeInterpreter],
    _fileSearch: Option[AssistantObjectToolResourcesFileSearch]
)
object CreateThreadAndRunRequestToolResources {
    def toStringBody(var_codeInterpreter: Object, var_fileSearch: Object) =
        s"""
        | {
        | "codeInterpreter":$var_codeInterpreter,"fileSearch":$var_fileSearch
        | }
        """.stripMargin
}
