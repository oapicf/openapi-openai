

#include "ProjectServiceAccountDeleteResponse.h"

using namespace Tiny;

ProjectServiceAccountDeleteResponse::ProjectServiceAccountDeleteResponse()
{
	object = std::string();
	id = std::string();
	deleted = bool(false);
}

ProjectServiceAccountDeleteResponse::ProjectServiceAccountDeleteResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProjectServiceAccountDeleteResponse::~ProjectServiceAccountDeleteResponse()
{

}

void
ProjectServiceAccountDeleteResponse::fromJson(std::string jsonObj)
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
ProjectServiceAccountDeleteResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["object"] = getObject();






    object["id"] = getId();






    object["deleted"] = isDeleted();



    return object;

}

std::string
ProjectServiceAccountDeleteResponse::getObject()
{
	return object;
}

void
ProjectServiceAccountDeleteResponse::setObject(std::string  object)
{
	this->object = object;
}

std::string
ProjectServiceAccountDeleteResponse::getId()
{
	return id;
}

void
ProjectServiceAccountDeleteResponse::setId(std::string  id)
{
	this->id = id;
}

bool
ProjectServiceAccountDeleteResponse::isDeleted()
{
	return deleted;
}

void
ProjectServiceAccountDeleteResponse::setDeleted(bool  deleted)
{
	this->deleted = deleted;
}



