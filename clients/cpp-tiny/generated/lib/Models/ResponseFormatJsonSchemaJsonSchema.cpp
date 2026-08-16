

#include "ResponseFormatJsonSchema_json_schema.h"

using namespace Tiny;

ResponseFormatJsonSchema_json_schema::ResponseFormatJsonSchema_json_schema()
{
	description = std::string();
	name = std::string();
	schema = null<AnyType>();
	strict = bool(false);
}

ResponseFormatJsonSchema_json_schema::ResponseFormatJsonSchema_json_schema(std::string jsonString)
{
	this->fromJson(jsonString);
}

ResponseFormatJsonSchema_json_schema::~ResponseFormatJsonSchema_json_schema()
{

}

void
ResponseFormatJsonSchema_json_schema::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *schemaKey = "schema";

    if(object.has_key(schemaKey))
    {
        bourne::json value = object[schemaKey];


    }

    const char *strictKey = "strict";

    if(object.has_key(strictKey))
    {
        bourne::json value = object[strictKey];



        jsonToValue(&strict, value, "bool");


    }


}

bourne::json
ResponseFormatJsonSchema_json_schema::toJson()
{
    bourne::json object = bourne::json::object();





    object["description"] = getDescription();






    object["name"] = getName();









    object["strict"] = isStrict();



    return object;

}

std::string
ResponseFormatJsonSchema_json_schema::getDescription()
{
	return description;
}

void
ResponseFormatJsonSchema_json_schema::setDescription(std::string  description)
{
	this->description = description;
}

std::string
ResponseFormatJsonSchema_json_schema::getName()
{
	return name;
}

void
ResponseFormatJsonSchema_json_schema::setName(std::string  name)
{
	this->name = name;
}

Map<string, string>
ResponseFormatJsonSchema_json_schema::getSchema()
{
	return schema;
}

void
ResponseFormatJsonSchema_json_schema::setSchema(Map <string, string> schema)
{
	this->schema = schema;
}

bool
ResponseFormatJsonSchema_json_schema::isStrict()
{
	return strict;
}

void
ResponseFormatJsonSchema_json_schema::setStrict(bool  strict)
{
	this->strict = strict;
}



