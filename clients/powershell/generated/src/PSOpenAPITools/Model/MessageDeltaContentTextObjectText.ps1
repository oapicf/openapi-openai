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

.PARAMETER Value
The data that makes up the text.
.PARAMETER Annotations
No description available.
.OUTPUTS

MessageDeltaContentTextObjectText<PSCustomObject>
#>

function Initialize-MessageDeltaContentTextObjectText {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Value},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Annotations}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => MessageDeltaContentTextObjectText' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "value" = ${Value}
            "annotations" = ${Annotations}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to MessageDeltaContentTextObjectText<PSCustomObject>

.DESCRIPTION

Convert from JSON to MessageDeltaContentTextObjectText<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

MessageDeltaContentTextObjectText<PSCustomObject>
#>
function ConvertFrom-JsonToMessageDeltaContentTextObjectText {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => MessageDeltaContentTextObjectText' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in MessageDeltaContentTextObjectText
        $AllProperties = ("value", "annotations")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "value"))) { #optional property not found
            $Value = $null
        } else {
            $Value = $JsonParameters.PSobject.Properties["value"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "annotations"))) { #optional property not found
            $Annotations = $null
        } else {
            $Annotations = $JsonParameters.PSobject.Properties["annotations"].value
        }

        $PSO = [PSCustomObject]@{
            "value" = ${Value}
            "annotations" = ${Annotations}
        }

        return $PSO
    }

}
