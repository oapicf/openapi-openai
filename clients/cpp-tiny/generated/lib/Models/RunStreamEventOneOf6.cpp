

#include "RunStreamEvent_oneOf_6.h"

using namespace Tiny;

RunStreamEvent_oneOf_6::RunStreamEvent_oneOf_6()
{
	event = std::string();
	data = RunObject();
}

RunStreamEvent_oneOf_6::RunStreamEvent_oneOf_6(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStreamEvent_oneOf_6::~RunStreamEvent_oneOf_6()
{

}

void
RunStreamEvent_oneOf_6::fromJson(std::string jsonObj)
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
RunStreamEvent_oneOf_6::toJson()
{
    bourne::json object = bourne::json::object();





    object["event"] = getEvent();







	object["data"] = getData().toJson();


    return object;

}

std::string
RunStreamEvent_oneOf_6::getEvent()
{
	return event;
}

void
RunStreamEvent_oneOf_6::setEvent(std::string  event)
{
	this->event = event;
}

RunObject
RunStreamEvent_oneOf_6::getData()
{
	return data;
}

void
RunStreamEvent_oneOf_6::setData(RunObject  data)
{
	this->data = data;
}



