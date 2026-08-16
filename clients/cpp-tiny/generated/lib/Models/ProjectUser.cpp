

#include "ProjectUser.h"

using namespace Tiny;

ProjectUser::ProjectUser()
{
	object = std::string();
	id = std::string();
	name = std::string();
	email = std::string();
	role = std::string();
	added_at = int(0);
}

ProjectUser::ProjectUser(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProjectUser::~ProjectUser()
{

}

void
ProjectUser::fromJson(std::string jsonObj)
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

    const char *emailKey = "email";

    if(object.has_key(emailKey))
    {
        bourne::json value = object[emailKey];



        jsonToValue(&email, value, "std::string");


    }

    const char *roleKey = "role";

    if(object.has_key(roleKey))
    {
        bourne::json value = object[roleKey];



        jsonToValue(&role, value, "std::string");


    }

    const char *added_atKey = "added_at";

    if(object.has_key(added_atKey))
    {
        bourne::json value = object[added_atKey];



        jsonToValue(&added_at, value, "int");


    }


}

bourne::json
ProjectUser::toJson()
{
    bourne::json object = bourne::json::object();





    object["object"] = getObject();






    object["id"] = getId();






    object["name"] = getName();






    object["email"] = getEmail();






    object["role"] = getRole();






    object["added_at"] = getAddedAt();



    return object;

}

std::string
ProjectUser::getObject()
{
	return object;
}

void
ProjectUser::setObject(std::string  object)
{
	this->object = object;
}

std::string
ProjectUser::getId()
{
	return id;
}

void
ProjectUser::setId(std::string  id)
{
	this->id = id;
}

std::string
ProjectUser::getName()
{
	return name;
}

void
ProjectUser::setName(std::string  name)
{
	this->name = name;
}

std::string
ProjectUser::getEmail()
{
	return email;
}

void
ProjectUser::setEmail(std::string  email)
{
	this->email = email;
}

std::string
ProjectUser::getRole()
{
	return role;
}

void
ProjectUser::setRole(std::string  role)
{
	this->role = role;
}

int
ProjectUser::getAddedAt()
{
	return added_at;
}

void
ProjectUser::setAddedAt(int  added_at)
{
	this->added_at = added_at;
}



