#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeServerEventError.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeServerEventError::RealtimeServerEventError()
{
	//__init();
}

RealtimeServerEventError::~RealtimeServerEventError()
{
	//__cleanup();
}

void
RealtimeServerEventError::__init()
{
	//event_id = std::string();
	//type = std::string();
	//error = new RealtimeServerEventError_error();
}

void
RealtimeServerEventError::__cleanup()
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
	//if(error != NULL) {
	//
	//delete error;
	//error = NULL;
	//}
	//
}

void
RealtimeServerEventError::fromJson(char* jsonStr)
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
	const gchar *errorKey = "error";
	node = json_object_get_member(pJsonObject, errorKey);
	if (node !=NULL) {
	

		if (isprimitive("RealtimeServerEventError_error")) {
			jsonToValue(&error, node, "RealtimeServerEventError_error", "RealtimeServerEventError_error");
		} else {
			
			RealtimeServerEventError_error* obj = static_cast<RealtimeServerEventError_error*> (&error);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RealtimeServerEventError::RealtimeServerEventError(char* json)
{
	this->fromJson(json);
}

char*
RealtimeServerEventError::toJson()
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
	if (isprimitive("RealtimeServerEventError_error")) {
		RealtimeServerEventError_error obj = getError();
		node = converttoJson(&obj, "RealtimeServerEventError_error", "");
	}
	else {
		
		RealtimeServerEventError_error obj = static_cast<RealtimeServerEventError_error> (getError());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *errorKey = "error";
	json_object_set_member(pJsonObject, errorKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RealtimeServerEventError::getEventId()
{
	return event_id;
}

void
RealtimeServerEventError::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventError::getType()
{
	return type;
}

void
RealtimeServerEventError::setType(std::string  type)
{
	this->type = type;
}

RealtimeServerEventError_error
RealtimeServerEventError::getError()
{
	return error;
}

void
RealtimeServerEventError::setError(RealtimeServerEventError_error  error)
{
	this->error = error;
}


