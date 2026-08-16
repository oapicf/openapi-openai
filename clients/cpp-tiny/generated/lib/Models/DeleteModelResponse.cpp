

#include "DeleteModelResponse.h"

using namespace Tiny;

DeleteModelResponse::DeleteModelResponse()
{
	id = std::string();
	deleted = bool(false);
	object = std::string();
}

DeleteModelResponse::DeleteModelResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeleteModelResponse::~DeleteModelResponse()
{

}

void
DeleteModelResponse::fromJson(std::string jsonObj)
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
DeleteModelResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["deleted"] = isDeleted();






    object["object"] = getObject();



    return object;

}

std::string
DeleteModelResponse::getId()
{
	return id;
}

void
DeleteModelResponse::setId(std::string  id)
{
	this->id = id;
}

bool
DeleteModelResponse::isDeleted()
{
	return deleted;
}

void
DeleteModelResponse::setDeleted(bool  deleted)
{
	this->deleted = deleted;
}

std::string
DeleteModelResponse::getObject()
{
	return object;
}

void
DeleteModelResponse::setObject(std::string  object)
{
	this->object = object;
}



