

#include "Invite_projects_inner.h"

using namespace Tiny;

Invite_projects_inner::Invite_projects_inner()
{
	id = std::string();
	role = std::string();
}

Invite_projects_inner::Invite_projects_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

Invite_projects_inner::~Invite_projects_inner()
{

}

void
Invite_projects_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *roleKey = "role";

    if(object.has_key(roleKey))
    {
        bourne::json value = object[roleKey];



        jsonToValue(&role, value, "std::string");


    }


}

bourne::json
Invite_projects_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["role"] = getRole();



    return object;

}

std::string
Invite_projects_inner::getId()
{
	return id;
}

void
Invite_projects_inner::setId(std::string  id)
{
	this->id = id;
}

std::string
Invite_projects_inner::getRole()
{
	return role;
}

void
Invite_projects_inner::setRole(std::string  role)
{
	this->role = role;
}



