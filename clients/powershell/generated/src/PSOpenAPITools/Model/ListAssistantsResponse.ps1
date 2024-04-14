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

.PARAMETER Object
No description available.
.PARAMETER VarData
No description available.
.PARAMETER FirstId
No description available.
.PARAMETER LastId
No description available.
.PARAMETER HasMore
No description available.
.OUTPUTS

ListAssistantsResponse<PSCustomObject>
#>

function Initialize-ListAssistantsResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Object},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${VarData},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${FirstId},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${LastId},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [Boolean]
        ${HasMore}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => ListAssistantsResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Object) {
            throw "invalid value for 'Object', 'Object' cannot be null."
        }

        if ($null -eq $VarData) {
            throw "invalid value for 'VarData', 'VarData' cannot be null."
        }

        if ($null -eq $FirstId) {
            throw "invalid value for 'FirstId', 'FirstId' cannot be null."
        }

        if ($null -eq $LastId) {
            throw "invalid value for 'LastId', 'LastId' cannot be null."
        }

        if ($null -eq $HasMore) {
            throw "invalid value for 'HasMore', 'HasMore' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "object" = ${Object}
            "data" = ${VarData}
            "first_id" = ${FirstId}
            "last_id" = ${LastId}
            "has_more" = ${HasMore}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to ListAssistantsResponse<PSCustomObject>

.DESCRIPTION

Convert from JSON to ListAssistantsResponse<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

ListAssistantsResponse<PSCustomObject>
#>
function ConvertFrom-JsonToListAssistantsResponse {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => ListAssistantsResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in ListAssistantsResponse
        $AllProperties = ("object", "data", "first_id", "last_id", "has_more")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'object' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "object"))) {
            throw "Error! JSON cannot be serialized due to the required property 'object' missing."
        } else {
            $Object = $JsonParameters.PSobject.Properties["object"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "data"))) {
            throw "Error! JSON cannot be serialized due to the required property 'data' missing."
        } else {
            $VarData = $JsonParameters.PSobject.Properties["data"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "first_id"))) {
            throw "Error! JSON cannot be serialized due to the required property 'first_id' missing."
        } else {
            $FirstId = $JsonParameters.PSobject.Properties["first_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "last_id"))) {
            throw "Error! JSON cannot be serialized due to the required property 'last_id' missing."
        } else {
            $LastId = $JsonParameters.PSobject.Properties["last_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "has_more"))) {
            throw "Error! JSON cannot be serialized due to the required property 'has_more' missing."
        } else {
            $HasMore = $JsonParameters.PSobject.Properties["has_more"].value
        }

        $PSO = [PSCustomObject]@{
            "object" = ${Object}
            "data" = ${VarData}
            "first_id" = ${FirstId}
            "last_id" = ${LastId}
            "has_more" = ${HasMore}
        }

        return $PSO
    }

}

