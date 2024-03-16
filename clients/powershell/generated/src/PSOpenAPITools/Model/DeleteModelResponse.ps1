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

.PARAMETER Id
No description available.
.PARAMETER Object
No description available.
.PARAMETER Deleted
No description available.
.OUTPUTS

DeleteModelResponse<PSCustomObject>
#>

function Initialize-DeleteModelResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Id},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Object},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [Boolean]
        ${Deleted}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => DeleteModelResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Id) {
            throw "invalid value for 'Id', 'Id' cannot be null."
        }

        if ($null -eq $Object) {
            throw "invalid value for 'Object', 'Object' cannot be null."
        }

        if ($null -eq $Deleted) {
            throw "invalid value for 'Deleted', 'Deleted' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "object" = ${Object}
            "deleted" = ${Deleted}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to DeleteModelResponse<PSCustomObject>

.DESCRIPTION

Convert from JSON to DeleteModelResponse<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

DeleteModelResponse<PSCustomObject>
#>
function ConvertFrom-JsonToDeleteModelResponse {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => DeleteModelResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in DeleteModelResponse
        $AllProperties = ("id", "object", "deleted")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "object"))) {
            throw "Error! JSON cannot be serialized due to the required property 'object' missing."
        } else {
            $Object = $JsonParameters.PSobject.Properties["object"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "deleted"))) {
            throw "Error! JSON cannot be serialized due to the required property 'deleted' missing."
        } else {
            $Deleted = $JsonParameters.PSobject.Properties["deleted"].value
        }

        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "object" = ${Object}
            "deleted" = ${Deleted}
        }

        return $PSO
    }

}

