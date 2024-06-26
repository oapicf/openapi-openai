/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "OpenAPIBaseModel.h"
#include "OpenAPICreateEmbeddingRequestInput.h"
#include "OpenAPICreateEmbeddingRequestModel.h"

namespace OpenAPI
{

/*
 * OpenAPICreateEmbeddingRequest
 *
 * 
 */
class OPENAPI_API OpenAPICreateEmbeddingRequest : public Model
{
public:
    virtual ~OpenAPICreateEmbeddingRequest() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	OpenAPICreateEmbeddingRequestInput Input;
	OpenAPICreateEmbeddingRequestModel Model;
	enum class EncodingFormatEnum
	{
		_Float,
		Base64,
  	};

	static FString EnumToString(const EncodingFormatEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, EncodingFormatEnum& EnumValue);
	/* The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/). */
	TOptional<EncodingFormatEnum> EncodingFormat;
	/* The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models.  */
	TOptional<int32> Dimensions;
	/* A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  */
	TOptional<FString> User;
};

}
