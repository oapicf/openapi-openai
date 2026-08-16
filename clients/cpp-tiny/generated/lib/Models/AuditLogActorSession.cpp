

#include "AuditLogActorSession.h"

using namespace Tiny;

AuditLogActorSession::AuditLogActorSession()
{
	user = AuditLogActorUser();
	ip_address = std::string();
}

AuditLogActorSession::AuditLogActorSession(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLogActorSession::~AuditLogActorSession()
{

}

void
AuditLogActorSession::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *userKey = "user";

    if(object.has_key(userKey))
    {
        bourne::json value = object[userKey];




        AuditLogActorUser* obj = &user;
		obj->fromJson(value.dump());

    }

    const char *ip_addressKey = "ip_address";

    if(object.has_key(ip_addressKey))
    {
        bourne::json value = object[ip_addressKey];



        jsonToValue(&ip_address, value, "std::string");


    }


}

bourne::json
AuditLogActorSession::toJson()
{
    bourne::json object = bourne::json::object();






	object["user"] = getUser().toJson();





    object["ip_address"] = getIpAddress();



    return object;

}

AuditLogActorUser
AuditLogActorSession::getUser()
{
	return user;
}

void
AuditLogActorSession::setUser(AuditLogActorUser  user)
{
	this->user = user;
}

std::string
AuditLogActorSession::getIpAddress()
{
	return ip_address;
}

void
AuditLogActorSession::setIpAddress(std::string  ip_address)
{
	this->ip_address = ip_address;
}



