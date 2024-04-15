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
#include "OpenAPIModerationsApi.h"

#include "OpenAPICreateModerationRequest.h"
#include "OpenAPICreateModerationResponse.h"

namespace OpenAPI
{

/* Classifies if text is potentially harmful.

*/
class OPENAPI_API OpenAPIModerationsApi::CreateModerationRequest : public Request
{
public:
    virtual ~CreateModerationRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	OpenAPICreateModerationRequest OpenAPICreateModerationRequest;
};

class OPENAPI_API OpenAPIModerationsApi::CreateModerationResponse : public Response
{
public:
    virtual ~CreateModerationResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPICreateModerationResponse Content;
};

}