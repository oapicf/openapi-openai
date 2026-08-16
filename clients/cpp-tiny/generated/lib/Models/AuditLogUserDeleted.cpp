

#include "AuditLog_user_deleted.h"

using namespace Tiny;

AuditLog_user_deleted::AuditLog_user_deleted()
{
	id = std::string();
}

AuditLog_user_deleted::AuditLog_user_deleted(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLog_user_deleted::~AuditLog_user_deleted()
{

}

void
AuditLog_user_deleted::fromJson(std::string jsonObj)
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
AuditLog_user_deleted::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();



    return object;

}

std::string
AuditLog_user_deleted::getId()
{
	return id;
}

void
AuditLog_user_deleted::setId(std::string  id)
{
	this->id = id;
}



