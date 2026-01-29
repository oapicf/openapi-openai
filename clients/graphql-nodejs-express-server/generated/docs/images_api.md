# images_api

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateImage**](images_api.md#CreateImage) | **POST** /images/generations | Creates an image given a prompt.
[**CreateImageEdit**](images_api.md#CreateImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**CreateImageVariation**](images_api.md#CreateImageVariation) | **POST** /images/variations | Creates a variation of a given image.


<a name="CreateImage"></a>
# **CreateImage**
> ImagesResponse CreateImage(createImageRequest)

Creates an image given a prompt.
<a name="CreateImageEdit"></a>
# **CreateImageEdit**
> ImagesResponse CreateImageEdit(image, prompt, mask, model, n, size, responseFormat, user)

Creates an edited or extended image given an original image and a prompt.
<a name="CreateImageVariation"></a>
# **CreateImageVariation**
> ImagesResponse CreateImageVariation(image, model, n, responseFormat, size, user)

Creates a variation of a given image.
