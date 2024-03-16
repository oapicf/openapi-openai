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

The name and arguments of a function that should be called, as generated by the model.

.PARAMETER Name
The name of the function to call.
.PARAMETER Arguments
The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
.OUTPUTS

ChatCompletionRequestMessageFunctionCall<PSCustomObject>
#>

function Initialize-ChatCompletionRequestMessageFunctionCall {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Name},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Arguments}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => ChatCompletionRequestMessageFunctionCall' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "name" = ${Name}
            "arguments" = ${Arguments}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to ChatCompletionRequestMessageFunctionCall<PSCustomObject>

.DESCRIPTION

Convert from JSON to ChatCompletionRequestMessageFunctionCall<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

ChatCompletionRequestMessageFunctionCall<PSCustomObject>
#>
function ConvertFrom-JsonToChatCompletionRequestMessageFunctionCall {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => ChatCompletionRequestMessageFunctionCall' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in ChatCompletionRequestMessageFunctionCall
        $AllProperties = ("name", "arguments")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "name"))) { #optional property not found
            $Name = $null
        } else {
            $Name = $JsonParameters.PSobject.Properties["name"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "arguments"))) { #optional property not found
            $Arguments = $null
        } else {
            $Arguments = $JsonParameters.PSobject.Properties["arguments"].value
        }

        $PSO = [PSCustomObject]@{
            "name" = ${Name}
            "arguments" = ${Arguments}
        }

        return $PSO
    }

}

