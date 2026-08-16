

#include "RunStepStreamEvent_oneOf_4.h"

using namespace Tiny;

RunStepStreamEvent_oneOf_4::RunStepStreamEvent_oneOf_4()
{
	event = std::string();
	data = RunStepObject();
}

RunStepStreamEvent_oneOf_4::RunStepStreamEvent_oneOf_4(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepStreamEvent_oneOf_4::~RunStepStreamEvent_oneOf_4()
{

}

void
RunStepStreamEvent_oneOf_4::fromJson(std::string jsonObj)
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
RunStepStreamEvent_oneOf_4::toJson()
{
    bourne::json object = bourne::json::object();





    object["event"] = getEvent();







	object["data"] = getData().toJson();


    return object;

}

std::string
RunStepStreamEvent_oneOf_4::getEvent()
{
	return event;
}

void
RunStepStreamEvent_oneOf_4::setEvent(std::string  event)
{
	this->event = event;
}

RunStepObject
RunStepStreamEvent_oneOf_4::getData()
{
	return data;
}

void
RunStepStreamEvent_oneOf_4::setData(RunStepObject  data)
{
	this->data = data;
}



