# PSOpenAPITools.PSOpenAPITools\Api.ImagesApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**New-Image**](ImagesApi.md#New-Image) | **POST** /images/generations | Creates an image given a prompt.
[**New-ImageEdit**](ImagesApi.md#New-ImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**New-ImageVariation**](ImagesApi.md#New-ImageVariation) | **POST** /images/variations | Creates a variation of a given image.


<a id="New-Image"></a>
# **New-Image**
> ImagesResponse New-Image<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateImageRequest] <PSCustomObject><br>

Creates an image given a prompt.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$CreateImageRequestModel = Initialize-CreateImageRequestModel 
$CreateImageRequest = Initialize-CreateImageRequest -Prompt "A cute baby sea otter" -Model $CreateImageRequestModel -N 1 -Quality "standard" -ResponseFormat "url" -Size "256x256" -Style "vivid" -User "user-1234" # CreateImageRequest | 

# Creates an image given a prompt.
try {
    $Result = New-Image -CreateImageRequest $CreateImageRequest
} catch {
    Write-Host ("Exception occurred when calling New-Image: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CreateImageRequest** | [**CreateImageRequest**](CreateImageRequest.md)|  | 

### Return type

[**ImagesResponse**](ImagesResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-ImageEdit"></a>
# **New-ImageEdit**
> ImagesResponse New-ImageEdit<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Image] <System.IO.FileInfo><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Prompt] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Mask] <System.IO.FileInfo><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Model] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-N] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Size] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ResponseFormat] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-User] <String><br>

Creates an edited or extended image given an original image and a prompt.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$Image =  # System.IO.FileInfo | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
$Prompt = "MyPrompt" # String | A text description of the desired image(s). The maximum length is 1000 characters.
$Mask =  # System.IO.FileInfo | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`. (optional)
$CreateImageEditRequestModel = Initialize-CreateImageEditRequestModel # CreateImageEditRequestModel |  (optional)
$N = 56 # Int32 | The number of images to generate. Must be between 1 and 10. (optional) (default to 1)
$Size = "256x256" # String | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional) (default to "1024x1024")
$ResponseFormat = "url" # String | The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. (optional) (default to "url")
$User = "MyUser" # String | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  (optional)

# Creates an edited or extended image given an original image and a prompt.
try {
    $Result = New-ImageEdit -Image $Image -Prompt $Prompt -Mask $Mask -Model $Model -N $N -Size $Size -ResponseFormat $ResponseFormat -User $User
} catch {
    Write-Host ("Exception occurred when calling New-ImageEdit: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Image** | **System.IO.FileInfo****System.IO.FileInfo**| The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | 
 **Prompt** | **String**| A text description of the desired image(s). The maximum length is 1000 characters. | 
 **Mask** | **System.IO.FileInfo****System.IO.FileInfo**| An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional] 
 **Model** | [**CreateImageEditRequestModel**](CreateImageEditRequestModel.md)|  | [optional] 
 **N** | **Int32**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **Size** | **String**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &quot;1024x1024&quot;]
 **ResponseFormat** | **String**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional] [default to &quot;url&quot;]
 **User** | **String**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  | [optional] 

### Return type

[**ImagesResponse**](ImagesResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-ImageVariation"></a>
# **New-ImageVariation**
> ImagesResponse New-ImageVariation<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Image] <System.IO.FileInfo><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Model] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-N] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ResponseFormat] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Size] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-User] <String><br>

Creates a variation of a given image.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$Image =  # System.IO.FileInfo | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
$CreateImageEditRequestModel = Initialize-CreateImageEditRequestModel # CreateImageEditRequestModel |  (optional)
$N = 56 # Int32 | The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported. (optional) (default to 1)
$ResponseFormat = "url" # String | The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. (optional) (default to "url")
$Size = "256x256" # String | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional) (default to "1024x1024")
$User = "MyUser" # String | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  (optional)

# Creates a variation of a given image.
try {
    $Result = New-ImageVariation -Image $Image -Model $Model -N $N -ResponseFormat $ResponseFormat -Size $Size -User $User
} catch {
    Write-Host ("Exception occurred when calling New-ImageVariation: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Image** | **System.IO.FileInfo****System.IO.FileInfo**| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | 
 **Model** | [**CreateImageEditRequestModel**](CreateImageEditRequestModel.md)|  | [optional] 
 **N** | **Int32**| The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. | [optional] [default to 1]
 **ResponseFormat** | **String**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional] [default to &quot;url&quot;]
 **Size** | **String**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &quot;1024x1024&quot;]
 **User** | **String**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  | [optional] 

### Return type

[**ImagesResponse**](ImagesResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

