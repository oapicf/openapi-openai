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
#include "OpenAPIAssistantObjectToolsInner.h"

namespace OpenAPI
{

/*
 * OpenAPIModifyAssistantRequest
 *
 * 
 */
class OPENAPI_API OpenAPIModifyAssistantRequest : public Model
{
public:
    virtual ~OpenAPIModifyAssistantRequest() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<FString> Model;
	/* The name of the assistant. The maximum length is 256 characters.  */
	TOptional<FString> Name;
	/* The description of the assistant. The maximum length is 512 characters.  */
	TOptional<FString> Description;
	/* The system instructions that the assistant uses. The maximum length is 256,000 characters.  */
	TOptional<FString> Instructions;
	/* A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`.  */
	TOptional<TArray<OpenAPIAssistantObjectToolsInner>> Tools;
	/* A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant.  */
	TOptional<TArray<FString>> FileIds;
	/* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
	TOptional<TSharedPtr<FJsonObject>> Metadata;
};

}
