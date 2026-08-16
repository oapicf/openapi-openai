

#include "AdminApiKey_owner.h"

using namespace Tiny;

AdminApiKey_owner::AdminApiKey_owner()
{
	type = std::string();
	id = std::string();
	name = std::string();
	created_at = long(0);
	role = std::string();
}

AdminApiKey_owner::AdminApiKey_owner(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdminApiKey_owner::~AdminApiKey_owner()
{

}

void
AdminApiKey_owner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


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

    const char *created_atKey = "created_at";

    if(object.has_key(created_atKey))
    {
        bourne::json value = object[created_atKey];



        jsonToValue(&created_at, value, "long");


    }

    const char *roleKey = "role";

    if(object.has_key(roleKey))
    {
        bourne::json value = object[roleKey];



        jsonToValue(&role, value, "std::string");


    }


}

bourne::json
AdminApiKey_owner::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();






    object["id"] = getId();






    object["name"] = getName();






    object["created_at"] = getCreatedAt();






    object["role"] = getRole();



    return object;

}

std::string
AdminApiKey_owner::getType()
{
	return type;
}

void
AdminApiKey_owner::setType(std::string  type)
{
	this->type = type;
}

std::string
AdminApiKey_owner::getId()
{
	return id;
}

void
AdminApiKey_owner::setId(std::string  id)
{
	this->id = id;
}

std::string
AdminApiKey_owner::getName()
{
	return name;
}

void
AdminApiKey_owner::setName(std::string  name)
{
	this->name = name;
}

long
AdminApiKey_owner::getCreatedAt()
{
	return created_at;
}

void
AdminApiKey_owner::setCreatedAt(long  created_at)
{
	this->created_at = created_at;
}

std::string
AdminApiKey_owner::getRole()
{
	return role;
}

void
AdminApiKey_owner::setRole(std::string  role)
{
	this->role = role;
}



