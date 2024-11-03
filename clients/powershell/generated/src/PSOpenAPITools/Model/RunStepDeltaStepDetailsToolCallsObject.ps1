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

Details of the tool call.

.PARAMETER Type
Always `tool_calls`.
.PARAMETER ToolCalls
An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 
.OUTPUTS

RunStepDeltaStepDetailsToolCallsObject<PSCustomObject>
#>

function Initialize-RunStepDeltaStepDetailsToolCallsObject {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("tool_calls")]
        [String]
        ${Type},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${ToolCalls}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => RunStepDeltaStepDetailsToolCallsObject' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Type) {
            throw "invalid value for 'Type', 'Type' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "type" = ${Type}
            "tool_calls" = ${ToolCalls}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to RunStepDeltaStepDetailsToolCallsObject<PSCustomObject>

.DESCRIPTION

Convert from JSON to RunStepDeltaStepDetailsToolCallsObject<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

RunStepDeltaStepDetailsToolCallsObject<PSCustomObject>
#>
function ConvertFrom-JsonToRunStepDeltaStepDetailsToolCallsObject {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => RunStepDeltaStepDetailsToolCallsObject' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in RunStepDeltaStepDetailsToolCallsObject
        $AllProperties = ("type", "tool_calls")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'type' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "type"))) {
            throw "Error! JSON cannot be serialized due to the required property 'type' missing."
        } else {
            $Type = $JsonParameters.PSobject.Properties["type"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "tool_calls"))) { #optional property not found
            $ToolCalls = $null
        } else {
            $ToolCalls = $JsonParameters.PSobject.Properties["tool_calls"].value
        }

        $PSO = [PSCustomObject]@{
            "type" = ${Type}
            "tool_calls" = ${ToolCalls}
        }

        return $PSO
    }

}

