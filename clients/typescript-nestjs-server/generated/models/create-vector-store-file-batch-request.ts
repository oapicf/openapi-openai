import { ChunkingStrategyRequestParam } from './chunking-strategy-request-param';


export interface CreateVectorStoreFileBatchRequest { 
  /**
   * A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.
   */
  file_ids: Array<string>;
  chunking_strategy?: ChunkingStrategyRequestParam;
}

