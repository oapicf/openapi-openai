

#include "AuditLog_invite_accepted.h"

using namespace Tiny;

AuditLog_invite_accepted::AuditLog_invite_accepted()
{
	id = std::string();
}

AuditLog_invite_accepted::AuditLog_invite_accepted(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLog_invite_accepted::~AuditLog_invite_accepted()
{

}

void
AuditLog_invite_accepted::fromJson(std::string jsonObj)
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
AuditLog_invite_accepted::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();



    return object;

}

std::string
AuditLog_invite_accepted::getId()
{
	return id;
}

void
AuditLog_invite_accepted::setId(std::string  id)
{
	this->id = id;
}



