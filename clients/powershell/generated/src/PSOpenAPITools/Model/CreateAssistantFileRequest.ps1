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
A [File](/docs/api-reference/files) ID (with `purpose=""assistants""`) that the assistant should use. Useful for tools like `retrieval` and `code_interpreter` that can access files.
.OUTPUTS

CreateAssistantFileRequest<PSCustomObject>
#>

function Initialize-CreateAssistantFileRequest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${FileId}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CreateAssistantFileRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $FileId) {
            throw "invalid value for 'FileId', 'FileId' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "file_id" = ${FileId}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CreateAssistantFileRequest<PSCustomObject>

.DESCRIPTION

Convert from JSON to CreateAssistantFileRequest<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CreateAssistantFileRequest<PSCustomObject>
#>
function ConvertFrom-JsonToCreateAssistantFileRequest {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CreateAssistantFileRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CreateAssistantFileRequest
        $AllProperties = ("file_id")
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

        $PSO = [PSCustomObject]@{
            "file_id" = ${FileId}
        }

        return $PSO
    }

}
