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

Specifies a tool the model should use. Use to force the model to call a specific function.

.PARAMETER Type
The type of the tool. Currently, only `function` is supported.
.PARAMETER VarFunction
No description available.
.OUTPUTS

ChatCompletionNamedToolChoice<PSCustomObject>
#>

function Initialize-ChatCompletionNamedToolChoice {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("function")]
        [String]
        ${Type},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${VarFunction}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => ChatCompletionNamedToolChoice' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Type) {
            throw "invalid value for 'Type', 'Type' cannot be null."
        }

        if ($null -eq $VarFunction) {
            throw "invalid value for 'VarFunction', 'VarFunction' cannot be null."
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

Convert from JSON to ChatCompletionNamedToolChoice<PSCustomObject>

.DESCRIPTION

Convert from JSON to ChatCompletionNamedToolChoice<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

ChatCompletionNamedToolChoice<PSCustomObject>
#>
function ConvertFrom-JsonToChatCompletionNamedToolChoice {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => ChatCompletionNamedToolChoice' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in ChatCompletionNamedToolChoice
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "function"))) {
            throw "Error! JSON cannot be serialized due to the required property 'function' missing."
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

