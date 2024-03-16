
package org.openapitools.client.model


case class ChatCompletionFunctions (
    /* The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. */
    _name: String,
    /* The description of what the function does. */
    _description: Option[String],
    /* The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/gpt/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format. */
    _parameters: Option[Map[String, AnyType]]
)
object ChatCompletionFunctions {
    def toStringBody(var_name: Object, var_description: Object, var_parameters: Object) =
        s"""
        | {
        | "name":$var_name,"description":$var_description,"parameters":$var_parameters
        | }
        """.stripMargin
}
