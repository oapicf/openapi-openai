import { CreateThreadRequestToolResourcesFileSearchVectorStoresInner } from './create-thread-request-tool-resources-file-search-vector-stores-inner';


export interface CreateThreadRequestToolResourcesFileSearch { 
  /**
   * The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
   */
  vector_store_ids?: Array<string>;
  /**
   * A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this thread. There can be a maximum of 1 vector store attached to the thread. 
   */
  vector_stores?: Array<CreateThreadRequestToolResourcesFileSearchVectorStoresInner>;
}

