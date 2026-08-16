

#include "MessageStreamEvent_oneOf_4.h"

using namespace Tiny;

MessageStreamEvent_oneOf_4::MessageStreamEvent_oneOf_4()
{
	event = std::string();
	data = MessageObject();
}

MessageStreamEvent_oneOf_4::MessageStreamEvent_oneOf_4(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageStreamEvent_oneOf_4::~MessageStreamEvent_oneOf_4()
{

}

void
MessageStreamEvent_oneOf_4::fromJson(std::string jsonObj)
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
MessageStreamEvent_oneOf_4::toJson()
{
    bourne::json object = bourne::json::object();





    object["event"] = getEvent();







	object["data"] = getData().toJson();


    return object;

}

std::string
MessageStreamEvent_oneOf_4::getEvent()
{
	return event;
}

void
MessageStreamEvent_oneOf_4::setEvent(std::string  event)
{
	this->event = event;
}

MessageObject
MessageStreamEvent_oneOf_4::getData()
{
	return data;
}

void
MessageStreamEvent_oneOf_4::setData(MessageObject  data)
{
	this->data = data;
}



