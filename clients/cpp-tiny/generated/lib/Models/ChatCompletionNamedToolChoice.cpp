

#include "ChatCompletionNamedToolChoice.h"

using namespace Tiny;

ChatCompletionNamedToolChoice::ChatCompletionNamedToolChoice()
{
	type = std::string();
	function = AssistantsNamedToolChoice_function();
}

ChatCompletionNamedToolChoice::ChatCompletionNamedToolChoice(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionNamedToolChoice::~ChatCompletionNamedToolChoice()
{

}

void
ChatCompletionNamedToolChoice::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *functionKey = "function";

    if(object.has_key(functionKey))
    {
        bourne::json value = object[functionKey];




        AssistantsNamedToolChoice_function* obj = &function;
		obj->fromJson(value.dump());

    }


}

bourne::json
ChatCompletionNamedToolChoice::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["function"] = getFunction().toJson();


    return object;

}

std::string
ChatCompletionNamedToolChoice::getType()
{
	return type;
}

void
ChatCompletionNamedToolChoice::setType(std::string  type)
{
	this->type = type;
}

AssistantsNamedToolChoice_function
ChatCompletionNamedToolChoice::getFunction()
{
	return function;
}

void
ChatCompletionNamedToolChoice::setFunction(AssistantsNamedToolChoice_function  function)
{
	this->function = function;
}



