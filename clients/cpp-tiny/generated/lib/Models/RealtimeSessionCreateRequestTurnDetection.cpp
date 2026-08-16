

#include "RealtimeSessionCreateRequest_turn_detection.h"

using namespace Tiny;

RealtimeSessionCreateRequest_turn_detection::RealtimeSessionCreateRequest_turn_detection()
{
	type = std::string();
	threshold = float(0);
	prefix_padding_ms = int(0);
	silence_duration_ms = int(0);
	create_response = bool(false);
}

RealtimeSessionCreateRequest_turn_detection::RealtimeSessionCreateRequest_turn_detection(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeSessionCreateRequest_turn_detection::~RealtimeSessionCreateRequest_turn_detection()
{

}

void
RealtimeSessionCreateRequest_turn_detection::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *thresholdKey = "threshold";

    if(object.has_key(thresholdKey))
    {
        bourne::json value = object[thresholdKey];



        jsonToValue(&threshold, value, "long");


    }

    const char *prefix_padding_msKey = "prefix_padding_ms";

    if(object.has_key(prefix_padding_msKey))
    {
        bourne::json value = object[prefix_padding_msKey];



        jsonToValue(&prefix_padding_ms, value, "int");


    }

    const char *silence_duration_msKey = "silence_duration_ms";

    if(object.has_key(silence_duration_msKey))
    {
        bourne::json value = object[silence_duration_msKey];



        jsonToValue(&silence_duration_ms, value, "int");


    }

    const char *create_responseKey = "create_response";

    if(object.has_key(create_responseKey))
    {
        bourne::json value = object[create_responseKey];



        jsonToValue(&create_response, value, "bool");


    }


}

bourne::json
RealtimeSessionCreateRequest_turn_detection::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();






    object["threshold"] = getThreshold();






    object["prefix_padding_ms"] = getPrefixPaddingMs();






    object["silence_duration_ms"] = getSilenceDurationMs();






    object["create_response"] = isCreateResponse();



    return object;

}

std::string
RealtimeSessionCreateRequest_turn_detection::getType()
{
	return type;
}

void
RealtimeSessionCreateRequest_turn_detection::setType(std::string  type)
{
	this->type = type;
}

long
RealtimeSessionCreateRequest_turn_detection::getThreshold()
{
	return threshold;
}

void
RealtimeSessionCreateRequest_turn_detection::setThreshold(long  threshold)
{
	this->threshold = threshold;
}

int
RealtimeSessionCreateRequest_turn_detection::getPrefixPaddingMs()
{
	return prefix_padding_ms;
}

void
RealtimeSessionCreateRequest_turn_detection::setPrefixPaddingMs(int  prefix_padding_ms)
{
	this->prefix_padding_ms = prefix_padding_ms;
}

int
RealtimeSessionCreateRequest_turn_detection::getSilenceDurationMs()
{
	return silence_duration_ms;
}

void
RealtimeSessionCreateRequest_turn_detection::setSilenceDurationMs(int  silence_duration_ms)
{
	this->silence_duration_ms = silence_duration_ms;
}

bool
RealtimeSessionCreateRequest_turn_detection::isCreateResponse()
{
	return create_response;
}

void
RealtimeSessionCreateRequest_turn_detection::setCreateResponse(bool  create_response)
{
	this->create_response = create_response;
}



