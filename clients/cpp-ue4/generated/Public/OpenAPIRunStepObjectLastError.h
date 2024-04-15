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

namespace OpenAPI
{

/*
 * OpenAPIRunStepObjectLastError
 *
 * The last error associated with this run step. Will be &#x60;null&#x60; if there are no errors.
 */
class OPENAPI_API OpenAPIRunStepObjectLastError : public Model
{
public:
    virtual ~OpenAPIRunStepObjectLastError() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	enum class CodeEnum
	{
		ServerError,
		RateLimitExceeded,
  	};

	static FString EnumToString(const CodeEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, CodeEnum& EnumValue);
	/* One of `server_error` or `rate_limit_exceeded`. */
	CodeEnum Code;
	/* A human-readable description of the error. */
	FString Message;
};

}