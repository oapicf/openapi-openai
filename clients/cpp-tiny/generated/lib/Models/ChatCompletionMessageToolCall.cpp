

#include "ChatCompletionMessageToolCall.h"

using namespace Tiny;

ChatCompletionMessageToolCall::ChatCompletionMessageToolCall()
{
	id = std::string();
	type = std::string();
	function = ChatCompletionMessageToolCall_function();
}

ChatCompletionMessageToolCall::ChatCompletionMessageToolCall(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionMessageToolCall::~ChatCompletionMessageToolCall()
{

}

void
ChatCompletionMessageToolCall::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

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




        ChatCompletionMessageToolCall_function* obj = &function;
		obj->fromJson(value.dump());

    }


}

bourne::json
ChatCompletionMessageToolCall::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["type"] = getType();







	object["function"] = getFunction().toJson();


    return object;

}

std::string
ChatCompletionMessageToolCall::getId()
{
	return id;
}

void
ChatCompletionMessageToolCall::setId(std::string  id)
{
	this->id = id;
}

std::string
ChatCompletionMessageToolCall::getType()
{
	return type;
}

void
ChatCompletionMessageToolCall::setType(std::string  type)
{
	this->type = type;
}

ChatCompletionMessageToolCall_function
ChatCompletionMessageToolCall::getFunction()
{
	return function;
}

void
ChatCompletionMessageToolCall::setFunction(ChatCompletionMessageToolCall_function  function)
{
	this->function = function;
}



