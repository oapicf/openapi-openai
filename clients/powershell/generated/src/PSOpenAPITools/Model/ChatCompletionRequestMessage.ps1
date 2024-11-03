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

.PARAMETER Json

JSON object

.OUTPUTS

ChatCompletionRequestMessage<PSCustomObject>
#>
function ConvertFrom-JsonToChatCompletionRequestMessage {
    [CmdletBinding()]
    Param (
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        $match = 0
        $matchType = $null
        $matchInstance = $null

        # try to match ChatCompletionRequestAssistantMessage defined in the oneOf schemas
        try {
            $matchInstance = ConvertFrom-JsonToChatCompletionRequestAssistantMessage $Json

            foreach($property in $matchInstance.PsObject.Properties) {
                if ($null -ne $property.Value) {
                    $matchType = "ChatCompletionRequestAssistantMessage"
                    $match++
                    break
                }
            }
        } catch {
            # fail to match the schema defined in oneOf, proceed to the next one
            Write-Debug "Failed to match 'ChatCompletionRequestAssistantMessage' defined in oneOf (ChatCompletionRequestMessage). Proceeding to the next one if any."
        }

        # try to match ChatCompletionRequestFunctionMessage defined in the oneOf schemas
        try {
            $matchInstance = ConvertFrom-JsonToChatCompletionRequestFunctionMessage $Json

            foreach($property in $matchInstance.PsObject.Properties) {
                if ($null -ne $property.Value) {
                    $matchType = "ChatCompletionRequestFunctionMessage"
                    $match++
                    break
                }
            }
        } catch {
            # fail to match the schema defined in oneOf, proceed to the next one
            Write-Debug "Failed to match 'ChatCompletionRequestFunctionMessage' defined in oneOf (ChatCompletionRequestMessage). Proceeding to the next one if any."
        }

        # try to match ChatCompletionRequestSystemMessage defined in the oneOf schemas
        try {
            $matchInstance = ConvertFrom-JsonToChatCompletionRequestSystemMessage $Json

            foreach($property in $matchInstance.PsObject.Properties) {
                if ($null -ne $property.Value) {
                    $matchType = "ChatCompletionRequestSystemMessage"
                    $match++
                    break
                }
            }
        } catch {
            # fail to match the schema defined in oneOf, proceed to the next one
            Write-Debug "Failed to match 'ChatCompletionRequestSystemMessage' defined in oneOf (ChatCompletionRequestMessage). Proceeding to the next one if any."
        }

        # try to match ChatCompletionRequestToolMessage defined in the oneOf schemas
        try {
            $matchInstance = ConvertFrom-JsonToChatCompletionRequestToolMessage $Json

            foreach($property in $matchInstance.PsObject.Properties) {
                if ($null -ne $property.Value) {
                    $matchType = "ChatCompletionRequestToolMessage"
                    $match++
                    break
                }
            }
        } catch {
            # fail to match the schema defined in oneOf, proceed to the next one
            Write-Debug "Failed to match 'ChatCompletionRequestToolMessage' defined in oneOf (ChatCompletionRequestMessage). Proceeding to the next one if any."
        }

        # try to match ChatCompletionRequestUserMessage defined in the oneOf schemas
        try {
            $matchInstance = ConvertFrom-JsonToChatCompletionRequestUserMessage $Json

            foreach($property in $matchInstance.PsObject.Properties) {
                if ($null -ne $property.Value) {
                    $matchType = "ChatCompletionRequestUserMessage"
                    $match++
                    break
                }
            }
        } catch {
            # fail to match the schema defined in oneOf, proceed to the next one
            Write-Debug "Failed to match 'ChatCompletionRequestUserMessage' defined in oneOf (ChatCompletionRequestMessage). Proceeding to the next one if any."
        }

        if ($match -gt 1) {
            throw "Error! The JSON payload matches more than one type defined in oneOf schemas ([ChatCompletionRequestAssistantMessage, ChatCompletionRequestFunctionMessage, ChatCompletionRequestSystemMessage, ChatCompletionRequestToolMessage, ChatCompletionRequestUserMessage]). JSON Payload: $($Json)"
        } elseif ($match -eq 1) {
            return [PSCustomObject]@{
                "ActualType" = ${matchType}
                "ActualInstance" = ${matchInstance}
                "OneOfSchemas" = @("ChatCompletionRequestAssistantMessage", "ChatCompletionRequestFunctionMessage", "ChatCompletionRequestSystemMessage", "ChatCompletionRequestToolMessage", "ChatCompletionRequestUserMessage")
            }
        } else {
            throw "Error! The JSON payload doesn't matches any type defined in oneOf schemas ([ChatCompletionRequestAssistantMessage, ChatCompletionRequestFunctionMessage, ChatCompletionRequestSystemMessage, ChatCompletionRequestToolMessage, ChatCompletionRequestUserMessage]). JSON Payload: $($Json)"
        }
    }
}

