

#include "AuditLogActorUser.h"

using namespace Tiny;

AuditLogActorUser::AuditLogActorUser()
{
	id = std::string();
	email = std::string();
}

AuditLogActorUser::AuditLogActorUser(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLogActorUser::~AuditLogActorUser()
{

}

void
AuditLogActorUser::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *emailKey = "email";

    if(object.has_key(emailKey))
    {
        bourne::json value = object[emailKey];



        jsonToValue(&email, value, "std::string");


    }


}

bourne::json
AuditLogActorUser::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["email"] = getEmail();



    return object;

}

std::string
AuditLogActorUser::getId()
{
	return id;
}

void
AuditLogActorUser::setId(std::string  id)
{
	this->id = id;
}

std::string
AuditLogActorUser::getEmail()
{
	return email;
}

void
AuditLogActorUser::setEmail(std::string  email)
{
	this->email = email;
}



