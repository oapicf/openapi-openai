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

.PARAMETER TextOffset
No description available.
.PARAMETER TokenLogprobs
No description available.
.PARAMETER Tokens
No description available.
.PARAMETER TopLogprobs
No description available.
.OUTPUTS

CreateCompletionResponseChoicesInnerLogprobs<PSCustomObject>
#>

function Initialize-CreateCompletionResponseChoicesInnerLogprobs {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Int32[]]
        ${TextOffset},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Decimal[]]
        ${TokenLogprobs},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${Tokens},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Collections.Hashtable[]]
        ${TopLogprobs}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CreateCompletionResponseChoicesInnerLogprobs' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "text_offset" = ${TextOffset}
            "token_logprobs" = ${TokenLogprobs}
            "tokens" = ${Tokens}
            "top_logprobs" = ${TopLogprobs}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CreateCompletionResponseChoicesInnerLogprobs<PSCustomObject>

.DESCRIPTION

Convert from JSON to CreateCompletionResponseChoicesInnerLogprobs<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CreateCompletionResponseChoicesInnerLogprobs<PSCustomObject>
#>
function ConvertFrom-JsonToCreateCompletionResponseChoicesInnerLogprobs {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CreateCompletionResponseChoicesInnerLogprobs' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CreateCompletionResponseChoicesInnerLogprobs
        $AllProperties = ("text_offset", "token_logprobs", "tokens", "top_logprobs")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "text_offset"))) { #optional property not found
            $TextOffset = $null
        } else {
            $TextOffset = $JsonParameters.PSobject.Properties["text_offset"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "token_logprobs"))) { #optional property not found
            $TokenLogprobs = $null
        } else {
            $TokenLogprobs = $JsonParameters.PSobject.Properties["token_logprobs"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "tokens"))) { #optional property not found
            $Tokens = $null
        } else {
            $Tokens = $JsonParameters.PSobject.Properties["tokens"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "top_logprobs"))) { #optional property not found
            $TopLogprobs = $null
        } else {
            $TopLogprobs = $JsonParameters.PSobject.Properties["top_logprobs"].value
        }

        $PSO = [PSCustomObject]@{
            "text_offset" = ${TextOffset}
            "token_logprobs" = ${TokenLogprobs}
            "tokens" = ${Tokens}
            "top_logprobs" = ${TopLogprobs}
        }

        return $PSO
    }

}

