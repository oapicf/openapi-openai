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

Details on the action required to continue the run. Will be `null` if no action is required.

.PARAMETER Type
For now, this is always `submit_tool_outputs`.
.PARAMETER SubmitToolOutputs
No description available.
.OUTPUTS

RunObjectRequiredAction<PSCustomObject>
#>

function Initialize-RunObjectRequiredAction {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("submit_tool_outputs")]
        [String]
        ${Type},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${SubmitToolOutputs}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => RunObjectRequiredAction' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Type) {
            throw "invalid value for 'Type', 'Type' cannot be null."
        }

        if ($null -eq $SubmitToolOutputs) {
            throw "invalid value for 'SubmitToolOutputs', 'SubmitToolOutputs' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "type" = ${Type}
            "submit_tool_outputs" = ${SubmitToolOutputs}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to RunObjectRequiredAction<PSCustomObject>

.DESCRIPTION

Convert from JSON to RunObjectRequiredAction<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

RunObjectRequiredAction<PSCustomObject>
#>
function ConvertFrom-JsonToRunObjectRequiredAction {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => RunObjectRequiredAction' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in RunObjectRequiredAction
        $AllProperties = ("type", "submit_tool_outputs")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "submit_tool_outputs"))) {
            throw "Error! JSON cannot be serialized due to the required property 'submit_tool_outputs' missing."
        } else {
            $SubmitToolOutputs = $JsonParameters.PSobject.Properties["submit_tool_outputs"].value
        }

        $PSO = [PSCustomObject]@{
            "type" = ${Type}
            "submit_tool_outputs" = ${SubmitToolOutputs}
        }

        return $PSO
    }

}

