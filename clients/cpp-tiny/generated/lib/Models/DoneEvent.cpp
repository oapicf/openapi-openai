

#include "DoneEvent.h"

using namespace Tiny;

DoneEvent::DoneEvent()
{
	event = std::string();
	data = std::string();
}

DoneEvent::DoneEvent(std::string jsonString)
{
	this->fromJson(jsonString);
}

DoneEvent::~DoneEvent()
{

}

void
DoneEvent::fromJson(std::string jsonObj)
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



        jsonToValue(&data, value, "std::string");


    }


}

bourne::json
DoneEvent::toJson()
{
    bourne::json object = bourne::json::object();





    object["event"] = getEvent();






    object["data"] = getData();



    return object;

}

std::string
DoneEvent::getEvent()
{
	return event;
}

void
DoneEvent::setEvent(std::string  event)
{
	this->event = event;
}

std::string
DoneEvent::getData()
{
	return data;
}

void
DoneEvent::setData(std::string  data)
{
	this->data = data;
}



