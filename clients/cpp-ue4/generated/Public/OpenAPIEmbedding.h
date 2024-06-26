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
 * OpenAPIEmbedding
 *
 * Represents an embedding vector returned by embedding endpoint. 
 */
class OPENAPI_API OpenAPIEmbedding : public Model
{
public:
    virtual ~OpenAPIEmbedding() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* The index of the embedding in the list of embeddings. */
	int32 Index = 0;
	/* The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings).  */
	TArray<double> Embedding;
	enum class ObjectEnum
	{
		Embedding,
  	};

	static FString EnumToString(const ObjectEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, ObjectEnum& EnumValue);
	/* The object type, which is always \"embedding\". */
	ObjectEnum Object;
};

}
