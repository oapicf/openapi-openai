package org.openapitools.server.model


/**
 * @param `type` The type of response format being defined: `json_schema` for example: ''null''
 * @param jsonSchema  for example: ''null''
*/
final case class ResponseFormatJsonSchema (
  `type`: String,
  jsonSchema: ResponseFormatJsonSchemaJsonSchema
)

