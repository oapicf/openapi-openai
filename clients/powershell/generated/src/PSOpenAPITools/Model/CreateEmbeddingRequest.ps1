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

.PARAMETER Model
No description available.
.PARAMETER VarInput
No description available.
.PARAMETER User
A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
.OUTPUTS

CreateEmbeddingRequest<PSCustomObject>
#>

function Initialize-CreateEmbeddingRequest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Model},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${VarInput},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${User}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CreateEmbeddingRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Model) {
            throw "invalid value for 'Model', 'Model' cannot be null."
        }

        if ($null -eq $VarInput) {
            throw "invalid value for 'VarInput', 'VarInput' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "model" = ${Model}
            "input" = ${VarInput}
            "user" = ${User}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CreateEmbeddingRequest<PSCustomObject>

.DESCRIPTION

Convert from JSON to CreateEmbeddingRequest<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CreateEmbeddingRequest<PSCustomObject>
#>
function ConvertFrom-JsonToCreateEmbeddingRequest {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CreateEmbeddingRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CreateEmbeddingRequest
        $AllProperties = ("model", "input", "user")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'model' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "model"))) {
            throw "Error! JSON cannot be serialized due to the required property 'model' missing."
        } else {
            $Model = $JsonParameters.PSobject.Properties["model"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "input"))) {
            throw "Error! JSON cannot be serialized due to the required property 'input' missing."
        } else {
            $VarInput = $JsonParameters.PSobject.Properties["input"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "user"))) { #optional property not found
            $User = $null
        } else {
            $User = $JsonParameters.PSobject.Properties["user"].value
        }

        $PSO = [PSCustomObject]@{
            "model" = ${Model}
            "input" = ${VarInput}
            "user" = ${User}
        }

        return $PSO
    }

}

