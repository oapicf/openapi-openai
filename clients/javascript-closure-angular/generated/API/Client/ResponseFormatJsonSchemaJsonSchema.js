goog.provide('API.Client.ResponseFormatJsonSchema_json_schema');

/**
 * @record
 */
API.Client.ResponseFormatJsonSchemaJsonSchema = function() {}

/**
 * A description of what the response format is for, used by the model to determine how to respond in the format.
 * @type {!string}
 * @export
 */
API.Client.ResponseFormatJsonSchemaJsonSchema.prototype.description;

/**
 * The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
 * @type {!string}
 * @export
 */
API.Client.ResponseFormatJsonSchemaJsonSchema.prototype.name;

/**
 * The schema for the response format, described as a JSON Schema object.
 * @type {!Object<!string, API.Client.AnyType>}
 * @export
 */
API.Client.ResponseFormatJsonSchemaJsonSchema.prototype.schema;

/**
 * Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).
 * @type {!boolean}
 * @export
 */
API.Client.ResponseFormatJsonSchemaJsonSchema.prototype.strict;

