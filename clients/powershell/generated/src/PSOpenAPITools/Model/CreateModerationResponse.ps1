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

Represents if a given text input is potentially harmful.

.PARAMETER Id
The unique identifier for the moderation request.
.PARAMETER Model
The model used to generate the moderation results.
.PARAMETER Results
A list of moderation objects.
.OUTPUTS

CreateModerationResponse<PSCustomObject>
#>

function Initialize-CreateModerationResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Id},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Model},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Results}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CreateModerationResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Id) {
            throw "invalid value for 'Id', 'Id' cannot be null."
        }

        if ($null -eq $Model) {
            throw "invalid value for 'Model', 'Model' cannot be null."
        }

        if ($null -eq $Results) {
            throw "invalid value for 'Results', 'Results' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "model" = ${Model}
            "results" = ${Results}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CreateModerationResponse<PSCustomObject>

.DESCRIPTION

Convert from JSON to CreateModerationResponse<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CreateModerationResponse<PSCustomObject>
#>
function ConvertFrom-JsonToCreateModerationResponse {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CreateModerationResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CreateModerationResponse
        $AllProperties = ("id", "model", "results")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'id' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "id"))) {
            throw "Error! JSON cannot be serialized due to the required property 'id' missing."
        } else {
            $Id = $JsonParameters.PSobject.Properties["id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "model"))) {
            throw "Error! JSON cannot be serialized due to the required property 'model' missing."
        } else {
            $Model = $JsonParameters.PSobject.Properties["model"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "results"))) {
            throw "Error! JSON cannot be serialized due to the required property 'results' missing."
        } else {
            $Results = $JsonParameters.PSobject.Properties["results"].value
        }

        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "model" = ${Model}
            "results" = ${Results}
        }

        return $PSO
    }

}
