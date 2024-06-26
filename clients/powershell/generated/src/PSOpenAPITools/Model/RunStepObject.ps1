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

Represents a step in execution of a run. 

.PARAMETER Id
The identifier of the run step, which can be referenced in API endpoints.
.PARAMETER Object
The object type, which is always `thread.run.step`.
.PARAMETER CreatedAt
The Unix timestamp (in seconds) for when the run step was created.
.PARAMETER AssistantId
The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
.PARAMETER ThreadId
The ID of the [thread](/docs/api-reference/threads) that was run.
.PARAMETER RunId
The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
.PARAMETER Type
The type of run step, which can be either `message_creation` or `tool_calls`.
.PARAMETER Status
The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
.PARAMETER StepDetails
No description available.
.PARAMETER LastError
No description available.
.PARAMETER ExpiredAt
The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
.PARAMETER CancelledAt
The Unix timestamp (in seconds) for when the run step was cancelled.
.PARAMETER FailedAt
The Unix timestamp (in seconds) for when the run step failed.
.PARAMETER CompletedAt
The Unix timestamp (in seconds) for when the run step completed.
.PARAMETER Metadata
Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
.PARAMETER Usage
No description available.
.OUTPUTS

RunStepObject<PSCustomObject>
#>

function Initialize-RunStepObject {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Id},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("thread.run.step")]
        [String]
        ${Object},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [Int32]
        ${CreatedAt},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${AssistantId},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ThreadId},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${RunId},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("message_creation", "tool_calls")]
        [String]
        ${Type},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("in_progress", "cancelled", "failed", "completed", "expired")]
        [String]
        ${Status},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${StepDetails},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${LastError},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${ExpiredAt},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${CancelledAt},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${FailedAt},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${CompletedAt},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Metadata},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Usage}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => RunStepObject' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Id) {
            throw "invalid value for 'Id', 'Id' cannot be null."
        }

        if ($null -eq $Object) {
            throw "invalid value for 'Object', 'Object' cannot be null."
        }

        if ($null -eq $CreatedAt) {
            throw "invalid value for 'CreatedAt', 'CreatedAt' cannot be null."
        }

        if ($null -eq $AssistantId) {
            throw "invalid value for 'AssistantId', 'AssistantId' cannot be null."
        }

        if ($null -eq $ThreadId) {
            throw "invalid value for 'ThreadId', 'ThreadId' cannot be null."
        }

        if ($null -eq $RunId) {
            throw "invalid value for 'RunId', 'RunId' cannot be null."
        }

        if ($null -eq $Type) {
            throw "invalid value for 'Type', 'Type' cannot be null."
        }

        if ($null -eq $Status) {
            throw "invalid value for 'Status', 'Status' cannot be null."
        }

        if ($null -eq $StepDetails) {
            throw "invalid value for 'StepDetails', 'StepDetails' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "object" = ${Object}
            "created_at" = ${CreatedAt}
            "assistant_id" = ${AssistantId}
            "thread_id" = ${ThreadId}
            "run_id" = ${RunId}
            "type" = ${Type}
            "status" = ${Status}
            "step_details" = ${StepDetails}
            "last_error" = ${LastError}
            "expired_at" = ${ExpiredAt}
            "cancelled_at" = ${CancelledAt}
            "failed_at" = ${FailedAt}
            "completed_at" = ${CompletedAt}
            "metadata" = ${Metadata}
            "usage" = ${Usage}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to RunStepObject<PSCustomObject>

.DESCRIPTION

Convert from JSON to RunStepObject<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

RunStepObject<PSCustomObject>
#>
function ConvertFrom-JsonToRunStepObject {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => RunStepObject' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in RunStepObject
        $AllProperties = ("id", "object", "created_at", "assistant_id", "thread_id", "run_id", "type", "status", "step_details", "last_error", "expired_at", "cancelled_at", "failed_at", "completed_at", "metadata", "usage")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "object"))) {
            throw "Error! JSON cannot be serialized due to the required property 'object' missing."
        } else {
            $Object = $JsonParameters.PSobject.Properties["object"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "created_at"))) {
            throw "Error! JSON cannot be serialized due to the required property 'created_at' missing."
        } else {
            $CreatedAt = $JsonParameters.PSobject.Properties["created_at"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "assistant_id"))) {
            throw "Error! JSON cannot be serialized due to the required property 'assistant_id' missing."
        } else {
            $AssistantId = $JsonParameters.PSobject.Properties["assistant_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "thread_id"))) {
            throw "Error! JSON cannot be serialized due to the required property 'thread_id' missing."
        } else {
            $ThreadId = $JsonParameters.PSobject.Properties["thread_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "run_id"))) {
            throw "Error! JSON cannot be serialized due to the required property 'run_id' missing."
        } else {
            $RunId = $JsonParameters.PSobject.Properties["run_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "type"))) {
            throw "Error! JSON cannot be serialized due to the required property 'type' missing."
        } else {
            $Type = $JsonParameters.PSobject.Properties["type"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "status"))) {
            throw "Error! JSON cannot be serialized due to the required property 'status' missing."
        } else {
            $Status = $JsonParameters.PSobject.Properties["status"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "step_details"))) {
            throw "Error! JSON cannot be serialized due to the required property 'step_details' missing."
        } else {
            $StepDetails = $JsonParameters.PSobject.Properties["step_details"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "last_error"))) {
            throw "Error! JSON cannot be serialized due to the required property 'last_error' missing."
        } else {
            $LastError = $JsonParameters.PSobject.Properties["last_error"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "expired_at"))) {
            throw "Error! JSON cannot be serialized due to the required property 'expired_at' missing."
        } else {
            $ExpiredAt = $JsonParameters.PSobject.Properties["expired_at"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "cancelled_at"))) {
            throw "Error! JSON cannot be serialized due to the required property 'cancelled_at' missing."
        } else {
            $CancelledAt = $JsonParameters.PSobject.Properties["cancelled_at"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "failed_at"))) {
            throw "Error! JSON cannot be serialized due to the required property 'failed_at' missing."
        } else {
            $FailedAt = $JsonParameters.PSobject.Properties["failed_at"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "completed_at"))) {
            throw "Error! JSON cannot be serialized due to the required property 'completed_at' missing."
        } else {
            $CompletedAt = $JsonParameters.PSobject.Properties["completed_at"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "metadata"))) {
            throw "Error! JSON cannot be serialized due to the required property 'metadata' missing."
        } else {
            $Metadata = $JsonParameters.PSobject.Properties["metadata"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "usage"))) {
            throw "Error! JSON cannot be serialized due to the required property 'usage' missing."
        } else {
            $Usage = $JsonParameters.PSobject.Properties["usage"].value
        }

        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "object" = ${Object}
            "created_at" = ${CreatedAt}
            "assistant_id" = ${AssistantId}
            "thread_id" = ${ThreadId}
            "run_id" = ${RunId}
            "type" = ${Type}
            "status" = ${Status}
            "step_details" = ${StepDetails}
            "last_error" = ${LastError}
            "expired_at" = ${ExpiredAt}
            "cancelled_at" = ${CancelledAt}
            "failed_at" = ${FailedAt}
            "completed_at" = ${CompletedAt}
            "metadata" = ${Metadata}
            "usage" = ${Usage}
        }

        return $PSO
    }

}

