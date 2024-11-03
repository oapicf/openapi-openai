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

MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation<PSCustomObject>
#>

function Initialize-MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation {
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
        'Creating PSCustomObject: PSOpenAPITools => MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "file_id" = ${FileId}
            "quote" = ${Quote}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation<PSCustomObject>

.DESCRIPTION

Convert from JSON to MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation<PSCustomObject>
#>
function ConvertFrom-JsonToMessageDeltaContentTextAnnotationsFileCitationObjectFileCitation {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
        $AllProperties = ("file_id", "quote")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "file_id"))) { #optional property not found
            $FileId = $null
        } else {
            $FileId = $JsonParameters.PSobject.Properties["file_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "quote"))) { #optional property not found
            $Quote = $null
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

