

#include "DeleteMessageResponse.h"

using namespace Tiny;

DeleteMessageResponse::DeleteMessageResponse()
{
	id = std::string();
	deleted = bool(false);
	object = std::string();
}

DeleteMessageResponse::DeleteMessageResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeleteMessageResponse::~DeleteMessageResponse()
{

}

void
DeleteMessageResponse::fromJson(std::string jsonObj)
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
DeleteMessageResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["deleted"] = isDeleted();






    object["object"] = getObject();



    return object;

}

std::string
DeleteMessageResponse::getId()
{
	return id;
}

void
DeleteMessageResponse::setId(std::string  id)
{
	this->id = id;
}

bool
DeleteMessageResponse::isDeleted()
{
	return deleted;
}

void
DeleteMessageResponse::setDeleted(bool  deleted)
{
	this->deleted = deleted;
}

std::string
DeleteMessageResponse::getObject()
{
	return object;
}

void
DeleteMessageResponse::setObject(std::string  object)
{
	this->object = object;
}



