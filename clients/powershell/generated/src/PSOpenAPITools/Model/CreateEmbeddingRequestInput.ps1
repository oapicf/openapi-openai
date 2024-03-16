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

Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a single request, pass an array of strings or array of token arrays. Each input must not exceed the max input tokens for the model (8191 tokens for `text-embedding-ada-002`). [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 

.PARAMETER Json

JSON object

.OUTPUTS

CreateEmbeddingRequestInput<PSCustomObject>
#>
function ConvertFrom-JsonToCreateEmbeddingRequestInput {
    [CmdletBinding()]
    Param (
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        $match = 0
        $matchType = $null
        $matchInstance = $null

        # try to match Int32[] defined in the oneOf schemas
        try {
            $matchInstance = ConvertFrom-JsonToInt32[] $Json

            foreach($property in $matchInstance.PsObject.Properties) {
                if ($null -ne $property.Value) {
                    $matchType = "Int32[]"
                    $match++
                    break
                }
            }
        } catch {
            # fail to match the schema defined in oneOf, proceed to the next one
            Write-Debug "Failed to match 'Int32[]' defined in oneOf (CreateEmbeddingRequestInput). Proceeding to the next one if any."
        }

        # try to match Int32[][] defined in the oneOf schemas
        try {
            $matchInstance = ConvertFrom-JsonToInt32[][] $Json

            foreach($property in $matchInstance.PsObject.Properties) {
                if ($null -ne $property.Value) {
                    $matchType = "Int32[][]"
                    $match++
                    break
                }
            }
        } catch {
            # fail to match the schema defined in oneOf, proceed to the next one
            Write-Debug "Failed to match 'Int32[][]' defined in oneOf (CreateEmbeddingRequestInput). Proceeding to the next one if any."
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
            Write-Debug "Failed to match 'String' defined in oneOf (CreateEmbeddingRequestInput). Proceeding to the next one if any."
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
            Write-Debug "Failed to match 'String[]' defined in oneOf (CreateEmbeddingRequestInput). Proceeding to the next one if any."
        }

        if ($match -gt 1) {
            throw "Error! The JSON payload matches more than one type defined in oneOf schemas ([Int32[], Int32[][], String, String[]]). JSON Payload: $($Json)"
        } elseif ($match -eq 1) {
            return [PSCustomObject]@{
                "ActualType" = ${matchType}
                "ActualInstance" = ${matchInstance}
                "OneOfSchemas" = @("Int32[]", "Int32[][]", "String", "String[]")
            }
        } else {
            throw "Error! The JSON payload doesn't matches any type defined in oneOf schemas ([Int32[], Int32[][], String, String[]]). JSON Payload: $($Json)"
        }
    }
}

