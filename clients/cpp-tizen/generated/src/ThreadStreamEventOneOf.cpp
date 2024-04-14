#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ThreadStreamEvent_oneOf.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ThreadStreamEvent_oneOf::ThreadStreamEvent_oneOf()
{
	//__init();
}

ThreadStreamEvent_oneOf::~ThreadStreamEvent_oneOf()
{
	//__cleanup();
}

void
ThreadStreamEvent_oneOf::__init()
{
	//event = std::string();
	//data = new ThreadObject();
}

void
ThreadStreamEvent_oneOf::__cleanup()
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
ThreadStreamEvent_oneOf::fromJson(char* jsonStr)
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
	

		if (isprimitive("ThreadObject")) {
			jsonToValue(&data, node, "ThreadObject", "ThreadObject");
		} else {
			
			ThreadObject* obj = static_cast<ThreadObject*> (&data);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ThreadStreamEvent_oneOf::ThreadStreamEvent_oneOf(char* json)
{
	this->fromJson(json);
}

char*
ThreadStreamEvent_oneOf::toJson()
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

std::string
ThreadStreamEvent_oneOf::getEvent()
{
	return event;
}

void
ThreadStreamEvent_oneOf::setEvent(std::string  event)
{
	this->event = event;
}

ThreadObject
ThreadStreamEvent_oneOf::getData()
{
	return data;
}

void
ThreadStreamEvent_oneOf::setData(ThreadObject  data)
{
	this->data = data;
}


