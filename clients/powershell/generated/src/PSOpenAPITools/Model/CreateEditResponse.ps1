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

.PARAMETER Object
No description available.
.PARAMETER Created
No description available.
.PARAMETER Choices
No description available.
.PARAMETER Usage
No description available.
.OUTPUTS

CreateEditResponse<PSCustomObject>
#>

function Initialize-CreateEditResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Object},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Int32]
        ${Created},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Choices},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Usage}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CreateEditResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Object) {
            throw "invalid value for 'Object', 'Object' cannot be null."
        }

        if ($null -eq $Created) {
            throw "invalid value for 'Created', 'Created' cannot be null."
        }

        if ($null -eq $Choices) {
            throw "invalid value for 'Choices', 'Choices' cannot be null."
        }

        if ($null -eq $Usage) {
            throw "invalid value for 'Usage', 'Usage' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "object" = ${Object}
            "created" = ${Created}
            "choices" = ${Choices}
            "usage" = ${Usage}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CreateEditResponse<PSCustomObject>

.DESCRIPTION

Convert from JSON to CreateEditResponse<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CreateEditResponse<PSCustomObject>
#>
function ConvertFrom-JsonToCreateEditResponse {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CreateEditResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CreateEditResponse
        $AllProperties = ("object", "created", "choices", "usage")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "created"))) {
            throw "Error! JSON cannot be serialized due to the required property 'created' missing."
        } else {
            $Created = $JsonParameters.PSobject.Properties["created"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "choices"))) {
            throw "Error! JSON cannot be serialized due to the required property 'choices' missing."
        } else {
            $Choices = $JsonParameters.PSobject.Properties["choices"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "usage"))) {
            throw "Error! JSON cannot be serialized due to the required property 'usage' missing."
        } else {
            $Usage = $JsonParameters.PSobject.Properties["usage"].value
        }

        $PSO = [PSCustomObject]@{
            "object" = ${Object}
            "created" = ${Created}
            "choices" = ${Choices}
            "usage" = ${Usage}
        }

        return $PSO
    }

}

