
# Table `CreateEditRequest`
(mapped from: CreateEditRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**model** | model | long NOT NULL |  | [**CreateEditRequestModel**](CreateEditRequestModel.md) |  |  [foreignkey]
**instruction** | instruction | text NOT NULL |  | **kotlin.String** | The instruction that tells the model how to edit the prompt. | 
**input** | input | text |  | **kotlin.String** | The input text to use as a starting point for the edit. |  [optional]
**n** | n | int UNSIGNED |  | **kotlin.Int** | How many edits to generate for the input and instruction. |  [optional]
**temperature** | temperature | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both.  |  [optional]
**topP** | top_p | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both.  |  [optional]








