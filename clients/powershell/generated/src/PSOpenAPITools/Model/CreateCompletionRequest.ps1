#
# OpenAI API
# APIs for sampling from and fine-tuning language models
# Version: 2.0.0
# Contact: blah+oapicf@cliffano.com
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

No summary available.

.DESCRIPTION

No description available.

.PARAMETER Model
No description available.
.PARAMETER Prompt
No description available.
.PARAMETER Suffix
The suffix that comes after a completion of inserted text.
.PARAMETER MaxTokens
The maximum number of [tokens](/tokenizer) to generate in the completion.  The token count of your prompt plus `max_tokens` cannot exceed the model's context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 
.PARAMETER Temperature
What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
.PARAMETER TopP
An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
.PARAMETER N
How many completions to generate for each prompt.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. 
.PARAMETER Stream
Whether to stream back partial progress. If set, tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb). 
.PARAMETER Logprobs
Include the log probabilities on the `logprobs` most likely tokens, as well the chosen tokens. For example, if `logprobs` is 5, the API will return a list of the 5 most likely tokens. The API will always return the `logprob` of the sampled token, so there may be up to `logprobs+1` elements in the response.  The maximum value for `logprobs` is 5. 
.PARAMETER Echo
Echo back the prompt in addition to the completion 
.PARAMETER Stop
No description available.
.PARAMETER PresencePenalty
Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
.PARAMETER FrequencyPenalty
Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
.PARAMETER BestOf
Generates `best_of` completions server-side and returns the ""best"" (the one with the highest log probability per token). Results cannot be streamed.  When used with `n`, `best_of` controls the number of candidate completions and `n` specifies how many to return – `best_of` must be greater than `n`.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. 
.PARAMETER LogitBias
Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view=bpe) (which works for both GPT-2 and GPT-3) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass `{""50256"": -100}` to prevent the <|endoftext|> token from being generated. 
.PARAMETER User
A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
.OUTPUTS

CreateCompletionRequest<PSCustomObject>
#>

function Initialize-CreateCompletionRequest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Model},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Prompt},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Suffix},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${MaxTokens} = 16,
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${Temperature} = 1,
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${TopP} = 1,
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${N} = 1,
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${Stream} = $false,
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${Logprobs},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${Echo} = $false,
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Stop},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${PresencePenalty} = 0,
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${FrequencyPenalty} = 0,
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${BestOf} = 1,
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${LogitBias},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${User}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CreateCompletionRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Model) {
            throw "invalid value for 'Model', 'Model' cannot be null."
        }

        if ($MaxTokens -and $MaxTokens -lt 0) {
          throw "invalid value for 'MaxTokens', must be greater than or equal to 0."
        }

        if ($Temperature -and $Temperature -gt 2) {
          throw "invalid value for 'Temperature', must be smaller than or equal to 2."
        }

        if ($Temperature -and $Temperature -lt 0) {
          throw "invalid value for 'Temperature', must be greater than or equal to 0."
        }

        if ($TopP -and $TopP -gt 1) {
          throw "invalid value for 'TopP', must be smaller than or equal to 1."
        }

        if ($TopP -and $TopP -lt 0) {
          throw "invalid value for 'TopP', must be greater than or equal to 0."
        }

        if ($N -and $N -gt 128) {
          throw "invalid value for 'N', must be smaller than or equal to 128."
        }

        if ($N -and $N -lt 1) {
          throw "invalid value for 'N', must be greater than or equal to 1."
        }

        if ($Logprobs -and $Logprobs -gt 5) {
          throw "invalid value for 'Logprobs', must be smaller than or equal to 5."
        }

        if ($Logprobs -and $Logprobs -lt 0) {
          throw "invalid value for 'Logprobs', must be greater than or equal to 0."
        }

        if ($PresencePenalty -and $PresencePenalty -gt 2) {
          throw "invalid value for 'PresencePenalty', must be smaller than or equal to 2."
        }

        if ($PresencePenalty -and $PresencePenalty -lt -2) {
          throw "invalid value for 'PresencePenalty', must be greater than or equal to -2."
        }

        if ($FrequencyPenalty -and $FrequencyPenalty -gt 2) {
          throw "invalid value for 'FrequencyPenalty', must be smaller than or equal to 2."
        }

        if ($FrequencyPenalty -and $FrequencyPenalty -lt -2) {
          throw "invalid value for 'FrequencyPenalty', must be greater than or equal to -2."
        }

        if ($BestOf -and $BestOf -gt 20) {
          throw "invalid value for 'BestOf', must be smaller than or equal to 20."
        }

        if ($BestOf -and $BestOf -lt 0) {
          throw "invalid value for 'BestOf', must be greater than or equal to 0."
        }


        $PSO = [PSCustomObject]@{
            "model" = ${Model}
            "prompt" = ${Prompt}
            "suffix" = ${Suffix}
            "max_tokens" = ${MaxTokens}
            "temperature" = ${Temperature}
            "top_p" = ${TopP}
            "n" = ${N}
            "stream" = ${Stream}
            "logprobs" = ${Logprobs}
            "echo" = ${Echo}
            "stop" = ${Stop}
            "presence_penalty" = ${PresencePenalty}
            "frequency_penalty" = ${FrequencyPenalty}
            "best_of" = ${BestOf}
            "logit_bias" = ${LogitBias}
            "user" = ${User}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CreateCompletionRequest<PSCustomObject>

.DESCRIPTION

Convert from JSON to CreateCompletionRequest<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CreateCompletionRequest<PSCustomObject>
#>
function ConvertFrom-JsonToCreateCompletionRequest {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CreateCompletionRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CreateCompletionRequest
        $AllProperties = ("model", "prompt", "suffix", "max_tokens", "temperature", "top_p", "n", "stream", "logprobs", "echo", "stop", "presence_penalty", "frequency_penalty", "best_of", "logit_bias", "user")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'model' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "model"))) {
            throw "Error! JSON cannot be serialized due to the required property 'model' missing."
        } else {
            $Model = $JsonParameters.PSobject.Properties["model"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "prompt"))) {
            throw "Error! JSON cannot be serialized due to the required property 'prompt' missing."
        } else {
            $Prompt = $JsonParameters.PSobject.Properties["prompt"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "suffix"))) { #optional property not found
            $Suffix = $null
        } else {
            $Suffix = $JsonParameters.PSobject.Properties["suffix"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "max_tokens"))) { #optional property not found
            $MaxTokens = $null
        } else {
            $MaxTokens = $JsonParameters.PSobject.Properties["max_tokens"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "temperature"))) { #optional property not found
            $Temperature = $null
        } else {
            $Temperature = $JsonParameters.PSobject.Properties["temperature"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "top_p"))) { #optional property not found
            $TopP = $null
        } else {
            $TopP = $JsonParameters.PSobject.Properties["top_p"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "n"))) { #optional property not found
            $N = $null
        } else {
            $N = $JsonParameters.PSobject.Properties["n"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "stream"))) { #optional property not found
            $Stream = $null
        } else {
            $Stream = $JsonParameters.PSobject.Properties["stream"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "logprobs"))) { #optional property not found
            $Logprobs = $null
        } else {
            $Logprobs = $JsonParameters.PSobject.Properties["logprobs"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "echo"))) { #optional property not found
            $Echo = $null
        } else {
            $Echo = $JsonParameters.PSobject.Properties["echo"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "stop"))) { #optional property not found
            $Stop = $null
        } else {
            $Stop = $JsonParameters.PSobject.Properties["stop"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "presence_penalty"))) { #optional property not found
            $PresencePenalty = $null
        } else {
            $PresencePenalty = $JsonParameters.PSobject.Properties["presence_penalty"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "frequency_penalty"))) { #optional property not found
            $FrequencyPenalty = $null
        } else {
            $FrequencyPenalty = $JsonParameters.PSobject.Properties["frequency_penalty"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "best_of"))) { #optional property not found
            $BestOf = $null
        } else {
            $BestOf = $JsonParameters.PSobject.Properties["best_of"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "logit_bias"))) { #optional property not found
            $LogitBias = $null
        } else {
            $LogitBias = $JsonParameters.PSobject.Properties["logit_bias"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "user"))) { #optional property not found
            $User = $null
        } else {
            $User = $JsonParameters.PSobject.Properties["user"].value
        }

        $PSO = [PSCustomObject]@{
            "model" = ${Model}
            "prompt" = ${Prompt}
            "suffix" = ${Suffix}
            "max_tokens" = ${MaxTokens}
            "temperature" = ${Temperature}
            "top_p" = ${TopP}
            "n" = ${N}
            "stream" = ${Stream}
            "logprobs" = ${Logprobs}
            "echo" = ${Echo}
            "stop" = ${Stop}
            "presence_penalty" = ${PresencePenalty}
            "frequency_penalty" = ${FrequencyPenalty}
            "best_of" = ${BestOf}
            "logit_bias" = ${LogitBias}
            "user" = ${User}
        }

        return $PSO
    }

}
