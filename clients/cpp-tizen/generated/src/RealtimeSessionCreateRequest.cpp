#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeSessionCreateRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeSessionCreateRequest::RealtimeSessionCreateRequest()
{
	//__init();
}

RealtimeSessionCreateRequest::~RealtimeSessionCreateRequest()
{
	//__cleanup();
}

void
RealtimeSessionCreateRequest::__init()
{
	//new std::list()std::list> modalities;
	//model = std::string();
	//instructions = std::string();
	//voice = std::string();
	//input_audio_format = std::string();
	//output_audio_format = std::string();
	//input_audio_transcription = new RealtimeSession_input_audio_transcription();
	//turn_detection = new RealtimeSessionCreateRequest_turn_detection();
	//new std::list()std::list> tools;
	//tool_choice = std::string();
	//temperature = double(0);
	//max_response_output_tokens = new RealtimeResponseCreateParams_max_response_output_tokens();
}

void
RealtimeSessionCreateRequest::__cleanup()
{
	//if(modalities != NULL) {
	//modalities.RemoveAll(true);
	//delete modalities;
	//modalities = NULL;
	//}
	//if(model != NULL) {
	//
	//delete model;
	//model = NULL;
	//}
	//if(instructions != NULL) {
	//
	//delete instructions;
	//instructions = NULL;
	//}
	//if(voice != NULL) {
	//
	//delete voice;
	//voice = NULL;
	//}
	//if(input_audio_format != NULL) {
	//
	//delete input_audio_format;
	//input_audio_format = NULL;
	//}
	//if(output_audio_format != NULL) {
	//
	//delete output_audio_format;
	//output_audio_format = NULL;
	//}
	//if(input_audio_transcription != NULL) {
	//
	//delete input_audio_transcription;
	//input_audio_transcription = NULL;
	//}
	//if(turn_detection != NULL) {
	//
	//delete turn_detection;
	//turn_detection = NULL;
	//}
	//if(tools != NULL) {
	//tools.RemoveAll(true);
	//delete tools;
	//tools = NULL;
	//}
	//if(tool_choice != NULL) {
	//
	//delete tool_choice;
	//tool_choice = NULL;
	//}
	//if(temperature != NULL) {
	//
	//delete temperature;
	//temperature = NULL;
	//}
	//if(max_response_output_tokens != NULL) {
	//
	//delete max_response_output_tokens;
	//max_response_output_tokens = NULL;
	//}
	//
}

void
RealtimeSessionCreateRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *modalitiesKey = "modalities";
	node = json_object_get_member(pJsonObject, modalitiesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			modalities = new_list;
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
	const gchar *instructionsKey = "instructions";
	node = json_object_get_member(pJsonObject, instructionsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&instructions, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *voiceKey = "voice";
	node = json_object_get_member(pJsonObject, voiceKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&voice, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *input_audio_formatKey = "input_audio_format";
	node = json_object_get_member(pJsonObject, input_audio_formatKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&input_audio_format, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *output_audio_formatKey = "output_audio_format";
	node = json_object_get_member(pJsonObject, output_audio_formatKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&output_audio_format, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *input_audio_transcriptionKey = "input_audio_transcription";
	node = json_object_get_member(pJsonObject, input_audio_transcriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("RealtimeSession_input_audio_transcription")) {
			jsonToValue(&input_audio_transcription, node, "RealtimeSession_input_audio_transcription", "RealtimeSession_input_audio_transcription");
		} else {
			
			RealtimeSession_input_audio_transcription* obj = static_cast<RealtimeSession_input_audio_transcription*> (&input_audio_transcription);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *turn_detectionKey = "turn_detection";
	node = json_object_get_member(pJsonObject, turn_detectionKey);
	if (node !=NULL) {
	

		if (isprimitive("RealtimeSessionCreateRequest_turn_detection")) {
			jsonToValue(&turn_detection, node, "RealtimeSessionCreateRequest_turn_detection", "RealtimeSessionCreateRequest_turn_detection");
		} else {
			
			RealtimeSessionCreateRequest_turn_detection* obj = static_cast<RealtimeSessionCreateRequest_turn_detection*> (&turn_detection);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *toolsKey = "tools";
	node = json_object_get_member(pJsonObject, toolsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<RealtimeResponseCreateParams_tools_inner> new_list;
			RealtimeResponseCreateParams_tools_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("RealtimeResponseCreateParams_tools_inner")) {
					jsonToValue(&inst, temp_json, "RealtimeResponseCreateParams_tools_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			tools = new_list;
		}
		
	}
	const gchar *tool_choiceKey = "tool_choice";
	node = json_object_get_member(pJsonObject, tool_choiceKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&tool_choice, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *temperatureKey = "temperature";
	node = json_object_get_member(pJsonObject, temperatureKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&temperature, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&temperature);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *max_response_output_tokensKey = "max_response_output_tokens";
	node = json_object_get_member(pJsonObject, max_response_output_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("RealtimeResponseCreateParams_max_response_output_tokens")) {
			jsonToValue(&max_response_output_tokens, node, "RealtimeResponseCreateParams_max_response_output_tokens", "RealtimeResponseCreateParams_max_response_output_tokens");
		} else {
			
			RealtimeResponseCreateParams_max_response_output_tokens* obj = static_cast<RealtimeResponseCreateParams_max_response_output_tokens*> (&max_response_output_tokens);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RealtimeSessionCreateRequest::RealtimeSessionCreateRequest(char* json)
{
	this->fromJson(json);
}

char*
RealtimeSessionCreateRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getModalities());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getModalities());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *modalitiesKey = "modalities";
	json_object_set_member(pJsonObject, modalitiesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getModel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *modelKey = "model";
	json_object_set_member(pJsonObject, modelKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getInstructions();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *instructionsKey = "instructions";
	json_object_set_member(pJsonObject, instructionsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVoice();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *voiceKey = "voice";
	json_object_set_member(pJsonObject, voiceKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getInputAudioFormat();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *input_audio_formatKey = "input_audio_format";
	json_object_set_member(pJsonObject, input_audio_formatKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOutputAudioFormat();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *output_audio_formatKey = "output_audio_format";
	json_object_set_member(pJsonObject, output_audio_formatKey, node);
	if (isprimitive("RealtimeSession_input_audio_transcription")) {
		RealtimeSession_input_audio_transcription obj = getInputAudioTranscription();
		node = converttoJson(&obj, "RealtimeSession_input_audio_transcription", "");
	}
	else {
		
		RealtimeSession_input_audio_transcription obj = static_cast<RealtimeSession_input_audio_transcription> (getInputAudioTranscription());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *input_audio_transcriptionKey = "input_audio_transcription";
	json_object_set_member(pJsonObject, input_audio_transcriptionKey, node);
	if (isprimitive("RealtimeSessionCreateRequest_turn_detection")) {
		RealtimeSessionCreateRequest_turn_detection obj = getTurnDetection();
		node = converttoJson(&obj, "RealtimeSessionCreateRequest_turn_detection", "");
	}
	else {
		
		RealtimeSessionCreateRequest_turn_detection obj = static_cast<RealtimeSessionCreateRequest_turn_detection> (getTurnDetection());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *turn_detectionKey = "turn_detection";
	json_object_set_member(pJsonObject, turn_detectionKey, node);
	if (isprimitive("RealtimeResponseCreateParams_tools_inner")) {
		list<RealtimeResponseCreateParams_tools_inner> new_list = static_cast<list <RealtimeResponseCreateParams_tools_inner> > (getTools());
		node = converttoJson(&new_list, "RealtimeResponseCreateParams_tools_inner", "array");
	} else {
		node = json_node_alloc();
		list<RealtimeResponseCreateParams_tools_inner> new_list = static_cast<list <RealtimeResponseCreateParams_tools_inner> > (getTools());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<RealtimeResponseCreateParams_tools_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			RealtimeResponseCreateParams_tools_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *toolsKey = "tools";
	json_object_set_member(pJsonObject, toolsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getToolChoice();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *tool_choiceKey = "tool_choice";
	json_object_set_member(pJsonObject, tool_choiceKey, node);
	if (isprimitive("long long")) {
		long long obj = getTemperature();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getTemperature());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *temperatureKey = "temperature";
	json_object_set_member(pJsonObject, temperatureKey, node);
	if (isprimitive("RealtimeResponseCreateParams_max_response_output_tokens")) {
		RealtimeResponseCreateParams_max_response_output_tokens obj = getMaxResponseOutputTokens();
		node = converttoJson(&obj, "RealtimeResponseCreateParams_max_response_output_tokens", "");
	}
	else {
		
		RealtimeResponseCreateParams_max_response_output_tokens obj = static_cast<RealtimeResponseCreateParams_max_response_output_tokens> (getMaxResponseOutputTokens());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *max_response_output_tokensKey = "max_response_output_tokens";
	json_object_set_member(pJsonObject, max_response_output_tokensKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
RealtimeSessionCreateRequest::getModalities()
{
	return modalities;
}

void
RealtimeSessionCreateRequest::setModalities(std::list <std::string> modalities)
{
	this->modalities = modalities;
}

std::string
RealtimeSessionCreateRequest::getModel()
{
	return model;
}

void
RealtimeSessionCreateRequest::setModel(std::string  model)
{
	this->model = model;
}

std::string
RealtimeSessionCreateRequest::getInstructions()
{
	return instructions;
}

void
RealtimeSessionCreateRequest::setInstructions(std::string  instructions)
{
	this->instructions = instructions;
}

std::string
RealtimeSessionCreateRequest::getVoice()
{
	return voice;
}

void
RealtimeSessionCreateRequest::setVoice(std::string  voice)
{
	this->voice = voice;
}

std::string
RealtimeSessionCreateRequest::getInputAudioFormat()
{
	return input_audio_format;
}

void
RealtimeSessionCreateRequest::setInputAudioFormat(std::string  input_audio_format)
{
	this->input_audio_format = input_audio_format;
}

std::string
RealtimeSessionCreateRequest::getOutputAudioFormat()
{
	return output_audio_format;
}

void
RealtimeSessionCreateRequest::setOutputAudioFormat(std::string  output_audio_format)
{
	this->output_audio_format = output_audio_format;
}

RealtimeSession_input_audio_transcription
RealtimeSessionCreateRequest::getInputAudioTranscription()
{
	return input_audio_transcription;
}

void
RealtimeSessionCreateRequest::setInputAudioTranscription(RealtimeSession_input_audio_transcription  input_audio_transcription)
{
	this->input_audio_transcription = input_audio_transcription;
}

RealtimeSessionCreateRequest_turn_detection
RealtimeSessionCreateRequest::getTurnDetection()
{
	return turn_detection;
}

void
RealtimeSessionCreateRequest::setTurnDetection(RealtimeSessionCreateRequest_turn_detection  turn_detection)
{
	this->turn_detection = turn_detection;
}

std::list<RealtimeResponseCreateParams_tools_inner>
RealtimeSessionCreateRequest::getTools()
{
	return tools;
}

void
RealtimeSessionCreateRequest::setTools(std::list <RealtimeResponseCreateParams_tools_inner> tools)
{
	this->tools = tools;
}

std::string
RealtimeSessionCreateRequest::getToolChoice()
{
	return tool_choice;
}

void
RealtimeSessionCreateRequest::setToolChoice(std::string  tool_choice)
{
	this->tool_choice = tool_choice;
}

long long
RealtimeSessionCreateRequest::getTemperature()
{
	return temperature;
}

void
RealtimeSessionCreateRequest::setTemperature(long long  temperature)
{
	this->temperature = temperature;
}

RealtimeResponseCreateParams_max_response_output_tokens
RealtimeSessionCreateRequest::getMaxResponseOutputTokens()
{
	return max_response_output_tokens;
}

void
RealtimeSessionCreateRequest::setMaxResponseOutputTokens(RealtimeResponseCreateParams_max_response_output_tokens  max_response_output_tokens)
{
	this->max_response_output_tokens = max_response_output_tokens;
}


