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

The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.

.PARAMETER NEpochs
No description available.
.OUTPUTS

FineTuningJobHyperparameters<PSCustomObject>
#>

function Initialize-FineTuningJobHyperparameters {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${NEpochs}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => FineTuningJobHyperparameters' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $NEpochs) {
            throw "invalid value for 'NEpochs', 'NEpochs' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "n_epochs" = ${NEpochs}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to FineTuningJobHyperparameters<PSCustomObject>

.DESCRIPTION

Convert from JSON to FineTuningJobHyperparameters<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

FineTuningJobHyperparameters<PSCustomObject>
#>
function ConvertFrom-JsonToFineTuningJobHyperparameters {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => FineTuningJobHyperparameters' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in FineTuningJobHyperparameters
        $AllProperties = ("n_epochs")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'n_epochs' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "n_epochs"))) {
            throw "Error! JSON cannot be serialized due to the required property 'n_epochs' missing."
        } else {
            $NEpochs = $JsonParameters.PSobject.Properties["n_epochs"].value
        }

        $PSO = [PSCustomObject]@{
            "n_epochs" = ${NEpochs}
        }

        return $PSO
    }

}

