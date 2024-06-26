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

Describes an OpenAI model offering that can be used with the API.

.PARAMETER Id
The model identifier, which can be referenced in the API endpoints.
.PARAMETER Created
The Unix timestamp (in seconds) when the model was created.
.PARAMETER Object
The object type, which is always ""model"".
.PARAMETER OwnedBy
The organization that owns the model.
.OUTPUTS

Model<PSCustomObject>
#>

function Initialize-Model {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Id},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Int32]
        ${Created},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("model")]
        [String]
        ${Object},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${OwnedBy}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => Model' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Id) {
            throw "invalid value for 'Id', 'Id' cannot be null."
        }

        if ($null -eq $Created) {
            throw "invalid value for 'Created', 'Created' cannot be null."
        }

        if ($null -eq $Object) {
            throw "invalid value for 'Object', 'Object' cannot be null."
        }

        if ($null -eq $OwnedBy) {
            throw "invalid value for 'OwnedBy', 'OwnedBy' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "created" = ${Created}
            "object" = ${Object}
            "owned_by" = ${OwnedBy}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to Model<PSCustomObject>

.DESCRIPTION

Convert from JSON to Model<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

Model<PSCustomObject>
#>
function ConvertFrom-JsonToModel {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => Model' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in Model
        $AllProperties = ("id", "created", "object", "owned_by")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "created"))) {
            throw "Error! JSON cannot be serialized due to the required property 'created' missing."
        } else {
            $Created = $JsonParameters.PSobject.Properties["created"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "object"))) {
            throw "Error! JSON cannot be serialized due to the required property 'object' missing."
        } else {
            $Object = $JsonParameters.PSobject.Properties["object"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "owned_by"))) {
            throw "Error! JSON cannot be serialized due to the required property 'owned_by' missing."
        } else {
            $OwnedBy = $JsonParameters.PSobject.Properties["owned_by"].value
        }

        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "created" = ${Created}
            "object" = ${Object}
            "owned_by" = ${OwnedBy}
        }

        return $PSO
    }

}

