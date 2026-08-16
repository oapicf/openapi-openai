

#include "RealtimeResponse_status_details_error.h"

using namespace Tiny;

RealtimeResponse_status_details_error::RealtimeResponse_status_details_error()
{
	type = std::string();
	code = std::string();
}

RealtimeResponse_status_details_error::RealtimeResponse_status_details_error(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeResponse_status_details_error::~RealtimeResponse_status_details_error()
{

}

void
RealtimeResponse_status_details_error::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *codeKey = "code";

    if(object.has_key(codeKey))
    {
        bourne::json value = object[codeKey];



        jsonToValue(&code, value, "std::string");


    }


}

bourne::json
RealtimeResponse_status_details_error::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();






    object["code"] = getCode();



    return object;

}

std::string
RealtimeResponse_status_details_error::getType()
{
	return type;
}

void
RealtimeResponse_status_details_error::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeResponse_status_details_error::getCode()
{
	return code;
}

void
RealtimeResponse_status_details_error::setCode(std::string  code)
{
	this->code = code;
}



