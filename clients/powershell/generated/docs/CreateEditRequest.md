# CreateEditRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Model** | [**CreateEditRequestModel**](CreateEditRequestModel.md) |  | 
**VarInput** | **String** | The input text to use as a starting point for the edit. | [optional] [default to ""]
**Instruction** | **String** | The instruction that tells the model how to edit the prompt. | 
**N** | **Int32** | How many edits to generate for the input and instruction. | [optional] [default to 1]
**Temperature** | **Decimal** | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both.  | [optional] [default to 1]
**TopP** | **Decimal** | An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both.  | [optional] [default to 1]

## Examples

- Prepare the resource
```powershell
$CreateEditRequest = Initialize-PSOpenAPIToolsCreateEditRequest  -Model null `
 -VarInput What day of the wek is it? `
 -Instruction Fix the spelling mistakes. `
 -N 1 `
 -Temperature 1 `
 -TopP 1
```

- Convert the resource to JSON
```powershell
$CreateEditRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

