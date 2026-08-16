

#include "MessageStreamEvent_oneOf_2.h"

using namespace Tiny;

MessageStreamEvent_oneOf_2::MessageStreamEvent_oneOf_2()
{
	event = std::string();
	data = MessageDeltaObject();
}

MessageStreamEvent_oneOf_2::MessageStreamEvent_oneOf_2(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageStreamEvent_oneOf_2::~MessageStreamEvent_oneOf_2()
{

}

void
MessageStreamEvent_oneOf_2::fromJson(std::string jsonObj)
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




        MessageDeltaObject* obj = &data;
		obj->fromJson(value.dump());

    }


}

bourne::json
MessageStreamEvent_oneOf_2::toJson()
{
    bourne::json object = bourne::json::object();





    object["event"] = getEvent();







	object["data"] = getData().toJson();


    return object;

}

std::string
MessageStreamEvent_oneOf_2::getEvent()
{
	return event;
}

void
MessageStreamEvent_oneOf_2::setEvent(std::string  event)
{
	this->event = event;
}

MessageDeltaObject
MessageStreamEvent_oneOf_2::getData()
{
	return data;
}

void
MessageStreamEvent_oneOf_2::setData(MessageDeltaObject  data)
{
	this->data = data;
}



