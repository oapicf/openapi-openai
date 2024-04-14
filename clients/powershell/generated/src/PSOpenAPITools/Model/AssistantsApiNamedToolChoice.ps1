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

Specifies a tool the model should use. Use to force the model to call a specific tool.

.PARAMETER Type
The type of the tool. If type is `function`, the function name must be set
.PARAMETER VarFunction
No description available.
.OUTPUTS

AssistantsApiNamedToolChoice<PSCustomObject>
#>

function Initialize-AssistantsApiNamedToolChoice {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("function", "code_interpreter", "retrieval")]
        [String]
        ${Type},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${VarFunction}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => AssistantsApiNamedToolChoice' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Type) {
            throw "invalid value for 'Type', 'Type' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "type" = ${Type}
            "function" = ${VarFunction}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to AssistantsApiNamedToolChoice<PSCustomObject>

.DESCRIPTION

Convert from JSON to AssistantsApiNamedToolChoice<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

AssistantsApiNamedToolChoice<PSCustomObject>
#>
function ConvertFrom-JsonToAssistantsApiNamedToolChoice {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => AssistantsApiNamedToolChoice' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in AssistantsApiNamedToolChoice
        $AllProperties = ("type", "function")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "function"))) { #optional property not found
            $VarFunction = $null
        } else {
            $VarFunction = $JsonParameters.PSobject.Properties["function"].value
        }

        $PSO = [PSCustomObject]@{
            "type" = ${Type}
            "function" = ${VarFunction}
        }

        return $PSO
    }

}

