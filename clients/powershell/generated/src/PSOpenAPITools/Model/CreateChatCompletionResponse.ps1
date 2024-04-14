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

Represents a chat completion response returned by model, based on the provided input.

.PARAMETER Id
A unique identifier for the chat completion.
.PARAMETER Choices
A list of chat completion choices. Can be more than one if `n` is greater than 1.
.PARAMETER Created
The Unix timestamp (in seconds) of when the chat completion was created.
.PARAMETER Model
The model used for the chat completion.
.PARAMETER SystemFingerprint
This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
.PARAMETER Object
The object type, which is always `chat.completion`.
.PARAMETER Usage
No description available.
.OUTPUTS

CreateChatCompletionResponse<PSCustomObject>
#>

function Initialize-CreateChatCompletionResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Id},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Choices},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [Int32]
        ${Created},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Model},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${SystemFingerprint},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("chat.completion")]
        [String]
        ${Object},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Usage}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CreateChatCompletionResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Id) {
            throw "invalid value for 'Id', 'Id' cannot be null."
        }

        if ($null -eq $Choices) {
            throw "invalid value for 'Choices', 'Choices' cannot be null."
        }

        if ($null -eq $Created) {
            throw "invalid value for 'Created', 'Created' cannot be null."
        }

        if ($null -eq $Model) {
            throw "invalid value for 'Model', 'Model' cannot be null."
        }

        if ($null -eq $Object) {
            throw "invalid value for 'Object', 'Object' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "choices" = ${Choices}
            "created" = ${Created}
            "model" = ${Model}
            "system_fingerprint" = ${SystemFingerprint}
            "object" = ${Object}
            "usage" = ${Usage}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CreateChatCompletionResponse<PSCustomObject>

.DESCRIPTION

Convert from JSON to CreateChatCompletionResponse<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CreateChatCompletionResponse<PSCustomObject>
#>
function ConvertFrom-JsonToCreateChatCompletionResponse {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CreateChatCompletionResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CreateChatCompletionResponse
        $AllProperties = ("id", "choices", "created", "model", "system_fingerprint", "object", "usage")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'id' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "id"))) {
            throw "Error! JSON cannot be serialized due to the required property 'id' missing."
        } else {
            $Id = $JsonParameters.PSobject.Properties["id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "choices"))) {
            throw "Error! JSON cannot be serialized due to the required property 'choices' missing."
        } else {
            $Choices = $JsonParameters.PSobject.Properties["choices"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "created"))) {
            throw "Error! JSON cannot be serialized due to the required property 'created' missing."
        } else {
            $Created = $JsonParameters.PSobject.Properties["created"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "model"))) {
            throw "Error! JSON cannot be serialized due to the required property 'model' missing."
        } else {
            $Model = $JsonParameters.PSobject.Properties["model"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "object"))) {
            throw "Error! JSON cannot be serialized due to the required property 'object' missing."
        } else {
            $Object = $JsonParameters.PSobject.Properties["object"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "system_fingerprint"))) { #optional property not found
            $SystemFingerprint = $null
        } else {
            $SystemFingerprint = $JsonParameters.PSobject.Properties["system_fingerprint"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "usage"))) { #optional property not found
            $Usage = $null
        } else {
            $Usage = $JsonParameters.PSobject.Properties["usage"].value
        }

        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "choices" = ${Choices}
            "created" = ${Created}
            "model" = ${Model}
            "system_fingerprint" = ${SystemFingerprint}
            "object" = ${Object}
            "usage" = ${Usage}
        }

        return $PSO
    }

}

