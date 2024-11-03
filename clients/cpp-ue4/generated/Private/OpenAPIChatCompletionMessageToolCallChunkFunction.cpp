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

#include "OpenAPIChatCompletionMessageToolCallChunkFunction.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIChatCompletionMessageToolCallChunkFunction::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Name.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("name")); WriteJsonValue(Writer, Name.GetValue());
	}
	if (Arguments.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("arguments")); WriteJsonValue(Writer, Arguments.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIChatCompletionMessageToolCallChunkFunction::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("name"), Name);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("arguments"), Arguments);

	return ParseSuccess;
}

}
