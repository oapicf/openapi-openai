

#include "ChatCompletionRequestAssistantMessage_function_call.h"

using namespace Tiny;

ChatCompletionRequestAssistantMessage_function_call::ChatCompletionRequestAssistantMessage_function_call()
{
	arguments = std::string();
	name = std::string();
}

ChatCompletionRequestAssistantMessage_function_call::ChatCompletionRequestAssistantMessage_function_call(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionRequestAssistantMessage_function_call::~ChatCompletionRequestAssistantMessage_function_call()
{

}

void
ChatCompletionRequestAssistantMessage_function_call::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *argumentsKey = "arguments";

    if(object.has_key(argumentsKey))
    {
        bourne::json value = object[argumentsKey];



        jsonToValue(&arguments, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }


}

bourne::json
ChatCompletionRequestAssistantMessage_function_call::toJson()
{
    bourne::json object = bourne::json::object();





    object["arguments"] = getArguments();






    object["name"] = getName();



    return object;

}

std::string
ChatCompletionRequestAssistantMessage_function_call::getArguments()
{
	return arguments;
}

void
ChatCompletionRequestAssistantMessage_function_call::setArguments(std::string  arguments)
{
	this->arguments = arguments;
}

std::string
ChatCompletionRequestAssistantMessage_function_call::getName()
{
	return name;
}

void
ChatCompletionRequestAssistantMessage_function_call::setName(std::string  name)
{
	this->name = name;
}



