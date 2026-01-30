
package org.openapitools.client.model


case class ModifyAssistantRequestToolResources (
    _codeInterpreter: Option[ModifyAssistantRequestToolResourcesCodeInterpreter],
    _fileSearch: Option[ModifyAssistantRequestToolResourcesFileSearch]
)
object ModifyAssistantRequestToolResources {
    def toStringBody(var_codeInterpreter: Object, var_fileSearch: Object) =
        s"""
        | {
        | "codeInterpreter":$var_codeInterpreter,"fileSearch":$var_fileSearch
        | }
        """.stripMargin
}
