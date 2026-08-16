

#include "RunToolCallObject.h"

using namespace Tiny;

RunToolCallObject::RunToolCallObject()
{
	id = std::string();
	type = std::string();
	function = RunToolCallObject_function();
}

RunToolCallObject::RunToolCallObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunToolCallObject::~RunToolCallObject()
{

}

void
RunToolCallObject::fromJson(std::string jsonObj)
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




        RunToolCallObject_function* obj = &function;
		obj->fromJson(value.dump());

    }


}

bourne::json
RunToolCallObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["type"] = getType();







	object["function"] = getFunction().toJson();


    return object;

}

std::string
RunToolCallObject::getId()
{
	return id;
}

void
RunToolCallObject::setId(std::string  id)
{
	this->id = id;
}

std::string
RunToolCallObject::getType()
{
	return type;
}

void
RunToolCallObject::setType(std::string  type)
{
	this->type = type;
}

RunToolCallObject_function
RunToolCallObject::getFunction()
{
	return function;
}

void
RunToolCallObject::setFunction(RunToolCallObject_function  function)
{
	this->function = function;
}



