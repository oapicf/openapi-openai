package org.openapitools.server.model


/**
 * The function definition.
 *
 * @param name The name of the function. for example: ''null''
 * @param arguments The arguments that the model expects you to pass to the function. for example: ''null''
*/
final case class RunToolCallObjectFunction (
  name: String,
  arguments: String
)

