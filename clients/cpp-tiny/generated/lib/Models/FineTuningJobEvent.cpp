

#include "FineTuningJobEvent.h"

using namespace Tiny;

FineTuningJobEvent::FineTuningJobEvent()
{
	object = std::string();
	id = std::string();
	created_at = int(0);
	level = std::string();
	message = std::string();
	type = std::string();
	data = null;
}

FineTuningJobEvent::FineTuningJobEvent(std::string jsonString)
{
	this->fromJson(jsonString);
}

FineTuningJobEvent::~FineTuningJobEvent()
{

}

void
FineTuningJobEvent::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *created_atKey = "created_at";

    if(object.has_key(created_atKey))
    {
        bourne::json value = object[created_atKey];



        jsonToValue(&created_at, value, "int");


    }

    const char *levelKey = "level";

    if(object.has_key(levelKey))
    {
        bourne::json value = object[levelKey];



        jsonToValue(&level, value, "std::string");


    }

    const char *messageKey = "message";

    if(object.has_key(messageKey))
    {
        bourne::json value = object[messageKey];



        jsonToValue(&message, value, "std::string");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];




        Object* obj = &data;
		obj->fromJson(value.dump());

    }


}

bourne::json
FineTuningJobEvent::toJson()
{
    bourne::json object = bourne::json::object();





    object["object"] = getObject();






    object["id"] = getId();






    object["created_at"] = getCreatedAt();






    object["level"] = getLevel();






    object["message"] = getMessage();






    object["type"] = getType();







	object["data"] = getData().toJson();


    return object;

}

std::string
FineTuningJobEvent::getObject()
{
	return object;
}

void
FineTuningJobEvent::setObject(std::string  object)
{
	this->object = object;
}

std::string
FineTuningJobEvent::getId()
{
	return id;
}

void
FineTuningJobEvent::setId(std::string  id)
{
	this->id = id;
}

int
FineTuningJobEvent::getCreatedAt()
{
	return created_at;
}

void
FineTuningJobEvent::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
FineTuningJobEvent::getLevel()
{
	return level;
}

void
FineTuningJobEvent::setLevel(std::string  level)
{
	this->level = level;
}

std::string
FineTuningJobEvent::getMessage()
{
	return message;
}

void
FineTuningJobEvent::setMessage(std::string  message)
{
	this->message = message;
}

std::string
FineTuningJobEvent::getType()
{
	return type;
}

void
FineTuningJobEvent::setType(std::string  type)
{
	this->type = type;
}

Object
FineTuningJobEvent::getData()
{
	return data;
}

void
FineTuningJobEvent::setData(Object  data)
{
	this->data = data;
}



