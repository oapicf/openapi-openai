

#include "RunStreamEvent.h"

using namespace Tiny;

RunStreamEvent::RunStreamEvent()
{
	event = std::string();
	data = RunObject();
}

RunStreamEvent::RunStreamEvent(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStreamEvent::~RunStreamEvent()
{

}

void
RunStreamEvent::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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




        RunObject* obj = &data;
		obj->fromJson(value.dump());

    }


}

bourne::json
RunStreamEvent::toJson()
{
    bourne::json object = bourne::json::object();





    object["event"] = getEvent();







	object["data"] = getData().toJson();


    return object;

}

std::string
RunStreamEvent::getEvent()
{
	return event;
}

void
RunStreamEvent::setEvent(std::string  event)
{
	this->event = event;
}

RunObject
RunStreamEvent::getData()
{
	return data;
}

void
RunStreamEvent::setData(RunObject  data)
{
	this->data = data;
}



