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

#include "OpenAPIMessageDeltaContentTextObjectText.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIMessageDeltaContentTextObjectText::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Value.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("value")); WriteJsonValue(Writer, Value.GetValue());
	}
	if (Annotations.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("annotations")); WriteJsonValue(Writer, Annotations.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIMessageDeltaContentTextObjectText::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("value"), Value);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("annotations"), Annotations);

	return ParseSuccess;
}

}
