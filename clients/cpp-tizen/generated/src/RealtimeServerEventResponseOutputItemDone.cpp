#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeServerEventResponseOutputItemDone.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeServerEventResponseOutputItemDone::RealtimeServerEventResponseOutputItemDone()
{
	//__init();
}

RealtimeServerEventResponseOutputItemDone::~RealtimeServerEventResponseOutputItemDone()
{
	//__cleanup();
}

void
RealtimeServerEventResponseOutputItemDone::__init()
{
	//event_id = std::string();
	//type = std::string();
	//response_id = std::string();
	//output_index = int(0);
	//item = new RealtimeConversationItem();
}

void
RealtimeServerEventResponseOutputItemDone::__cleanup()
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
	//if(output_index != NULL) {
	//
	//delete output_index;
	//output_index = NULL;
	//}
	//if(item != NULL) {
	//
	//delete item;
	//item = NULL;
	//}
	//
}

void
RealtimeServerEventResponseOutputItemDone::fromJson(char* jsonStr)
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
	const gchar *output_indexKey = "output_index";
	node = json_object_get_member(pJsonObject, output_indexKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&output_index, node, "int", "");
		} else {
			
		}
	}
	const gchar *itemKey = "item";
	node = json_object_get_member(pJsonObject, itemKey);
	if (node !=NULL) {
	

		if (isprimitive("RealtimeConversationItem")) {
			jsonToValue(&item, node, "RealtimeConversationItem", "RealtimeConversationItem");
		} else {
			
			RealtimeConversationItem* obj = static_cast<RealtimeConversationItem*> (&item);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RealtimeServerEventResponseOutputItemDone::RealtimeServerEventResponseOutputItemDone(char* json)
{
	this->fromJson(json);
}

char*
RealtimeServerEventResponseOutputItemDone::toJson()
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
	if (isprimitive("int")) {
		int obj = getOutputIndex();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *output_indexKey = "output_index";
	json_object_set_member(pJsonObject, output_indexKey, node);
	if (isprimitive("RealtimeConversationItem")) {
		RealtimeConversationItem obj = getItem();
		node = converttoJson(&obj, "RealtimeConversationItem", "");
	}
	else {
		
		RealtimeConversationItem obj = static_cast<RealtimeConversationItem> (getItem());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *itemKey = "item";
	json_object_set_member(pJsonObject, itemKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RealtimeServerEventResponseOutputItemDone::getEventId()
{
	return event_id;
}

void
RealtimeServerEventResponseOutputItemDone::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventResponseOutputItemDone::getType()
{
	return type;
}

void
RealtimeServerEventResponseOutputItemDone::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeServerEventResponseOutputItemDone::getResponseId()
{
	return response_id;
}

void
RealtimeServerEventResponseOutputItemDone::setResponseId(std::string  response_id)
{
	this->response_id = response_id;
}

int
RealtimeServerEventResponseOutputItemDone::getOutputIndex()
{
	return output_index;
}

void
RealtimeServerEventResponseOutputItemDone::setOutputIndex(int  output_index)
{
	this->output_index = output_index;
}

RealtimeConversationItem
RealtimeServerEventResponseOutputItemDone::getItem()
{
	return item;
}

void
RealtimeServerEventResponseOutputItemDone::setItem(RealtimeConversationItem  item)
{
	this->item = item;
}


