

export interface BatchErrorsDataInner { 
  /**
   * An error code identifying the error type.
   */
  code?: string;
  /**
   * A human-readable message providing more details about the error.
   */
  message?: string;
  /**
   * The name of the parameter that caused the error, if applicable.
   */
  param?: string | null;
  /**
   * The line number of the input file where the error occurred, if applicable.
   */
  line?: number | null;
}

