

#include "RunStepStreamEvent_oneOf.h"

using namespace Tiny;

RunStepStreamEvent_oneOf::RunStepStreamEvent_oneOf()
{
	event = std::string();
	data = RunStepObject();
}

RunStepStreamEvent_oneOf::RunStepStreamEvent_oneOf(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepStreamEvent_oneOf::~RunStepStreamEvent_oneOf()
{

}

void
RunStepStreamEvent_oneOf::fromJson(std::string jsonObj)
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
RunStepStreamEvent_oneOf::toJson()
{
    bourne::json object = bourne::json::object();





    object["event"] = getEvent();







	object["data"] = getData().toJson();


    return object;

}

std::string
RunStepStreamEvent_oneOf::getEvent()
{
	return event;
}

void
RunStepStreamEvent_oneOf::setEvent(std::string  event)
{
	this->event = event;
}

RunStepObject
RunStepStreamEvent_oneOf::getData()
{
	return data;
}

void
RunStepStreamEvent_oneOf::setData(RunStepObject  data)
{
	this->data = data;
}



