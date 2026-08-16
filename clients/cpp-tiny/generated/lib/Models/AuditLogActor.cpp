

#include "AuditLogActor.h"

using namespace Tiny;

AuditLogActor::AuditLogActor()
{
	type = std::string();
	session = AuditLogActorSession();
	api_key = AuditLogActorApiKey();
}

AuditLogActor::AuditLogActor(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLogActor::~AuditLogActor()
{

}

void
AuditLogActor::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *sessionKey = "session";

    if(object.has_key(sessionKey))
    {
        bourne::json value = object[sessionKey];




        AuditLogActorSession* obj = &session;
		obj->fromJson(value.dump());

    }

    const char *api_keyKey = "api_key";

    if(object.has_key(api_keyKey))
    {
        bourne::json value = object[api_keyKey];




        AuditLogActorApiKey* obj = &api_key;
		obj->fromJson(value.dump());

    }


}

bourne::json
AuditLogActor::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["session"] = getSession().toJson();






	object["api_key"] = getApiKey().toJson();


    return object;

}

std::string
AuditLogActor::getType()
{
	return type;
}

void
AuditLogActor::setType(std::string  type)
{
	this->type = type;
}

AuditLogActorSession
AuditLogActor::getSession()
{
	return session;
}

void
AuditLogActor::setSession(AuditLogActorSession  session)
{
	this->session = session;
}

AuditLogActorApiKey
AuditLogActor::getApiKey()
{
	return api_key;
}

void
AuditLogActor::setApiKey(AuditLogActorApiKey  api_key)
{
	this->api_key = api_key;
}



