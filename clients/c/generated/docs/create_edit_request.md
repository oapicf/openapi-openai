# create_edit_request_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | [**create_edit_request_model_t**](create_edit_request_model.md) \* |  | 
**input** | **char \*** | The input text to use as a starting point for the edit. | [optional] [default to '']
**instruction** | **char \*** | The instruction that tells the model how to edit the prompt. | 
**n** | **int** | How many edits to generate for the input and instruction. | [optional] [default to 1]
**temperature** | **double** | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both.  | [optional] [default to 1]
**top_p** | **double** | An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both.  | [optional] [default to 1]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


