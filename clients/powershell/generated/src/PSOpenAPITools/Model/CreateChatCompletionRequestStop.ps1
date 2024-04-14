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

Up to 4 sequences where the API will stop generating further tokens. 

.PARAMETER Json

JSON object

.OUTPUTS

CreateChatCompletionRequestStop<PSCustomObject>
#>
function ConvertFrom-JsonToCreateChatCompletionRequestStop {
    [CmdletBinding()]
    Param (
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        $match = 0
        $matchType = $null
        $matchInstance = $null

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
            Write-Debug "Failed to match 'String' defined in oneOf (CreateChatCompletionRequestStop). Proceeding to the next one if any."
        }

        # try to match String[] defined in the oneOf schemas
        try {
            $matchInstance = ConvertFrom-JsonToString[] $Json

            foreach($property in $matchInstance.PsObject.Properties) {
                if ($null -ne $property.Value) {
                    $matchType = "String[]"
                    $match++
                    break
                }
            }
        } catch {
            # fail to match the schema defined in oneOf, proceed to the next one
            Write-Debug "Failed to match 'String[]' defined in oneOf (CreateChatCompletionRequestStop). Proceeding to the next one if any."
        }

        if ($match -gt 1) {
            throw "Error! The JSON payload matches more than one type defined in oneOf schemas ([String, String[]]). JSON Payload: $($Json)"
        } elseif ($match -eq 1) {
            return [PSCustomObject]@{
                "ActualType" = ${matchType}
                "ActualInstance" = ${matchInstance}
                "OneOfSchemas" = @("String", "String[]")
            }
        } else {
            throw "Error! The JSON payload doesn't matches any type defined in oneOf schemas ([String, String[]]). JSON Payload: $($Json)"
        }
    }
}

