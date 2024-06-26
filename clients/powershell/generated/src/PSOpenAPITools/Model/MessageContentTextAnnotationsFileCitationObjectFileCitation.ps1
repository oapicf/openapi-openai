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

.PARAMETER FileId
The ID of the specific File the citation is from.
.PARAMETER Quote
The specific quote in the file.
.OUTPUTS

MessageContentTextAnnotationsFileCitationObjectFileCitation<PSCustomObject>
#>

function Initialize-MessageContentTextAnnotationsFileCitationObjectFileCitation {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${FileId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Quote}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => MessageContentTextAnnotationsFileCitationObjectFileCitation' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $FileId) {
            throw "invalid value for 'FileId', 'FileId' cannot be null."
        }

        if ($null -eq $Quote) {
            throw "invalid value for 'Quote', 'Quote' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "file_id" = ${FileId}
            "quote" = ${Quote}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to MessageContentTextAnnotationsFileCitationObjectFileCitation<PSCustomObject>

.DESCRIPTION

Convert from JSON to MessageContentTextAnnotationsFileCitationObjectFileCitation<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

MessageContentTextAnnotationsFileCitationObjectFileCitation<PSCustomObject>
#>
function ConvertFrom-JsonToMessageContentTextAnnotationsFileCitationObjectFileCitation {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => MessageContentTextAnnotationsFileCitationObjectFileCitation' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in MessageContentTextAnnotationsFileCitationObjectFileCitation
        $AllProperties = ("file_id", "quote")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'file_id' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "file_id"))) {
            throw "Error! JSON cannot be serialized due to the required property 'file_id' missing."
        } else {
            $FileId = $JsonParameters.PSobject.Properties["file_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "quote"))) {
            throw "Error! JSON cannot be serialized due to the required property 'quote' missing."
        } else {
            $Quote = $JsonParameters.PSobject.Properties["quote"].value
        }

        $PSO = [PSCustomObject]@{
            "file_id" = ${FileId}
            "quote" = ${Quote}
        }

        return $PSO
    }

}

