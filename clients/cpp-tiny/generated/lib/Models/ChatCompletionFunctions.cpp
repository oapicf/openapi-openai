

#include "ChatCompletionFunctions.h"

using namespace Tiny;

ChatCompletionFunctions::ChatCompletionFunctions()
{
	description = std::string();
	name = std::string();
	parameters = null<AnyType>();
}

ChatCompletionFunctions::ChatCompletionFunctions(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionFunctions::~ChatCompletionFunctions()
{

}

void
ChatCompletionFunctions::fromJson(std::string jsonObj)
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


}

bourne::json
ChatCompletionFunctions::toJson()
{
    bourne::json object = bourne::json::object();





    object["description"] = getDescription();






    object["name"] = getName();






    return object;

}

std::string
ChatCompletionFunctions::getDescription()
{
	return description;
}

void
ChatCompletionFunctions::setDescription(std::string  description)
{
	this->description = description;
}

std::string
ChatCompletionFunctions::getName()
{
	return name;
}

void
ChatCompletionFunctions::setName(std::string  name)
{
	this->name = name;
}

Map<string, string>
ChatCompletionFunctions::getParameters()
{
	return parameters;
}

void
ChatCompletionFunctions::setParameters(Map <string, string> parameters)
{
	this->parameters = parameters;
}



