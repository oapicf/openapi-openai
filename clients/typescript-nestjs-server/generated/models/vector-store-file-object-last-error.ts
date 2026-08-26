

/**
 * The last error associated with this vector store file. Will be `null` if there are no errors.
 */
export interface VectorStoreFileObjectLastError { 
  /**
   * One of `server_error` or `rate_limit_exceeded`.
   */
  code: VectorStoreFileObjectLastError.CodeEnum;
  /**
   * A human-readable description of the error.
   */
  message: string;
}
export namespace VectorStoreFileObjectLastError {
  export const CodeEnum = {
    ServerError: 'server_error',
    UnsupportedFile: 'unsupported_file',
    InvalidFile: 'invalid_file'
  } as const;
  export type CodeEnum = typeof CodeEnum[keyof typeof CodeEnum];
}


