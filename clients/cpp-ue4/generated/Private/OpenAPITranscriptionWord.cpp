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

#include "OpenAPITranscriptionWord.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPITranscriptionWord::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("word")); WriteJsonValue(Writer, Word);
	Writer->WriteIdentifierPrefix(TEXT("start")); WriteJsonValue(Writer, Start);
	Writer->WriteIdentifierPrefix(TEXT("end")); WriteJsonValue(Writer, End);
	Writer->WriteObjectEnd();
}

bool OpenAPITranscriptionWord::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("word"), Word);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("start"), Start);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("end"), End);

	return ParseSuccess;
}

}