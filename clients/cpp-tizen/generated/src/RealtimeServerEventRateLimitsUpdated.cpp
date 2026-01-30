#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeServerEventRateLimitsUpdated.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeServerEventRateLimitsUpdated::RealtimeServerEventRateLimitsUpdated()
{
	//__init();
}

RealtimeServerEventRateLimitsUpdated::~RealtimeServerEventRateLimitsUpdated()
{
	//__cleanup();
}

void
RealtimeServerEventRateLimitsUpdated::__init()
{
	//event_id = std::string();
	//type = std::string();
	//new std::list()std::list> rate_limits;
}

void
RealtimeServerEventRateLimitsUpdated::__cleanup()
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
	//if(rate_limits != NULL) {
	//rate_limits.RemoveAll(true);
	//delete rate_limits;
	//rate_limits = NULL;
	//}
	//
}

void
RealtimeServerEventRateLimitsUpdated::fromJson(char* jsonStr)
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
	const gchar *rate_limitsKey = "rate_limits";
	node = json_object_get_member(pJsonObject, rate_limitsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<RealtimeServerEventRateLimitsUpdated_rate_limits_inner> new_list;
			RealtimeServerEventRateLimitsUpdated_rate_limits_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("RealtimeServerEventRateLimitsUpdated_rate_limits_inner")) {
					jsonToValue(&inst, temp_json, "RealtimeServerEventRateLimitsUpdated_rate_limits_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			rate_limits = new_list;
		}
		
	}
}

RealtimeServerEventRateLimitsUpdated::RealtimeServerEventRateLimitsUpdated(char* json)
{
	this->fromJson(json);
}

char*
RealtimeServerEventRateLimitsUpdated::toJson()
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
	if (isprimitive("RealtimeServerEventRateLimitsUpdated_rate_limits_inner")) {
		list<RealtimeServerEventRateLimitsUpdated_rate_limits_inner> new_list = static_cast<list <RealtimeServerEventRateLimitsUpdated_rate_limits_inner> > (getRateLimits());
		node = converttoJson(&new_list, "RealtimeServerEventRateLimitsUpdated_rate_limits_inner", "array");
	} else {
		node = json_node_alloc();
		list<RealtimeServerEventRateLimitsUpdated_rate_limits_inner> new_list = static_cast<list <RealtimeServerEventRateLimitsUpdated_rate_limits_inner> > (getRateLimits());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<RealtimeServerEventRateLimitsUpdated_rate_limits_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			RealtimeServerEventRateLimitsUpdated_rate_limits_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *rate_limitsKey = "rate_limits";
	json_object_set_member(pJsonObject, rate_limitsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RealtimeServerEventRateLimitsUpdated::getEventId()
{
	return event_id;
}

void
RealtimeServerEventRateLimitsUpdated::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventRateLimitsUpdated::getType()
{
	return type;
}

void
RealtimeServerEventRateLimitsUpdated::setType(std::string  type)
{
	this->type = type;
}

std::list<RealtimeServerEventRateLimitsUpdated_rate_limits_inner>
RealtimeServerEventRateLimitsUpdated::getRateLimits()
{
	return rate_limits;
}

void
RealtimeServerEventRateLimitsUpdated::setRateLimits(std::list <RealtimeServerEventRateLimitsUpdated_rate_limits_inner> rate_limits)
{
	this->rate_limits = rate_limits;
}


