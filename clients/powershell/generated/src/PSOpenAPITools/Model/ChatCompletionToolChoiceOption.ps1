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

Controls which (if any) function is called by the model. `none` means the model will not call a function and instead generates a message. `auto` means the model can pick between generating a message or calling a function. Specifying a particular function via `{""type"": ""function"", ""function"": {""name"": ""my_function""}}` forces the model to call that function.  `none` is the default when no functions are present. `auto` is the default if functions are present. 

.PARAMETER Json

JSON object

.OUTPUTS

ChatCompletionToolChoiceOption<PSCustomObject>
#>
function ConvertFrom-JsonToChatCompletionToolChoiceOption {
    [CmdletBinding()]
    Param (
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        $match = 0
        $matchType = $null
        $matchInstance = $null

        # try to match ChatCompletionNamedToolChoice defined in the oneOf schemas
        try {
            $matchInstance = ConvertFrom-JsonToChatCompletionNamedToolChoice $Json

            foreach($property in $matchInstance.PsObject.Properties) {
                if ($null -ne $property.Value) {
                    $matchType = "ChatCompletionNamedToolChoice"
                    $match++
                    break
                }
            }
        } catch {
            # fail to match the schema defined in oneOf, proceed to the next one
            Write-Debug "Failed to match 'ChatCompletionNamedToolChoice' defined in oneOf (ChatCompletionToolChoiceOption). Proceeding to the next one if any."
        }

        # try to match String defined in the oneOf schemas
        try {
            $matchInstance = ConvertFrom-JsonToString $Json

            foreach($property in $matchInstance.PsObject.Properties) {
                if ($null -ne $property.Value) {
                    $matchType = "String"
                    $match++
                    break
                }
            }
        } catch {
            # fail to match the schema defined in oneOf, proceed to the next one
            Write-Debug "Failed to match 'String' defined in oneOf (ChatCompletionToolChoiceOption). Proceeding to the next one if any."
        }

        if ($match -gt 1) {
            throw "Error! The JSON payload matches more than one type defined in oneOf schemas ([ChatCompletionNamedToolChoice, String]). JSON Payload: $($Json)"
        } elseif ($match -eq 1) {
            return [PSCustomObject]@{
                "ActualType" = ${matchType}
                "ActualInstance" = ${matchInstance}
                "OneOfSchemas" = @("ChatCompletionNamedToolChoice", "String")
            }
        } else {
            throw "Error! The JSON payload doesn't matches any type defined in oneOf schemas ([ChatCompletionNamedToolChoice, String]). JSON Payload: $($Json)"
        }
    }
}

