# ResponseFormatJsonSchemaJsonSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | Option<**String**> | A description of what the response format is for, used by the model to determine how to respond in the format. | [optional]
**name** | **String** | The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. | 
**schema** | Option<[**std::collections::HashMap<String, serde_json::Value>**](serde_json::Value.md)> | The schema for the response format, described as a JSON Schema object. | [optional]
**strict** | Option<**bool**> | Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs). | [optional][default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


