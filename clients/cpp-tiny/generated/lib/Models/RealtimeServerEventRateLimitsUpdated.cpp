

#include "RealtimeServerEventRateLimitsUpdated.h"

using namespace Tiny;

RealtimeServerEventRateLimitsUpdated::RealtimeServerEventRateLimitsUpdated()
{
	event_id = std::string();
	type = std::string();
	rate_limits = std::list<RealtimeServerEventRateLimitsUpdated_rate_limits_inner>();
}

RealtimeServerEventRateLimitsUpdated::RealtimeServerEventRateLimitsUpdated(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeServerEventRateLimitsUpdated::~RealtimeServerEventRateLimitsUpdated()
{

}

void
RealtimeServerEventRateLimitsUpdated::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *event_idKey = "event_id";

    if(object.has_key(event_idKey))
    {
        bourne::json value = object[event_idKey];



        jsonToValue(&event_id, value, "std::string");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *rate_limitsKey = "rate_limits";

    if(object.has_key(rate_limitsKey))
    {
        bourne::json value = object[rate_limitsKey];


        std::list<RealtimeServerEventRateLimitsUpdated_rate_limits_inner> rate_limits_list;
        RealtimeServerEventRateLimitsUpdated_rate_limits_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            rate_limits_list.push_back(element);
        }
        rate_limits = rate_limits_list;


    }


}

bourne::json
RealtimeServerEventRateLimitsUpdated::toJson()
{
    bourne::json object = bourne::json::object();





    object["event_id"] = getEventId();






    object["type"] = getType();





    std::list<RealtimeServerEventRateLimitsUpdated_rate_limits_inner> rate_limits_list = getRateLimits();
    bourne::json rate_limits_arr = bourne::json::array();

    for(auto& var : rate_limits_list)
    {
        RealtimeServerEventRateLimitsUpdated_rate_limits_inner obj = var;
        rate_limits_arr.append(obj.toJson());
    }
    object["rate_limits"] = rate_limits_arr;




    return object;

}

std::string
RealtimeServerEventRateLimitsUpdated::getEventId()
{
	return event_id;
}

void
RealtimeServerEventRateLimitsUpdated::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventRateLimitsUpdated::getType()
{
	return type;
}

void
RealtimeServerEventRateLimitsUpdated::setType(std::string  type)
{
	this->type = type;
}

std::list<RealtimeServerEventRateLimitsUpdated_rate_limits_inner>
RealtimeServerEventRateLimitsUpdated::getRateLimits()
{
	return rate_limits;
}

void
RealtimeServerEventRateLimitsUpdated::setRateLimits(std::list <RealtimeServerEventRateLimitsUpdated_rate_limits_inner> rate_limits)
{
	this->rate_limits = rate_limits;
}



