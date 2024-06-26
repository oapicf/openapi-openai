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

.PARAMETER Role
The role of the entity that is creating the message. Allowed values include: - `user`: Indicates the message is sent by an actual user and should be used in most cases to represent user-generated messages. - `assistant`: Indicates the message is generated by the assistant. Use this value to insert messages from the assistant into the conversation. 
.PARAMETER Content
The content of the message.
.PARAMETER FileIds
A list of [File](/docs/api-reference/files) IDs that the message should use. There can be a maximum of 10 files attached to a message. Useful for tools like `retrieval` and `code_interpreter` that can access and use files.
.PARAMETER Metadata
Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
.OUTPUTS

CreateMessageRequest<PSCustomObject>
#>

function Initialize-CreateMessageRequest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("user", "assistant")]
        [String]
        ${Role},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Content},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${FileIds},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Metadata}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CreateMessageRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Role) {
            throw "invalid value for 'Role', 'Role' cannot be null."
        }

        if ($null -eq $Content) {
            throw "invalid value for 'Content', 'Content' cannot be null."
        }

        if ($Content.length -gt 256000) {
            throw "invalid value for 'Content', the character length must be smaller than or equal to 256000."
        }

        if ($Content.length -lt 1) {
            throw "invalid value for 'Content', the character length must be great than or equal to 1."
        }

        if (!$FileIds -and $FileIds.length -gt 10) {
            throw "invalid value for 'FileIds', number of items must be less than or equal to 10."
        }

        if (!$FileIds -and $FileIds.length -lt 1) {
            throw "invalid value for 'FileIds', number of items must be greater than or equal to 1."
        }


        $PSO = [PSCustomObject]@{
            "role" = ${Role}
            "content" = ${Content}
            "file_ids" = ${FileIds}
            "metadata" = ${Metadata}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CreateMessageRequest<PSCustomObject>

.DESCRIPTION

Convert from JSON to CreateMessageRequest<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CreateMessageRequest<PSCustomObject>
#>
function ConvertFrom-JsonToCreateMessageRequest {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CreateMessageRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CreateMessageRequest
        $AllProperties = ("role", "content", "file_ids", "metadata")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'role' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "role"))) {
            throw "Error! JSON cannot be serialized due to the required property 'role' missing."
        } else {
            $Role = $JsonParameters.PSobject.Properties["role"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "content"))) {
            throw "Error! JSON cannot be serialized due to the required property 'content' missing."
        } else {
            $Content = $JsonParameters.PSobject.Properties["content"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "file_ids"))) { #optional property not found
            $FileIds = $null
        } else {
            $FileIds = $JsonParameters.PSobject.Properties["file_ids"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "metadata"))) { #optional property not found
            $Metadata = $null
        } else {
            $Metadata = $JsonParameters.PSobject.Properties["metadata"].value
        }

        $PSO = [PSCustomObject]@{
            "role" = ${Role}
            "content" = ${Content}
            "file_ids" = ${FileIds}
            "metadata" = ${Metadata}
        }

        return $PSO
    }

}

