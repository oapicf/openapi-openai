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
#include "OpenAPIMessageContentImageFileObjectImageFile.h"

namespace OpenAPI
{

/*
 * OpenAPIMessageContentImageFileObject
 *
 * References an image [File](/docs/api-reference/files) in the content of a message.
 */
class OPENAPI_API OpenAPIMessageContentImageFileObject : public Model
{
public:
    virtual ~OpenAPIMessageContentImageFileObject() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	enum class TypeEnum
	{
		ImageFile,
  	};

	static FString EnumToString(const TypeEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, TypeEnum& EnumValue);
	/* Always `image_file`. */
	TypeEnum Type;
	OpenAPIMessageContentImageFileObjectImageFile ImageFile;
};

}
