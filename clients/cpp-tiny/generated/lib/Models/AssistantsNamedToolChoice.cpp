

#include "AssistantsNamedToolChoice.h"

using namespace Tiny;

AssistantsNamedToolChoice::AssistantsNamedToolChoice()
{
	type = std::string();
	function = AssistantsNamedToolChoice_function();
}

AssistantsNamedToolChoice::AssistantsNamedToolChoice(std::string jsonString)
{
	this->fromJson(jsonString);
}

AssistantsNamedToolChoice::~AssistantsNamedToolChoice()
{

}

void
AssistantsNamedToolChoice::fromJson(std::string jsonObj)
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
AssistantsNamedToolChoice::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["function"] = getFunction().toJson();


    return object;

}

std::string
AssistantsNamedToolChoice::getType()
{
	return type;
}

void
AssistantsNamedToolChoice::setType(std::string  type)
{
	this->type = type;
}

AssistantsNamedToolChoice_function
AssistantsNamedToolChoice::getFunction()
{
	return function;
}

void
AssistantsNamedToolChoice::setFunction(AssistantsNamedToolChoice_function  function)
{
	this->function = function;
}



