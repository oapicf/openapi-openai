

#include "RunStreamEvent_oneOf.h"

using namespace Tiny;

RunStreamEvent_oneOf::RunStreamEvent_oneOf()
{
	event = std::string();
	data = RunObject();
}

RunStreamEvent_oneOf::RunStreamEvent_oneOf(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStreamEvent_oneOf::~RunStreamEvent_oneOf()
{

}

void
RunStreamEvent_oneOf::fromJson(std::string jsonObj)
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
RunStreamEvent_oneOf::toJson()
{
    bourne::json object = bourne::json::object();





    object["event"] = getEvent();







	object["data"] = getData().toJson();


    return object;

}

std::string
RunStreamEvent_oneOf::getEvent()
{
	return event;
}

void
RunStreamEvent_oneOf::setEvent(std::string  event)
{
	this->event = event;
}

RunObject
RunStreamEvent_oneOf::getData()
{
	return data;
}

void
RunStreamEvent_oneOf::setData(RunObject  data)
{
	this->data = data;
}



