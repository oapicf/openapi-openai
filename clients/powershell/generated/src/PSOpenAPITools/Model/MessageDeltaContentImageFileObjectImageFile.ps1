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
The [File](/docs/api-reference/files) ID of the image in the message content.
.OUTPUTS

MessageDeltaContentImageFileObjectImageFile<PSCustomObject>
#>

function Initialize-MessageDeltaContentImageFileObjectImageFile {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${FileId}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => MessageDeltaContentImageFileObjectImageFile' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "file_id" = ${FileId}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to MessageDeltaContentImageFileObjectImageFile<PSCustomObject>

.DESCRIPTION

Convert from JSON to MessageDeltaContentImageFileObjectImageFile<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

MessageDeltaContentImageFileObjectImageFile<PSCustomObject>
#>
function ConvertFrom-JsonToMessageDeltaContentImageFileObjectImageFile {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => MessageDeltaContentImageFileObjectImageFile' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in MessageDeltaContentImageFileObjectImageFile
        $AllProperties = ("file_id")
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

        $PSO = [PSCustomObject]@{
            "file_id" = ${FileId}
        }

        return $PSO
    }

}

