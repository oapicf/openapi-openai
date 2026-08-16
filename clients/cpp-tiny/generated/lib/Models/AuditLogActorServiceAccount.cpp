

#include "AuditLogActorServiceAccount.h"

using namespace Tiny;

AuditLogActorServiceAccount::AuditLogActorServiceAccount()
{
	id = std::string();
}

AuditLogActorServiceAccount::AuditLogActorServiceAccount(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLogActorServiceAccount::~AuditLogActorServiceAccount()
{

}

void
AuditLogActorServiceAccount::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }


}

bourne::json
AuditLogActorServiceAccount::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();



    return object;

}

std::string
AuditLogActorServiceAccount::getId()
{
	return id;
}

void
AuditLogActorServiceAccount::setId(std::string  id)
{
	this->id = id;
}



