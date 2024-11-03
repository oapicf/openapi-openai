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

.PARAMETER VarInput
No description available.
.PARAMETER Model
No description available.
.PARAMETER EncodingFormat
The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
.PARAMETER Dimensions
The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. 
.PARAMETER User
A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
.OUTPUTS

CreateEmbeddingRequest<PSCustomObject>
#>

function Initialize-CreateEmbeddingRequest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${VarInput},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Model},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("float", "base64")]
        [String]
        ${EncodingFormat} = "float",
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${Dimensions},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${User}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CreateEmbeddingRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $VarInput) {
            throw "invalid value for 'VarInput', 'VarInput' cannot be null."
        }

        if ($null -eq $Model) {
            throw "invalid value for 'Model', 'Model' cannot be null."
        }

        if ($Dimensions -and $Dimensions -lt 1) {
          throw "invalid value for 'Dimensions', must be greater than or equal to 1."
        }


        $PSO = [PSCustomObject]@{
            "input" = ${VarInput}
            "model" = ${Model}
            "encoding_format" = ${EncodingFormat}
            "dimensions" = ${Dimensions}
            "user" = ${User}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CreateEmbeddingRequest<PSCustomObject>

.DESCRIPTION

Convert from JSON to CreateEmbeddingRequest<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CreateEmbeddingRequest<PSCustomObject>
#>
function ConvertFrom-JsonToCreateEmbeddingRequest {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CreateEmbeddingRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CreateEmbeddingRequest
        $AllProperties = ("input", "model", "encoding_format", "dimensions", "user")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'input' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "input"))) {
            throw "Error! JSON cannot be serialized due to the required property 'input' missing."
        } else {
            $VarInput = $JsonParameters.PSobject.Properties["input"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "model"))) {
            throw "Error! JSON cannot be serialized due to the required property 'model' missing."
        } else {
            $Model = $JsonParameters.PSobject.Properties["model"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "encoding_format"))) { #optional property not found
            $EncodingFormat = $null
        } else {
            $EncodingFormat = $JsonParameters.PSobject.Properties["encoding_format"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "dimensions"))) { #optional property not found
            $Dimensions = $null
        } else {
            $Dimensions = $JsonParameters.PSobject.Properties["dimensions"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "user"))) { #optional property not found
            $User = $null
        } else {
            $User = $JsonParameters.PSobject.Properties["user"].value
        }

        $PSO = [PSCustomObject]@{
            "input" = ${VarInput}
            "model" = ${Model}
            "encoding_format" = ${EncodingFormat}
            "dimensions" = ${Dimensions}
            "user" = ${User}
        }

        return $PSO
    }

}

