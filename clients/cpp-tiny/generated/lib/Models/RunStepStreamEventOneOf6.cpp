

#include "RunStepStreamEvent_oneOf_6.h"

using namespace Tiny;

RunStepStreamEvent_oneOf_6::RunStepStreamEvent_oneOf_6()
{
	event = std::string();
	data = RunStepObject();
}

RunStepStreamEvent_oneOf_6::RunStepStreamEvent_oneOf_6(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepStreamEvent_oneOf_6::~RunStepStreamEvent_oneOf_6()
{

}

void
RunStepStreamEvent_oneOf_6::fromJson(std::string jsonObj)
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
RunStepStreamEvent_oneOf_6::toJson()
{
    bourne::json object = bourne::json::object();





    object["event"] = getEvent();







	object["data"] = getData().toJson();


    return object;

}

std::string
RunStepStreamEvent_oneOf_6::getEvent()
{
	return event;
}

void
RunStepStreamEvent_oneOf_6::setEvent(std::string  event)
{
	this->event = event;
}

RunStepObject
RunStepStreamEvent_oneOf_6::getData()
{
	return data;
}

void
RunStepStreamEvent_oneOf_6::setData(RunStepObject  data)
{
	this->data = data;
}



