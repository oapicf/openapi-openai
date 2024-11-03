#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunStepStreamEvent_oneOf.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunStepStreamEvent_oneOf::RunStepStreamEvent_oneOf()
{
	//__init();
}

RunStepStreamEvent_oneOf::~RunStepStreamEvent_oneOf()
{
	//__cleanup();
}

void
RunStepStreamEvent_oneOf::__init()
{
	//event = std::string();
	//data = new RunStepObject();
}

void
RunStepStreamEvent_oneOf::__cleanup()
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
RunStepStreamEvent_oneOf::fromJson(char* jsonStr)
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

RunStepStreamEvent_oneOf::RunStepStreamEvent_oneOf(char* json)
{
	this->fromJson(json);
}

char*
RunStepStreamEvent_oneOf::toJson()
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
RunStepStreamEvent_oneOf::getEvent()
{
	return event;
}

void
RunStepStreamEvent_oneOf::setEvent(std::string  event)
{
	this->event = event;
}

RunStepObject
RunStepStreamEvent_oneOf::getData()
{
	return data;
}

void
RunStepStreamEvent_oneOf::setData(RunStepObject  data)
{
	this->data = data;
}


