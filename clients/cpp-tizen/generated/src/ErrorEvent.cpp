#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ErrorEvent.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ErrorEvent::ErrorEvent()
{
	//__init();
}

ErrorEvent::~ErrorEvent()
{
	//__cleanup();
}

void
ErrorEvent::__init()
{
	//event = std::string();
	//data = new Error();
}

void
ErrorEvent::__cleanup()
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
ErrorEvent::fromJson(char* jsonStr)
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
	

		if (isprimitive("Error")) {
			jsonToValue(&data, node, "Error", "Error");
		} else {
			
			Error* obj = static_cast<Error*> (&data);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ErrorEvent::ErrorEvent(char* json)
{
	this->fromJson(json);
}

char*
ErrorEvent::toJson()
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
	if (isprimitive("Error")) {
		Error obj = getData();
		node = converttoJson(&obj, "Error", "");
	}
	else {
		
		Error obj = static_cast<Error> (getData());
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
ErrorEvent::getEvent()
{
	return event;
}

void
ErrorEvent::setEvent(std::string  event)
{
	this->event = event;
}

Error
ErrorEvent::getData()
{
	return data;
}

void
ErrorEvent::setData(Error  data)
{
	this->data = data;
}


