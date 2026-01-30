
package org.openapitools.client.model


case class CreateAssistantRequestToolResources (
    _codeInterpreter: Option[CreateAssistantRequestToolResourcesCodeInterpreter],
    _fileSearch: Option[CreateAssistantRequestToolResourcesFileSearch]
)
object CreateAssistantRequestToolResources {
    def toStringBody(var_codeInterpreter: Object, var_fileSearch: Object) =
        s"""
        | {
        | "codeInterpreter":$var_codeInterpreter,"fileSearch":$var_fileSearch
        | }
        """.stripMargin
}
