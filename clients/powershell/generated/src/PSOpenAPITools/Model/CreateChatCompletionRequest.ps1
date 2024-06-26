#
# OpenAI API
# The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
# Version: 2.0.0
# Contact: blah+oapicf@cliffano.com
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

No summary available.

.DESCRIPTION

No description available.

.PARAMETER Messages
A list of messages comprising the conversation so far. [Example Python code](https://cookbook.openai.com/examples/how_to_format_inputs_to_chatgpt_models).
.PARAMETER Model
No description available.
.PARAMETER FrequencyPenalty
Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) 
.PARAMETER LogitBias
Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 
.PARAMETER Logprobs
Whether to return log probabilities of the output tokens or not. If true, returns the log probabilities of each output token returned in the `content` of `message`.
.PARAMETER TopLogprobs
An integer between 0 and 20 specifying the number of most likely tokens to return at each token position, each with an associated log probability. `logprobs` must be set to `true` if this parameter is used.
.PARAMETER MaxTokens
The maximum number of [tokens](/tokenizer) that can be generated in the chat completion.  The total length of input tokens and generated tokens is limited by the model's context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
.PARAMETER N
How many chat completion choices to generate for each input message. Note that you will be charged based on the number of generated tokens across all of the choices. Keep `n` as `1` to minimize costs.
.PARAMETER PresencePenalty
Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) 
.PARAMETER ResponseFormat
No description available.
.PARAMETER Seed
This feature is in Beta. If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result. Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend. 
.PARAMETER Stop
No description available.
.PARAMETER Stream
If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). 
.PARAMETER Temperature
What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
.PARAMETER TopP
An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
.PARAMETER Tools
A list of tools the model may call. Currently, only functions are supported as a tool. Use this to provide a list of functions the model may generate JSON inputs for. A max of 128 functions are supported. 
.PARAMETER ToolChoice
No description available.
.PARAMETER User
A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
.PARAMETER FunctionCall
No description available.
.PARAMETER Functions
Deprecated in favor of `tools`.  A list of functions the model may generate JSON inputs for. 
.OUTPUTS

CreateChatCompletionRequest<PSCustomObject>
#>

function Initialize-CreateChatCompletionRequest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Messages},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Model},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${FrequencyPenalty} = 0,
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Collections.Hashtable]
        ${LogitBias},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${Logprobs} = $false,
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${TopLogprobs},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${MaxTokens},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${N} = 1,
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${PresencePenalty} = 0,
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${ResponseFormat},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${Seed},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Stop},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${Stream} = $false,
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${Temperature} = 1,
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${TopP} = 1,
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Tools},
        [Parameter(Position = 16, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${ToolChoice},
        [Parameter(Position = 17, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${User},
        [Parameter(Position = 18, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${FunctionCall},
        [Parameter(Position = 19, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Functions}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CreateChatCompletionRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Messages) {
            throw "invalid value for 'Messages', 'Messages' cannot be null."
        }

        if ($Messages.length -lt 1) {
            throw "invalid value for 'Messages', number of items must be greater than or equal to 1."
        }

        if ($null -eq $Model) {
            throw "invalid value for 'Model', 'Model' cannot be null."
        }

        if ($FrequencyPenalty -and $FrequencyPenalty -gt 2) {
          throw "invalid value for 'FrequencyPenalty', must be smaller than or equal to 2."
        }

        if ($FrequencyPenalty -and $FrequencyPenalty -lt -2) {
          throw "invalid value for 'FrequencyPenalty', must be greater than or equal to -2."
        }

        if ($TopLogprobs -and $TopLogprobs -gt 20) {
          throw "invalid value for 'TopLogprobs', must be smaller than or equal to 20."
        }

        if ($TopLogprobs -and $TopLogprobs -lt 0) {
          throw "invalid value for 'TopLogprobs', must be greater than or equal to 0."
        }

        if ($N -and $N -gt 128) {
          throw "invalid value for 'N', must be smaller than or equal to 128."
        }

        if ($N -and $N -lt 1) {
          throw "invalid value for 'N', must be greater than or equal to 1."
        }

        if ($PresencePenalty -and $PresencePenalty -gt 2) {
          throw "invalid value for 'PresencePenalty', must be smaller than or equal to 2."
        }

        if ($PresencePenalty -and $PresencePenalty -lt -2) {
          throw "invalid value for 'PresencePenalty', must be greater than or equal to -2."
        }

        if ($Seed -and $Seed -gt 9223372036854775807) {
          throw "invalid value for 'Seed', must be smaller than or equal to 9223372036854775807."
        }

        if ($Seed -and $Seed -lt -9223372036854775808) {
          throw "invalid value for 'Seed', must be greater than or equal to -9223372036854775808."
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

        if (!$Functions -and $Functions.length -gt 128) {
            throw "invalid value for 'Functions', number of items must be less than or equal to 128."
        }

        if (!$Functions -and $Functions.length -lt 1) {
            throw "invalid value for 'Functions', number of items must be greater than or equal to 1."
        }


        $PSO = [PSCustomObject]@{
            "messages" = ${Messages}
            "model" = ${Model}
            "frequency_penalty" = ${FrequencyPenalty}
            "logit_bias" = ${LogitBias}
            "logprobs" = ${Logprobs}
            "top_logprobs" = ${TopLogprobs}
            "max_tokens" = ${MaxTokens}
            "n" = ${N}
            "presence_penalty" = ${PresencePenalty}
            "response_format" = ${ResponseFormat}
            "seed" = ${Seed}
            "stop" = ${Stop}
            "stream" = ${Stream}
            "temperature" = ${Temperature}
            "top_p" = ${TopP}
            "tools" = ${Tools}
            "tool_choice" = ${ToolChoice}
            "user" = ${User}
            "function_call" = ${FunctionCall}
            "functions" = ${Functions}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CreateChatCompletionRequest<PSCustomObject>

.DESCRIPTION

Convert from JSON to CreateChatCompletionRequest<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CreateChatCompletionRequest<PSCustomObject>
#>
function ConvertFrom-JsonToCreateChatCompletionRequest {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CreateChatCompletionRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CreateChatCompletionRequest
        $AllProperties = ("messages", "model", "frequency_penalty", "logit_bias", "logprobs", "top_logprobs", "max_tokens", "n", "presence_penalty", "response_format", "seed", "stop", "stream", "temperature", "top_p", "tools", "tool_choice", "user", "function_call", "functions")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'messages' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "messages"))) {
            throw "Error! JSON cannot be serialized due to the required property 'messages' missing."
        } else {
            $Messages = $JsonParameters.PSobject.Properties["messages"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "model"))) {
            throw "Error! JSON cannot be serialized due to the required property 'model' missing."
        } else {
            $Model = $JsonParameters.PSobject.Properties["model"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "frequency_penalty"))) { #optional property not found
            $FrequencyPenalty = $null
        } else {
            $FrequencyPenalty = $JsonParameters.PSobject.Properties["frequency_penalty"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "logit_bias"))) { #optional property not found
            $LogitBias = $null
        } else {
            $LogitBias = $JsonParameters.PSobject.Properties["logit_bias"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "logprobs"))) { #optional property not found
            $Logprobs = $null
        } else {
            $Logprobs = $JsonParameters.PSobject.Properties["logprobs"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "top_logprobs"))) { #optional property not found
            $TopLogprobs = $null
        } else {
            $TopLogprobs = $JsonParameters.PSobject.Properties["top_logprobs"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "max_tokens"))) { #optional property not found
            $MaxTokens = $null
        } else {
            $MaxTokens = $JsonParameters.PSobject.Properties["max_tokens"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "n"))) { #optional property not found
            $N = $null
        } else {
            $N = $JsonParameters.PSobject.Properties["n"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "presence_penalty"))) { #optional property not found
            $PresencePenalty = $null
        } else {
            $PresencePenalty = $JsonParameters.PSobject.Properties["presence_penalty"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "response_format"))) { #optional property not found
            $ResponseFormat = $null
        } else {
            $ResponseFormat = $JsonParameters.PSobject.Properties["response_format"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "seed"))) { #optional property not found
            $Seed = $null
        } else {
            $Seed = $JsonParameters.PSobject.Properties["seed"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "stop"))) { #optional property not found
            $Stop = $null
        } else {
            $Stop = $JsonParameters.PSobject.Properties["stop"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "stream"))) { #optional property not found
            $Stream = $null
        } else {
            $Stream = $JsonParameters.PSobject.Properties["stream"].value
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "tools"))) { #optional property not found
            $Tools = $null
        } else {
            $Tools = $JsonParameters.PSobject.Properties["tools"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "tool_choice"))) { #optional property not found
            $ToolChoice = $null
        } else {
            $ToolChoice = $JsonParameters.PSobject.Properties["tool_choice"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "user"))) { #optional property not found
            $User = $null
        } else {
            $User = $JsonParameters.PSobject.Properties["user"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "function_call"))) { #optional property not found
            $FunctionCall = $null
        } else {
            $FunctionCall = $JsonParameters.PSobject.Properties["function_call"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "functions"))) { #optional property not found
            $Functions = $null
        } else {
            $Functions = $JsonParameters.PSobject.Properties["functions"].value
        }

        $PSO = [PSCustomObject]@{
            "messages" = ${Messages}
            "model" = ${Model}
            "frequency_penalty" = ${FrequencyPenalty}
            "logit_bias" = ${LogitBias}
            "logprobs" = ${Logprobs}
            "top_logprobs" = ${TopLogprobs}
            "max_tokens" = ${MaxTokens}
            "n" = ${N}
            "presence_penalty" = ${PresencePenalty}
            "response_format" = ${ResponseFormat}
            "seed" = ${Seed}
            "stop" = ${Stop}
            "stream" = ${Stream}
            "temperature" = ${Temperature}
            "top_p" = ${TopP}
            "tools" = ${Tools}
            "tool_choice" = ${ToolChoice}
            "user" = ${User}
            "function_call" = ${FunctionCall}
            "functions" = ${Functions}
        }

        return $PSO
    }

}

