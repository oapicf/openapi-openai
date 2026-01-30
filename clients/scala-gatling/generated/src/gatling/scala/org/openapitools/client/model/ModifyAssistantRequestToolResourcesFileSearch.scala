
package org.openapitools.client.model


case class ModifyAssistantRequestToolResourcesFileSearch (
    /* Overrides the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant.  */
    _vectorStoreIds: Option[List[String]]
)
object ModifyAssistantRequestToolResourcesFileSearch {
    def toStringBody(var_vectorStoreIds: Object) =
        s"""
        | {
        | "vectorStoreIds":$var_vectorStoreIds
        | }
        """.stripMargin
}
