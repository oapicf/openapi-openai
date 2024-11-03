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

#include "OpenAPICreateThreadRequest.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPICreateThreadRequest::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Messages.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("messages")); WriteJsonValue(Writer, Messages.GetValue());
	}
	if (Metadata.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("metadata")); WriteJsonValue(Writer, Metadata.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPICreateThreadRequest::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("messages"), Messages);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("metadata"), Metadata);

	return ParseSuccess;
}

}
