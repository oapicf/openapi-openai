

#include "MessageDeltaObject.h"

using namespace Tiny;

MessageDeltaObject::MessageDeltaObject()
{
	id = std::string();
	object = std::string();
	delta = MessageDeltaObject_delta();
}

MessageDeltaObject::MessageDeltaObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageDeltaObject::~MessageDeltaObject()
{

}

void
MessageDeltaObject::fromJson(std::string jsonObj)
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




        MessageDeltaObject_delta* obj = &delta;
		obj->fromJson(value.dump());

    }


}

bourne::json
MessageDeltaObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["object"] = getObject();







	object["delta"] = getDelta().toJson();


    return object;

}

std::string
MessageDeltaObject::getId()
{
	return id;
}

void
MessageDeltaObject::setId(std::string  id)
{
	this->id = id;
}

std::string
MessageDeltaObject::getObject()
{
	return object;
}

void
MessageDeltaObject::setObject(std::string  object)
{
	this->object = object;
}

MessageDeltaObject_delta
MessageDeltaObject::getDelta()
{
	return delta;
}

void
MessageDeltaObject::setDelta(MessageDeltaObject_delta  delta)
{
	this->delta = delta;
}



