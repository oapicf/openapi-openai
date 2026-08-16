

#include "DeleteFileResponse.h"

using namespace Tiny;

DeleteFileResponse::DeleteFileResponse()
{
	id = std::string();
	object = std::string();
	deleted = bool(false);
}

DeleteFileResponse::DeleteFileResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeleteFileResponse::~DeleteFileResponse()
{

}

void
DeleteFileResponse::fromJson(std::string jsonObj)
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

    const char *deletedKey = "deleted";

    if(object.has_key(deletedKey))
    {
        bourne::json value = object[deletedKey];



        jsonToValue(&deleted, value, "bool");


    }


}

bourne::json
DeleteFileResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["object"] = getObject();






    object["deleted"] = isDeleted();



    return object;

}

std::string
DeleteFileResponse::getId()
{
	return id;
}

void
DeleteFileResponse::setId(std::string  id)
{
	this->id = id;
}

std::string
DeleteFileResponse::getObject()
{
	return object;
}

void
DeleteFileResponse::setObject(std::string  object)
{
	this->object = object;
}

bool
DeleteFileResponse::isDeleted()
{
	return deleted;
}

void
DeleteFileResponse::setDeleted(bool  deleted)
{
	this->deleted = deleted;
}



