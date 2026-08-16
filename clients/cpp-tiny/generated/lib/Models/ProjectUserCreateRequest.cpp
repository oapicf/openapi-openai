

#include "ProjectUserCreateRequest.h"

using namespace Tiny;

ProjectUserCreateRequest::ProjectUserCreateRequest()
{
	user_id = std::string();
	role = std::string();
}

ProjectUserCreateRequest::ProjectUserCreateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProjectUserCreateRequest::~ProjectUserCreateRequest()
{

}

void
ProjectUserCreateRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *user_idKey = "user_id";

    if(object.has_key(user_idKey))
    {
        bourne::json value = object[user_idKey];



        jsonToValue(&user_id, value, "std::string");


    }

    const char *roleKey = "role";

    if(object.has_key(roleKey))
    {
        bourne::json value = object[roleKey];



        jsonToValue(&role, value, "std::string");


    }


}

bourne::json
ProjectUserCreateRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["user_id"] = getUserId();






    object["role"] = getRole();



    return object;

}

std::string
ProjectUserCreateRequest::getUserId()
{
	return user_id;
}

void
ProjectUserCreateRequest::setUserId(std::string  user_id)
{
	this->user_id = user_id;
}

std::string
ProjectUserCreateRequest::getRole()
{
	return role;
}

void
ProjectUserCreateRequest::setRole(std::string  role)
{
	this->role = role;
}



