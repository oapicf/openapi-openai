

#include "CreateChatCompletionRequest_response_format.h"

using namespace Tiny;

CreateChatCompletionRequest_response_format::CreateChatCompletionRequest_response_format()
{
	type = std::string();
	json_schema = ResponseFormatJsonSchema_json_schema();
}

CreateChatCompletionRequest_response_format::CreateChatCompletionRequest_response_format(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateChatCompletionRequest_response_format::~CreateChatCompletionRequest_response_format()
{

}

void
CreateChatCompletionRequest_response_format::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *json_schemaKey = "json_schema";

    if(object.has_key(json_schemaKey))
    {
        bourne::json value = object[json_schemaKey];




        ResponseFormatJsonSchema_json_schema* obj = &json_schema;
		obj->fromJson(value.dump());

    }


}

bourne::json
CreateChatCompletionRequest_response_format::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["json_schema"] = getJsonSchema().toJson();


    return object;

}

std::string
CreateChatCompletionRequest_response_format::getType()
{
	return type;
}

void
CreateChatCompletionRequest_response_format::setType(std::string  type)
{
	this->type = type;
}

ResponseFormatJsonSchema_json_schema
CreateChatCompletionRequest_response_format::getJsonSchema()
{
	return json_schema;
}

void
CreateChatCompletionRequest_response_format::setJsonSchema(ResponseFormatJsonSchema_json_schema  json_schema)
{
	this->json_schema = json_schema;
}



