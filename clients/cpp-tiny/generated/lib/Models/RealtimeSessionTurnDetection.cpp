

#include "RealtimeSession_turn_detection.h"

using namespace Tiny;

RealtimeSession_turn_detection::RealtimeSession_turn_detection()
{
	type = std::string();
	threshold = float(0);
	prefix_padding_ms = int(0);
	silence_duration_ms = int(0);
}

RealtimeSession_turn_detection::RealtimeSession_turn_detection(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeSession_turn_detection::~RealtimeSession_turn_detection()
{

}

void
RealtimeSession_turn_detection::fromJson(std::string jsonObj)
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


}

bourne::json
RealtimeSession_turn_detection::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();






    object["threshold"] = getThreshold();






    object["prefix_padding_ms"] = getPrefixPaddingMs();






    object["silence_duration_ms"] = getSilenceDurationMs();



    return object;

}

std::string
RealtimeSession_turn_detection::getType()
{
	return type;
}

void
RealtimeSession_turn_detection::setType(std::string  type)
{
	this->type = type;
}

long
RealtimeSession_turn_detection::getThreshold()
{
	return threshold;
}

void
RealtimeSession_turn_detection::setThreshold(long  threshold)
{
	this->threshold = threshold;
}

int
RealtimeSession_turn_detection::getPrefixPaddingMs()
{
	return prefix_padding_ms;
}

void
RealtimeSession_turn_detection::setPrefixPaddingMs(int  prefix_padding_ms)
{
	this->prefix_padding_ms = prefix_padding_ms;
}

int
RealtimeSession_turn_detection::getSilenceDurationMs()
{
	return silence_duration_ms;
}

void
RealtimeSession_turn_detection::setSilenceDurationMs(int  silence_duration_ms)
{
	this->silence_duration_ms = silence_duration_ms;
}



