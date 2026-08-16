

#include "ChatCompletionMessageToolCall_function.h"

using namespace Tiny;

ChatCompletionMessageToolCall_function::ChatCompletionMessageToolCall_function()
{
	name = std::string();
	arguments = std::string();
}

ChatCompletionMessageToolCall_function::ChatCompletionMessageToolCall_function(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionMessageToolCall_function::~ChatCompletionMessageToolCall_function()
{

}

void
ChatCompletionMessageToolCall_function::fromJson(std::string jsonObj)
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
ChatCompletionMessageToolCall_function::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["arguments"] = getArguments();



    return object;

}

std::string
ChatCompletionMessageToolCall_function::getName()
{
	return name;
}

void
ChatCompletionMessageToolCall_function::setName(std::string  name)
{
	this->name = name;
}

std::string
ChatCompletionMessageToolCall_function::getArguments()
{
	return arguments;
}

void
ChatCompletionMessageToolCall_function::setArguments(std::string  arguments)
{
	this->arguments = arguments;
}



