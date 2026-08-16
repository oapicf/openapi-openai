

#include "ProjectUserDeleteResponse.h"

using namespace Tiny;

ProjectUserDeleteResponse::ProjectUserDeleteResponse()
{
	object = std::string();
	id = std::string();
	deleted = bool(false);
}

ProjectUserDeleteResponse::ProjectUserDeleteResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProjectUserDeleteResponse::~ProjectUserDeleteResponse()
{

}

void
ProjectUserDeleteResponse::fromJson(std::string jsonObj)
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
ProjectUserDeleteResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["object"] = getObject();






    object["id"] = getId();






    object["deleted"] = isDeleted();



    return object;

}

std::string
ProjectUserDeleteResponse::getObject()
{
	return object;
}

void
ProjectUserDeleteResponse::setObject(std::string  object)
{
	this->object = object;
}

std::string
ProjectUserDeleteResponse::getId()
{
	return id;
}

void
ProjectUserDeleteResponse::setId(std::string  id)
{
	this->id = id;
}

bool
ProjectUserDeleteResponse::isDeleted()
{
	return deleted;
}

void
ProjectUserDeleteResponse::setDeleted(bool  deleted)
{
	this->deleted = deleted;
}



