

#include "ProjectUserUpdateRequest.h"

using namespace Tiny;

ProjectUserUpdateRequest::ProjectUserUpdateRequest()
{
	role = std::string();
}

ProjectUserUpdateRequest::ProjectUserUpdateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProjectUserUpdateRequest::~ProjectUserUpdateRequest()
{

}

void
ProjectUserUpdateRequest::fromJson(std::string jsonObj)
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
ProjectUserUpdateRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["role"] = getRole();



    return object;

}

std::string
ProjectUserUpdateRequest::getRole()
{
	return role;
}

void
ProjectUserUpdateRequest::setRole(std::string  role)
{
	this->role = role;
}



