

#include "RealtimeServerEventResponseTextDone.h"

using namespace Tiny;

RealtimeServerEventResponseTextDone::RealtimeServerEventResponseTextDone()
{
	event_id = std::string();
	type = std::string();
	response_id = std::string();
	item_id = std::string();
	output_index = int(0);
	content_index = int(0);
	text = std::string();
}

RealtimeServerEventResponseTextDone::RealtimeServerEventResponseTextDone(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeServerEventResponseTextDone::~RealtimeServerEventResponseTextDone()
{

}

void
RealtimeServerEventResponseTextDone::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *event_idKey = "event_id";

    if(object.has_key(event_idKey))
    {
        bourne::json value = object[event_idKey];



        jsonToValue(&event_id, value, "std::string");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *response_idKey = "response_id";

    if(object.has_key(response_idKey))
    {
        bourne::json value = object[response_idKey];



        jsonToValue(&response_id, value, "std::string");


    }

    const char *item_idKey = "item_id";

    if(object.has_key(item_idKey))
    {
        bourne::json value = object[item_idKey];



        jsonToValue(&item_id, value, "std::string");


    }

    const char *output_indexKey = "output_index";

    if(object.has_key(output_indexKey))
    {
        bourne::json value = object[output_indexKey];



        jsonToValue(&output_index, value, "int");


    }

    const char *content_indexKey = "content_index";

    if(object.has_key(content_indexKey))
    {
        bourne::json value = object[content_indexKey];



        jsonToValue(&content_index, value, "int");


    }

    const char *textKey = "text";

    if(object.has_key(textKey))
    {
        bourne::json value = object[textKey];



        jsonToValue(&text, value, "std::string");


    }


}

bourne::json
RealtimeServerEventResponseTextDone::toJson()
{
    bourne::json object = bourne::json::object();





    object["event_id"] = getEventId();






    object["type"] = getType();






    object["response_id"] = getResponseId();






    object["item_id"] = getItemId();






    object["output_index"] = getOutputIndex();






    object["content_index"] = getContentIndex();






    object["text"] = getText();



    return object;

}

std::string
RealtimeServerEventResponseTextDone::getEventId()
{
	return event_id;
}

void
RealtimeServerEventResponseTextDone::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventResponseTextDone::getType()
{
	return type;
}

void
RealtimeServerEventResponseTextDone::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeServerEventResponseTextDone::getResponseId()
{
	return response_id;
}

void
RealtimeServerEventResponseTextDone::setResponseId(std::string  response_id)
{
	this->response_id = response_id;
}

std::string
RealtimeServerEventResponseTextDone::getItemId()
{
	return item_id;
}

void
RealtimeServerEventResponseTextDone::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

int
RealtimeServerEventResponseTextDone::getOutputIndex()
{
	return output_index;
}

void
RealtimeServerEventResponseTextDone::setOutputIndex(int  output_index)
{
	this->output_index = output_index;
}

int
RealtimeServerEventResponseTextDone::getContentIndex()
{
	return content_index;
}

void
RealtimeServerEventResponseTextDone::setContentIndex(int  content_index)
{
	this->content_index = content_index;
}

std::string
RealtimeServerEventResponseTextDone::getText()
{
	return text;
}

void
RealtimeServerEventResponseTextDone::setText(std::string  text)
{
	this->text = text;
}



