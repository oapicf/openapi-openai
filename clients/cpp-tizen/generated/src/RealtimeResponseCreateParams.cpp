#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeResponseCreateParams.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeResponseCreateParams::RealtimeResponseCreateParams()
{
	//__init();
}

RealtimeResponseCreateParams::~RealtimeResponseCreateParams()
{
	//__cleanup();
}

void
RealtimeResponseCreateParams::__init()
{
	//new std::list()std::list> modalities;
	//instructions = std::string();
	//voice = std::string();
	//output_audio_format = std::string();
	//new std::list()std::list> tools;
	//tool_choice = std::string();
	//temperature = double(0);
	//max_response_output_tokens = new RealtimeResponseCreateParams_max_response_output_tokens();
	//conversation = new RealtimeResponseCreateParams_conversation();
	//metadata = null;
	//new std::list()std::list> input;
}

void
RealtimeResponseCreateParams::__cleanup()
{
	//if(modalities != NULL) {
	//modalities.RemoveAll(true);
	//delete modalities;
	//modalities = NULL;
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
	//if(output_audio_format != NULL) {
	//
	//delete output_audio_format;
	//output_audio_format = NULL;
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
	//if(conversation != NULL) {
	//
	//delete conversation;
	//conversation = NULL;
	//}
	//if(metadata != NULL) {
	//
	//delete metadata;
	//metadata = NULL;
	//}
	//if(input != NULL) {
	//input.RemoveAll(true);
	//delete input;
	//input = NULL;
	//}
	//
}

void
RealtimeResponseCreateParams::fromJson(char* jsonStr)
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
	const gchar *output_audio_formatKey = "output_audio_format";
	node = json_object_get_member(pJsonObject, output_audio_formatKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&output_audio_format, node, "std::string", "");
		} else {
			
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
	const gchar *conversationKey = "conversation";
	node = json_object_get_member(pJsonObject, conversationKey);
	if (node !=NULL) {
	

		if (isprimitive("RealtimeResponseCreateParams_conversation")) {
			jsonToValue(&conversation, node, "RealtimeResponseCreateParams_conversation", "RealtimeResponseCreateParams_conversation");
		} else {
			
			RealtimeResponseCreateParams_conversation* obj = static_cast<RealtimeResponseCreateParams_conversation*> (&conversation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *metadataKey = "metadata";
	node = json_object_get_member(pJsonObject, metadataKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&metadata, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&metadata);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *inputKey = "input";
	node = json_object_get_member(pJsonObject, inputKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<RealtimeConversationItem> new_list;
			RealtimeConversationItem inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("RealtimeConversationItem")) {
					jsonToValue(&inst, temp_json, "RealtimeConversationItem", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			input = new_list;
		}
		
	}
}

RealtimeResponseCreateParams::RealtimeResponseCreateParams(char* json)
{
	this->fromJson(json);
}

char*
RealtimeResponseCreateParams::toJson()
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
		std::string obj = getOutputAudioFormat();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *output_audio_formatKey = "output_audio_format";
	json_object_set_member(pJsonObject, output_audio_formatKey, node);
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
	if (isprimitive("RealtimeResponseCreateParams_conversation")) {
		RealtimeResponseCreateParams_conversation obj = getConversation();
		node = converttoJson(&obj, "RealtimeResponseCreateParams_conversation", "");
	}
	else {
		
		RealtimeResponseCreateParams_conversation obj = static_cast<RealtimeResponseCreateParams_conversation> (getConversation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *conversationKey = "conversation";
	json_object_set_member(pJsonObject, conversationKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMetadata();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getMetadata());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *metadataKey = "metadata";
	json_object_set_member(pJsonObject, metadataKey, node);
	if (isprimitive("RealtimeConversationItem")) {
		list<RealtimeConversationItem> new_list = static_cast<list <RealtimeConversationItem> > (getInput());
		node = converttoJson(&new_list, "RealtimeConversationItem", "array");
	} else {
		node = json_node_alloc();
		list<RealtimeConversationItem> new_list = static_cast<list <RealtimeConversationItem> > (getInput());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<RealtimeConversationItem>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			RealtimeConversationItem obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *inputKey = "input";
	json_object_set_member(pJsonObject, inputKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
RealtimeResponseCreateParams::getModalities()
{
	return modalities;
}

void
RealtimeResponseCreateParams::setModalities(std::list <std::string> modalities)
{
	this->modalities = modalities;
}

std::string
RealtimeResponseCreateParams::getInstructions()
{
	return instructions;
}

void
RealtimeResponseCreateParams::setInstructions(std::string  instructions)
{
	this->instructions = instructions;
}

std::string
RealtimeResponseCreateParams::getVoice()
{
	return voice;
}

void
RealtimeResponseCreateParams::setVoice(std::string  voice)
{
	this->voice = voice;
}

std::string
RealtimeResponseCreateParams::getOutputAudioFormat()
{
	return output_audio_format;
}

void
RealtimeResponseCreateParams::setOutputAudioFormat(std::string  output_audio_format)
{
	this->output_audio_format = output_audio_format;
}

std::list<RealtimeResponseCreateParams_tools_inner>
RealtimeResponseCreateParams::getTools()
{
	return tools;
}

void
RealtimeResponseCreateParams::setTools(std::list <RealtimeResponseCreateParams_tools_inner> tools)
{
	this->tools = tools;
}

std::string
RealtimeResponseCreateParams::getToolChoice()
{
	return tool_choice;
}

void
RealtimeResponseCreateParams::setToolChoice(std::string  tool_choice)
{
	this->tool_choice = tool_choice;
}

long long
RealtimeResponseCreateParams::getTemperature()
{
	return temperature;
}

void
RealtimeResponseCreateParams::setTemperature(long long  temperature)
{
	this->temperature = temperature;
}

RealtimeResponseCreateParams_max_response_output_tokens
RealtimeResponseCreateParams::getMaxResponseOutputTokens()
{
	return max_response_output_tokens;
}

void
RealtimeResponseCreateParams::setMaxResponseOutputTokens(RealtimeResponseCreateParams_max_response_output_tokens  max_response_output_tokens)
{
	this->max_response_output_tokens = max_response_output_tokens;
}

RealtimeResponseCreateParams_conversation
RealtimeResponseCreateParams::getConversation()
{
	return conversation;
}

void
RealtimeResponseCreateParams::setConversation(RealtimeResponseCreateParams_conversation  conversation)
{
	this->conversation = conversation;
}

std::string
RealtimeResponseCreateParams::getMetadata()
{
	return metadata;
}

void
RealtimeResponseCreateParams::setMetadata(std::string  metadata)
{
	this->metadata = metadata;
}

std::list<RealtimeConversationItem>
RealtimeResponseCreateParams::getInput()
{
	return input;
}

void
RealtimeResponseCreateParams::setInput(std::list <RealtimeConversationItem> input)
{
	this->input = input;
}


