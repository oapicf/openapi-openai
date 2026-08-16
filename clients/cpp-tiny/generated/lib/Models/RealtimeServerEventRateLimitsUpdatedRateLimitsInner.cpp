

#include "RealtimeServerEventRateLimitsUpdated_rate_limits_inner.h"

using namespace Tiny;

RealtimeServerEventRateLimitsUpdated_rate_limits_inner::RealtimeServerEventRateLimitsUpdated_rate_limits_inner()
{
	name = std::string();
	limit = int(0);
	remaining = int(0);
	reset_seconds = float(0);
}

RealtimeServerEventRateLimitsUpdated_rate_limits_inner::RealtimeServerEventRateLimitsUpdated_rate_limits_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeServerEventRateLimitsUpdated_rate_limits_inner::~RealtimeServerEventRateLimitsUpdated_rate_limits_inner()
{

}

void
RealtimeServerEventRateLimitsUpdated_rate_limits_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *limitKey = "limit";

    if(object.has_key(limitKey))
    {
        bourne::json value = object[limitKey];



        jsonToValue(&limit, value, "int");


    }

    const char *remainingKey = "remaining";

    if(object.has_key(remainingKey))
    {
        bourne::json value = object[remainingKey];



        jsonToValue(&remaining, value, "int");


    }

    const char *reset_secondsKey = "reset_seconds";

    if(object.has_key(reset_secondsKey))
    {
        bourne::json value = object[reset_secondsKey];



        jsonToValue(&reset_seconds, value, "long");


    }


}

bourne::json
RealtimeServerEventRateLimitsUpdated_rate_limits_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["limit"] = getLimit();






    object["remaining"] = getRemaining();






    object["reset_seconds"] = getResetSeconds();



    return object;

}

std::string
RealtimeServerEventRateLimitsUpdated_rate_limits_inner::getName()
{
	return name;
}

void
RealtimeServerEventRateLimitsUpdated_rate_limits_inner::setName(std::string  name)
{
	this->name = name;
}

int
RealtimeServerEventRateLimitsUpdated_rate_limits_inner::getLimit()
{
	return limit;
}

void
RealtimeServerEventRateLimitsUpdated_rate_limits_inner::setLimit(int  limit)
{
	this->limit = limit;
}

int
RealtimeServerEventRateLimitsUpdated_rate_limits_inner::getRemaining()
{
	return remaining;
}

void
RealtimeServerEventRateLimitsUpdated_rate_limits_inner::setRemaining(int  remaining)
{
	this->remaining = remaining;
}

long
RealtimeServerEventRateLimitsUpdated_rate_limits_inner::getResetSeconds()
{
	return reset_seconds;
}

void
RealtimeServerEventRateLimitsUpdated_rate_limits_inner::setResetSeconds(long  reset_seconds)
{
	this->reset_seconds = reset_seconds;
}



