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

An object specifying the format that the model must output. Compatible with [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than `gpt-3.5-turbo-1106`.  Setting to `{ ""type"": ""json_object"" }` enables JSON mode, which guarantees the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly ""stuck"" request. Also note that the message content may be partially cut off if `finish_reason=""length""`, which indicates the generation exceeded `max_tokens` or the conversation exceeded the max context length. 

.PARAMETER Type
Must be one of `text` or `json_object`.
.OUTPUTS

CreateChatCompletionRequestResponseFormat<PSCustomObject>
#>

function Initialize-CreateChatCompletionRequestResponseFormat {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("text", "json_object")]
        [String]
        ${Type} = "text"
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CreateChatCompletionRequestResponseFormat' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "type" = ${Type}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CreateChatCompletionRequestResponseFormat<PSCustomObject>

.DESCRIPTION

Convert from JSON to CreateChatCompletionRequestResponseFormat<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CreateChatCompletionRequestResponseFormat<PSCustomObject>
#>
function ConvertFrom-JsonToCreateChatCompletionRequestResponseFormat {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CreateChatCompletionRequestResponseFormat' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CreateChatCompletionRequestResponseFormat
        $AllProperties = ("type")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "type"))) { #optional property not found
            $Type = $null
        } else {
            $Type = $JsonParameters.PSobject.Properties["type"].value
        }

        $PSO = [PSCustomObject]@{
            "type" = ${Type}
        }

        return $PSO
    }

}

