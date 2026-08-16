

#include "ProjectApiKeyDeleteResponse.h"

using namespace Tiny;

ProjectApiKeyDeleteResponse::ProjectApiKeyDeleteResponse()
{
	object = std::string();
	id = std::string();
	deleted = bool(false);
}

ProjectApiKeyDeleteResponse::ProjectApiKeyDeleteResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProjectApiKeyDeleteResponse::~ProjectApiKeyDeleteResponse()
{

}

void
ProjectApiKeyDeleteResponse::fromJson(std::string jsonObj)
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
ProjectApiKeyDeleteResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["object"] = getObject();






    object["id"] = getId();






    object["deleted"] = isDeleted();



    return object;

}

std::string
ProjectApiKeyDeleteResponse::getObject()
{
	return object;
}

void
ProjectApiKeyDeleteResponse::setObject(std::string  object)
{
	this->object = object;
}

std::string
ProjectApiKeyDeleteResponse::getId()
{
	return id;
}

void
ProjectApiKeyDeleteResponse::setId(std::string  id)
{
	this->id = id;
}

bool
ProjectApiKeyDeleteResponse::isDeleted()
{
	return deleted;
}

void
ProjectApiKeyDeleteResponse::setDeleted(bool  deleted)
{
	this->deleted = deleted;
}



