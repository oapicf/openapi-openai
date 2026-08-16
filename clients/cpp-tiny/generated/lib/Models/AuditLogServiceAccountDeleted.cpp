

#include "AuditLog_service_account_deleted.h"

using namespace Tiny;

AuditLog_service_account_deleted::AuditLog_service_account_deleted()
{
	id = std::string();
}

AuditLog_service_account_deleted::AuditLog_service_account_deleted(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLog_service_account_deleted::~AuditLog_service_account_deleted()
{

}

void
AuditLog_service_account_deleted::fromJson(std::string jsonObj)
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
AuditLog_service_account_deleted::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();



    return object;

}

std::string
AuditLog_service_account_deleted::getId()
{
	return id;
}

void
AuditLog_service_account_deleted::setId(std::string  id)
{
	this->id = id;
}



