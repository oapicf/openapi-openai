#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MessageStreamEvent_oneOf_1.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MessageStreamEvent_oneOf_1::MessageStreamEvent_oneOf_1()
{
	//__init();
}

MessageStreamEvent_oneOf_1::~MessageStreamEvent_oneOf_1()
{
	//__cleanup();
}

void
MessageStreamEvent_oneOf_1::__init()
{
	//event = std::string();
	//data = new MessageObject();
}

void
MessageStreamEvent_oneOf_1::__cleanup()
{
	//if(event != NULL) {
	//
	//delete event;
	//event = NULL;
	//}
	//if(data != NULL) {
	//
	//delete data;
	//data = NULL;
	//}
	//
}

void
MessageStreamEvent_oneOf_1::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *eventKey = "event";
	node = json_object_get_member(pJsonObject, eventKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&event, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	

		if (isprimitive("MessageObject")) {
			jsonToValue(&data, node, "MessageObject", "MessageObject");
		} else {
			
			MessageObject* obj = static_cast<MessageObject*> (&data);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

MessageStreamEvent_oneOf_1::MessageStreamEvent_oneOf_1(char* json)
{
	this->fromJson(json);
}

char*
MessageStreamEvent_oneOf_1::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getEvent();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *eventKey = "event";
	json_object_set_member(pJsonObject, eventKey, node);
	if (isprimitive("MessageObject")) {
		MessageObject obj = getData();
		node = converttoJson(&obj, "MessageObject", "");
	}
	else {
		
		MessageObject obj = static_cast<MessageObject> (getData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
MessageStreamEvent_oneOf_1::getEvent()
{
	return event;
}

void
MessageStreamEvent_oneOf_1::setEvent(std::string  event)
{
	this->event = event;
}

MessageObject
MessageStreamEvent_oneOf_1::getData()
{
	return data;
}

void
MessageStreamEvent_oneOf_1::setData(MessageObject  data)
{
	this->data = data;
}


