

#include "ChatCompletionToolChoiceOption.h"

using namespace Tiny;

ChatCompletionToolChoiceOption::ChatCompletionToolChoiceOption()
{
	type = std::string();
	function = AssistantsNamedToolChoice_function();
}

ChatCompletionToolChoiceOption::ChatCompletionToolChoiceOption(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionToolChoiceOption::~ChatCompletionToolChoiceOption()
{

}

void
ChatCompletionToolChoiceOption::fromJson(std::string jsonObj)
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
ChatCompletionToolChoiceOption::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["function"] = getFunction().toJson();


    return object;

}

std::string
ChatCompletionToolChoiceOption::getType()
{
	return type;
}

void
ChatCompletionToolChoiceOption::setType(std::string  type)
{
	this->type = type;
}

AssistantsNamedToolChoice_function
ChatCompletionToolChoiceOption::getFunction()
{
	return function;
}

void
ChatCompletionToolChoiceOption::setFunction(AssistantsNamedToolChoice_function  function)
{
	this->function = function;
}



