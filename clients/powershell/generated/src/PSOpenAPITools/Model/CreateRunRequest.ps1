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

.PARAMETER AssistantId
The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
.PARAMETER Model
No description available.
.PARAMETER Instructions
Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis.
.PARAMETER AdditionalInstructions
Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions.
.PARAMETER AdditionalMessages
Adds additional messages to the thread before creating the run.
.PARAMETER Tools
Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
.PARAMETER Metadata
Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
.PARAMETER Temperature
What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
.PARAMETER Stream
If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
.PARAMETER MaxPromptTokens
The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. 
.PARAMETER MaxCompletionTokens
The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. 
.PARAMETER TruncationStrategy
No description available.
.PARAMETER ToolChoice
No description available.
.PARAMETER ResponseFormat
No description available.
.OUTPUTS

CreateRunRequest<PSCustomObject>
#>

function Initialize-CreateRunRequest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${AssistantId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Model},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Instructions},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${AdditionalInstructions},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${AdditionalMessages},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Tools},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Metadata},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${Temperature} = 1,
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${Stream},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${MaxPromptTokens},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${MaxCompletionTokens},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${TruncationStrategy},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${ToolChoice},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${ResponseFormat}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CreateRunRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $AssistantId) {
            throw "invalid value for 'AssistantId', 'AssistantId' cannot be null."
        }

        if (!$Tools -and $Tools.length -gt 20) {
            throw "invalid value for 'Tools', number of items must be less than or equal to 20."
        }

        if ($Temperature -and $Temperature -gt 2) {
          throw "invalid value for 'Temperature', must be smaller than or equal to 2."
        }

        if ($Temperature -and $Temperature -lt 0) {
          throw "invalid value for 'Temperature', must be greater than or equal to 0."
        }

        if ($MaxPromptTokens -and $MaxPromptTokens -lt 256) {
          throw "invalid value for 'MaxPromptTokens', must be greater than or equal to 256."
        }

        if ($MaxCompletionTokens -and $MaxCompletionTokens -lt 256) {
          throw "invalid value for 'MaxCompletionTokens', must be greater than or equal to 256."
        }


        $PSO = [PSCustomObject]@{
            "assistant_id" = ${AssistantId}
            "model" = ${Model}
            "instructions" = ${Instructions}
            "additional_instructions" = ${AdditionalInstructions}
            "additional_messages" = ${AdditionalMessages}
            "tools" = ${Tools}
            "metadata" = ${Metadata}
            "temperature" = ${Temperature}
            "stream" = ${Stream}
            "max_prompt_tokens" = ${MaxPromptTokens}
            "max_completion_tokens" = ${MaxCompletionTokens}
            "truncation_strategy" = ${TruncationStrategy}
            "tool_choice" = ${ToolChoice}
            "response_format" = ${ResponseFormat}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CreateRunRequest<PSCustomObject>

.DESCRIPTION

Convert from JSON to CreateRunRequest<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CreateRunRequest<PSCustomObject>
#>
function ConvertFrom-JsonToCreateRunRequest {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CreateRunRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CreateRunRequest
        $AllProperties = ("assistant_id", "model", "instructions", "additional_instructions", "additional_messages", "tools", "metadata", "temperature", "stream", "max_prompt_tokens", "max_completion_tokens", "truncation_strategy", "tool_choice", "response_format")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'assistant_id' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "assistant_id"))) {
            throw "Error! JSON cannot be serialized due to the required property 'assistant_id' missing."
        } else {
            $AssistantId = $JsonParameters.PSobject.Properties["assistant_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "model"))) { #optional property not found
            $Model = $null
        } else {
            $Model = $JsonParameters.PSobject.Properties["model"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "instructions"))) { #optional property not found
            $Instructions = $null
        } else {
            $Instructions = $JsonParameters.PSobject.Properties["instructions"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "additional_instructions"))) { #optional property not found
            $AdditionalInstructions = $null
        } else {
            $AdditionalInstructions = $JsonParameters.PSobject.Properties["additional_instructions"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "additional_messages"))) { #optional property not found
            $AdditionalMessages = $null
        } else {
            $AdditionalMessages = $JsonParameters.PSobject.Properties["additional_messages"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "tools"))) { #optional property not found
            $Tools = $null
        } else {
            $Tools = $JsonParameters.PSobject.Properties["tools"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "metadata"))) { #optional property not found
            $Metadata = $null
        } else {
            $Metadata = $JsonParameters.PSobject.Properties["metadata"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "temperature"))) { #optional property not found
            $Temperature = $null
        } else {
            $Temperature = $JsonParameters.PSobject.Properties["temperature"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "stream"))) { #optional property not found
            $Stream = $null
        } else {
            $Stream = $JsonParameters.PSobject.Properties["stream"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "max_prompt_tokens"))) { #optional property not found
            $MaxPromptTokens = $null
        } else {
            $MaxPromptTokens = $JsonParameters.PSobject.Properties["max_prompt_tokens"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "max_completion_tokens"))) { #optional property not found
            $MaxCompletionTokens = $null
        } else {
            $MaxCompletionTokens = $JsonParameters.PSobject.Properties["max_completion_tokens"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "truncation_strategy"))) { #optional property not found
            $TruncationStrategy = $null
        } else {
            $TruncationStrategy = $JsonParameters.PSobject.Properties["truncation_strategy"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "tool_choice"))) { #optional property not found
            $ToolChoice = $null
        } else {
            $ToolChoice = $JsonParameters.PSobject.Properties["tool_choice"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "response_format"))) { #optional property not found
            $ResponseFormat = $null
        } else {
            $ResponseFormat = $JsonParameters.PSobject.Properties["response_format"].value
        }

        $PSO = [PSCustomObject]@{
            "assistant_id" = ${AssistantId}
            "model" = ${Model}
            "instructions" = ${Instructions}
            "additional_instructions" = ${AdditionalInstructions}
            "additional_messages" = ${AdditionalMessages}
            "tools" = ${Tools}
            "metadata" = ${Metadata}
            "temperature" = ${Temperature}
            "stream" = ${Stream}
            "max_prompt_tokens" = ${MaxPromptTokens}
            "max_completion_tokens" = ${MaxCompletionTokens}
            "truncation_strategy" = ${TruncationStrategy}
            "tool_choice" = ${ToolChoice}
            "response_format" = ${ResponseFormat}
        }

        return $PSO
    }

}

