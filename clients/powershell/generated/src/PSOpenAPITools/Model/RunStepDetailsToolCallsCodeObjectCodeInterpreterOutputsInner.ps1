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

RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner<PSCustomObject>
#>
function ConvertFrom-JsonToRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {
    [CmdletBinding()]
    Param (
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        $match = 0
        $matchType = $null
        $matchInstance = $null

        # try to match RunStepDetailsToolCallsCodeOutputImageObject defined in the oneOf schemas
        try {
            $matchInstance = ConvertFrom-JsonToRunStepDetailsToolCallsCodeOutputImageObject $Json

            foreach($property in $matchInstance.PsObject.Properties) {
                if ($null -ne $property.Value) {
                    $matchType = "RunStepDetailsToolCallsCodeOutputImageObject"
                    $match++
                    break
                }
            }
        } catch {
            # fail to match the schema defined in oneOf, proceed to the next one
            Write-Debug "Failed to match 'RunStepDetailsToolCallsCodeOutputImageObject' defined in oneOf (RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner). Proceeding to the next one if any."
        }

        # try to match RunStepDetailsToolCallsCodeOutputLogsObject defined in the oneOf schemas
        try {
            $matchInstance = ConvertFrom-JsonToRunStepDetailsToolCallsCodeOutputLogsObject $Json

            foreach($property in $matchInstance.PsObject.Properties) {
                if ($null -ne $property.Value) {
                    $matchType = "RunStepDetailsToolCallsCodeOutputLogsObject"
                    $match++
                    break
                }
            }
        } catch {
            # fail to match the schema defined in oneOf, proceed to the next one
            Write-Debug "Failed to match 'RunStepDetailsToolCallsCodeOutputLogsObject' defined in oneOf (RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner). Proceeding to the next one if any."
        }

        if ($match -gt 1) {
            throw "Error! The JSON payload matches more than one type defined in oneOf schemas ([RunStepDetailsToolCallsCodeOutputImageObject, RunStepDetailsToolCallsCodeOutputLogsObject]). JSON Payload: $($Json)"
        } elseif ($match -eq 1) {
            return [PSCustomObject]@{
                "ActualType" = ${matchType}
                "ActualInstance" = ${matchInstance}
                "OneOfSchemas" = @("RunStepDetailsToolCallsCodeOutputImageObject", "RunStepDetailsToolCallsCodeOutputLogsObject")
            }
        } else {
            throw "Error! The JSON payload doesn't matches any type defined in oneOf schemas ([RunStepDetailsToolCallsCodeOutputImageObject, RunStepDetailsToolCallsCodeOutputLogsObject]). JSON Payload: $($Json)"
        }
    }
}
