
package org.openapitools.client.model


case class CreateThreadRequestToolResources (
    _codeInterpreter: Option[CreateAssistantRequestToolResourcesCodeInterpreter],
    _fileSearch: Option[CreateThreadRequestToolResourcesFileSearch]
)
object CreateThreadRequestToolResources {
    def toStringBody(var_codeInterpreter: Object, var_fileSearch: Object) =
        s"""
        | {
        | "codeInterpreter":$var_codeInterpreter,"fileSearch":$var_fileSearch
        | }
        """.stripMargin
}
