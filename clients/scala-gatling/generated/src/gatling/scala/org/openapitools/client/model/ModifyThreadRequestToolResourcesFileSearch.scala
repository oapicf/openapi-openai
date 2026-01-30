
package org.openapitools.client.model


case class ModifyThreadRequestToolResourcesFileSearch (
    /* The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread.  */
    _vectorStoreIds: Option[List[String]]
)
object ModifyThreadRequestToolResourcesFileSearch {
    def toStringBody(var_vectorStoreIds: Object) =
        s"""
        | {
        | "vectorStoreIds":$var_vectorStoreIds
        | }
        """.stripMargin
}
