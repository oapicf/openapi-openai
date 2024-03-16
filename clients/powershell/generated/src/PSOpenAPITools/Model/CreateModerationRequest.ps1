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

.PARAMETER VarInput
No description available.
.PARAMETER Model
No description available.
.OUTPUTS

CreateModerationRequest<PSCustomObject>
#>

function Initialize-CreateModerationRequest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${VarInput},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Model}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CreateModerationRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $VarInput) {
            throw "invalid value for 'VarInput', 'VarInput' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "input" = ${VarInput}
            "model" = ${Model}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CreateModerationRequest<PSCustomObject>

.DESCRIPTION

Convert from JSON to CreateModerationRequest<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CreateModerationRequest<PSCustomObject>
#>
function ConvertFrom-JsonToCreateModerationRequest {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CreateModerationRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CreateModerationRequest
        $AllProperties = ("input", "model")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'input' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "input"))) {
            throw "Error! JSON cannot be serialized due to the required property 'input' missing."
        } else {
            $VarInput = $JsonParameters.PSobject.Properties["input"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "model"))) { #optional property not found
            $Model = $null
        } else {
            $Model = $JsonParameters.PSobject.Properties["model"].value
        }

        $PSO = [PSCustomObject]@{
            "input" = ${VarInput}
            "model" = ${Model}
        }

        return $PSO
    }

}

