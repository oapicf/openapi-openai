

#include "RunStepStreamEvent_oneOf_2.h"

using namespace Tiny;

RunStepStreamEvent_oneOf_2::RunStepStreamEvent_oneOf_2()
{
	event = std::string();
	data = RunStepDeltaObject();
}

RunStepStreamEvent_oneOf_2::RunStepStreamEvent_oneOf_2(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepStreamEvent_oneOf_2::~RunStepStreamEvent_oneOf_2()
{

}

void
RunStepStreamEvent_oneOf_2::fromJson(std::string jsonObj)
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




        RunStepDeltaObject* obj = &data;
		obj->fromJson(value.dump());

    }


}

bourne::json
RunStepStreamEvent_oneOf_2::toJson()
{
    bourne::json object = bourne::json::object();





    object["event"] = getEvent();







	object["data"] = getData().toJson();


    return object;

}

std::string
RunStepStreamEvent_oneOf_2::getEvent()
{
	return event;
}

void
RunStepStreamEvent_oneOf_2::setEvent(std::string  event)
{
	this->event = event;
}

RunStepDeltaObject
RunStepStreamEvent_oneOf_2::getData()
{
	return data;
}

void
RunStepStreamEvent_oneOf_2::setData(RunStepDeltaObject  data)
{
	this->data = data;
}



