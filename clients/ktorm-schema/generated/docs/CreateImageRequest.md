
# Table `CreateImageRequest`
(mapped from: CreateImageRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**prompt** | prompt | text NOT NULL |  | **kotlin.String** | A text description of the desired image(s). The maximum length is 1000 characters. | 
**n** | n | int UNSIGNED |  | **kotlin.Int** | The number of images to generate. Must be between 1 and 10. |  [optional]
**propertySize** | size | text |  | [**size**](#PropertySize) | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. |  [optional]
**responseFormat** | response_format | text |  | [**response_format**](#ResponseFormat) | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. |  [optional]
**user** | user | text |  | **kotlin.String** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  |  [optional]







