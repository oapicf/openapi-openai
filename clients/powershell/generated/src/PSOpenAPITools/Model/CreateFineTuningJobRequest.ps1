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

.PARAMETER Model
No description available.
.PARAMETER TrainingFile
The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
.PARAMETER Hyperparameters
No description available.
.PARAMETER Suffix
A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a `suffix` of ""custom-model-name"" would produce a model name like `ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel`. 
.PARAMETER ValidationFile
The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
.PARAMETER Integrations
A list of integrations to enable for your fine-tuning job.
.PARAMETER Seed
The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. 
.OUTPUTS

CreateFineTuningJobRequest<PSCustomObject>
#>

function Initialize-CreateFineTuningJobRequest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Model},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TrainingFile},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Hyperparameters},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Suffix},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ValidationFile},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Integrations},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${Seed}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CreateFineTuningJobRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Model) {
            throw "invalid value for 'Model', 'Model' cannot be null."
        }

        if ($null -eq $TrainingFile) {
            throw "invalid value for 'TrainingFile', 'TrainingFile' cannot be null."
        }

        if (!$Suffix -and $Suffix.length -gt 40) {
            throw "invalid value for 'Suffix', the character length must be smaller than or equal to 40."
        }

        if (!$Suffix -and $Suffix.length -lt 1) {
            throw "invalid value for 'Suffix', the character length must be great than or equal to 1."
        }

        if ($Seed -and $Seed -gt 2147483647) {
          throw "invalid value for 'Seed', must be smaller than or equal to 2147483647."
        }

        if ($Seed -and $Seed -lt 0) {
          throw "invalid value for 'Seed', must be greater than or equal to 0."
        }


        $PSO = [PSCustomObject]@{
            "model" = ${Model}
            "training_file" = ${TrainingFile}
            "hyperparameters" = ${Hyperparameters}
            "suffix" = ${Suffix}
            "validation_file" = ${ValidationFile}
            "integrations" = ${Integrations}
            "seed" = ${Seed}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CreateFineTuningJobRequest<PSCustomObject>

.DESCRIPTION

Convert from JSON to CreateFineTuningJobRequest<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CreateFineTuningJobRequest<PSCustomObject>
#>
function ConvertFrom-JsonToCreateFineTuningJobRequest {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CreateFineTuningJobRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CreateFineTuningJobRequest
        $AllProperties = ("model", "training_file", "hyperparameters", "suffix", "validation_file", "integrations", "seed")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'model' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "model"))) {
            throw "Error! JSON cannot be serialized due to the required property 'model' missing."
        } else {
            $Model = $JsonParameters.PSobject.Properties["model"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "training_file"))) {
            throw "Error! JSON cannot be serialized due to the required property 'training_file' missing."
        } else {
            $TrainingFile = $JsonParameters.PSobject.Properties["training_file"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "hyperparameters"))) { #optional property not found
            $Hyperparameters = $null
        } else {
            $Hyperparameters = $JsonParameters.PSobject.Properties["hyperparameters"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "suffix"))) { #optional property not found
            $Suffix = $null
        } else {
            $Suffix = $JsonParameters.PSobject.Properties["suffix"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "validation_file"))) { #optional property not found
            $ValidationFile = $null
        } else {
            $ValidationFile = $JsonParameters.PSobject.Properties["validation_file"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "integrations"))) { #optional property not found
            $Integrations = $null
        } else {
            $Integrations = $JsonParameters.PSobject.Properties["integrations"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "seed"))) { #optional property not found
            $Seed = $null
        } else {
            $Seed = $JsonParameters.PSobject.Properties["seed"].value
        }

        $PSO = [PSCustomObject]@{
            "model" = ${Model}
            "training_file" = ${TrainingFile}
            "hyperparameters" = ${Hyperparameters}
            "suffix" = ${Suffix}
            "validation_file" = ${ValidationFile}
            "integrations" = ${Integrations}
            "seed" = ${Seed}
        }

        return $PSO
    }

}
