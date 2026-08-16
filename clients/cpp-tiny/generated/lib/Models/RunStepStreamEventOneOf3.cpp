

#include "RunStepStreamEvent_oneOf_3.h"

using namespace Tiny;

RunStepStreamEvent_oneOf_3::RunStepStreamEvent_oneOf_3()
{
	event = std::string();
	data = RunStepObject();
}

RunStepStreamEvent_oneOf_3::RunStepStreamEvent_oneOf_3(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepStreamEvent_oneOf_3::~RunStepStreamEvent_oneOf_3()
{

}

void
RunStepStreamEvent_oneOf_3::fromJson(std::string jsonObj)
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
RunStepStreamEvent_oneOf_3::toJson()
{
    bourne::json object = bourne::json::object();





    object["event"] = getEvent();







	object["data"] = getData().toJson();


    return object;

}

std::string
RunStepStreamEvent_oneOf_3::getEvent()
{
	return event;
}

void
RunStepStreamEvent_oneOf_3::setEvent(std::string  event)
{
	this->event = event;
}

RunStepObject
RunStepStreamEvent_oneOf_3::getData()
{
	return data;
}

void
RunStepStreamEvent_oneOf_3::setData(RunStepObject  data)
{
	this->data = data;
}



