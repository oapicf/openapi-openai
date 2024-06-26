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

Represents an embedding vector returned by embedding endpoint. 

.PARAMETER Index
The index of the embedding in the list of embeddings.
.PARAMETER Embedding
The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). 
.PARAMETER Object
The object type, which is always ""embedding"".
.OUTPUTS

Embedding<PSCustomObject>
#>

function Initialize-Embedding {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Int32]
        ${Index},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Decimal[]]
        ${Embedding},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("embedding")]
        [String]
        ${Object}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => Embedding' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Index) {
            throw "invalid value for 'Index', 'Index' cannot be null."
        }

        if ($null -eq $Embedding) {
            throw "invalid value for 'Embedding', 'Embedding' cannot be null."
        }

        if ($null -eq $Object) {
            throw "invalid value for 'Object', 'Object' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "index" = ${Index}
            "embedding" = ${Embedding}
            "object" = ${Object}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to Embedding<PSCustomObject>

.DESCRIPTION

Convert from JSON to Embedding<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

Embedding<PSCustomObject>
#>
function ConvertFrom-JsonToEmbedding {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => Embedding' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in Embedding
        $AllProperties = ("index", "embedding", "object")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'index' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "index"))) {
            throw "Error! JSON cannot be serialized due to the required property 'index' missing."
        } else {
            $Index = $JsonParameters.PSobject.Properties["index"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "embedding"))) {
            throw "Error! JSON cannot be serialized due to the required property 'embedding' missing."
        } else {
            $Embedding = $JsonParameters.PSobject.Properties["embedding"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "object"))) {
            throw "Error! JSON cannot be serialized due to the required property 'object' missing."
        } else {
            $Object = $JsonParameters.PSobject.Properties["object"].value
        }

        $PSO = [PSCustomObject]@{
            "index" = ${Index}
            "embedding" = ${Embedding}
            "object" = ${Object}
        }

        return $PSO
    }

}

