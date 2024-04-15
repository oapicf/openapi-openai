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
#include "OpenAPICreateModerationRequestInput.h"
#include "OpenAPICreateModerationRequestModel.h"

namespace OpenAPI
{

/*
 * OpenAPICreateModerationRequest
 *
 * 
 */
class OPENAPI_API OpenAPICreateModerationRequest : public Model
{
public:
    virtual ~OpenAPICreateModerationRequest() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	OpenAPICreateModerationRequestInput Input;
	TOptional<OpenAPICreateModerationRequestModel> Model;
};

}