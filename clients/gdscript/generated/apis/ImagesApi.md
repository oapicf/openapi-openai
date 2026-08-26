<a name="__pageTop"></a>
# ImagesApi   { #ImagesApi }


All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_image**](#create_image) | **POST** `/images/generations` | Creates an image given a prompt.
[**create_image_edit**](#create_image_edit) | **POST** `/images/edits` | Creates an edited or extended image given an original image and a prompt.
[**create_image_variation**](#create_image_variation) | **POST** `/images/variations` | Creates a variation of a given image.

# **create_image**   { #create_image }
<a name="create_image"></a>

> `create_image(createImageRequest: CreateImageRequest, on_success: Callable, on_failure: Callable)`

Creates an image given a prompt.



### Example

* Bearer Authentication (`ApiKeyAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = ImagesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ImagesApi.new(config, client)

var createImageRequest = CreateImageRequest.new()
# … fill model createImageRequest with data

# Invoke an endpoint
api.create_image(
	# createImageRequest: CreateImageRequest
	createImageRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "create_image", response)
		assert(response.data is ImagesResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **create_image_edit**   { #create_image_edit }
<a name="create_image_edit"></a>

> `create_image_edit(some_image: String,prompt: String,mask = null,model = null,n = 1,size = "1024x1024",responseFormat = "url",user = "", on_success: Callable, on_failure: Callable)`

Creates an edited or extended image given an original image and a prompt.



### Example

* Bearer Authentication (`ApiKeyAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = ImagesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ImagesApi.new(config, client)


# Invoke an endpoint
api.create_image_edit(
	# some_image: String   Eg: BINARY_DATA_HERE
	# The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
	some_image,
	# prompt: String = ""   Eg: prompt_example
	# A text description of the desired image(s). The maximum length is 1000 characters.
	prompt,
	# mask: String   Eg: BINARY_DATA_HERE
	# An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.
	mask,
	# model: CreateImageEditRequestModel
	model,
	# n: int = 1   Eg: 56
	# The number of images to generate. Must be between 1 and 10.
	n,
	# size: String = "1024x1024"   Eg: size_example
	# The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
	size,
	# responseFormat: String = "url"   Eg: responseFormat_example
	# The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
	responseFormat,
	# user: String = ""   Eg: user_example
	# A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
	user,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "create_image_edit", response)
		assert(response.data is ImagesResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **create_image_variation**   { #create_image_variation }
<a name="create_image_variation"></a>

> `create_image_variation(some_image: String,model = null,n = 1,responseFormat = "url",size = "1024x1024",user = "", on_success: Callable, on_failure: Callable)`

Creates a variation of a given image.



### Example

* Bearer Authentication (`ApiKeyAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = ImagesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ImagesApi.new(config, client)


# Invoke an endpoint
api.create_image_variation(
	# some_image: String   Eg: BINARY_DATA_HERE
	# The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
	some_image,
	# model: CreateImageEditRequestModel
	model,
	# n: int = 1   Eg: 56
	# The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
	n,
	# responseFormat: String = "url"   Eg: responseFormat_example
	# The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
	responseFormat,
	# size: String = "1024x1024"   Eg: size_example
	# The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
	size,
	# user: String = ""   Eg: user_example
	# A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
	user,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "create_image_variation", response)
		assert(response.data is ImagesResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

[[Back to top]](#__pageTop) \
[[Back to API list]](../README.md#documentation-for-api-endpoints) \
[[Back to Model list]](../README.md#documentation-for-models) \
[[Back to README]](../README.md) \

