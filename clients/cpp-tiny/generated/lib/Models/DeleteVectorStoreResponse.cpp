

#include "DeleteVectorStoreResponse.h"

using namespace Tiny;

DeleteVectorStoreResponse::DeleteVectorStoreResponse()
{
	id = std::string();
	deleted = bool(false);
	object = std::string();
}

DeleteVectorStoreResponse::DeleteVectorStoreResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeleteVectorStoreResponse::~DeleteVectorStoreResponse()
{

}

void
DeleteVectorStoreResponse::fromJson(std::string jsonObj)
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
DeleteVectorStoreResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["deleted"] = isDeleted();






    object["object"] = getObject();



    return object;

}

std::string
DeleteVectorStoreResponse::getId()
{
	return id;
}

void
DeleteVectorStoreResponse::setId(std::string  id)
{
	this->id = id;
}

bool
DeleteVectorStoreResponse::isDeleted()
{
	return deleted;
}

void
DeleteVectorStoreResponse::setDeleted(bool  deleted)
{
	this->deleted = deleted;
}

std::string
DeleteVectorStoreResponse::getObject()
{
	return object;
}

void
DeleteVectorStoreResponse::setObject(std::string  object)
{
	this->object = object;
}



