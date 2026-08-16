

#include "ErrorEvent.h"

using namespace Tiny;

ErrorEvent::ErrorEvent()
{
	event = std::string();
	data = Error();
}

ErrorEvent::ErrorEvent(std::string jsonString)
{
	this->fromJson(jsonString);
}

ErrorEvent::~ErrorEvent()
{

}

void
ErrorEvent::fromJson(std::string jsonObj)
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




        Error* obj = &data;
		obj->fromJson(value.dump());

    }


}

bourne::json
ErrorEvent::toJson()
{
    bourne::json object = bourne::json::object();





    object["event"] = getEvent();







	object["data"] = getData().toJson();


    return object;

}

std::string
ErrorEvent::getEvent()
{
	return event;
}

void
ErrorEvent::setEvent(std::string  event)
{
	this->event = event;
}

Error
ErrorEvent::getData()
{
	return data;
}

void
ErrorEvent::setData(Error  data)
{
	this->data = data;
}



