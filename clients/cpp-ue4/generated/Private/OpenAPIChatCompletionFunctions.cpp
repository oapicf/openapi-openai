/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * OpenAPI spec version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#include "OpenAPIChatCompletionFunctions.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIChatCompletionFunctions::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("name")); WriteJsonValue(Writer, Name);
	if (Description.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("description")); WriteJsonValue(Writer, Description.GetValue());
	}
	if (Parameters.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("parameters")); WriteJsonValue(Writer, Parameters.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIChatCompletionFunctions::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("name"), Name);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("description"), Description);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("parameters"), Parameters);

	return ParseSuccess;
}

}
