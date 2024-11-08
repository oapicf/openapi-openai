#
# OpenAI API
# The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
# Version: 2.0.0
# Contact: blah+oapicf@cliffano.com
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

Creates an image given a prompt.

.DESCRIPTION

No description available.

.PARAMETER CreateImageRequest
No description available.

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

ImagesResponse
#>
function New-Image {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [PSCustomObject]
        ${CreateImageRequest},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: New-Image' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $LocalVarAccepts = @()
        $LocalVarContentTypes = @()
        $LocalVarQueryParameters = @{}
        $LocalVarHeaderParameters = @{}
        $LocalVarFormParameters = @{}
        $LocalVarPathParameters = @{}
        $LocalVarCookieParameters = @{}
        $LocalVarBodyParameter = $null

        $Configuration = Get-Configuration
        # HTTP header 'Accept' (if needed)
        $LocalVarAccepts = @('application/json')

        # HTTP header 'Content-Type'
        $LocalVarContentTypes = @('application/json')

        $LocalVarUri = '/images/generations'

        if (!$CreateImageRequest) {
            throw "Error! The required parameter `CreateImageRequest` missing when calling createImage."
        }

        $LocalVarBodyParameter = $CreateImageRequest | ConvertTo-Json -Depth 100

        if ($Configuration["AccessToken"]) {
            $LocalVarHeaderParameters['Authorization'] = "Bearer " + $Configuration["AccessToken"]
            Write-Verbose ("Using Bearer authentication in {0}" -f $MyInvocation.MyCommand)
        }

        $LocalVarResult = Invoke-ApiClient -Method 'POST' `
                                -Uri $LocalVarUri `
                                -Accepts $LocalVarAccepts `
                                -ContentTypes $LocalVarContentTypes `
                                -Body $LocalVarBodyParameter `
                                -HeaderParameters $LocalVarHeaderParameters `
                                -QueryParameters $LocalVarQueryParameters `
                                -FormParameters $LocalVarFormParameters `
                                -CookieParameters $LocalVarCookieParameters `
                                -ReturnType "ImagesResponse" `
                                -IsBodyNullable $false

        if ($WithHttpInfo.IsPresent) {
            return $LocalVarResult
        } else {
            return $LocalVarResult["Response"]
        }
    }
}

<#
.SYNOPSIS

Creates an edited or extended image given an original image and a prompt.

.DESCRIPTION

No description available.

.PARAMETER Image
The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.

.PARAMETER Prompt
A text description of the desired image(s). The maximum length is 1000 characters.

.PARAMETER Mask
An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.

.PARAMETER Model
No description available.

.PARAMETER N
The number of images to generate. Must be between 1 and 10.

.PARAMETER Size
The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.

.PARAMETER ResponseFormat
The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.

.PARAMETER User
A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

ImagesResponse
#>
function New-ImageEdit {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [System.IO.FileInfo]
        ${Image},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${Prompt},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [System.IO.FileInfo]
        ${Mask},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [PSCustomObject]
        ${Model},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [System.Nullable[Int32]]
        ${N},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [ValidateSet("256x256", "512x512", "1024x1024")]
        [String]
        ${Size},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [ValidateSet("url", "b64_json")]
        [String]
        ${ResponseFormat},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${User},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: New-ImageEdit' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $LocalVarAccepts = @()
        $LocalVarContentTypes = @()
        $LocalVarQueryParameters = @{}
        $LocalVarHeaderParameters = @{}
        $LocalVarFormParameters = @{}
        $LocalVarPathParameters = @{}
        $LocalVarCookieParameters = @{}
        $LocalVarBodyParameter = $null

        $Configuration = Get-Configuration
        # HTTP header 'Accept' (if needed)
        $LocalVarAccepts = @('application/json')

        # HTTP header 'Content-Type'
        $LocalVarContentTypes = @('multipart/form-data')

        $LocalVarUri = '/images/edits'

        if (!$Image) {
            throw "Error! The required parameter `Image` missing when calling createImageEdit."
        }
        $LocalVarFormParameters['image'] = $Image | Foreach-Object { [System.IO.FileInfo]$executionContext.SessionState.Path.GetUnresolvedProviderPathFromPSPath($_) }

        if (!$Prompt) {
            throw "Error! The required parameter `Prompt` missing when calling createImageEdit."
        }
        $LocalVarFormParameters['prompt'] = $Prompt

        if ($Mask) {
            $LocalVarFormParameters['mask'] = $Mask | Foreach-Object { [System.IO.FileInfo]$executionContext.SessionState.Path.GetUnresolvedProviderPathFromPSPath($_) }
        }

        $LocalVarFormParameters['model'] = $Model

        $LocalVarFormParameters['n'] = $N

        $LocalVarFormParameters['size'] = $Size

        $LocalVarFormParameters['response_format'] = $ResponseFormat

        if ($User) {
            $LocalVarFormParameters['user'] = $User
        }

        if ($Configuration["AccessToken"]) {
            $LocalVarHeaderParameters['Authorization'] = "Bearer " + $Configuration["AccessToken"]
            Write-Verbose ("Using Bearer authentication in {0}" -f $MyInvocation.MyCommand)
        }

        $LocalVarResult = Invoke-ApiClient -Method 'POST' `
                                -Uri $LocalVarUri `
                                -Accepts $LocalVarAccepts `
                                -ContentTypes $LocalVarContentTypes `
                                -Body $LocalVarBodyParameter `
                                -HeaderParameters $LocalVarHeaderParameters `
                                -QueryParameters $LocalVarQueryParameters `
                                -FormParameters $LocalVarFormParameters `
                                -CookieParameters $LocalVarCookieParameters `
                                -ReturnType "ImagesResponse" `
                                -IsBodyNullable $false

        if ($WithHttpInfo.IsPresent) {
            return $LocalVarResult
        } else {
            return $LocalVarResult["Response"]
        }
    }
}

<#
.SYNOPSIS

Creates a variation of a given image.

.DESCRIPTION

No description available.

.PARAMETER Image
The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.

.PARAMETER Model
No description available.

.PARAMETER N
The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.

.PARAMETER ResponseFormat
The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.

.PARAMETER Size
The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.

.PARAMETER User
A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

ImagesResponse
#>
function New-ImageVariation {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [System.IO.FileInfo]
        ${Image},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [PSCustomObject]
        ${Model},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [System.Nullable[Int32]]
        ${N},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [ValidateSet("url", "b64_json")]
        [String]
        ${ResponseFormat},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [ValidateSet("256x256", "512x512", "1024x1024")]
        [String]
        ${Size},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${User},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: New-ImageVariation' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $LocalVarAccepts = @()
        $LocalVarContentTypes = @()
        $LocalVarQueryParameters = @{}
        $LocalVarHeaderParameters = @{}
        $LocalVarFormParameters = @{}
        $LocalVarPathParameters = @{}
        $LocalVarCookieParameters = @{}
        $LocalVarBodyParameter = $null

        $Configuration = Get-Configuration
        # HTTP header 'Accept' (if needed)
        $LocalVarAccepts = @('application/json')

        # HTTP header 'Content-Type'
        $LocalVarContentTypes = @('multipart/form-data')

        $LocalVarUri = '/images/variations'

        if (!$Image) {
            throw "Error! The required parameter `Image` missing when calling createImageVariation."
        }
        $LocalVarFormParameters['image'] = $Image | Foreach-Object { [System.IO.FileInfo]$executionContext.SessionState.Path.GetUnresolvedProviderPathFromPSPath($_) }

        $LocalVarFormParameters['model'] = $Model

        $LocalVarFormParameters['n'] = $N

        $LocalVarFormParameters['response_format'] = $ResponseFormat

        $LocalVarFormParameters['size'] = $Size

        if ($User) {
            $LocalVarFormParameters['user'] = $User
        }

        if ($Configuration["AccessToken"]) {
            $LocalVarHeaderParameters['Authorization'] = "Bearer " + $Configuration["AccessToken"]
            Write-Verbose ("Using Bearer authentication in {0}" -f $MyInvocation.MyCommand)
        }

        $LocalVarResult = Invoke-ApiClient -Method 'POST' `
                                -Uri $LocalVarUri `
                                -Accepts $LocalVarAccepts `
                                -ContentTypes $LocalVarContentTypes `
                                -Body $LocalVarBodyParameter `
                                -HeaderParameters $LocalVarHeaderParameters `
                                -QueryParameters $LocalVarQueryParameters `
                                -FormParameters $LocalVarFormParameters `
                                -CookieParameters $LocalVarCookieParameters `
                                -ReturnType "ImagesResponse" `
                                -IsBodyNullable $false

        if ($WithHttpInfo.IsPresent) {
            return $LocalVarResult
        } else {
            return $LocalVarResult["Response"]
        }
    }
}

