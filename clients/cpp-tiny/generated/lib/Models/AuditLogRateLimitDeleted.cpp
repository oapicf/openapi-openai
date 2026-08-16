

#include "AuditLog_rate_limit_deleted.h"

using namespace Tiny;

AuditLog_rate_limit_deleted::AuditLog_rate_limit_deleted()
{
	id = std::string();
}

AuditLog_rate_limit_deleted::AuditLog_rate_limit_deleted(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLog_rate_limit_deleted::~AuditLog_rate_limit_deleted()
{

}

void
AuditLog_rate_limit_deleted::fromJson(std::string jsonObj)
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
AuditLog_rate_limit_deleted::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();



    return object;

}

std::string
AuditLog_rate_limit_deleted::getId()
{
	return id;
}

void
AuditLog_rate_limit_deleted::setId(std::string  id)
{
	this->id = id;
}



