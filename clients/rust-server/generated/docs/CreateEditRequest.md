# CreateEditRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | [***models::CreateEditRequestModel**](CreateEditRequest_model.md) |  | 
**input** | **String** | The input text to use as a starting point for the edit. | [optional] [default to Some(swagger::Nullable::Present("".to_string()))]
**instruction** | **String** | The instruction that tells the model how to edit the prompt. | 
**n** | **u8** | How many edits to generate for the input and instruction. | [optional] [default to Some(swagger::Nullable::Present(1))]
**temperature** | **f64** | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both.  | [optional] [default to Some(swagger::Nullable::Present(1))]
**top_p** | **f64** | An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both.  | [optional] [default to Some(swagger::Nullable::Present(1))]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


