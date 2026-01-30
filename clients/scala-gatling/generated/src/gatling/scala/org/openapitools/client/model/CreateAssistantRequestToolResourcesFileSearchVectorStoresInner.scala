
package org.openapitools.client.model


case class CreateAssistantRequestToolResourcesFileSearchVectorStoresInner (
    /* A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store.  */
    _fileIds: Option[List[String]],
    _chunkingStrategy: Option[CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy],
    /* Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    _metadata: Option[Any]
)
object CreateAssistantRequestToolResourcesFileSearchVectorStoresInner {
    def toStringBody(var_fileIds: Object, var_chunkingStrategy: Object, var_metadata: Object) =
        s"""
        | {
        | "fileIds":$var_fileIds,"chunkingStrategy":$var_chunkingStrategy,"metadata":$var_metadata
        | }
        """.stripMargin
}
