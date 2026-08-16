

#include "ResponseFormatJsonSchema.h"

using namespace Tiny;

ResponseFormatJsonSchema::ResponseFormatJsonSchema()
{
	type = std::string();
	json_schema = ResponseFormatJsonSchema_json_schema();
}

ResponseFormatJsonSchema::ResponseFormatJsonSchema(std::string jsonString)
{
	this->fromJson(jsonString);
}

ResponseFormatJsonSchema::~ResponseFormatJsonSchema()
{

}

void
ResponseFormatJsonSchema::fromJson(std::string jsonObj)
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
ResponseFormatJsonSchema::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["json_schema"] = getJsonSchema().toJson();


    return object;

}

std::string
ResponseFormatJsonSchema::getType()
{
	return type;
}

void
ResponseFormatJsonSchema::setType(std::string  type)
{
	this->type = type;
}

ResponseFormatJsonSchema_json_schema
ResponseFormatJsonSchema::getJsonSchema()
{
	return json_schema;
}

void
ResponseFormatJsonSchema::setJsonSchema(ResponseFormatJsonSchema_json_schema  json_schema)
{
	this->json_schema = json_schema;
}



