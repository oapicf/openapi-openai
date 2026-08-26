

/**
 * Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function. 
 */
export interface ChatCompletionFunctionCallOption { 
  /**
   * The name of the function to call.
   */
  name: string;
}

