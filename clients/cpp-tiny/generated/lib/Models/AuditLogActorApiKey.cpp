

#include "AuditLogActorApiKey.h"

using namespace Tiny;

AuditLogActorApiKey::AuditLogActorApiKey()
{
	id = std::string();
	type = std::string();
	user = AuditLogActorUser();
	service_account = AuditLogActorServiceAccount();
}

AuditLogActorApiKey::AuditLogActorApiKey(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLogActorApiKey::~AuditLogActorApiKey()
{

}

void
AuditLogActorApiKey::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

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




        AuditLogActorUser* obj = &user;
		obj->fromJson(value.dump());

    }

    const char *service_accountKey = "service_account";

    if(object.has_key(service_accountKey))
    {
        bourne::json value = object[service_accountKey];




        AuditLogActorServiceAccount* obj = &service_account;
		obj->fromJson(value.dump());

    }


}

bourne::json
AuditLogActorApiKey::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["type"] = getType();







	object["user"] = getUser().toJson();






	object["service_account"] = getServiceAccount().toJson();


    return object;

}

std::string
AuditLogActorApiKey::getId()
{
	return id;
}

void
AuditLogActorApiKey::setId(std::string  id)
{
	this->id = id;
}

std::string
AuditLogActorApiKey::getType()
{
	return type;
}

void
AuditLogActorApiKey::setType(std::string  type)
{
	this->type = type;
}

AuditLogActorUser
AuditLogActorApiKey::getUser()
{
	return user;
}

void
AuditLogActorApiKey::setUser(AuditLogActorUser  user)
{
	this->user = user;
}

AuditLogActorServiceAccount
AuditLogActorApiKey::getServiceAccount()
{
	return service_account;
}

void
AuditLogActorApiKey::setServiceAccount(AuditLogActorServiceAccount  service_account)
{
	this->service_account = service_account;
}



