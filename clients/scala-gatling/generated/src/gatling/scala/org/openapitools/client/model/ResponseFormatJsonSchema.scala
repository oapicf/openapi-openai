
package org.openapitools.client.model


case class ResponseFormatJsonSchema (
    /* The type of response format being defined: `json_schema` */
    _type: String,
    _jsonSchema: ResponseFormatJsonSchemaJsonSchema
)
object ResponseFormatJsonSchema {
    def toStringBody(var_type: Object, var_jsonSchema: Object) =
        s"""
        | {
        | "type":$var_type,"jsonSchema":$var_jsonSchema
        | }
        """.stripMargin
}
