

export interface VectorStoreObjectFileCounts { 
  /**
   * The number of files that are currently being processed.
   */
  in_progress: number;
  /**
   * The number of files that have been successfully processed.
   */
  completed: number;
  /**
   * The number of files that have failed to process.
   */
  failed: number;
  /**
   * The number of files that were cancelled.
   */
  cancelled: number;
  /**
   * The total number of files.
   */
  total: number;
}

