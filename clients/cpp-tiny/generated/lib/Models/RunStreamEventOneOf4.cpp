

#include "RunStreamEvent_oneOf_4.h"

using namespace Tiny;

RunStreamEvent_oneOf_4::RunStreamEvent_oneOf_4()
{
	event = std::string();
	data = RunObject();
}

RunStreamEvent_oneOf_4::RunStreamEvent_oneOf_4(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStreamEvent_oneOf_4::~RunStreamEvent_oneOf_4()
{

}

void
RunStreamEvent_oneOf_4::fromJson(std::string jsonObj)
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
RunStreamEvent_oneOf_4::toJson()
{
    bourne::json object = bourne::json::object();





    object["event"] = getEvent();







	object["data"] = getData().toJson();


    return object;

}

std::string
RunStreamEvent_oneOf_4::getEvent()
{
	return event;
}

void
RunStreamEvent_oneOf_4::setEvent(std::string  event)
{
	this->event = event;
}

RunObject
RunStreamEvent_oneOf_4::getData()
{
	return data;
}

void
RunStreamEvent_oneOf_4::setData(RunObject  data)
{
	this->data = data;
}



