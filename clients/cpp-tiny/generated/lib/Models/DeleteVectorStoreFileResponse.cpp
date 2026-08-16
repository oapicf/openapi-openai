

#include "DeleteVectorStoreFileResponse.h"

using namespace Tiny;

DeleteVectorStoreFileResponse::DeleteVectorStoreFileResponse()
{
	id = std::string();
	deleted = bool(false);
	object = std::string();
}

DeleteVectorStoreFileResponse::DeleteVectorStoreFileResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeleteVectorStoreFileResponse::~DeleteVectorStoreFileResponse()
{

}

void
DeleteVectorStoreFileResponse::fromJson(std::string jsonObj)
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
DeleteVectorStoreFileResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["deleted"] = isDeleted();






    object["object"] = getObject();



    return object;

}

std::string
DeleteVectorStoreFileResponse::getId()
{
	return id;
}

void
DeleteVectorStoreFileResponse::setId(std::string  id)
{
	this->id = id;
}

bool
DeleteVectorStoreFileResponse::isDeleted()
{
	return deleted;
}

void
DeleteVectorStoreFileResponse::setDeleted(bool  deleted)
{
	this->deleted = deleted;
}

std::string
DeleteVectorStoreFileResponse::getObject()
{
	return object;
}

void
DeleteVectorStoreFileResponse::setObject(std::string  object)
{
	this->object = object;
}



