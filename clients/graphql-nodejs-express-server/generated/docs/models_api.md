# models_api

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteModel**](models_api.md#DeleteModel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
[**ListModels**](models_api.md#ListModels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**RetrieveModel**](models_api.md#RetrieveModel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


<a name="DeleteModel"></a>
# **DeleteModel**
> DeleteModelResponse DeleteModel(model)

Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
<a name="ListModels"></a>
# **ListModels**
> ListModelsResponse ListModels()

Lists the currently available models, and provides basic information about each one such as the owner and availability.
<a name="RetrieveModel"></a>
# **RetrieveModel**
> Model RetrieveModel(model)

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
