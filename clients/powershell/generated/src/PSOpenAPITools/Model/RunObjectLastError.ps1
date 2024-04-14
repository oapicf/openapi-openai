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

The last error associated with this run. Will be `null` if there are no errors.

.PARAMETER Code
One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.
.PARAMETER Message
A human-readable description of the error.
.OUTPUTS

RunObjectLastError<PSCustomObject>
#>

function Initialize-RunObjectLastError {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("server_error", "rate_limit_exceeded", "invalid_prompt")]
        [String]
        ${Code},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Message}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => RunObjectLastError' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Code) {
            throw "invalid value for 'Code', 'Code' cannot be null."
        }

        if ($null -eq $Message) {
            throw "invalid value for 'Message', 'Message' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "code" = ${Code}
            "message" = ${Message}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to RunObjectLastError<PSCustomObject>

.DESCRIPTION

Convert from JSON to RunObjectLastError<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

RunObjectLastError<PSCustomObject>
#>
function ConvertFrom-JsonToRunObjectLastError {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => RunObjectLastError' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in RunObjectLastError
        $AllProperties = ("code", "message")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'code' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "code"))) {
            throw "Error! JSON cannot be serialized due to the required property 'code' missing."
        } else {
            $Code = $JsonParameters.PSobject.Properties["code"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "message"))) {
            throw "Error! JSON cannot be serialized due to the required property 'message' missing."
        } else {
            $Message = $JsonParameters.PSobject.Properties["message"].value
        }

        $PSO = [PSCustomObject]@{
            "code" = ${Code}
            "message" = ${Message}
        }

        return $PSO
    }

}

