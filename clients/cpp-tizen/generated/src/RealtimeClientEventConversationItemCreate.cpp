#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeClientEventConversationItemCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeClientEventConversationItemCreate::RealtimeClientEventConversationItemCreate()
{
	//__init();
}

RealtimeClientEventConversationItemCreate::~RealtimeClientEventConversationItemCreate()
{
	//__cleanup();
}

void
RealtimeClientEventConversationItemCreate::__init()
{
	//event_id = std::string();
	//type = std::string();
	//previous_item_id = std::string();
	//item = new RealtimeConversationItem();
}

void
RealtimeClientEventConversationItemCreate::__cleanup()
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
	//if(item != NULL) {
	//
	//delete item;
	//item = NULL;
	//}
	//
}

void
RealtimeClientEventConversationItemCreate::fromJson(char* jsonStr)
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

RealtimeClientEventConversationItemCreate::RealtimeClientEventConversationItemCreate(char* json)
{
	this->fromJson(json);
}

char*
RealtimeClientEventConversationItemCreate::toJson()
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
RealtimeClientEventConversationItemCreate::getEventId()
{
	return event_id;
}

void
RealtimeClientEventConversationItemCreate::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeClientEventConversationItemCreate::getType()
{
	return type;
}

void
RealtimeClientEventConversationItemCreate::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeClientEventConversationItemCreate::getPreviousItemId()
{
	return previous_item_id;
}

void
RealtimeClientEventConversationItemCreate::setPreviousItemId(std::string  previous_item_id)
{
	this->previous_item_id = previous_item_id;
}

RealtimeConversationItem
RealtimeClientEventConversationItemCreate::getItem()
{
	return item;
}

void
RealtimeClientEventConversationItemCreate::setItem(RealtimeConversationItem  item)
{
	this->item = item;
}


