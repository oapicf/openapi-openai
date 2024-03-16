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

.PARAMETER Flagged
No description available.
.PARAMETER Categories
No description available.
.PARAMETER CategoryScores
No description available.
.OUTPUTS

CreateModerationResponseResultsInner<PSCustomObject>
#>

function Initialize-CreateModerationResponseResultsInner {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Boolean]
        ${Flagged},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Categories},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${CategoryScores}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CreateModerationResponseResultsInner' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Flagged) {
            throw "invalid value for 'Flagged', 'Flagged' cannot be null."
        }

        if ($null -eq $Categories) {
            throw "invalid value for 'Categories', 'Categories' cannot be null."
        }

        if ($null -eq $CategoryScores) {
            throw "invalid value for 'CategoryScores', 'CategoryScores' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "flagged" = ${Flagged}
            "categories" = ${Categories}
            "category_scores" = ${CategoryScores}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CreateModerationResponseResultsInner<PSCustomObject>

.DESCRIPTION

Convert from JSON to CreateModerationResponseResultsInner<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CreateModerationResponseResultsInner<PSCustomObject>
#>
function ConvertFrom-JsonToCreateModerationResponseResultsInner {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CreateModerationResponseResultsInner' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CreateModerationResponseResultsInner
        $AllProperties = ("flagged", "categories", "category_scores")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'flagged' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "flagged"))) {
            throw "Error! JSON cannot be serialized due to the required property 'flagged' missing."
        } else {
            $Flagged = $JsonParameters.PSobject.Properties["flagged"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "categories"))) {
            throw "Error! JSON cannot be serialized due to the required property 'categories' missing."
        } else {
            $Categories = $JsonParameters.PSobject.Properties["categories"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "category_scores"))) {
            throw "Error! JSON cannot be serialized due to the required property 'category_scores' missing."
        } else {
            $CategoryScores = $JsonParameters.PSobject.Properties["category_scores"].value
        }

        $PSO = [PSCustomObject]@{
            "flagged" = ${Flagged}
            "categories" = ${Categories}
            "category_scores" = ${CategoryScores}
        }

        return $PSO
    }

}

