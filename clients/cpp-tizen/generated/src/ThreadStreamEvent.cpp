#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ThreadStreamEvent.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ThreadStreamEvent::ThreadStreamEvent()
{
	//__init();
}

ThreadStreamEvent::~ThreadStreamEvent()
{
	//__cleanup();
}

void
ThreadStreamEvent::__init()
{
	//enabled = bool(false);
	//event = std::string();
	//data = new ThreadObject();
}

void
ThreadStreamEvent::__cleanup()
{
	//if(enabled != NULL) {
	//
	//delete enabled;
	//enabled = NULL;
	//}
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
ThreadStreamEvent::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *enabledKey = "enabled";
	node = json_object_get_member(pJsonObject, enabledKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&enabled, node, "bool", "");
		} else {
			
		}
	}
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
	

		if (isprimitive("ThreadObject")) {
			jsonToValue(&data, node, "ThreadObject", "ThreadObject");
		} else {
			
			ThreadObject* obj = static_cast<ThreadObject*> (&data);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ThreadStreamEvent::ThreadStreamEvent(char* json)
{
	this->fromJson(json);
}

char*
ThreadStreamEvent::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getEnabled();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *enabledKey = "enabled";
	json_object_set_member(pJsonObject, enabledKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEvent();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *eventKey = "event";
	json_object_set_member(pJsonObject, eventKey, node);
	if (isprimitive("ThreadObject")) {
		ThreadObject obj = getData();
		node = converttoJson(&obj, "ThreadObject", "");
	}
	else {
		
		ThreadObject obj = static_cast<ThreadObject> (getData());
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

bool
ThreadStreamEvent::getEnabled()
{
	return enabled;
}

void
ThreadStreamEvent::setEnabled(bool  enabled)
{
	this->enabled = enabled;
}

std::string
ThreadStreamEvent::getEvent()
{
	return event;
}

void
ThreadStreamEvent::setEvent(std::string  event)
{
	this->event = event;
}

ThreadObject
ThreadStreamEvent::getData()
{
	return data;
}

void
ThreadStreamEvent::setData(ThreadObject  data)
{
	this->data = data;
}


