#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeServerEventRateLimitsUpdated_rate_limits_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeServerEventRateLimitsUpdated_rate_limits_inner::RealtimeServerEventRateLimitsUpdated_rate_limits_inner()
{
	//__init();
}

RealtimeServerEventRateLimitsUpdated_rate_limits_inner::~RealtimeServerEventRateLimitsUpdated_rate_limits_inner()
{
	//__cleanup();
}

void
RealtimeServerEventRateLimitsUpdated_rate_limits_inner::__init()
{
	//name = std::string();
	//limit = int(0);
	//remaining = int(0);
	//reset_seconds = double(0);
}

void
RealtimeServerEventRateLimitsUpdated_rate_limits_inner::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(limit != NULL) {
	//
	//delete limit;
	//limit = NULL;
	//}
	//if(remaining != NULL) {
	//
	//delete remaining;
	//remaining = NULL;
	//}
	//if(reset_seconds != NULL) {
	//
	//delete reset_seconds;
	//reset_seconds = NULL;
	//}
	//
}

void
RealtimeServerEventRateLimitsUpdated_rate_limits_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *limitKey = "limit";
	node = json_object_get_member(pJsonObject, limitKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&limit, node, "int", "");
		} else {
			
		}
	}
	const gchar *remainingKey = "remaining";
	node = json_object_get_member(pJsonObject, remainingKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&remaining, node, "int", "");
		} else {
			
		}
	}
	const gchar *reset_secondsKey = "reset_seconds";
	node = json_object_get_member(pJsonObject, reset_secondsKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&reset_seconds, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&reset_seconds);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RealtimeServerEventRateLimitsUpdated_rate_limits_inner::RealtimeServerEventRateLimitsUpdated_rate_limits_inner(char* json)
{
	this->fromJson(json);
}

char*
RealtimeServerEventRateLimitsUpdated_rate_limits_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("int")) {
		int obj = getLimit();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *limitKey = "limit";
	json_object_set_member(pJsonObject, limitKey, node);
	if (isprimitive("int")) {
		int obj = getRemaining();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *remainingKey = "remaining";
	json_object_set_member(pJsonObject, remainingKey, node);
	if (isprimitive("long long")) {
		long long obj = getResetSeconds();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getResetSeconds());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *reset_secondsKey = "reset_seconds";
	json_object_set_member(pJsonObject, reset_secondsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RealtimeServerEventRateLimitsUpdated_rate_limits_inner::getName()
{
	return name;
}

void
RealtimeServerEventRateLimitsUpdated_rate_limits_inner::setName(std::string  name)
{
	this->name = name;
}

int
RealtimeServerEventRateLimitsUpdated_rate_limits_inner::getLimit()
{
	return limit;
}

void
RealtimeServerEventRateLimitsUpdated_rate_limits_inner::setLimit(int  limit)
{
	this->limit = limit;
}

int
RealtimeServerEventRateLimitsUpdated_rate_limits_inner::getRemaining()
{
	return remaining;
}

void
RealtimeServerEventRateLimitsUpdated_rate_limits_inner::setRemaining(int  remaining)
{
	this->remaining = remaining;
}

long long
RealtimeServerEventRateLimitsUpdated_rate_limits_inner::getResetSeconds()
{
	return reset_seconds;
}

void
RealtimeServerEventRateLimitsUpdated_rate_limits_inner::setResetSeconds(long long  reset_seconds)
{
	this->reset_seconds = reset_seconds;
}


