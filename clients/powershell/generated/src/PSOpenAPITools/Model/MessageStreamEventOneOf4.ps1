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

Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed.

.PARAMETER VarEvent
No description available.
.PARAMETER VarData
No description available.
.OUTPUTS

MessageStreamEventOneOf4<PSCustomObject>
#>

function Initialize-MessageStreamEventOneOf4 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("thread.message.incomplete")]
        [String]
        ${VarEvent},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${VarData}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => MessageStreamEventOneOf4' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $VarEvent) {
            throw "invalid value for 'VarEvent', 'VarEvent' cannot be null."
        }

        if ($null -eq $VarData) {
            throw "invalid value for 'VarData', 'VarData' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "event" = ${VarEvent}
            "data" = ${VarData}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to MessageStreamEventOneOf4<PSCustomObject>

.DESCRIPTION

Convert from JSON to MessageStreamEventOneOf4<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

MessageStreamEventOneOf4<PSCustomObject>
#>
function ConvertFrom-JsonToMessageStreamEventOneOf4 {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => MessageStreamEventOneOf4' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in MessageStreamEventOneOf4
        $AllProperties = ("event", "data")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'event' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "event"))) {
            throw "Error! JSON cannot be serialized due to the required property 'event' missing."
        } else {
            $VarEvent = $JsonParameters.PSobject.Properties["event"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "data"))) {
            throw "Error! JSON cannot be serialized due to the required property 'data' missing."
        } else {
            $VarData = $JsonParameters.PSobject.Properties["data"].value
        }

        $PSO = [PSCustomObject]@{
            "event" = ${VarEvent}
            "data" = ${VarData}
        }

        return $PSO
    }

}
