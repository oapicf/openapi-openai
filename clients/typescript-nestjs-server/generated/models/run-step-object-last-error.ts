

/**
 * The last error associated with this run step. Will be `null` if there are no errors.
 */
export interface RunStepObjectLastError { 
  /**
   * One of `server_error` or `rate_limit_exceeded`.
   */
  code: RunStepObjectLastError.CodeEnum;
  /**
   * A human-readable description of the error.
   */
  message: string;
}
export namespace RunStepObjectLastError {
  export const CodeEnum = {
    ServerError: 'server_error',
    RateLimitExceeded: 'rate_limit_exceeded'
  } as const;
  export type CodeEnum = typeof CodeEnum[keyof typeof CodeEnum];
}


