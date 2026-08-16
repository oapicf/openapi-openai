

#include "DeleteThreadResponse.h"

using namespace Tiny;

DeleteThreadResponse::DeleteThreadResponse()
{
	id = std::string();
	deleted = bool(false);
	object = std::string();
}

DeleteThreadResponse::DeleteThreadResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeleteThreadResponse::~DeleteThreadResponse()
{

}

void
DeleteThreadResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *deletedKey = "deleted";

    if(object.has_key(deletedKey))
    {
        bourne::json value = object[deletedKey];



        jsonToValue(&deleted, value, "bool");


    }

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }


}

bourne::json
DeleteThreadResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["deleted"] = isDeleted();






    object["object"] = getObject();



    return object;

}

std::string
DeleteThreadResponse::getId()
{
	return id;
}

void
DeleteThreadResponse::setId(std::string  id)
{
	this->id = id;
}

bool
DeleteThreadResponse::isDeleted()
{
	return deleted;
}

void
DeleteThreadResponse::setDeleted(bool  deleted)
{
	this->deleted = deleted;
}

std::string
DeleteThreadResponse::getObject()
{
	return object;
}

void
DeleteThreadResponse::setObject(std::string  object)
{
	this->object = object;
}



