
package org.openapitools.client.model


case class ResponseFormatJsonSchemaJsonSchema (
    /* A description of what the response format is for, used by the model to determine how to respond in the format. */
    _description: Option[String],
    /* The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. */
    _name: String,
    /* The schema for the response format, described as a JSON Schema object. */
    _schema: Option[Map[String, AnyType]],
    /* Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs). */
    _strict: Option[Boolean]
)
object ResponseFormatJsonSchemaJsonSchema {
    def toStringBody(var_description: Object, var_name: Object, var_schema: Object, var_strict: Object) =
        s"""
        | {
        | "description":$var_description,"name":$var_name,"schema":$var_schema,"strict":$var_strict
        | }
        """.stripMargin
}
