#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunStreamEvent_oneOf_3.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunStreamEvent_oneOf_3::RunStreamEvent_oneOf_3()
{
	//__init();
}

RunStreamEvent_oneOf_3::~RunStreamEvent_oneOf_3()
{
	//__cleanup();
}

void
RunStreamEvent_oneOf_3::__init()
{
	//event = std::string();
	//data = new RunObject();
}

void
RunStreamEvent_oneOf_3::__cleanup()
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
RunStreamEvent_oneOf_3::fromJson(char* jsonStr)
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
	

		if (isprimitive("RunObject")) {
			jsonToValue(&data, node, "RunObject", "RunObject");
		} else {
			
			RunObject* obj = static_cast<RunObject*> (&data);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RunStreamEvent_oneOf_3::RunStreamEvent_oneOf_3(char* json)
{
	this->fromJson(json);
}

char*
RunStreamEvent_oneOf_3::toJson()
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
	if (isprimitive("RunObject")) {
		RunObject obj = getData();
		node = converttoJson(&obj, "RunObject", "");
	}
	else {
		
		RunObject obj = static_cast<RunObject> (getData());
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
RunStreamEvent_oneOf_3::getEvent()
{
	return event;
}

void
RunStreamEvent_oneOf_3::setEvent(std::string  event)
{
	this->event = event;
}

RunObject
RunStreamEvent_oneOf_3::getData()
{
	return data;
}

void
RunStreamEvent_oneOf_3::setData(RunObject  data)
{
	this->data = data;
}


