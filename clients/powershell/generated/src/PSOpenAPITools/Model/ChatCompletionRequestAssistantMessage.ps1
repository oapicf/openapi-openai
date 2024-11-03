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

.PARAMETER Content
The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified. 
.PARAMETER Role
The role of the messages author, in this case `assistant`.
.PARAMETER Name
An optional name for the participant. Provides the model information to differentiate between participants of the same role.
.PARAMETER ToolCalls
The tool calls generated by the model, such as function calls.
.PARAMETER FunctionCall
No description available.
.OUTPUTS

ChatCompletionRequestAssistantMessage<PSCustomObject>
#>

function Initialize-ChatCompletionRequestAssistantMessage {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Content},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("assistant")]
        [String]
        ${Role},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Name},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${ToolCalls},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${FunctionCall}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => ChatCompletionRequestAssistantMessage' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Role) {
            throw "invalid value for 'Role', 'Role' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "content" = ${Content}
            "role" = ${Role}
            "name" = ${Name}
            "tool_calls" = ${ToolCalls}
            "function_call" = ${FunctionCall}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to ChatCompletionRequestAssistantMessage<PSCustomObject>

.DESCRIPTION

Convert from JSON to ChatCompletionRequestAssistantMessage<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

ChatCompletionRequestAssistantMessage<PSCustomObject>
#>
function ConvertFrom-JsonToChatCompletionRequestAssistantMessage {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => ChatCompletionRequestAssistantMessage' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in ChatCompletionRequestAssistantMessage
        $AllProperties = ("content", "role", "name", "tool_calls", "function_call")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'role' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "role"))) {
            throw "Error! JSON cannot be serialized due to the required property 'role' missing."
        } else {
            $Role = $JsonParameters.PSobject.Properties["role"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "content"))) { #optional property not found
            $Content = $null
        } else {
            $Content = $JsonParameters.PSobject.Properties["content"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "name"))) { #optional property not found
            $Name = $null
        } else {
            $Name = $JsonParameters.PSobject.Properties["name"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "tool_calls"))) { #optional property not found
            $ToolCalls = $null
        } else {
            $ToolCalls = $JsonParameters.PSobject.Properties["tool_calls"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "function_call"))) { #optional property not found
            $FunctionCall = $null
        } else {
            $FunctionCall = $JsonParameters.PSobject.Properties["function_call"].value
        }

        $PSO = [PSCustomObject]@{
            "content" = ${Content}
            "role" = ${Role}
            "name" = ${Name}
            "tool_calls" = ${ToolCalls}
            "function_call" = ${FunctionCall}
        }

        return $PSO
    }

}

