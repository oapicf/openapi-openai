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

The name of the base model to fine-tune. You can select one of ""ada"", ""babbage"", ""curie"", ""davinci"", or a fine-tuned model created after 2022-04-21. To learn more about these models, see the [Models](https://platform.openai.com/docs/models) documentation. 

.PARAMETER Json

JSON object

.OUTPUTS

CreateFineTuneRequestModel<PSCustomObject>
#>
function ConvertFrom-JsonToCreateFineTuneRequestModel {
    [CmdletBinding()]
    Param (
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        $match = 0
        $matchType = $null
        $matchInstance = $null

        # nullable check
        if ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") {
            return [PSCustomObject]@{
                "ActualType" = $null
                "ActualInstance" = $null
                "OneOfSchemas" = @("String")
            }
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
            Write-Debug "Failed to match 'String' defined in oneOf (CreateFineTuneRequestModel). Proceeding to the next one if any."
        }

        if ($match -gt 1) {
            throw "Error! The JSON payload matches more than one type defined in oneOf schemas ([String]). JSON Payload: $($Json)"
        } elseif ($match -eq 1) {
            return [PSCustomObject]@{
                "ActualType" = ${matchType}
                "ActualInstance" = ${matchInstance}
                "OneOfSchemas" = @("String")
            }
        } else {
            throw "Error! The JSON payload doesn't matches any type defined in oneOf schemas ([String]). JSON Payload: $($Json)"
        }
    }
}
