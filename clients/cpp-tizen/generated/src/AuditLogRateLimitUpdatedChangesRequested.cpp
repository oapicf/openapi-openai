#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AuditLog_rate_limit_updated_changes_requested.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AuditLog_rate_limit_updated_changes_requested::AuditLog_rate_limit_updated_changes_requested()
{
	//__init();
}

AuditLog_rate_limit_updated_changes_requested::~AuditLog_rate_limit_updated_changes_requested()
{
	//__cleanup();
}

void
AuditLog_rate_limit_updated_changes_requested::__init()
{
	//max_requests_per_1_minute = int(0);
	//max_tokens_per_1_minute = int(0);
	//max_images_per_1_minute = int(0);
	//max_audio_megabytes_per_1_minute = int(0);
	//max_requests_per_1_day = int(0);
	//batch_1_day_max_input_tokens = int(0);
}

void
AuditLog_rate_limit_updated_changes_requested::__cleanup()
{
	//if(max_requests_per_1_minute != NULL) {
	//
	//delete max_requests_per_1_minute;
	//max_requests_per_1_minute = NULL;
	//}
	//if(max_tokens_per_1_minute != NULL) {
	//
	//delete max_tokens_per_1_minute;
	//max_tokens_per_1_minute = NULL;
	//}
	//if(max_images_per_1_minute != NULL) {
	//
	//delete max_images_per_1_minute;
	//max_images_per_1_minute = NULL;
	//}
	//if(max_audio_megabytes_per_1_minute != NULL) {
	//
	//delete max_audio_megabytes_per_1_minute;
	//max_audio_megabytes_per_1_minute = NULL;
	//}
	//if(max_requests_per_1_day != NULL) {
	//
	//delete max_requests_per_1_day;
	//max_requests_per_1_day = NULL;
	//}
	//if(batch_1_day_max_input_tokens != NULL) {
	//
	//delete batch_1_day_max_input_tokens;
	//batch_1_day_max_input_tokens = NULL;
	//}
	//
}

void
AuditLog_rate_limit_updated_changes_requested::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *max_requests_per_1_minuteKey = "max_requests_per_1_minute";
	node = json_object_get_member(pJsonObject, max_requests_per_1_minuteKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&max_requests_per_1_minute, node, "int", "");
		} else {
			
		}
	}
	const gchar *max_tokens_per_1_minuteKey = "max_tokens_per_1_minute";
	node = json_object_get_member(pJsonObject, max_tokens_per_1_minuteKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&max_tokens_per_1_minute, node, "int", "");
		} else {
			
		}
	}
	const gchar *max_images_per_1_minuteKey = "max_images_per_1_minute";
	node = json_object_get_member(pJsonObject, max_images_per_1_minuteKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&max_images_per_1_minute, node, "int", "");
		} else {
			
		}
	}
	const gchar *max_audio_megabytes_per_1_minuteKey = "max_audio_megabytes_per_1_minute";
	node = json_object_get_member(pJsonObject, max_audio_megabytes_per_1_minuteKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&max_audio_megabytes_per_1_minute, node, "int", "");
		} else {
			
		}
	}
	const gchar *max_requests_per_1_dayKey = "max_requests_per_1_day";
	node = json_object_get_member(pJsonObject, max_requests_per_1_dayKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&max_requests_per_1_day, node, "int", "");
		} else {
			
		}
	}
	const gchar *batch_1_day_max_input_tokensKey = "batch_1_day_max_input_tokens";
	node = json_object_get_member(pJsonObject, batch_1_day_max_input_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&batch_1_day_max_input_tokens, node, "int", "");
		} else {
			
		}
	}
}

AuditLog_rate_limit_updated_changes_requested::AuditLog_rate_limit_updated_changes_requested(char* json)
{
	this->fromJson(json);
}

char*
AuditLog_rate_limit_updated_changes_requested::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getMaxRequestsPer1Minute();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *max_requests_per_1_minuteKey = "max_requests_per_1_minute";
	json_object_set_member(pJsonObject, max_requests_per_1_minuteKey, node);
	if (isprimitive("int")) {
		int obj = getMaxTokensPer1Minute();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *max_tokens_per_1_minuteKey = "max_tokens_per_1_minute";
	json_object_set_member(pJsonObject, max_tokens_per_1_minuteKey, node);
	if (isprimitive("int")) {
		int obj = getMaxImagesPer1Minute();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *max_images_per_1_minuteKey = "max_images_per_1_minute";
	json_object_set_member(pJsonObject, max_images_per_1_minuteKey, node);
	if (isprimitive("int")) {
		int obj = getMaxAudioMegabytesPer1Minute();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *max_audio_megabytes_per_1_minuteKey = "max_audio_megabytes_per_1_minute";
	json_object_set_member(pJsonObject, max_audio_megabytes_per_1_minuteKey, node);
	if (isprimitive("int")) {
		int obj = getMaxRequestsPer1Day();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *max_requests_per_1_dayKey = "max_requests_per_1_day";
	json_object_set_member(pJsonObject, max_requests_per_1_dayKey, node);
	if (isprimitive("int")) {
		int obj = getBatch1DayMaxInputTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *batch_1_day_max_input_tokensKey = "batch_1_day_max_input_tokens";
	json_object_set_member(pJsonObject, batch_1_day_max_input_tokensKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
AuditLog_rate_limit_updated_changes_requested::getMaxRequestsPer1Minute()
{
	return max_requests_per_1_minute;
}

void
AuditLog_rate_limit_updated_changes_requested::setMaxRequestsPer1Minute(int  max_requests_per_1_minute)
{
	this->max_requests_per_1_minute = max_requests_per_1_minute;
}

int
AuditLog_rate_limit_updated_changes_requested::getMaxTokensPer1Minute()
{
	return max_tokens_per_1_minute;
}

void
AuditLog_rate_limit_updated_changes_requested::setMaxTokensPer1Minute(int  max_tokens_per_1_minute)
{
	this->max_tokens_per_1_minute = max_tokens_per_1_minute;
}

int
AuditLog_rate_limit_updated_changes_requested::getMaxImagesPer1Minute()
{
	return max_images_per_1_minute;
}

void
AuditLog_rate_limit_updated_changes_requested::setMaxImagesPer1Minute(int  max_images_per_1_minute)
{
	this->max_images_per_1_minute = max_images_per_1_minute;
}

int
AuditLog_rate_limit_updated_changes_requested::getMaxAudioMegabytesPer1Minute()
{
	return max_audio_megabytes_per_1_minute;
}

void
AuditLog_rate_limit_updated_changes_requested::setMaxAudioMegabytesPer1Minute(int  max_audio_megabytes_per_1_minute)
{
	this->max_audio_megabytes_per_1_minute = max_audio_megabytes_per_1_minute;
}

int
AuditLog_rate_limit_updated_changes_requested::getMaxRequestsPer1Day()
{
	return max_requests_per_1_day;
}

void
AuditLog_rate_limit_updated_changes_requested::setMaxRequestsPer1Day(int  max_requests_per_1_day)
{
	this->max_requests_per_1_day = max_requests_per_1_day;
}

int
AuditLog_rate_limit_updated_changes_requested::getBatch1DayMaxInputTokens()
{
	return batch_1_day_max_input_tokens;
}

void
AuditLog_rate_limit_updated_changes_requested::setBatch1DayMaxInputTokens(int  batch_1_day_max_input_tokens)
{
	this->batch_1_day_max_input_tokens = batch_1_day_max_input_tokens;
}


