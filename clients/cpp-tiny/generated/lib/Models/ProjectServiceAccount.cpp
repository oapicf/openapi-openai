

#include "ProjectServiceAccount.h"

using namespace Tiny;

ProjectServiceAccount::ProjectServiceAccount()
{
	object = std::string();
	id = std::string();
	name = std::string();
	role = std::string();
	created_at = int(0);
}

ProjectServiceAccount::ProjectServiceAccount(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProjectServiceAccount::~ProjectServiceAccount()
{

}

void
ProjectServiceAccount::fromJson(std::string jsonObj)
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


}

bourne::json
ProjectServiceAccount::toJson()
{
    bourne::json object = bourne::json::object();





    object["object"] = getObject();






    object["id"] = getId();






    object["name"] = getName();






    object["role"] = getRole();






    object["created_at"] = getCreatedAt();



    return object;

}

std::string
ProjectServiceAccount::getObject()
{
	return object;
}

void
ProjectServiceAccount::setObject(std::string  object)
{
	this->object = object;
}

std::string
ProjectServiceAccount::getId()
{
	return id;
}

void
ProjectServiceAccount::setId(std::string  id)
{
	this->id = id;
}

std::string
ProjectServiceAccount::getName()
{
	return name;
}

void
ProjectServiceAccount::setName(std::string  name)
{
	this->name = name;
}

std::string
ProjectServiceAccount::getRole()
{
	return role;
}

void
ProjectServiceAccount::setRole(std::string  role)
{
	this->role = role;
}

int
ProjectServiceAccount::getCreatedAt()
{
	return created_at;
}

void
ProjectServiceAccount::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}



