

export interface VectorStoreFileBatchObjectFileCounts { 
  /**
   * The number of files that are currently being processed.
   */
  in_progress: number;
  /**
   * The number of files that have been processed.
   */
  completed: number;
  /**
   * The number of files that have failed to process.
   */
  failed: number;
  /**
   * The number of files that where cancelled.
   */
  cancelled: number;
  /**
   * The total number of files.
   */
  total: number;
}

