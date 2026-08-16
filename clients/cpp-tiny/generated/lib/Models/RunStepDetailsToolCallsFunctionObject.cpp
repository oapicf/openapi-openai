

#include "RunStepDetailsToolCallsFunctionObject.h"

using namespace Tiny;

RunStepDetailsToolCallsFunctionObject::RunStepDetailsToolCallsFunctionObject()
{
	id = std::string();
	type = std::string();
	function = RunStepDetailsToolCallsFunctionObject_function();
}

RunStepDetailsToolCallsFunctionObject::RunStepDetailsToolCallsFunctionObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDetailsToolCallsFunctionObject::~RunStepDetailsToolCallsFunctionObject()
{

}

void
RunStepDetailsToolCallsFunctionObject::fromJson(std::string jsonObj)
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




        RunStepDetailsToolCallsFunctionObject_function* obj = &function;
		obj->fromJson(value.dump());

    }


}

bourne::json
RunStepDetailsToolCallsFunctionObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["type"] = getType();







	object["function"] = getFunction().toJson();


    return object;

}

std::string
RunStepDetailsToolCallsFunctionObject::getId()
{
	return id;
}

void
RunStepDetailsToolCallsFunctionObject::setId(std::string  id)
{
	this->id = id;
}

std::string
RunStepDetailsToolCallsFunctionObject::getType()
{
	return type;
}

void
RunStepDetailsToolCallsFunctionObject::setType(std::string  type)
{
	this->type = type;
}

RunStepDetailsToolCallsFunctionObject_function
RunStepDetailsToolCallsFunctionObject::getFunction()
{
	return function;
}

void
RunStepDetailsToolCallsFunctionObject::setFunction(RunStepDetailsToolCallsFunctionObject_function  function)
{
	this->function = function;
}



