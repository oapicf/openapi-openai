

#include "RunStepStreamEvent.h"

using namespace Tiny;

RunStepStreamEvent::RunStepStreamEvent()
{
	event = std::string();
	data = RunStepObject();
}

RunStepStreamEvent::RunStepStreamEvent(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepStreamEvent::~RunStepStreamEvent()
{

}

void
RunStepStreamEvent::fromJson(std::string jsonObj)
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




        RunStepObject* obj = &data;
		obj->fromJson(value.dump());

    }


}

bourne::json
RunStepStreamEvent::toJson()
{
    bourne::json object = bourne::json::object();





    object["event"] = getEvent();







	object["data"] = getData().toJson();


    return object;

}

std::string
RunStepStreamEvent::getEvent()
{
	return event;
}

void
RunStepStreamEvent::setEvent(std::string  event)
{
	this->event = event;
}

RunStepObject
RunStepStreamEvent::getData()
{
	return data;
}

void
RunStepStreamEvent::setData(RunStepObject  data)
{
	this->data = data;
}



