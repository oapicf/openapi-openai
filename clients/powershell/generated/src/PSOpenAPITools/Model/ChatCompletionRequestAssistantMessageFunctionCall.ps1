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

Deprecated and replaced by `tool_calls`. The name and arguments of a function that should be called, as generated by the model.

.PARAMETER Arguments
The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
.PARAMETER Name
The name of the function to call.
.OUTPUTS

ChatCompletionRequestAssistantMessageFunctionCall<PSCustomObject>
#>

function Initialize-ChatCompletionRequestAssistantMessageFunctionCall {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Arguments},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Name}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => ChatCompletionRequestAssistantMessageFunctionCall' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Arguments) {
            throw "invalid value for 'Arguments', 'Arguments' cannot be null."
        }

        if ($null -eq $Name) {
            throw "invalid value for 'Name', 'Name' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "arguments" = ${Arguments}
            "name" = ${Name}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to ChatCompletionRequestAssistantMessageFunctionCall<PSCustomObject>

.DESCRIPTION

Convert from JSON to ChatCompletionRequestAssistantMessageFunctionCall<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

ChatCompletionRequestAssistantMessageFunctionCall<PSCustomObject>
#>
function ConvertFrom-JsonToChatCompletionRequestAssistantMessageFunctionCall {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => ChatCompletionRequestAssistantMessageFunctionCall' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in ChatCompletionRequestAssistantMessageFunctionCall
        $AllProperties = ("arguments", "name")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'arguments' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "arguments"))) {
            throw "Error! JSON cannot be serialized due to the required property 'arguments' missing."
        } else {
            $Arguments = $JsonParameters.PSobject.Properties["arguments"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "name"))) {
            throw "Error! JSON cannot be serialized due to the required property 'name' missing."
        } else {
            $Name = $JsonParameters.PSobject.Properties["name"].value
        }

        $PSO = [PSCustomObject]@{
            "arguments" = ${Arguments}
            "name" = ${Name}
        }

        return $PSO
    }

}

