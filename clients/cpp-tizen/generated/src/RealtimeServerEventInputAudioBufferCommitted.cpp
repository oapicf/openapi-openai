#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeServerEventInputAudioBufferCommitted.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeServerEventInputAudioBufferCommitted::RealtimeServerEventInputAudioBufferCommitted()
{
	//__init();
}

RealtimeServerEventInputAudioBufferCommitted::~RealtimeServerEventInputAudioBufferCommitted()
{
	//__cleanup();
}

void
RealtimeServerEventInputAudioBufferCommitted::__init()
{
	//event_id = std::string();
	//type = std::string();
	//previous_item_id = std::string();
	//item_id = std::string();
}

void
RealtimeServerEventInputAudioBufferCommitted::__cleanup()
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
	//if(previous_item_id != NULL) {
	//
	//delete previous_item_id;
	//previous_item_id = NULL;
	//}
	//if(item_id != NULL) {
	//
	//delete item_id;
	//item_id = NULL;
	//}
	//
}

void
RealtimeServerEventInputAudioBufferCommitted::fromJson(char* jsonStr)
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
	const gchar *previous_item_idKey = "previous_item_id";
	node = json_object_get_member(pJsonObject, previous_item_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&previous_item_id, node, "std::string", "");
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
}

RealtimeServerEventInputAudioBufferCommitted::RealtimeServerEventInputAudioBufferCommitted(char* json)
{
	this->fromJson(json);
}

char*
RealtimeServerEventInputAudioBufferCommitted::toJson()
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
		std::string obj = getPreviousItemId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *previous_item_idKey = "previous_item_id";
	json_object_set_member(pJsonObject, previous_item_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getItemId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *item_idKey = "item_id";
	json_object_set_member(pJsonObject, item_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RealtimeServerEventInputAudioBufferCommitted::getEventId()
{
	return event_id;
}

void
RealtimeServerEventInputAudioBufferCommitted::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventInputAudioBufferCommitted::getType()
{
	return type;
}

void
RealtimeServerEventInputAudioBufferCommitted::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeServerEventInputAudioBufferCommitted::getPreviousItemId()
{
	return previous_item_id;
}

void
RealtimeServerEventInputAudioBufferCommitted::setPreviousItemId(std::string  previous_item_id)
{
	this->previous_item_id = previous_item_id;
}

std::string
RealtimeServerEventInputAudioBufferCommitted::getItemId()
{
	return item_id;
}

void
RealtimeServerEventInputAudioBufferCommitted::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}


