package org.openapitools.server.model


/**
 * Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function. 
 *
 * @param name The name of the function to call. for example: ''null''
*/
final case class ChatCompletionFunctionCallOption (
  name: String
)

