# openapi::ResponseFormatJsonSchemaJsonSchema


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **character** | A description of what the response format is for, used by the model to determine how to respond in the format. | [optional] 
**name** | **character** | The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. | 
**schema** | [**map(AnyType)**](AnyType.md) | The schema for the response format, described as a JSON Schema object. | [optional] 
**strict** | **character** | Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the &#x60;schema&#x60; field. Only a subset of JSON Schema is supported when &#x60;strict&#x60; is &#x60;true&#x60;. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs). | [optional] [default to FALSE] 


