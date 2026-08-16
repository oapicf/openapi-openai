

#include "RunStepDeltaObject.h"

using namespace Tiny;

RunStepDeltaObject::RunStepDeltaObject()
{
	id = std::string();
	object = std::string();
	delta = RunStepDeltaObject_delta();
}

RunStepDeltaObject::RunStepDeltaObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDeltaObject::~RunStepDeltaObject()
{

}

void
RunStepDeltaObject::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }

    const char *deltaKey = "delta";

    if(object.has_key(deltaKey))
    {
        bourne::json value = object[deltaKey];




        RunStepDeltaObject_delta* obj = &delta;
		obj->fromJson(value.dump());

    }


}

bourne::json
RunStepDeltaObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["object"] = getObject();







	object["delta"] = getDelta().toJson();


    return object;

}

std::string
RunStepDeltaObject::getId()
{
	return id;
}

void
RunStepDeltaObject::setId(std::string  id)
{
	this->id = id;
}

std::string
RunStepDeltaObject::getObject()
{
	return object;
}

void
RunStepDeltaObject::setObject(std::string  object)
{
	this->object = object;
}

RunStepDeltaObject_delta
RunStepDeltaObject::getDelta()
{
	return delta;
}

void
RunStepDeltaObject::setDelta(RunStepDeltaObject_delta  delta)
{
	this->delta = delta;
}



