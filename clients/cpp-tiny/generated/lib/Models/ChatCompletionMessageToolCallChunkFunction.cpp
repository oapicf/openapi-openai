

#include "ChatCompletionMessageToolCallChunk_function.h"

using namespace Tiny;

ChatCompletionMessageToolCallChunk_function::ChatCompletionMessageToolCallChunk_function()
{
	name = std::string();
	arguments = std::string();
}

ChatCompletionMessageToolCallChunk_function::ChatCompletionMessageToolCallChunk_function(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionMessageToolCallChunk_function::~ChatCompletionMessageToolCallChunk_function()
{

}

void
ChatCompletionMessageToolCallChunk_function::fromJson(std::string jsonObj)
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
ChatCompletionMessageToolCallChunk_function::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["arguments"] = getArguments();



    return object;

}

std::string
ChatCompletionMessageToolCallChunk_function::getName()
{
	return name;
}

void
ChatCompletionMessageToolCallChunk_function::setName(std::string  name)
{
	this->name = name;
}

std::string
ChatCompletionMessageToolCallChunk_function::getArguments()
{
	return arguments;
}

void
ChatCompletionMessageToolCallChunk_function::setArguments(std::string  arguments)
{
	this->arguments = arguments;
}



