#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeServerEventResponseFunctionCallArgumentsDelta.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeServerEventResponseFunctionCallArgumentsDelta::RealtimeServerEventResponseFunctionCallArgumentsDelta()
{
	//__init();
}

RealtimeServerEventResponseFunctionCallArgumentsDelta::~RealtimeServerEventResponseFunctionCallArgumentsDelta()
{
	//__cleanup();
}

void
RealtimeServerEventResponseFunctionCallArgumentsDelta::__init()
{
	//event_id = std::string();
	//type = std::string();
	//response_id = std::string();
	//item_id = std::string();
	//output_index = int(0);
	//call_id = std::string();
	//delta = std::string();
}

void
RealtimeServerEventResponseFunctionCallArgumentsDelta::__cleanup()
{
	//if(event_id != NULL) {
	//
	//delete event_id;
	//event_id = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(response_id != NULL) {
	//
	//delete response_id;
	//response_id = NULL;
	//}
	//if(item_id != NULL) {
	//
	//delete item_id;
	//item_id = NULL;
	//}
	//if(output_index != NULL) {
	//
	//delete output_index;
	//output_index = NULL;
	//}
	//if(call_id != NULL) {
	//
	//delete call_id;
	//call_id = NULL;
	//}
	//if(delta != NULL) {
	//
	//delete delta;
	//delta = NULL;
	//}
	//
}

void
RealtimeServerEventResponseFunctionCallArgumentsDelta::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *event_idKey = "event_id";
	node = json_object_get_member(pJsonObject, event_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&event_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *response_idKey = "response_id";
	node = json_object_get_member(pJsonObject, response_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&response_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *item_idKey = "item_id";
	node = json_object_get_member(pJsonObject, item_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&item_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *output_indexKey = "output_index";
	node = json_object_get_member(pJsonObject, output_indexKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&output_index, node, "int", "");
		} else {
			
		}
	}
	const gchar *call_idKey = "call_id";
	node = json_object_get_member(pJsonObject, call_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&call_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *deltaKey = "delta";
	node = json_object_get_member(pJsonObject, deltaKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&delta, node, "std::string", "");
		} else {
			
		}
	}
}

RealtimeServerEventResponseFunctionCallArgumentsDelta::RealtimeServerEventResponseFunctionCallArgumentsDelta(char* json)
{
	this->fromJson(json);
}

char*
RealtimeServerEventResponseFunctionCallArgumentsDelta::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getEventId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *event_idKey = "event_id";
	json_object_set_member(pJsonObject, event_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getResponseId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *response_idKey = "response_id";
	json_object_set_member(pJsonObject, response_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getItemId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *item_idKey = "item_id";
	json_object_set_member(pJsonObject, item_idKey, node);
	if (isprimitive("int")) {
		int obj = getOutputIndex();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *output_indexKey = "output_index";
	json_object_set_member(pJsonObject, output_indexKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCallId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *call_idKey = "call_id";
	json_object_set_member(pJsonObject, call_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDelta();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *deltaKey = "delta";
	json_object_set_member(pJsonObject, deltaKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RealtimeServerEventResponseFunctionCallArgumentsDelta::getEventId()
{
	return event_id;
}

void
RealtimeServerEventResponseFunctionCallArgumentsDelta::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventResponseFunctionCallArgumentsDelta::getType()
{
	return type;
}

void
RealtimeServerEventResponseFunctionCallArgumentsDelta::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeServerEventResponseFunctionCallArgumentsDelta::getResponseId()
{
	return response_id;
}

void
RealtimeServerEventResponseFunctionCallArgumentsDelta::setResponseId(std::string  response_id)
{
	this->response_id = response_id;
}

std::string
RealtimeServerEventResponseFunctionCallArgumentsDelta::getItemId()
{
	return item_id;
}

void
RealtimeServerEventResponseFunctionCallArgumentsDelta::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

int
RealtimeServerEventResponseFunctionCallArgumentsDelta::getOutputIndex()
{
	return output_index;
}

void
RealtimeServerEventResponseFunctionCallArgumentsDelta::setOutputIndex(int  output_index)
{
	this->output_index = output_index;
}

std::string
RealtimeServerEventResponseFunctionCallArgumentsDelta::getCallId()
{
	return call_id;
}

void
RealtimeServerEventResponseFunctionCallArgumentsDelta::setCallId(std::string  call_id)
{
	this->call_id = call_id;
}

std::string
RealtimeServerEventResponseFunctionCallArgumentsDelta::getDelta()
{
	return delta;
}

void
RealtimeServerEventResponseFunctionCallArgumentsDelta::setDelta(std::string  delta)
{
	this->delta = delta;
}


