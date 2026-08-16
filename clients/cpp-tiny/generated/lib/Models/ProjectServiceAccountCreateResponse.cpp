

#include "ProjectServiceAccountCreateResponse.h"

using namespace Tiny;

ProjectServiceAccountCreateResponse::ProjectServiceAccountCreateResponse()
{
	object = std::string();
	id = std::string();
	name = std::string();
	role = std::string();
	created_at = int(0);
	api_key = ProjectServiceAccountApiKey();
}

ProjectServiceAccountCreateResponse::ProjectServiceAccountCreateResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProjectServiceAccountCreateResponse::~ProjectServiceAccountCreateResponse()
{

}

void
ProjectServiceAccountCreateResponse::fromJson(std::string jsonObj)
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

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *roleKey = "role";

    if(object.has_key(roleKey))
    {
        bourne::json value = object[roleKey];



        jsonToValue(&role, value, "std::string");


    }

    const char *created_atKey = "created_at";

    if(object.has_key(created_atKey))
    {
        bourne::json value = object[created_atKey];



        jsonToValue(&created_at, value, "int");


    }

    const char *api_keyKey = "api_key";

    if(object.has_key(api_keyKey))
    {
        bourne::json value = object[api_keyKey];




        ProjectServiceAccountApiKey* obj = &api_key;
		obj->fromJson(value.dump());

    }


}

bourne::json
ProjectServiceAccountCreateResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["object"] = getObject();






    object["id"] = getId();






    object["name"] = getName();






    object["role"] = getRole();






    object["created_at"] = getCreatedAt();







	object["api_key"] = getApiKey().toJson();


    return object;

}

std::string
ProjectServiceAccountCreateResponse::getObject()
{
	return object;
}

void
ProjectServiceAccountCreateResponse::setObject(std::string  object)
{
	this->object = object;
}

std::string
ProjectServiceAccountCreateResponse::getId()
{
	return id;
}

void
ProjectServiceAccountCreateResponse::setId(std::string  id)
{
	this->id = id;
}

std::string
ProjectServiceAccountCreateResponse::getName()
{
	return name;
}

void
ProjectServiceAccountCreateResponse::setName(std::string  name)
{
	this->name = name;
}

std::string
ProjectServiceAccountCreateResponse::getRole()
{
	return role;
}

void
ProjectServiceAccountCreateResponse::setRole(std::string  role)
{
	this->role = role;
}

int
ProjectServiceAccountCreateResponse::getCreatedAt()
{
	return created_at;
}

void
ProjectServiceAccountCreateResponse::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

ProjectServiceAccountApiKey
ProjectServiceAccountCreateResponse::getApiKey()
{
	return api_key;
}

void
ProjectServiceAccountCreateResponse::setApiKey(ProjectServiceAccountApiKey  api_key)
{
	this->api_key = api_key;
}



