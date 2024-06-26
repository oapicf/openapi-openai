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

#include "OpenAPIListRunsResponse.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIListRunsResponse::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("object")); WriteJsonValue(Writer, Object);
	Writer->WriteIdentifierPrefix(TEXT("data")); WriteJsonValue(Writer, Data);
	Writer->WriteIdentifierPrefix(TEXT("first_id")); WriteJsonValue(Writer, FirstId);
	Writer->WriteIdentifierPrefix(TEXT("last_id")); WriteJsonValue(Writer, LastId);
	Writer->WriteIdentifierPrefix(TEXT("has_more")); WriteJsonValue(Writer, HasMore);
	Writer->WriteObjectEnd();
}

bool OpenAPIListRunsResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("object"), Object);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("data"), Data);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("first_id"), FirstId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("last_id"), LastId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("has_more"), HasMore);

	return ParseSuccess;
}

}
