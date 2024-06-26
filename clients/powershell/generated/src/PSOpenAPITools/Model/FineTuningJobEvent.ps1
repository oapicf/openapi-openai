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

Fine-tuning job event object

.PARAMETER Id
No description available.
.PARAMETER CreatedAt
No description available.
.PARAMETER Level
No description available.
.PARAMETER Message
No description available.
.PARAMETER Object
No description available.
.OUTPUTS

FineTuningJobEvent<PSCustomObject>
#>

function Initialize-FineTuningJobEvent {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Id},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Int32]
        ${CreatedAt},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("info", "warn", "error")]
        [String]
        ${Level},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Message},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("fine_tuning.job.event")]
        [String]
        ${Object}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => FineTuningJobEvent' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Id) {
            throw "invalid value for 'Id', 'Id' cannot be null."
        }

        if ($null -eq $CreatedAt) {
            throw "invalid value for 'CreatedAt', 'CreatedAt' cannot be null."
        }

        if ($null -eq $Level) {
            throw "invalid value for 'Level', 'Level' cannot be null."
        }

        if ($null -eq $Message) {
            throw "invalid value for 'Message', 'Message' cannot be null."
        }

        if ($null -eq $Object) {
            throw "invalid value for 'Object', 'Object' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "created_at" = ${CreatedAt}
            "level" = ${Level}
            "message" = ${Message}
            "object" = ${Object}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to FineTuningJobEvent<PSCustomObject>

.DESCRIPTION

Convert from JSON to FineTuningJobEvent<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

FineTuningJobEvent<PSCustomObject>
#>
function ConvertFrom-JsonToFineTuningJobEvent {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => FineTuningJobEvent' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in FineTuningJobEvent
        $AllProperties = ("id", "created_at", "level", "message", "object")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "created_at"))) {
            throw "Error! JSON cannot be serialized due to the required property 'created_at' missing."
        } else {
            $CreatedAt = $JsonParameters.PSobject.Properties["created_at"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "level"))) {
            throw "Error! JSON cannot be serialized due to the required property 'level' missing."
        } else {
            $Level = $JsonParameters.PSobject.Properties["level"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "message"))) {
            throw "Error! JSON cannot be serialized due to the required property 'message' missing."
        } else {
            $Message = $JsonParameters.PSobject.Properties["message"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "object"))) {
            throw "Error! JSON cannot be serialized due to the required property 'object' missing."
        } else {
            $Object = $JsonParameters.PSobject.Properties["object"].value
        }

        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "created_at" = ${CreatedAt}
            "level" = ${Level}
            "message" = ${Message}
            "object" = ${Object}
        }

        return $PSO
    }

}

