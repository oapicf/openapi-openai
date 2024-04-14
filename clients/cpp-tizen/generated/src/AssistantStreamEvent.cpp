#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AssistantStreamEvent.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AssistantStreamEvent::AssistantStreamEvent()
{
	//__init();
}

AssistantStreamEvent::~AssistantStreamEvent()
{
	//__cleanup();
}

void
AssistantStreamEvent::__init()
{
	//event = std::string();
	//data = std::string();
}

void
AssistantStreamEvent::__cleanup()
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
AssistantStreamEvent::fromJson(char* jsonStr)
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
	

		if (isprimitive("std::string")) {
			jsonToValue(&data, node, "std::string", "");
		} else {
			
		}
	}
}

AssistantStreamEvent::AssistantStreamEvent(char* json)
{
	this->fromJson(json);
}

char*
AssistantStreamEvent::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getData();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
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
AssistantStreamEvent::getEvent()
{
	return event;
}

void
AssistantStreamEvent::setEvent(std::string  event)
{
	this->event = event;
}

std::string
AssistantStreamEvent::getData()
{
	return data;
}

void
AssistantStreamEvent::setData(std::string  data)
{
	this->data = data;
}


