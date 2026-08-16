

#include "RunObject_incomplete_details.h"

using namespace Tiny;

RunObject_incomplete_details::RunObject_incomplete_details()
{
	reason = std::string();
}

RunObject_incomplete_details::RunObject_incomplete_details(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunObject_incomplete_details::~RunObject_incomplete_details()
{

}

void
RunObject_incomplete_details::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *reasonKey = "reason";

    if(object.has_key(reasonKey))
    {
        bourne::json value = object[reasonKey];



        jsonToValue(&reason, value, "std::string");


    }


}

bourne::json
RunObject_incomplete_details::toJson()
{
    bourne::json object = bourne::json::object();





    object["reason"] = getReason();



    return object;

}

std::string
RunObject_incomplete_details::getReason()
{
	return reason;
}

void
RunObject_incomplete_details::setReason(std::string  reason)
{
	this->reason = reason;
}



