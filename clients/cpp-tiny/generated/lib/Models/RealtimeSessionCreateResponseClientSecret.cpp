

#include "RealtimeSessionCreateResponse_client_secret.h"

using namespace Tiny;

RealtimeSessionCreateResponse_client_secret::RealtimeSessionCreateResponse_client_secret()
{
	value = std::string();
	expires_at = int(0);
}

RealtimeSessionCreateResponse_client_secret::RealtimeSessionCreateResponse_client_secret(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeSessionCreateResponse_client_secret::~RealtimeSessionCreateResponse_client_secret()
{

}

void
RealtimeSessionCreateResponse_client_secret::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "std::string");


    }

    const char *expires_atKey = "expires_at";

    if(object.has_key(expires_atKey))
    {
        bourne::json value = object[expires_atKey];



        jsonToValue(&expires_at, value, "int");


    }


}

bourne::json
RealtimeSessionCreateResponse_client_secret::toJson()
{
    bourne::json object = bourne::json::object();





    object["value"] = getValue();






    object["expires_at"] = getExpiresAt();



    return object;

}

std::string
RealtimeSessionCreateResponse_client_secret::getValue()
{
	return value;
}

void
RealtimeSessionCreateResponse_client_secret::setValue(std::string  value)
{
	this->value = value;
}

int
RealtimeSessionCreateResponse_client_secret::getExpiresAt()
{
	return expires_at;
}

void
RealtimeSessionCreateResponse_client_secret::setExpiresAt(int  expires_at)
{
	this->expires_at = expires_at;
}



