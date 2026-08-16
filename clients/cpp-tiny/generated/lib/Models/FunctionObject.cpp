

#include "FunctionObject.h"

using namespace Tiny;

FunctionObject::FunctionObject()
{
	description = std::string();
	name = std::string();
	parameters = null<AnyType>();
	strict = bool(false);
}

FunctionObject::FunctionObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

FunctionObject::~FunctionObject()
{

}

void
FunctionObject::fromJson(std::string jsonObj)
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

    const char *parametersKey = "parameters";

    if(object.has_key(parametersKey))
    {
        bourne::json value = object[parametersKey];


    }

    const char *strictKey = "strict";

    if(object.has_key(strictKey))
    {
        bourne::json value = object[strictKey];



        jsonToValue(&strict, value, "bool");


    }


}

bourne::json
FunctionObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["description"] = getDescription();






    object["name"] = getName();









    object["strict"] = isStrict();



    return object;

}

std::string
FunctionObject::getDescription()
{
	return description;
}

void
FunctionObject::setDescription(std::string  description)
{
	this->description = description;
}

std::string
FunctionObject::getName()
{
	return name;
}

void
FunctionObject::setName(std::string  name)
{
	this->name = name;
}

Map<string, string>
FunctionObject::getParameters()
{
	return parameters;
}

void
FunctionObject::setParameters(Map <string, string> parameters)
{
	this->parameters = parameters;
}

bool
FunctionObject::isStrict()
{
	return strict;
}

void
FunctionObject::setStrict(bool  strict)
{
	this->strict = strict;
}



