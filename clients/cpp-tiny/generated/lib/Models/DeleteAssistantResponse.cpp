

#include "DeleteAssistantResponse.h"

using namespace Tiny;

DeleteAssistantResponse::DeleteAssistantResponse()
{
	id = std::string();
	deleted = bool(false);
	object = std::string();
}

DeleteAssistantResponse::DeleteAssistantResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeleteAssistantResponse::~DeleteAssistantResponse()
{

}

void
DeleteAssistantResponse::fromJson(std::string jsonObj)
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
DeleteAssistantResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["deleted"] = isDeleted();






    object["object"] = getObject();



    return object;

}

std::string
DeleteAssistantResponse::getId()
{
	return id;
}

void
DeleteAssistantResponse::setId(std::string  id)
{
	this->id = id;
}

bool
DeleteAssistantResponse::isDeleted()
{
	return deleted;
}

void
DeleteAssistantResponse::setDeleted(bool  deleted)
{
	this->deleted = deleted;
}

std::string
DeleteAssistantResponse::getObject()
{
	return object;
}

void
DeleteAssistantResponse::setObject(std::string  object)
{
	this->object = object;
}



