#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunStepStreamEvent.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunStepStreamEvent::RunStepStreamEvent()
{
	//__init();
}

RunStepStreamEvent::~RunStepStreamEvent()
{
	//__cleanup();
}

void
RunStepStreamEvent::__init()
{
	//event = std::string();
	//data = new RunStepObject();
}

void
RunStepStreamEvent::__cleanup()
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
RunStepStreamEvent::fromJson(char* jsonStr)
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
	

		if (isprimitive("RunStepObject")) {
			jsonToValue(&data, node, "RunStepObject", "RunStepObject");
		} else {
			
			RunStepObject* obj = static_cast<RunStepObject*> (&data);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RunStepStreamEvent::RunStepStreamEvent(char* json)
{
	this->fromJson(json);
}

char*
RunStepStreamEvent::toJson()
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
	if (isprimitive("RunStepObject")) {
		RunStepObject obj = getData();
		node = converttoJson(&obj, "RunStepObject", "");
	}
	else {
		
		RunStepObject obj = static_cast<RunStepObject> (getData());
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
RunStepStreamEvent::getEvent()
{
	return event;
}

void
RunStepStreamEvent::setEvent(std::string  event)
{
	this->event = event;
}

RunStepObject
RunStepStreamEvent::getData()
{
	return data;
}

void
RunStepStreamEvent::setData(RunStepObject  data)
{
	this->data = data;
}


