

#include "AssistantToolsFunction.h"

using namespace Tiny;

AssistantToolsFunction::AssistantToolsFunction()
{
	type = std::string();
	function = FunctionObject();
}

AssistantToolsFunction::AssistantToolsFunction(std::string jsonString)
{
	this->fromJson(jsonString);
}

AssistantToolsFunction::~AssistantToolsFunction()
{

}

void
AssistantToolsFunction::fromJson(std::string jsonObj)
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




        FunctionObject* obj = &function;
		obj->fromJson(value.dump());

    }


}

bourne::json
AssistantToolsFunction::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["function"] = getFunction().toJson();


    return object;

}

std::string
AssistantToolsFunction::getType()
{
	return type;
}

void
AssistantToolsFunction::setType(std::string  type)
{
	this->type = type;
}

FunctionObject
AssistantToolsFunction::getFunction()
{
	return function;
}

void
AssistantToolsFunction::setFunction(FunctionObject  function)
{
	this->function = function;
}



