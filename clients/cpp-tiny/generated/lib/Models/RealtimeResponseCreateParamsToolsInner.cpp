

#include "RealtimeResponseCreateParams_tools_inner.h"

using namespace Tiny;

RealtimeResponseCreateParams_tools_inner::RealtimeResponseCreateParams_tools_inner()
{
	type = std::string();
	name = std::string();
	description = std::string();
	parameters = null;
}

RealtimeResponseCreateParams_tools_inner::RealtimeResponseCreateParams_tools_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeResponseCreateParams_tools_inner::~RealtimeResponseCreateParams_tools_inner()
{

}

void
RealtimeResponseCreateParams_tools_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *parametersKey = "parameters";

    if(object.has_key(parametersKey))
    {
        bourne::json value = object[parametersKey];




        Object* obj = &parameters;
		obj->fromJson(value.dump());

    }


}

bourne::json
RealtimeResponseCreateParams_tools_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();






    object["name"] = getName();






    object["description"] = getDescription();







	object["parameters"] = getParameters().toJson();


    return object;

}

std::string
RealtimeResponseCreateParams_tools_inner::getType()
{
	return type;
}

void
RealtimeResponseCreateParams_tools_inner::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeResponseCreateParams_tools_inner::getName()
{
	return name;
}

void
RealtimeResponseCreateParams_tools_inner::setName(std::string  name)
{
	this->name = name;
}

std::string
RealtimeResponseCreateParams_tools_inner::getDescription()
{
	return description;
}

void
RealtimeResponseCreateParams_tools_inner::setDescription(std::string  description)
{
	this->description = description;
}

Object
RealtimeResponseCreateParams_tools_inner::getParameters()
{
	return parameters;
}

void
RealtimeResponseCreateParams_tools_inner::setParameters(Object  parameters)
{
	this->parameters = parameters;
}



