

# AssistantsApiResponseFormat

An object describing the expected output of the model. If `json_object` only `function` type `tools` are allowed to be passed to the Run. If `text` the model can return text or any value needed. 

The class is defined in **[AssistantsApiResponseFormat.java](../../src/main/java/org/openapitools/model/AssistantsApiResponseFormat.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Must be one of &#x60;text&#x60; or &#x60;json_object&#x60;. |  [optional property]

## TypeEnum

Name | Value
---- | -----
TEXT | `"text"`
JSON_OBJECT | `"json_object"`


