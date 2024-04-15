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

.PARAMETER Type
The type of the content part.
.PARAMETER Text
The text content.
.OUTPUTS

ChatCompletionRequestMessageContentPartText<PSCustomObject>
#>

function Initialize-ChatCompletionRequestMessageContentPartText {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("text")]
        [String]
        ${Type},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Text}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => ChatCompletionRequestMessageContentPartText' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Type) {
            throw "invalid value for 'Type', 'Type' cannot be null."
        }

        if ($null -eq $Text) {
            throw "invalid value for 'Text', 'Text' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "type" = ${Type}
            "text" = ${Text}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to ChatCompletionRequestMessageContentPartText<PSCustomObject>

.DESCRIPTION

Convert from JSON to ChatCompletionRequestMessageContentPartText<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

ChatCompletionRequestMessageContentPartText<PSCustomObject>
#>
function ConvertFrom-JsonToChatCompletionRequestMessageContentPartText {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => ChatCompletionRequestMessageContentPartText' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in ChatCompletionRequestMessageContentPartText
        $AllProperties = ("type", "text")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'type' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "type"))) {
            throw "Error! JSON cannot be serialized due to the required property 'type' missing."
        } else {
            $Type = $JsonParameters.PSobject.Properties["type"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "text"))) {
            throw "Error! JSON cannot be serialized due to the required property 'text' missing."
        } else {
            $Text = $JsonParameters.PSobject.Properties["text"].value
        }

        $PSO = [PSCustomObject]@{
            "type" = ${Type}
            "text" = ${Text}
        }

        return $PSO
    }

}
