

#include "AuditLog_api_key_deleted.h"

using namespace Tiny;

AuditLog_api_key_deleted::AuditLog_api_key_deleted()
{
	id = std::string();
}

AuditLog_api_key_deleted::AuditLog_api_key_deleted(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLog_api_key_deleted::~AuditLog_api_key_deleted()
{

}

void
AuditLog_api_key_deleted::fromJson(std::string jsonObj)
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
AuditLog_api_key_deleted::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();



    return object;

}

std::string
AuditLog_api_key_deleted::getId()
{
	return id;
}

void
AuditLog_api_key_deleted::setId(std::string  id)
{
	this->id = id;
}



