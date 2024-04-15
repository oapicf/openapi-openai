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

MessageContentTextObjectTextAnnotationsInner<PSCustomObject>
#>
function ConvertFrom-JsonToMessageContentTextObjectTextAnnotationsInner {
    [CmdletBinding()]
    Param (
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        $match = 0
        $matchType = $null
        $matchInstance = $null

        # try to match MessageContentTextAnnotationsFileCitationObject defined in the oneOf schemas
        try {
            $matchInstance = ConvertFrom-JsonToMessageContentTextAnnotationsFileCitationObject $Json

            foreach($property in $matchInstance.PsObject.Properties) {
                if ($null -ne $property.Value) {
                    $matchType = "MessageContentTextAnnotationsFileCitationObject"
                    $match++
                    break
                }
            }
        } catch {
            # fail to match the schema defined in oneOf, proceed to the next one
            Write-Debug "Failed to match 'MessageContentTextAnnotationsFileCitationObject' defined in oneOf (MessageContentTextObjectTextAnnotationsInner). Proceeding to the next one if any."
        }

        # try to match MessageContentTextAnnotationsFilePathObject defined in the oneOf schemas
        try {
            $matchInstance = ConvertFrom-JsonToMessageContentTextAnnotationsFilePathObject $Json

            foreach($property in $matchInstance.PsObject.Properties) {
                if ($null -ne $property.Value) {
                    $matchType = "MessageContentTextAnnotationsFilePathObject"
                    $match++
                    break
                }
            }
        } catch {
            # fail to match the schema defined in oneOf, proceed to the next one
            Write-Debug "Failed to match 'MessageContentTextAnnotationsFilePathObject' defined in oneOf (MessageContentTextObjectTextAnnotationsInner). Proceeding to the next one if any."
        }

        if ($match -gt 1) {
            throw "Error! The JSON payload matches more than one type defined in oneOf schemas ([MessageContentTextAnnotationsFileCitationObject, MessageContentTextAnnotationsFilePathObject]). JSON Payload: $($Json)"
        } elseif ($match -eq 1) {
            return [PSCustomObject]@{
                "ActualType" = ${matchType}
                "ActualInstance" = ${matchInstance}
                "OneOfSchemas" = @("MessageContentTextAnnotationsFileCitationObject", "MessageContentTextAnnotationsFilePathObject")
            }
        } else {
            throw "Error! The JSON payload doesn't matches any type defined in oneOf schemas ([MessageContentTextAnnotationsFileCitationObject, MessageContentTextAnnotationsFilePathObject]). JSON Payload: $($Json)"
        }
    }
}
