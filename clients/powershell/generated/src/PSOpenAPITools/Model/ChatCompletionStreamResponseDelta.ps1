#
# OpenAI API
# APIs for sampling from and fine-tuning language models
# Version: 2.0.0
# Contact: blah+oapicf@cliffano.com
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

No summary available.

.DESCRIPTION

No description available.

.PARAMETER Role
The role of the author of this message.
.PARAMETER Content
The contents of the chunk message.
.PARAMETER FunctionCall
No description available.
.OUTPUTS

ChatCompletionStreamResponseDelta<PSCustomObject>
#>

function Initialize-ChatCompletionStreamResponseDelta {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("system", "user", "assistant", "function")]
        [String]
        ${Role},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Content},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${FunctionCall}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => ChatCompletionStreamResponseDelta' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "role" = ${Role}
            "content" = ${Content}
            "function_call" = ${FunctionCall}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to ChatCompletionStreamResponseDelta<PSCustomObject>

.DESCRIPTION

Convert from JSON to ChatCompletionStreamResponseDelta<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

ChatCompletionStreamResponseDelta<PSCustomObject>
#>
function ConvertFrom-JsonToChatCompletionStreamResponseDelta {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => ChatCompletionStreamResponseDelta' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in ChatCompletionStreamResponseDelta
        $AllProperties = ("role", "content", "function_call")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "role"))) { #optional property not found
            $Role = $null
        } else {
            $Role = $JsonParameters.PSobject.Properties["role"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "content"))) { #optional property not found
            $Content = $null
        } else {
            $Content = $JsonParameters.PSobject.Properties["content"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "function_call"))) { #optional property not found
            $FunctionCall = $null
        } else {
            $FunctionCall = $JsonParameters.PSobject.Properties["function_call"].value
        }

        $PSO = [PSCustomObject]@{
            "role" = ${Role}
            "content" = ${Content}
            "function_call" = ${FunctionCall}
        }

        return $PSO
    }

}

