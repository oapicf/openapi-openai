

#include "AssistantStreamEvent.h"

using namespace Tiny;

AssistantStreamEvent::AssistantStreamEvent()
{
	enabled = bool(false);
	event = std::string();
	data = std::string();
}

AssistantStreamEvent::AssistantStreamEvent(std::string jsonString)
{
	this->fromJson(jsonString);
}

AssistantStreamEvent::~AssistantStreamEvent()
{

}

void
AssistantStreamEvent::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *enabledKey = "enabled";

    if(object.has_key(enabledKey))
    {
        bourne::json value = object[enabledKey];



        jsonToValue(&enabled, value, "bool");


    }

    const char *eventKey = "event";

    if(object.has_key(eventKey))
    {
        bourne::json value = object[eventKey];



        jsonToValue(&event, value, "std::string");


    }

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];



        jsonToValue(&data, value, "std::string");


    }


}

bourne::json
AssistantStreamEvent::toJson()
{
    bourne::json object = bourne::json::object();





    object["enabled"] = isEnabled();






    object["event"] = getEvent();






    object["data"] = getData();



    return object;

}

bool
AssistantStreamEvent::isEnabled()
{
	return enabled;
}

void
AssistantStreamEvent::setEnabled(bool  enabled)
{
	this->enabled = enabled;
}

std::string
AssistantStreamEvent::getEvent()
{
	return event;
}

void
AssistantStreamEvent::setEvent(std::string  event)
{
	this->event = event;
}

std::string
AssistantStreamEvent::getData()
{
	return data;
}

void
AssistantStreamEvent::setData(std::string  data)
{
	this->data = data;
}



