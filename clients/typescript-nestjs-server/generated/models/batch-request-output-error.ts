

/**
 * For requests that failed with a non-HTTP error, this will contain more information on the cause of the failure.
 */
export interface BatchRequestOutputError { 
  /**
   * A machine-readable error code.
   */
  code?: string;
  /**
   * A human-readable error message.
   */
  message?: string;
}

