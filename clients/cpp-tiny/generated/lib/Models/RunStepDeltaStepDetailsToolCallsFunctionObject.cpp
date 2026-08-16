

#include "RunStepDeltaStepDetailsToolCallsFunctionObject.h"

using namespace Tiny;

RunStepDeltaStepDetailsToolCallsFunctionObject::RunStepDeltaStepDetailsToolCallsFunctionObject()
{
	index = int(0);
	id = std::string();
	type = std::string();
	function = RunStepDeltaStepDetailsToolCallsFunctionObject_function();
}

RunStepDeltaStepDetailsToolCallsFunctionObject::RunStepDeltaStepDetailsToolCallsFunctionObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDeltaStepDetailsToolCallsFunctionObject::~RunStepDeltaStepDetailsToolCallsFunctionObject()
{

}

void
RunStepDeltaStepDetailsToolCallsFunctionObject::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *indexKey = "index";

    if(object.has_key(indexKey))
    {
        bourne::json value = object[indexKey];



        jsonToValue(&index, value, "int");


    }

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




        RunStepDeltaStepDetailsToolCallsFunctionObject_function* obj = &function;
		obj->fromJson(value.dump());

    }


}

bourne::json
RunStepDeltaStepDetailsToolCallsFunctionObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["index"] = getIndex();






    object["id"] = getId();






    object["type"] = getType();







	object["function"] = getFunction().toJson();


    return object;

}

int
RunStepDeltaStepDetailsToolCallsFunctionObject::getIndex()
{
	return index;
}

void
RunStepDeltaStepDetailsToolCallsFunctionObject::setIndex(int  index)
{
	this->index = index;
}

std::string
RunStepDeltaStepDetailsToolCallsFunctionObject::getId()
{
	return id;
}

void
RunStepDeltaStepDetailsToolCallsFunctionObject::setId(std::string  id)
{
	this->id = id;
}

std::string
RunStepDeltaStepDetailsToolCallsFunctionObject::getType()
{
	return type;
}

void
RunStepDeltaStepDetailsToolCallsFunctionObject::setType(std::string  type)
{
	this->type = type;
}

RunStepDeltaStepDetailsToolCallsFunctionObject_function
RunStepDeltaStepDetailsToolCallsFunctionObject::getFunction()
{
	return function;
}

void
RunStepDeltaStepDetailsToolCallsFunctionObject::setFunction(RunStepDeltaStepDetailsToolCallsFunctionObject_function  function)
{
	this->function = function;
}



