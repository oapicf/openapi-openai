#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeServerEventResponseContentPartDone.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeServerEventResponseContentPartDone::RealtimeServerEventResponseContentPartDone()
{
	//__init();
}

RealtimeServerEventResponseContentPartDone::~RealtimeServerEventResponseContentPartDone()
{
	//__cleanup();
}

void
RealtimeServerEventResponseContentPartDone::__init()
{
	//event_id = std::string();
	//type = std::string();
	//response_id = std::string();
	//item_id = std::string();
	//output_index = int(0);
	//content_index = int(0);
	//part = new RealtimeServerEventResponseContentPartDone_part();
}

void
RealtimeServerEventResponseContentPartDone::__cleanup()
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
	//if(content_index != NULL) {
	//
	//delete content_index;
	//content_index = NULL;
	//}
	//if(part != NULL) {
	//
	//delete part;
	//part = NULL;
	//}
	//
}

void
RealtimeServerEventResponseContentPartDone::fromJson(char* jsonStr)
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
	const gchar *content_indexKey = "content_index";
	node = json_object_get_member(pJsonObject, content_indexKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&content_index, node, "int", "");
		} else {
			
		}
	}
	const gchar *partKey = "part";
	node = json_object_get_member(pJsonObject, partKey);
	if (node !=NULL) {
	

		if (isprimitive("RealtimeServerEventResponseContentPartDone_part")) {
			jsonToValue(&part, node, "RealtimeServerEventResponseContentPartDone_part", "RealtimeServerEventResponseContentPartDone_part");
		} else {
			
			RealtimeServerEventResponseContentPartDone_part* obj = static_cast<RealtimeServerEventResponseContentPartDone_part*> (&part);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RealtimeServerEventResponseContentPartDone::RealtimeServerEventResponseContentPartDone(char* json)
{
	this->fromJson(json);
}

char*
RealtimeServerEventResponseContentPartDone::toJson()
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
	if (isprimitive("int")) {
		int obj = getContentIndex();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *content_indexKey = "content_index";
	json_object_set_member(pJsonObject, content_indexKey, node);
	if (isprimitive("RealtimeServerEventResponseContentPartDone_part")) {
		RealtimeServerEventResponseContentPartDone_part obj = getPart();
		node = converttoJson(&obj, "RealtimeServerEventResponseContentPartDone_part", "");
	}
	else {
		
		RealtimeServerEventResponseContentPartDone_part obj = static_cast<RealtimeServerEventResponseContentPartDone_part> (getPart());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *partKey = "part";
	json_object_set_member(pJsonObject, partKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RealtimeServerEventResponseContentPartDone::getEventId()
{
	return event_id;
}

void
RealtimeServerEventResponseContentPartDone::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventResponseContentPartDone::getType()
{
	return type;
}

void
RealtimeServerEventResponseContentPartDone::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeServerEventResponseContentPartDone::getResponseId()
{
	return response_id;
}

void
RealtimeServerEventResponseContentPartDone::setResponseId(std::string  response_id)
{
	this->response_id = response_id;
}

std::string
RealtimeServerEventResponseContentPartDone::getItemId()
{
	return item_id;
}

void
RealtimeServerEventResponseContentPartDone::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

int
RealtimeServerEventResponseContentPartDone::getOutputIndex()
{
	return output_index;
}

void
RealtimeServerEventResponseContentPartDone::setOutputIndex(int  output_index)
{
	this->output_index = output_index;
}

int
RealtimeServerEventResponseContentPartDone::getContentIndex()
{
	return content_index;
}

void
RealtimeServerEventResponseContentPartDone::setContentIndex(int  content_index)
{
	this->content_index = content_index;
}

RealtimeServerEventResponseContentPartDone_part
RealtimeServerEventResponseContentPartDone::getPart()
{
	return part;
}

void
RealtimeServerEventResponseContentPartDone::setPart(RealtimeServerEventResponseContentPartDone_part  part)
{
	this->part = part;
}


