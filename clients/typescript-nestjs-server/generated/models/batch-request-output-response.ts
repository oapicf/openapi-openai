

export interface BatchRequestOutputResponse { 
  /**
   * The HTTP status code of the response
   */
  status_code?: number;
  /**
   * An unique identifier for the OpenAI API request. Please include this request ID when contacting support.
   */
  request_id?: string;
  /**
   * The JSON body of the response
   */
  body?: object;
}

