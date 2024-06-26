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

RunStepDeltaStepDetailsToolCallsObjectToolCallsInner<PSCustomObject>
#>
function ConvertFrom-JsonToRunStepDeltaStepDetailsToolCallsObjectToolCallsInner {
    [CmdletBinding()]
    Param (
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        $match = 0
        $matchType = $null
        $matchInstance = $null

        # try to match RunStepDeltaStepDetailsToolCallsCodeObject defined in the oneOf schemas
        try {
            $matchInstance = ConvertFrom-JsonToRunStepDeltaStepDetailsToolCallsCodeObject $Json

            foreach($property in $matchInstance.PsObject.Properties) {
                if ($null -ne $property.Value) {
                    $matchType = "RunStepDeltaStepDetailsToolCallsCodeObject"
                    $match++
                    break
                }
            }
        } catch {
            # fail to match the schema defined in oneOf, proceed to the next one
            Write-Debug "Failed to match 'RunStepDeltaStepDetailsToolCallsCodeObject' defined in oneOf (RunStepDeltaStepDetailsToolCallsObjectToolCallsInner). Proceeding to the next one if any."
        }

        # try to match RunStepDeltaStepDetailsToolCallsFunctionObject defined in the oneOf schemas
        try {
            $matchInstance = ConvertFrom-JsonToRunStepDeltaStepDetailsToolCallsFunctionObject $Json

            foreach($property in $matchInstance.PsObject.Properties) {
                if ($null -ne $property.Value) {
                    $matchType = "RunStepDeltaStepDetailsToolCallsFunctionObject"
                    $match++
                    break
                }
            }
        } catch {
            # fail to match the schema defined in oneOf, proceed to the next one
            Write-Debug "Failed to match 'RunStepDeltaStepDetailsToolCallsFunctionObject' defined in oneOf (RunStepDeltaStepDetailsToolCallsObjectToolCallsInner). Proceeding to the next one if any."
        }

        # try to match RunStepDeltaStepDetailsToolCallsRetrievalObject defined in the oneOf schemas
        try {
            $matchInstance = ConvertFrom-JsonToRunStepDeltaStepDetailsToolCallsRetrievalObject $Json

            foreach($property in $matchInstance.PsObject.Properties) {
                if ($null -ne $property.Value) {
                    $matchType = "RunStepDeltaStepDetailsToolCallsRetrievalObject"
                    $match++
                    break
                }
            }
        } catch {
            # fail to match the schema defined in oneOf, proceed to the next one
            Write-Debug "Failed to match 'RunStepDeltaStepDetailsToolCallsRetrievalObject' defined in oneOf (RunStepDeltaStepDetailsToolCallsObjectToolCallsInner). Proceeding to the next one if any."
        }

        if ($match -gt 1) {
            throw "Error! The JSON payload matches more than one type defined in oneOf schemas ([RunStepDeltaStepDetailsToolCallsCodeObject, RunStepDeltaStepDetailsToolCallsFunctionObject, RunStepDeltaStepDetailsToolCallsRetrievalObject]). JSON Payload: $($Json)"
        } elseif ($match -eq 1) {
            return [PSCustomObject]@{
                "ActualType" = ${matchType}
                "ActualInstance" = ${matchInstance}
                "OneOfSchemas" = @("RunStepDeltaStepDetailsToolCallsCodeObject", "RunStepDeltaStepDetailsToolCallsFunctionObject", "RunStepDeltaStepDetailsToolCallsRetrievalObject")
            }
        } else {
            throw "Error! The JSON payload doesn't matches any type defined in oneOf schemas ([RunStepDeltaStepDetailsToolCallsCodeObject, RunStepDeltaStepDetailsToolCallsFunctionObject, RunStepDeltaStepDetailsToolCallsRetrievalObject]). JSON Payload: $($Json)"
        }
    }
}

