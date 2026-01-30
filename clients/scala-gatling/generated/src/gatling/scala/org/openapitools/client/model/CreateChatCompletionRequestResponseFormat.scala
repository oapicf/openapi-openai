
package org.openapitools.client.model


case class CreateChatCompletionRequestResponseFormat (
    /* The type of response format being defined: `text` */
    _type: String,
    _jsonSchema: ResponseFormatJsonSchemaJsonSchema
)
object CreateChatCompletionRequestResponseFormat {
    def toStringBody(var_type: Object, var_jsonSchema: Object) =
        s"""
        | {
        | "type":$var_type,"jsonSchema":$var_jsonSchema
        | }
        """.stripMargin
}
