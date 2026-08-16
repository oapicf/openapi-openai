

#include "ThreadStreamEvent.h"

using namespace Tiny;

ThreadStreamEvent::ThreadStreamEvent()
{
	enabled = bool(false);
	event = std::string();
	data = ThreadObject();
}

ThreadStreamEvent::ThreadStreamEvent(std::string jsonString)
{
	this->fromJson(jsonString);
}

ThreadStreamEvent::~ThreadStreamEvent()
{

}

void
ThreadStreamEvent::fromJson(std::string jsonObj)
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




        ThreadObject* obj = &data;
		obj->fromJson(value.dump());

    }


}

bourne::json
ThreadStreamEvent::toJson()
{
    bourne::json object = bourne::json::object();





    object["enabled"] = isEnabled();






    object["event"] = getEvent();







	object["data"] = getData().toJson();


    return object;

}

bool
ThreadStreamEvent::isEnabled()
{
	return enabled;
}

void
ThreadStreamEvent::setEnabled(bool  enabled)
{
	this->enabled = enabled;
}

std::string
ThreadStreamEvent::getEvent()
{
	return event;
}

void
ThreadStreamEvent::setEvent(std::string  event)
{
	this->event = event;
}

ThreadObject
ThreadStreamEvent::getData()
{
	return data;
}

void
ThreadStreamEvent::setData(ThreadObject  data)
{
	this->data = data;
}



