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
#include "OpenAPIRunObject.h"

namespace OpenAPI
{

/*
 * OpenAPIListRunsResponse
 *
 * 
 */
class OPENAPI_API OpenAPIListRunsResponse : public Model
{
public:
    virtual ~OpenAPIListRunsResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	FString Object;
	TArray<OpenAPIRunObject> Data;
	FString FirstId;
	FString LastId;
	bool HasMore = false;
};

}