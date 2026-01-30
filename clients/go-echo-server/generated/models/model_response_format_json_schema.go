package models

type ResponseFormatJsonSchema struct {

	// The type of response format being defined: `json_schema`
	Type string `json:"type"`

	JsonSchema ResponseFormatJsonSchemaJsonSchema `json:"json_schema"`
}
