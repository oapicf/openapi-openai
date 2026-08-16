

#include "UserDeleteResponse.h"

using namespace Tiny;

UserDeleteResponse::UserDeleteResponse()
{
	object = std::string();
	id = std::string();
	deleted = bool(false);
}

UserDeleteResponse::UserDeleteResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

UserDeleteResponse::~UserDeleteResponse()
{

}

void
UserDeleteResponse::fromJson(std::string jsonObj)
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

    const char *deletedKey = "deleted";

    if(object.has_key(deletedKey))
    {
        bourne::json value = object[deletedKey];



        jsonToValue(&deleted, value, "bool");


    }


}

bourne::json
UserDeleteResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["object"] = getObject();






    object["id"] = getId();






    object["deleted"] = isDeleted();



    return object;

}

std::string
UserDeleteResponse::getObject()
{
	return object;
}

void
UserDeleteResponse::setObject(std::string  object)
{
	this->object = object;
}

std::string
UserDeleteResponse::getId()
{
	return id;
}

void
UserDeleteResponse::setId(std::string  id)
{
	this->id = id;
}

bool
UserDeleteResponse::isDeleted()
{
	return deleted;
}

void
UserDeleteResponse::setDeleted(bool  deleted)
{
	this->deleted = deleted;
}



