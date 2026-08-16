

#include "MessageStreamEvent.h"

using namespace Tiny;

MessageStreamEvent::MessageStreamEvent()
{
	event = std::string();
	data = MessageObject();
}

MessageStreamEvent::MessageStreamEvent(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageStreamEvent::~MessageStreamEvent()
{

}

void
MessageStreamEvent::fromJson(std::string jsonObj)
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




        MessageObject* obj = &data;
		obj->fromJson(value.dump());

    }


}

bourne::json
MessageStreamEvent::toJson()
{
    bourne::json object = bourne::json::object();





    object["event"] = getEvent();







	object["data"] = getData().toJson();


    return object;

}

std::string
MessageStreamEvent::getEvent()
{
	return event;
}

void
MessageStreamEvent::setEvent(std::string  event)
{
	this->event = event;
}

MessageObject
MessageStreamEvent::getData()
{
	return data;
}

void
MessageStreamEvent::setData(MessageObject  data)
{
	this->data = data;
}



