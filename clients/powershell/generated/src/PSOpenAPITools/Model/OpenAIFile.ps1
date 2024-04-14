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

The `File` object represents a document that has been uploaded to OpenAI.

.PARAMETER Id
The file identifier, which can be referenced in the API endpoints.
.PARAMETER Bytes
The size of the file, in bytes.
.PARAMETER CreatedAt
The Unix timestamp (in seconds) for when the file was created.
.PARAMETER Filename
The name of the file.
.PARAMETER Object
The object type, which is always `file`.
.PARAMETER Purpose
The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`.
.PARAMETER Status
Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
.PARAMETER StatusDetails
Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`.
.OUTPUTS

OpenAIFile<PSCustomObject>
#>

function Initialize-OpenAIFile {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Id},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Int32]
        ${Bytes},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [Int32]
        ${CreatedAt},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Filename},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("file")]
        [String]
        ${Object},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("fine-tune", "fine-tune-results", "assistants", "assistants_output")]
        [String]
        ${Purpose},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("uploaded", "processed", "error")]
        [String]
        ${Status},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${StatusDetails}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => OpenAIFile' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Id) {
            throw "invalid value for 'Id', 'Id' cannot be null."
        }

        if ($null -eq $Bytes) {
            throw "invalid value for 'Bytes', 'Bytes' cannot be null."
        }

        if ($null -eq $CreatedAt) {
            throw "invalid value for 'CreatedAt', 'CreatedAt' cannot be null."
        }

        if ($null -eq $Filename) {
            throw "invalid value for 'Filename', 'Filename' cannot be null."
        }

        if ($null -eq $Object) {
            throw "invalid value for 'Object', 'Object' cannot be null."
        }

        if ($null -eq $Purpose) {
            throw "invalid value for 'Purpose', 'Purpose' cannot be null."
        }

        if ($null -eq $Status) {
            throw "invalid value for 'Status', 'Status' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "bytes" = ${Bytes}
            "created_at" = ${CreatedAt}
            "filename" = ${Filename}
            "object" = ${Object}
            "purpose" = ${Purpose}
            "status" = ${Status}
            "status_details" = ${StatusDetails}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to OpenAIFile<PSCustomObject>

.DESCRIPTION

Convert from JSON to OpenAIFile<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

OpenAIFile<PSCustomObject>
#>
function ConvertFrom-JsonToOpenAIFile {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => OpenAIFile' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in OpenAIFile
        $AllProperties = ("id", "bytes", "created_at", "filename", "object", "purpose", "status", "status_details")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "bytes"))) {
            throw "Error! JSON cannot be serialized due to the required property 'bytes' missing."
        } else {
            $Bytes = $JsonParameters.PSobject.Properties["bytes"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "created_at"))) {
            throw "Error! JSON cannot be serialized due to the required property 'created_at' missing."
        } else {
            $CreatedAt = $JsonParameters.PSobject.Properties["created_at"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "filename"))) {
            throw "Error! JSON cannot be serialized due to the required property 'filename' missing."
        } else {
            $Filename = $JsonParameters.PSobject.Properties["filename"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "object"))) {
            throw "Error! JSON cannot be serialized due to the required property 'object' missing."
        } else {
            $Object = $JsonParameters.PSobject.Properties["object"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "purpose"))) {
            throw "Error! JSON cannot be serialized due to the required property 'purpose' missing."
        } else {
            $Purpose = $JsonParameters.PSobject.Properties["purpose"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "status"))) {
            throw "Error! JSON cannot be serialized due to the required property 'status' missing."
        } else {
            $Status = $JsonParameters.PSobject.Properties["status"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "status_details"))) { #optional property not found
            $StatusDetails = $null
        } else {
            $StatusDetails = $JsonParameters.PSobject.Properties["status_details"].value
        }

        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "bytes" = ${Bytes}
            "created_at" = ${CreatedAt}
            "filename" = ${Filename}
            "object" = ${Object}
            "purpose" = ${Purpose}
            "status" = ${Status}
            "status_details" = ${StatusDetails}
        }

        return $PSO
    }

}

