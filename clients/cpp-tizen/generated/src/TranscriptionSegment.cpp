#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TranscriptionSegment.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TranscriptionSegment::TranscriptionSegment()
{
	//__init();
}

TranscriptionSegment::~TranscriptionSegment()
{
	//__cleanup();
}

void
TranscriptionSegment::__init()
{
	//id = int(0);
	//seek = int(0);
	//start = float(0);
	//end = float(0);
	//text = std::string();
	//new std::list()std::list> tokens;
	//temperature = float(0);
	//avg_logprob = float(0);
	//compression_ratio = float(0);
	//no_speech_prob = float(0);
}

void
TranscriptionSegment::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(seek != NULL) {
	//
	//delete seek;
	//seek = NULL;
	//}
	//if(start != NULL) {
	//
	//delete start;
	//start = NULL;
	//}
	//if(end != NULL) {
	//
	//delete end;
	//end = NULL;
	//}
	//if(text != NULL) {
	//
	//delete text;
	//text = NULL;
	//}
	//if(tokens != NULL) {
	//tokens.RemoveAll(true);
	//delete tokens;
	//tokens = NULL;
	//}
	//if(temperature != NULL) {
	//
	//delete temperature;
	//temperature = NULL;
	//}
	//if(avg_logprob != NULL) {
	//
	//delete avg_logprob;
	//avg_logprob = NULL;
	//}
	//if(compression_ratio != NULL) {
	//
	//delete compression_ratio;
	//compression_ratio = NULL;
	//}
	//if(no_speech_prob != NULL) {
	//
	//delete no_speech_prob;
	//no_speech_prob = NULL;
	//}
	//
}

void
TranscriptionSegment::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&id, node, "int", "");
		} else {
			
		}
	}
	const gchar *seekKey = "seek";
	node = json_object_get_member(pJsonObject, seekKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&seek, node, "int", "");
		} else {
			
		}
	}
	const gchar *startKey = "start";
	node = json_object_get_member(pJsonObject, startKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&start, node, "float", "");
		} else {
			
		}
	}
	const gchar *endKey = "end";
	node = json_object_get_member(pJsonObject, endKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&end, node, "float", "");
		} else {
			
		}
	}
	const gchar *textKey = "text";
	node = json_object_get_member(pJsonObject, textKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&text, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *tokensKey = "tokens";
	node = json_object_get_member(pJsonObject, tokensKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<int> new_list;
			int inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("int")) {
					jsonToValue(&inst, temp_json, "int", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			tokens = new_list;
		}
		
	}
	const gchar *temperatureKey = "temperature";
	node = json_object_get_member(pJsonObject, temperatureKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&temperature, node, "float", "");
		} else {
			
		}
	}
	const gchar *avg_logprobKey = "avg_logprob";
	node = json_object_get_member(pJsonObject, avg_logprobKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&avg_logprob, node, "float", "");
		} else {
			
		}
	}
	const gchar *compression_ratioKey = "compression_ratio";
	node = json_object_get_member(pJsonObject, compression_ratioKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&compression_ratio, node, "float", "");
		} else {
			
		}
	}
	const gchar *no_speech_probKey = "no_speech_prob";
	node = json_object_get_member(pJsonObject, no_speech_probKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&no_speech_prob, node, "float", "");
		} else {
			
		}
	}
}

TranscriptionSegment::TranscriptionSegment(char* json)
{
	this->fromJson(json);
}

char*
TranscriptionSegment::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("int")) {
		int obj = getSeek();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *seekKey = "seek";
	json_object_set_member(pJsonObject, seekKey, node);
	if (isprimitive("float")) {
		float obj = getStart();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *startKey = "start";
	json_object_set_member(pJsonObject, startKey, node);
	if (isprimitive("float")) {
		float obj = getEnd();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *endKey = "end";
	json_object_set_member(pJsonObject, endKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getText();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *textKey = "text";
	json_object_set_member(pJsonObject, textKey, node);
	if (isprimitive("int")) {
		list<int> new_list = static_cast<list <int> > (getTokens());
		node = converttoJson(&new_list, "int", "array");
	} else {
		node = json_node_alloc();
		list<int> new_list = static_cast<list <int> > (getTokens());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *tokensKey = "tokens";
	json_object_set_member(pJsonObject, tokensKey, node);
	if (isprimitive("float")) {
		float obj = getTemperature();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *temperatureKey = "temperature";
	json_object_set_member(pJsonObject, temperatureKey, node);
	if (isprimitive("float")) {
		float obj = getAvgLogprob();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *avg_logprobKey = "avg_logprob";
	json_object_set_member(pJsonObject, avg_logprobKey, node);
	if (isprimitive("float")) {
		float obj = getCompressionRatio();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *compression_ratioKey = "compression_ratio";
	json_object_set_member(pJsonObject, compression_ratioKey, node);
	if (isprimitive("float")) {
		float obj = getNoSpeechProb();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *no_speech_probKey = "no_speech_prob";
	json_object_set_member(pJsonObject, no_speech_probKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
TranscriptionSegment::getId()
{
	return id;
}

void
TranscriptionSegment::setId(int  id)
{
	this->id = id;
}

int
TranscriptionSegment::getSeek()
{
	return seek;
}

void
TranscriptionSegment::setSeek(int  seek)
{
	this->seek = seek;
}

float
TranscriptionSegment::getStart()
{
	return start;
}

void
TranscriptionSegment::setStart(float  start)
{
	this->start = start;
}

float
TranscriptionSegment::getEnd()
{
	return end;
}

void
TranscriptionSegment::setEnd(float  end)
{
	this->end = end;
}

std::string
TranscriptionSegment::getText()
{
	return text;
}

void
TranscriptionSegment::setText(std::string  text)
{
	this->text = text;
}

std::list<int>
TranscriptionSegment::getTokens()
{
	return tokens;
}

void
TranscriptionSegment::setTokens(std::list <int> tokens)
{
	this->tokens = tokens;
}

float
TranscriptionSegment::getTemperature()
{
	return temperature;
}

void
TranscriptionSegment::setTemperature(float  temperature)
{
	this->temperature = temperature;
}

float
TranscriptionSegment::getAvgLogprob()
{
	return avg_logprob;
}

void
TranscriptionSegment::setAvgLogprob(float  avg_logprob)
{
	this->avg_logprob = avg_logprob;
}

float
TranscriptionSegment::getCompressionRatio()
{
	return compression_ratio;
}

void
TranscriptionSegment::setCompressionRatio(float  compression_ratio)
{
	this->compression_ratio = compression_ratio;
}

float
TranscriptionSegment::getNoSpeechProb()
{
	return no_speech_prob;
}

void
TranscriptionSegment::setNoSpeechProb(float  no_speech_prob)
{
	this->no_speech_prob = no_speech_prob;
}


