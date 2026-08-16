

#include "MessageStreamEvent_oneOf.h"

using namespace Tiny;

MessageStreamEvent_oneOf::MessageStreamEvent_oneOf()
{
	event = std::string();
	data = MessageObject();
}

MessageStreamEvent_oneOf::MessageStreamEvent_oneOf(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageStreamEvent_oneOf::~MessageStreamEvent_oneOf()
{

}

void
MessageStreamEvent_oneOf::fromJson(std::string jsonObj)
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
MessageStreamEvent_oneOf::toJson()
{
    bourne::json object = bourne::json::object();





    object["event"] = getEvent();







	object["data"] = getData().toJson();


    return object;

}

std::string
MessageStreamEvent_oneOf::getEvent()
{
	return event;
}

void
MessageStreamEvent_oneOf::setEvent(std::string  event)
{
	this->event = event;
}

MessageObject
MessageStreamEvent_oneOf::getData()
{
	return data;
}

void
MessageStreamEvent_oneOf::setData(MessageObject  data)
{
	this->data = data;
}



