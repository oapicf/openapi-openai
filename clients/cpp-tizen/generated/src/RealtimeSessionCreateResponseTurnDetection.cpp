#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeSessionCreateResponse_turn_detection.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeSessionCreateResponse_turn_detection::RealtimeSessionCreateResponse_turn_detection()
{
	//__init();
}

RealtimeSessionCreateResponse_turn_detection::~RealtimeSessionCreateResponse_turn_detection()
{
	//__cleanup();
}

void
RealtimeSessionCreateResponse_turn_detection::__init()
{
	//type = std::string();
	//threshold = double(0);
	//prefix_padding_ms = int(0);
	//silence_duration_ms = int(0);
}

void
RealtimeSessionCreateResponse_turn_detection::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(threshold != NULL) {
	//
	//delete threshold;
	//threshold = NULL;
	//}
	//if(prefix_padding_ms != NULL) {
	//
	//delete prefix_padding_ms;
	//prefix_padding_ms = NULL;
	//}
	//if(silence_duration_ms != NULL) {
	//
	//delete silence_duration_ms;
	//silence_duration_ms = NULL;
	//}
	//
}

void
RealtimeSessionCreateResponse_turn_detection::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *thresholdKey = "threshold";
	node = json_object_get_member(pJsonObject, thresholdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&threshold, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&threshold);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *prefix_padding_msKey = "prefix_padding_ms";
	node = json_object_get_member(pJsonObject, prefix_padding_msKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&prefix_padding_ms, node, "int", "");
		} else {
			
		}
	}
	const gchar *silence_duration_msKey = "silence_duration_ms";
	node = json_object_get_member(pJsonObject, silence_duration_msKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&silence_duration_ms, node, "int", "");
		} else {
			
		}
	}
}

RealtimeSessionCreateResponse_turn_detection::RealtimeSessionCreateResponse_turn_detection(char* json)
{
	this->fromJson(json);
}

char*
RealtimeSessionCreateResponse_turn_detection::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("long long")) {
		long long obj = getThreshold();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getThreshold());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *thresholdKey = "threshold";
	json_object_set_member(pJsonObject, thresholdKey, node);
	if (isprimitive("int")) {
		int obj = getPrefixPaddingMs();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *prefix_padding_msKey = "prefix_padding_ms";
	json_object_set_member(pJsonObject, prefix_padding_msKey, node);
	if (isprimitive("int")) {
		int obj = getSilenceDurationMs();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *silence_duration_msKey = "silence_duration_ms";
	json_object_set_member(pJsonObject, silence_duration_msKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RealtimeSessionCreateResponse_turn_detection::getType()
{
	return type;
}

void
RealtimeSessionCreateResponse_turn_detection::setType(std::string  type)
{
	this->type = type;
}

long long
RealtimeSessionCreateResponse_turn_detection::getThreshold()
{
	return threshold;
}

void
RealtimeSessionCreateResponse_turn_detection::setThreshold(long long  threshold)
{
	this->threshold = threshold;
}

int
RealtimeSessionCreateResponse_turn_detection::getPrefixPaddingMs()
{
	return prefix_padding_ms;
}

void
RealtimeSessionCreateResponse_turn_detection::setPrefixPaddingMs(int  prefix_padding_ms)
{
	this->prefix_padding_ms = prefix_padding_ms;
}

int
RealtimeSessionCreateResponse_turn_detection::getSilenceDurationMs()
{
	return silence_duration_ms;
}

void
RealtimeSessionCreateResponse_turn_detection::setSilenceDurationMs(int  silence_duration_ms)
{
	this->silence_duration_ms = silence_duration_ms;
}


