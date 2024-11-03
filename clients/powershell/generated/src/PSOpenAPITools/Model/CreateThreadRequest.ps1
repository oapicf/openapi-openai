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

.PARAMETER Messages
A list of [messages](/docs/api-reference/messages) to start the thread with.
.PARAMETER Metadata
Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
.OUTPUTS

CreateThreadRequest<PSCustomObject>
#>

function Initialize-CreateThreadRequest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Messages},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Metadata}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CreateThreadRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "messages" = ${Messages}
            "metadata" = ${Metadata}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CreateThreadRequest<PSCustomObject>

.DESCRIPTION

Convert from JSON to CreateThreadRequest<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CreateThreadRequest<PSCustomObject>
#>
function ConvertFrom-JsonToCreateThreadRequest {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CreateThreadRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CreateThreadRequest
        $AllProperties = ("messages", "metadata")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "messages"))) { #optional property not found
            $Messages = $null
        } else {
            $Messages = $JsonParameters.PSobject.Properties["messages"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "metadata"))) { #optional property not found
            $Metadata = $null
        } else {
            $Metadata = $JsonParameters.PSobject.Properties["metadata"].value
        }

        $PSO = [PSCustomObject]@{
            "messages" = ${Messages}
            "metadata" = ${Metadata}
        }

        return $PSO
    }

}

