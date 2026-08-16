

#include "RealtimeResponse_status_details.h"

using namespace Tiny;

RealtimeResponse_status_details::RealtimeResponse_status_details()
{
	type = std::string();
	reason = std::string();
	error = RealtimeResponse_status_details_error();
}

RealtimeResponse_status_details::RealtimeResponse_status_details(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeResponse_status_details::~RealtimeResponse_status_details()
{

}

void
RealtimeResponse_status_details::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *reasonKey = "reason";

    if(object.has_key(reasonKey))
    {
        bourne::json value = object[reasonKey];



        jsonToValue(&reason, value, "std::string");


    }

    const char *errorKey = "error";

    if(object.has_key(errorKey))
    {
        bourne::json value = object[errorKey];




        RealtimeResponse_status_details_error* obj = &error;
		obj->fromJson(value.dump());

    }


}

bourne::json
RealtimeResponse_status_details::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();






    object["reason"] = getReason();







	object["error"] = getError().toJson();


    return object;

}

std::string
RealtimeResponse_status_details::getType()
{
	return type;
}

void
RealtimeResponse_status_details::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeResponse_status_details::getReason()
{
	return reason;
}

void
RealtimeResponse_status_details::setReason(std::string  reason)
{
	this->reason = reason;
}

RealtimeResponse_status_details_error
RealtimeResponse_status_details::getError()
{
	return error;
}

void
RealtimeResponse_status_details::setError(RealtimeResponse_status_details_error  error)
{
	this->error = error;
}



