# openapi::AssistantsApiResponseFormat

An object describing the expected output of the model. If `json_object` only `function` type `tools` are allowed to be passed to the Run. If `text` the model can return text or any value needed. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **character** | Must be one of &#x60;text&#x60; or &#x60;json_object&#x60;. | [optional] [default to &quot;text&quot;] [Enum: [text, json_object]] 


