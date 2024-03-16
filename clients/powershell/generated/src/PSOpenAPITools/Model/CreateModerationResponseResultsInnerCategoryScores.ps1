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

.PARAMETER Hate
No description available.
.PARAMETER HateThreatening
No description available.
.PARAMETER SelfHarm
No description available.
.PARAMETER Sexual
No description available.
.PARAMETER SexualMinors
No description available.
.PARAMETER Violence
No description available.
.PARAMETER ViolenceGraphic
No description available.
.OUTPUTS

CreateModerationResponseResultsInnerCategoryScores<PSCustomObject>
#>

function Initialize-CreateModerationResponseResultsInnerCategoryScores {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Decimal]
        ${Hate},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Decimal]
        ${HateThreatening},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [Decimal]
        ${SelfHarm},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [Decimal]
        ${Sexual},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [Decimal]
        ${SexualMinors},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [Decimal]
        ${Violence},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [Decimal]
        ${ViolenceGraphic}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CreateModerationResponseResultsInnerCategoryScores' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Hate) {
            throw "invalid value for 'Hate', 'Hate' cannot be null."
        }

        if ($null -eq $HateThreatening) {
            throw "invalid value for 'HateThreatening', 'HateThreatening' cannot be null."
        }

        if ($null -eq $SelfHarm) {
            throw "invalid value for 'SelfHarm', 'SelfHarm' cannot be null."
        }

        if ($null -eq $Sexual) {
            throw "invalid value for 'Sexual', 'Sexual' cannot be null."
        }

        if ($null -eq $SexualMinors) {
            throw "invalid value for 'SexualMinors', 'SexualMinors' cannot be null."
        }

        if ($null -eq $Violence) {
            throw "invalid value for 'Violence', 'Violence' cannot be null."
        }

        if ($null -eq $ViolenceGraphic) {
            throw "invalid value for 'ViolenceGraphic', 'ViolenceGraphic' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "hate" = ${Hate}
            "hate/threatening" = ${HateThreatening}
            "self-harm" = ${SelfHarm}
            "sexual" = ${Sexual}
            "sexual/minors" = ${SexualMinors}
            "violence" = ${Violence}
            "violence/graphic" = ${ViolenceGraphic}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CreateModerationResponseResultsInnerCategoryScores<PSCustomObject>

.DESCRIPTION

Convert from JSON to CreateModerationResponseResultsInnerCategoryScores<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CreateModerationResponseResultsInnerCategoryScores<PSCustomObject>
#>
function ConvertFrom-JsonToCreateModerationResponseResultsInnerCategoryScores {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CreateModerationResponseResultsInnerCategoryScores' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CreateModerationResponseResultsInnerCategoryScores
        $AllProperties = ("hate", "hate/threatening", "self-harm", "sexual", "sexual/minors", "violence", "violence/graphic")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'hate' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "hate"))) {
            throw "Error! JSON cannot be serialized due to the required property 'hate' missing."
        } else {
            $Hate = $JsonParameters.PSobject.Properties["hate"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "hate/threatening"))) {
            throw "Error! JSON cannot be serialized due to the required property 'hate/threatening' missing."
        } else {
            $HateThreatening = $JsonParameters.PSobject.Properties["hate/threatening"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "self-harm"))) {
            throw "Error! JSON cannot be serialized due to the required property 'self-harm' missing."
        } else {
            $SelfHarm = $JsonParameters.PSobject.Properties["self-harm"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "sexual"))) {
            throw "Error! JSON cannot be serialized due to the required property 'sexual' missing."
        } else {
            $Sexual = $JsonParameters.PSobject.Properties["sexual"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "sexual/minors"))) {
            throw "Error! JSON cannot be serialized due to the required property 'sexual/minors' missing."
        } else {
            $SexualMinors = $JsonParameters.PSobject.Properties["sexual/minors"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "violence"))) {
            throw "Error! JSON cannot be serialized due to the required property 'violence' missing."
        } else {
            $Violence = $JsonParameters.PSobject.Properties["violence"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "violence/graphic"))) {
            throw "Error! JSON cannot be serialized due to the required property 'violence/graphic' missing."
        } else {
            $ViolenceGraphic = $JsonParameters.PSobject.Properties["violence/graphic"].value
        }

        $PSO = [PSCustomObject]@{
            "hate" = ${Hate}
            "hate/threatening" = ${HateThreatening}
            "self-harm" = ${SelfHarm}
            "sexual" = ${Sexual}
            "sexual/minors" = ${SexualMinors}
            "violence" = ${Violence}
            "violence/graphic" = ${ViolenceGraphic}
        }

        return $PSO
    }

}

