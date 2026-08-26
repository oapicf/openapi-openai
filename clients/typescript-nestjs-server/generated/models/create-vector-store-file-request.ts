import { ChunkingStrategyRequestParam } from './chunking-strategy-request-param';


export interface CreateVectorStoreFileRequest { 
  /**
   * A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files.
   */
  file_id: string;
  chunking_strategy?: ChunkingStrategyRequestParam;
}

