

#include "User.h"

using namespace Tiny;

User::User()
{
	object = std::string();
	id = std::string();
	name = std::string();
	email = std::string();
	role = std::string();
	added_at = int(0);
}

User::User(std::string jsonString)
{
	this->fromJson(jsonString);
}

User::~User()
{

}

void
User::fromJson(std::string jsonObj)
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
User::toJson()
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
User::getObject()
{
	return object;
}

void
User::setObject(std::string  object)
{
	this->object = object;
}

std::string
User::getId()
{
	return id;
}

void
User::setId(std::string  id)
{
	this->id = id;
}

std::string
User::getName()
{
	return name;
}

void
User::setName(std::string  name)
{
	this->name = name;
}

std::string
User::getEmail()
{
	return email;
}

void
User::setEmail(std::string  email)
{
	this->email = email;
}

std::string
User::getRole()
{
	return role;
}

void
User::setRole(std::string  role)
{
	this->role = role;
}

int
User::getAddedAt()
{
	return added_at;
}

void
User::setAddedAt(int  added_at)
{
	this->added_at = added_at;
}



