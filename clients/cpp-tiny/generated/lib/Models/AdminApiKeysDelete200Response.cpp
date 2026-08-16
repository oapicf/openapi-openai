

#include "Admin_api_keys_delete_200_response.h"

using namespace Tiny;

Admin_api_keys_delete_200_response::Admin_api_keys_delete_200_response()
{
	id = std::string();
	object = std::string();
	deleted = bool(false);
}

Admin_api_keys_delete_200_response::Admin_api_keys_delete_200_response(std::string jsonString)
{
	this->fromJson(jsonString);
}

Admin_api_keys_delete_200_response::~Admin_api_keys_delete_200_response()
{

}

void
Admin_api_keys_delete_200_response::fromJson(std::string jsonObj)
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
Admin_api_keys_delete_200_response::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["object"] = getObject();






    object["deleted"] = isDeleted();



    return object;

}

std::string
Admin_api_keys_delete_200_response::getId()
{
	return id;
}

void
Admin_api_keys_delete_200_response::setId(std::string  id)
{
	this->id = id;
}

std::string
Admin_api_keys_delete_200_response::getObject()
{
	return object;
}

void
Admin_api_keys_delete_200_response::setObject(std::string  object)
{
	this->object = object;
}

bool
Admin_api_keys_delete_200_response::isDeleted()
{
	return deleted;
}

void
Admin_api_keys_delete_200_response::setDeleted(bool  deleted)
{
	this->deleted = deleted;
}



