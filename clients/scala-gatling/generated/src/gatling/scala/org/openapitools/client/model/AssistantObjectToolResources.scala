
package org.openapitools.client.model


case class AssistantObjectToolResources (
    _codeInterpreter: Option[AssistantObjectToolResourcesCodeInterpreter],
    _fileSearch: Option[AssistantObjectToolResourcesFileSearch]
)
object AssistantObjectToolResources {
    def toStringBody(var_codeInterpreter: Object, var_fileSearch: Object) =
        s"""
        | {
        | "codeInterpreter":$var_codeInterpreter,"fileSearch":$var_fileSearch
        | }
        """.stripMargin
}
