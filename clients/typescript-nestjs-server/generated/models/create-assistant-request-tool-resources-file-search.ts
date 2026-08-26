import { CreateAssistantRequestToolResourcesFileSearchVectorStoresInner } from './create-assistant-request-tool-resources-file-search-vector-stores-inner';


export interface CreateAssistantRequestToolResourcesFileSearch { 
  /**
   * The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
   */
  vector_store_ids?: Array<string>;
  /**
   * A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
   */
  vector_stores?: Array<CreateAssistantRequestToolResourcesFileSearchVectorStoresInner>;
}

