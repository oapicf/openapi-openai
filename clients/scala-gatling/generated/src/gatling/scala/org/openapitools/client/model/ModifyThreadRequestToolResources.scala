
package org.openapitools.client.model


case class ModifyThreadRequestToolResources (
    _codeInterpreter: Option[CreateAssistantRequestToolResourcesCodeInterpreter],
    _fileSearch: Option[ModifyThreadRequestToolResourcesFileSearch]
)
object ModifyThreadRequestToolResources {
    def toStringBody(var_codeInterpreter: Object, var_fileSearch: Object) =
        s"""
        | {
        | "codeInterpreter":$var_codeInterpreter,"fileSearch":$var_fileSearch
        | }
        """.stripMargin
}
