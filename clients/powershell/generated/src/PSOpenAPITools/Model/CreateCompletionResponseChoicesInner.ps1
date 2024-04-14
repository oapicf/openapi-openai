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

.PARAMETER FinishReason
The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. 
.PARAMETER Index
No description available.
.PARAMETER Logprobs
No description available.
.PARAMETER Text
No description available.
.OUTPUTS

CreateCompletionResponseChoicesInner<PSCustomObject>
#>

function Initialize-CreateCompletionResponseChoicesInner {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("stop", "length", "content_filter")]
        [String]
        ${FinishReason},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Int32]
        ${Index},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Logprobs},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Text}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CreateCompletionResponseChoicesInner' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $FinishReason) {
            throw "invalid value for 'FinishReason', 'FinishReason' cannot be null."
        }

        if ($null -eq $Index) {
            throw "invalid value for 'Index', 'Index' cannot be null."
        }

        if ($null -eq $Text) {
            throw "invalid value for 'Text', 'Text' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "finish_reason" = ${FinishReason}
            "index" = ${Index}
            "logprobs" = ${Logprobs}
            "text" = ${Text}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CreateCompletionResponseChoicesInner<PSCustomObject>

.DESCRIPTION

Convert from JSON to CreateCompletionResponseChoicesInner<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CreateCompletionResponseChoicesInner<PSCustomObject>
#>
function ConvertFrom-JsonToCreateCompletionResponseChoicesInner {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CreateCompletionResponseChoicesInner' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CreateCompletionResponseChoicesInner
        $AllProperties = ("finish_reason", "index", "logprobs", "text")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'finish_reason' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "finish_reason"))) {
            throw "Error! JSON cannot be serialized due to the required property 'finish_reason' missing."
        } else {
            $FinishReason = $JsonParameters.PSobject.Properties["finish_reason"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "index"))) {
            throw "Error! JSON cannot be serialized due to the required property 'index' missing."
        } else {
            $Index = $JsonParameters.PSobject.Properties["index"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "logprobs"))) {
            throw "Error! JSON cannot be serialized due to the required property 'logprobs' missing."
        } else {
            $Logprobs = $JsonParameters.PSobject.Properties["logprobs"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "text"))) {
            throw "Error! JSON cannot be serialized due to the required property 'text' missing."
        } else {
            $Text = $JsonParameters.PSobject.Properties["text"].value
        }

        $PSO = [PSCustomObject]@{
            "finish_reason" = ${FinishReason}
            "index" = ${Index}
            "logprobs" = ${Logprobs}
            "text" = ${Text}
        }

        return $PSO
    }

}

