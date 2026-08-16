

#include "UserRoleUpdateRequest.h"

using namespace Tiny;

UserRoleUpdateRequest::UserRoleUpdateRequest()
{
	role = std::string();
}

UserRoleUpdateRequest::UserRoleUpdateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

UserRoleUpdateRequest::~UserRoleUpdateRequest()
{

}

void
UserRoleUpdateRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *roleKey = "role";

    if(object.has_key(roleKey))
    {
        bourne::json value = object[roleKey];



        jsonToValue(&role, value, "std::string");


    }


}

bourne::json
UserRoleUpdateRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["role"] = getRole();



    return object;

}

std::string
UserRoleUpdateRequest::getRole()
{
	return role;
}

void
UserRoleUpdateRequest::setRole(std::string  role)
{
	this->role = role;
}



