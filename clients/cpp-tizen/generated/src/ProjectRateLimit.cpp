#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProjectRateLimit.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProjectRateLimit::ProjectRateLimit()
{
	//__init();
}

ProjectRateLimit::~ProjectRateLimit()
{
	//__cleanup();
}

void
ProjectRateLimit::__init()
{
	//object = std::string();
	//id = std::string();
	//model = std::string();
	//max_requests_per_1_minute = int(0);
	//max_tokens_per_1_minute = int(0);
	//max_images_per_1_minute = int(0);
	//max_audio_megabytes_per_1_minute = int(0);
	//max_requests_per_1_day = int(0);
	//batch_1_day_max_input_tokens = int(0);
}

void
ProjectRateLimit::__cleanup()
{
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(model != NULL) {
	//
	//delete model;
	//model = NULL;
	//}
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
ProjectRateLimit::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *objectKey = "object";
	node = json_object_get_member(pJsonObject, objectKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&object, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *modelKey = "model";
	node = json_object_get_member(pJsonObject, modelKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&model, node, "std::string", "");
		} else {
			
		}
	}
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

ProjectRateLimit::ProjectRateLimit(char* json)
{
	this->fromJson(json);
}

char*
ProjectRateLimit::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getObject();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *objectKey = "object";
	json_object_set_member(pJsonObject, objectKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getModel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *modelKey = "model";
	json_object_set_member(pJsonObject, modelKey, node);
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

std::string
ProjectRateLimit::getObject()
{
	return object;
}

void
ProjectRateLimit::setObject(std::string  object)
{
	this->object = object;
}

std::string
ProjectRateLimit::getId()
{
	return id;
}

void
ProjectRateLimit::setId(std::string  id)
{
	this->id = id;
}

std::string
ProjectRateLimit::getModel()
{
	return model;
}

void
ProjectRateLimit::setModel(std::string  model)
{
	this->model = model;
}

int
ProjectRateLimit::getMaxRequestsPer1Minute()
{
	return max_requests_per_1_minute;
}

void
ProjectRateLimit::setMaxRequestsPer1Minute(int  max_requests_per_1_minute)
{
	this->max_requests_per_1_minute = max_requests_per_1_minute;
}

int
ProjectRateLimit::getMaxTokensPer1Minute()
{
	return max_tokens_per_1_minute;
}

void
ProjectRateLimit::setMaxTokensPer1Minute(int  max_tokens_per_1_minute)
{
	this->max_tokens_per_1_minute = max_tokens_per_1_minute;
}

int
ProjectRateLimit::getMaxImagesPer1Minute()
{
	return max_images_per_1_minute;
}

void
ProjectRateLimit::setMaxImagesPer1Minute(int  max_images_per_1_minute)
{
	this->max_images_per_1_minute = max_images_per_1_minute;
}

int
ProjectRateLimit::getMaxAudioMegabytesPer1Minute()
{
	return max_audio_megabytes_per_1_minute;
}

void
ProjectRateLimit::setMaxAudioMegabytesPer1Minute(int  max_audio_megabytes_per_1_minute)
{
	this->max_audio_megabytes_per_1_minute = max_audio_megabytes_per_1_minute;
}

int
ProjectRateLimit::getMaxRequestsPer1Day()
{
	return max_requests_per_1_day;
}

void
ProjectRateLimit::setMaxRequestsPer1Day(int  max_requests_per_1_day)
{
	this->max_requests_per_1_day = max_requests_per_1_day;
}

int
ProjectRateLimit::getBatch1DayMaxInputTokens()
{
	return batch_1_day_max_input_tokens;
}

void
ProjectRateLimit::setBatch1DayMaxInputTokens(int  batch_1_day_max_input_tokens)
{
	this->batch_1_day_max_input_tokens = batch_1_day_max_input_tokens;
}


