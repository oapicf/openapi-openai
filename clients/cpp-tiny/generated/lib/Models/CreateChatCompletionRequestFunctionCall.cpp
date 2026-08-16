

#include "CreateChatCompletionRequest_function_call.h"

using namespace Tiny;

CreateChatCompletionRequest_function_call::CreateChatCompletionRequest_function_call()
{
	name = std::string();
}

CreateChatCompletionRequest_function_call::CreateChatCompletionRequest_function_call(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateChatCompletionRequest_function_call::~CreateChatCompletionRequest_function_call()
{

}

void
CreateChatCompletionRequest_function_call::fromJson(std::string jsonObj)
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
CreateChatCompletionRequest_function_call::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();



    return object;

}

std::string
CreateChatCompletionRequest_function_call::getName()
{
	return name;
}

void
CreateChatCompletionRequest_function_call::setName(std::string  name)
{
	this->name = name;
}



