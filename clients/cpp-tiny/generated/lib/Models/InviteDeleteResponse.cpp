

#include "InviteDeleteResponse.h"

using namespace Tiny;

InviteDeleteResponse::InviteDeleteResponse()
{
	object = std::string();
	id = std::string();
	deleted = bool(false);
}

InviteDeleteResponse::InviteDeleteResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

InviteDeleteResponse::~InviteDeleteResponse()
{

}

void
InviteDeleteResponse::fromJson(std::string jsonObj)
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
InviteDeleteResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["object"] = getObject();






    object["id"] = getId();






    object["deleted"] = isDeleted();



    return object;

}

std::string
InviteDeleteResponse::getObject()
{
	return object;
}

void
InviteDeleteResponse::setObject(std::string  object)
{
	this->object = object;
}

std::string
InviteDeleteResponse::getId()
{
	return id;
}

void
InviteDeleteResponse::setId(std::string  id)
{
	this->id = id;
}

bool
InviteDeleteResponse::isDeleted()
{
	return deleted;
}

void
InviteDeleteResponse::setDeleted(bool  deleted)
{
	this->deleted = deleted;
}



