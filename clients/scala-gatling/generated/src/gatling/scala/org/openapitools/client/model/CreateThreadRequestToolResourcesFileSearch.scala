
package org.openapitools.client.model


case class CreateThreadRequestToolResourcesFileSearch (
    /* The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread.  */
    _vectorStoreIds: Option[List[String]],
    /* A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this thread. There can be a maximum of 1 vector store attached to the thread.  */
    _vectorStores: Option[List[CreateThreadRequestToolResourcesFileSearchVectorStoresInner]]
)
object CreateThreadRequestToolResourcesFileSearch {
    def toStringBody(var_vectorStoreIds: Object, var_vectorStores: Object) =
        s"""
        | {
        | "vectorStoreIds":$var_vectorStoreIds,"vectorStores":$var_vectorStores
        | }
        """.stripMargin
}
