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

.PARAMETER Content
No description available.
.PARAMETER Role
The role of the messages author, in this case `user`.
.PARAMETER Name
An optional name for the participant. Provides the model information to differentiate between participants of the same role.
.OUTPUTS

ChatCompletionRequestUserMessage<PSCustomObject>
#>

function Initialize-ChatCompletionRequestUserMessage {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Content},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("user")]
        [String]
        ${Role},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Name}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => ChatCompletionRequestUserMessage' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Content) {
            throw "invalid value for 'Content', 'Content' cannot be null."
        }

        if ($null -eq $Role) {
            throw "invalid value for 'Role', 'Role' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "content" = ${Content}
            "role" = ${Role}
            "name" = ${Name}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to ChatCompletionRequestUserMessage<PSCustomObject>

.DESCRIPTION

Convert from JSON to ChatCompletionRequestUserMessage<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

ChatCompletionRequestUserMessage<PSCustomObject>
#>
function ConvertFrom-JsonToChatCompletionRequestUserMessage {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => ChatCompletionRequestUserMessage' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in ChatCompletionRequestUserMessage
        $AllProperties = ("content", "role", "name")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'content' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "content"))) {
            throw "Error! JSON cannot be serialized due to the required property 'content' missing."
        } else {
            $Content = $JsonParameters.PSobject.Properties["content"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "role"))) {
            throw "Error! JSON cannot be serialized due to the required property 'role' missing."
        } else {
            $Role = $JsonParameters.PSobject.Properties["role"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "name"))) { #optional property not found
            $Name = $null
        } else {
            $Name = $JsonParameters.PSobject.Properties["name"].value
        }

        $PSO = [PSCustomObject]@{
            "content" = ${Content}
            "role" = ${Role}
            "name" = ${Name}
        }

        return $PSO
    }

}

