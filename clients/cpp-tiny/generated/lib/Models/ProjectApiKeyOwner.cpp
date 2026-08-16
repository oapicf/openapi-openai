

#include "ProjectApiKey_owner.h"

using namespace Tiny;

ProjectApiKey_owner::ProjectApiKey_owner()
{
	type = std::string();
	user = ProjectUser();
	service_account = ProjectServiceAccount();
}

ProjectApiKey_owner::ProjectApiKey_owner(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProjectApiKey_owner::~ProjectApiKey_owner()
{

}

void
ProjectApiKey_owner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *userKey = "user";

    if(object.has_key(userKey))
    {
        bourne::json value = object[userKey];




        ProjectUser* obj = &user;
		obj->fromJson(value.dump());

    }

    const char *service_accountKey = "service_account";

    if(object.has_key(service_accountKey))
    {
        bourne::json value = object[service_accountKey];




        ProjectServiceAccount* obj = &service_account;
		obj->fromJson(value.dump());

    }


}

bourne::json
ProjectApiKey_owner::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["user"] = getUser().toJson();






	object["service_account"] = getServiceAccount().toJson();


    return object;

}

std::string
ProjectApiKey_owner::getType()
{
	return type;
}

void
ProjectApiKey_owner::setType(std::string  type)
{
	this->type = type;
}

ProjectUser
ProjectApiKey_owner::getUser()
{
	return user;
}

void
ProjectApiKey_owner::setUser(ProjectUser  user)
{
	this->user = user;
}

ProjectServiceAccount
ProjectApiKey_owner::getServiceAccount()
{
	return service_account;
}

void
ProjectApiKey_owner::setServiceAccount(ProjectServiceAccount  service_account)
{
	this->service_account = service_account;
}



