

#include "AssistantsNamedToolChoice_function.h"

using namespace Tiny;

AssistantsNamedToolChoice_function::AssistantsNamedToolChoice_function()
{
	name = std::string();
}

AssistantsNamedToolChoice_function::AssistantsNamedToolChoice_function(std::string jsonString)
{
	this->fromJson(jsonString);
}

AssistantsNamedToolChoice_function::~AssistantsNamedToolChoice_function()
{

}

void
AssistantsNamedToolChoice_function::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }


}

bourne::json
AssistantsNamedToolChoice_function::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();



    return object;

}

std::string
AssistantsNamedToolChoice_function::getName()
{
	return name;
}

void
AssistantsNamedToolChoice_function::setName(std::string  name)
{
	this->name = name;
}



