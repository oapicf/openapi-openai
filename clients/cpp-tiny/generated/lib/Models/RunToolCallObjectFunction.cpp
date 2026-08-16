

#include "RunToolCallObject_function.h"

using namespace Tiny;

RunToolCallObject_function::RunToolCallObject_function()
{
	name = std::string();
	arguments = std::string();
}

RunToolCallObject_function::RunToolCallObject_function(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunToolCallObject_function::~RunToolCallObject_function()
{

}

void
RunToolCallObject_function::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *argumentsKey = "arguments";

    if(object.has_key(argumentsKey))
    {
        bourne::json value = object[argumentsKey];



        jsonToValue(&arguments, value, "std::string");


    }


}

bourne::json
RunToolCallObject_function::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["arguments"] = getArguments();



    return object;

}

std::string
RunToolCallObject_function::getName()
{
	return name;
}

void
RunToolCallObject_function::setName(std::string  name)
{
	this->name = name;
}

std::string
RunToolCallObject_function::getArguments()
{
	return arguments;
}

void
RunToolCallObject_function::setArguments(std::string  arguments)
{
	this->arguments = arguments;
}



