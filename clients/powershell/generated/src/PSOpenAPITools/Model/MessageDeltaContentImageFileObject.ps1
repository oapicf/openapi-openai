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

References an image [File](/docs/api-reference/files) in the content of a message.

.PARAMETER Index
The index of the content part in the message.
.PARAMETER Type
Always `image_file`.
.PARAMETER ImageFile
No description available.
.OUTPUTS

MessageDeltaContentImageFileObject<PSCustomObject>
#>

function Initialize-MessageDeltaContentImageFileObject {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Int32]
        ${Index},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("image_file")]
        [String]
        ${Type},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${ImageFile}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => MessageDeltaContentImageFileObject' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Index) {
            throw "invalid value for 'Index', 'Index' cannot be null."
        }

        if ($null -eq $Type) {
            throw "invalid value for 'Type', 'Type' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "index" = ${Index}
            "type" = ${Type}
            "image_file" = ${ImageFile}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to MessageDeltaContentImageFileObject<PSCustomObject>

.DESCRIPTION

Convert from JSON to MessageDeltaContentImageFileObject<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

MessageDeltaContentImageFileObject<PSCustomObject>
#>
function ConvertFrom-JsonToMessageDeltaContentImageFileObject {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => MessageDeltaContentImageFileObject' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in MessageDeltaContentImageFileObject
        $AllProperties = ("index", "type", "image_file")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'index' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "index"))) {
            throw "Error! JSON cannot be serialized due to the required property 'index' missing."
        } else {
            $Index = $JsonParameters.PSobject.Properties["index"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "type"))) {
            throw "Error! JSON cannot be serialized due to the required property 'type' missing."
        } else {
            $Type = $JsonParameters.PSobject.Properties["type"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "image_file"))) { #optional property not found
            $ImageFile = $null
        } else {
            $ImageFile = $JsonParameters.PSobject.Properties["image_file"].value
        }

        $PSO = [PSCustomObject]@{
            "index" = ${Index}
            "type" = ${Type}
            "image_file" = ${ImageFile}
        }

        return $PSO
    }

}

