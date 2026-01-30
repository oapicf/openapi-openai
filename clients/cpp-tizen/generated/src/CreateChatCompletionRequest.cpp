#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateChatCompletionRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateChatCompletionRequest::CreateChatCompletionRequest()
{
	//__init();
}

CreateChatCompletionRequest::~CreateChatCompletionRequest()
{
	//__cleanup();
}

void
CreateChatCompletionRequest::__init()
{
	//new std::list()std::list> messages;
	//model = new CreateChatCompletionRequest_model();
	//store = bool(false);
	//reasoning_effort = std::string();
	//new std::map()std::map> metadata;
	//frequency_penalty = double(0);
	//new std::map()std::map> logit_bias;
	//logprobs = bool(false);
	//top_logprobs = int(0);
	//max_tokens = int(0);
	//max_completion_tokens = int(0);
	//n = int(0);
	//new std::list()std::list> modalities;
	//prediction = null;
	//audio = new CreateChatCompletionRequest_audio();
	//presence_penalty = double(0);
	//response_format = new CreateChatCompletionRequest_response_format();
	//seed = int(0);
	//service_tier = std::string();
	//stop = new CreateChatCompletionRequest_stop();
	//stream = bool(false);
	//stream_options = new ChatCompletionStreamOptions();
	//temperature = double(0);
	//top_p = double(0);
	//new std::list()std::list> tools;
	//tool_choice = new ChatCompletionToolChoiceOption();
	//parallel_tool_calls = bool(false);
	//user = std::string();
	//function_call = new CreateChatCompletionRequest_function_call();
	//new std::list()std::list> functions;
}

void
CreateChatCompletionRequest::__cleanup()
{
	//if(messages != NULL) {
	//messages.RemoveAll(true);
	//delete messages;
	//messages = NULL;
	//}
	//if(model != NULL) {
	//
	//delete model;
	//model = NULL;
	//}
	//if(store != NULL) {
	//
	//delete store;
	//store = NULL;
	//}
	//if(reasoning_effort != NULL) {
	//
	//delete reasoning_effort;
	//reasoning_effort = NULL;
	//}
	//if(metadata != NULL) {
	//metadata.RemoveAll(true);
	//delete metadata;
	//metadata = NULL;
	//}
	//if(frequency_penalty != NULL) {
	//
	//delete frequency_penalty;
	//frequency_penalty = NULL;
	//}
	//if(logit_bias != NULL) {
	//logit_bias.RemoveAll(true);
	//delete logit_bias;
	//logit_bias = NULL;
	//}
	//if(logprobs != NULL) {
	//
	//delete logprobs;
	//logprobs = NULL;
	//}
	//if(top_logprobs != NULL) {
	//
	//delete top_logprobs;
	//top_logprobs = NULL;
	//}
	//if(max_tokens != NULL) {
	//
	//delete max_tokens;
	//max_tokens = NULL;
	//}
	//if(max_completion_tokens != NULL) {
	//
	//delete max_completion_tokens;
	//max_completion_tokens = NULL;
	//}
	//if(n != NULL) {
	//
	//delete n;
	//n = NULL;
	//}
	//if(modalities != NULL) {
	//modalities.RemoveAll(true);
	//delete modalities;
	//modalities = NULL;
	//}
	//if(prediction != NULL) {
	//
	//delete prediction;
	//prediction = NULL;
	//}
	//if(audio != NULL) {
	//
	//delete audio;
	//audio = NULL;
	//}
	//if(presence_penalty != NULL) {
	//
	//delete presence_penalty;
	//presence_penalty = NULL;
	//}
	//if(response_format != NULL) {
	//
	//delete response_format;
	//response_format = NULL;
	//}
	//if(seed != NULL) {
	//
	//delete seed;
	//seed = NULL;
	//}
	//if(service_tier != NULL) {
	//
	//delete service_tier;
	//service_tier = NULL;
	//}
	//if(stop != NULL) {
	//
	//delete stop;
	//stop = NULL;
	//}
	//if(stream != NULL) {
	//
	//delete stream;
	//stream = NULL;
	//}
	//if(stream_options != NULL) {
	//
	//delete stream_options;
	//stream_options = NULL;
	//}
	//if(temperature != NULL) {
	//
	//delete temperature;
	//temperature = NULL;
	//}
	//if(top_p != NULL) {
	//
	//delete top_p;
	//top_p = NULL;
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
	//if(parallel_tool_calls != NULL) {
	//
	//delete parallel_tool_calls;
	//parallel_tool_calls = NULL;
	//}
	//if(user != NULL) {
	//
	//delete user;
	//user = NULL;
	//}
	//if(function_call != NULL) {
	//
	//delete function_call;
	//function_call = NULL;
	//}
	//if(functions != NULL) {
	//functions.RemoveAll(true);
	//delete functions;
	//functions = NULL;
	//}
	//
}

void
CreateChatCompletionRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *messagesKey = "messages";
	node = json_object_get_member(pJsonObject, messagesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ChatCompletionRequestMessage> new_list;
			ChatCompletionRequestMessage inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ChatCompletionRequestMessage")) {
					jsonToValue(&inst, temp_json, "ChatCompletionRequestMessage", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			messages = new_list;
		}
		
	}
	const gchar *modelKey = "model";
	node = json_object_get_member(pJsonObject, modelKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateChatCompletionRequest_model")) {
			jsonToValue(&model, node, "CreateChatCompletionRequest_model", "CreateChatCompletionRequest_model");
		} else {
			
			CreateChatCompletionRequest_model* obj = static_cast<CreateChatCompletionRequest_model*> (&model);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *storeKey = "store";
	node = json_object_get_member(pJsonObject, storeKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&store, node, "bool", "");
		} else {
			
		}
	}
	const gchar *reasoning_effortKey = "reasoning_effort";
	node = json_object_get_member(pJsonObject, reasoning_effortKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&reasoning_effort, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *metadataKey = "metadata";
	node = json_object_get_member(pJsonObject, metadataKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			metadata = new_map;
		}
		
	}
	const gchar *frequency_penaltyKey = "frequency_penalty";
	node = json_object_get_member(pJsonObject, frequency_penaltyKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&frequency_penalty, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&frequency_penalty);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *logit_biasKey = "logit_bias";
	node = json_object_get_member(pJsonObject, logit_biasKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			logit_bias = new_map;
		}
		
	}
	const gchar *logprobsKey = "logprobs";
	node = json_object_get_member(pJsonObject, logprobsKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&logprobs, node, "bool", "");
		} else {
			
		}
	}
	const gchar *top_logprobsKey = "top_logprobs";
	node = json_object_get_member(pJsonObject, top_logprobsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&top_logprobs, node, "int", "");
		} else {
			
		}
	}
	const gchar *max_tokensKey = "max_tokens";
	node = json_object_get_member(pJsonObject, max_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&max_tokens, node, "int", "");
		} else {
			
		}
	}
	const gchar *max_completion_tokensKey = "max_completion_tokens";
	node = json_object_get_member(pJsonObject, max_completion_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&max_completion_tokens, node, "int", "");
		} else {
			
		}
	}
	const gchar *nKey = "n";
	node = json_object_get_member(pJsonObject, nKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&n, node, "int", "");
		} else {
			
		}
	}
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
	const gchar *predictionKey = "prediction";
	node = json_object_get_member(pJsonObject, predictionKey);
	if (node !=NULL) {
	

		if (isprimitive("PredictionContent")) {
			jsonToValue(&prediction, node, "PredictionContent", "PredictionContent");
		} else {
			
			PredictionContent* obj = static_cast<PredictionContent*> (&prediction);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *audioKey = "audio";
	node = json_object_get_member(pJsonObject, audioKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateChatCompletionRequest_audio")) {
			jsonToValue(&audio, node, "CreateChatCompletionRequest_audio", "CreateChatCompletionRequest_audio");
		} else {
			
			CreateChatCompletionRequest_audio* obj = static_cast<CreateChatCompletionRequest_audio*> (&audio);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *presence_penaltyKey = "presence_penalty";
	node = json_object_get_member(pJsonObject, presence_penaltyKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&presence_penalty, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&presence_penalty);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *response_formatKey = "response_format";
	node = json_object_get_member(pJsonObject, response_formatKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateChatCompletionRequest_response_format")) {
			jsonToValue(&response_format, node, "CreateChatCompletionRequest_response_format", "CreateChatCompletionRequest_response_format");
		} else {
			
			CreateChatCompletionRequest_response_format* obj = static_cast<CreateChatCompletionRequest_response_format*> (&response_format);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *seedKey = "seed";
	node = json_object_get_member(pJsonObject, seedKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&seed, node, "int", "");
		} else {
			
		}
	}
	const gchar *service_tierKey = "service_tier";
	node = json_object_get_member(pJsonObject, service_tierKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&service_tier, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *stopKey = "stop";
	node = json_object_get_member(pJsonObject, stopKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateChatCompletionRequest_stop")) {
			jsonToValue(&stop, node, "CreateChatCompletionRequest_stop", "CreateChatCompletionRequest_stop");
		} else {
			
			CreateChatCompletionRequest_stop* obj = static_cast<CreateChatCompletionRequest_stop*> (&stop);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *streamKey = "stream";
	node = json_object_get_member(pJsonObject, streamKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&stream, node, "bool", "");
		} else {
			
		}
	}
	const gchar *stream_optionsKey = "stream_options";
	node = json_object_get_member(pJsonObject, stream_optionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ChatCompletionStreamOptions")) {
			jsonToValue(&stream_options, node, "ChatCompletionStreamOptions", "ChatCompletionStreamOptions");
		} else {
			
			ChatCompletionStreamOptions* obj = static_cast<ChatCompletionStreamOptions*> (&stream_options);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *top_pKey = "top_p";
	node = json_object_get_member(pJsonObject, top_pKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&top_p, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&top_p);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *toolsKey = "tools";
	node = json_object_get_member(pJsonObject, toolsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ChatCompletionTool> new_list;
			ChatCompletionTool inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ChatCompletionTool")) {
					jsonToValue(&inst, temp_json, "ChatCompletionTool", "");
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
	

		if (isprimitive("ChatCompletionToolChoiceOption")) {
			jsonToValue(&tool_choice, node, "ChatCompletionToolChoiceOption", "ChatCompletionToolChoiceOption");
		} else {
			
			ChatCompletionToolChoiceOption* obj = static_cast<ChatCompletionToolChoiceOption*> (&tool_choice);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *parallel_tool_callsKey = "parallel_tool_calls";
	node = json_object_get_member(pJsonObject, parallel_tool_callsKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&parallel_tool_calls, node, "bool", "");
		} else {
			
		}
	}
	const gchar *userKey = "user";
	node = json_object_get_member(pJsonObject, userKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&user, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *function_callKey = "function_call";
	node = json_object_get_member(pJsonObject, function_callKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateChatCompletionRequest_function_call")) {
			jsonToValue(&function_call, node, "CreateChatCompletionRequest_function_call", "CreateChatCompletionRequest_function_call");
		} else {
			
			CreateChatCompletionRequest_function_call* obj = static_cast<CreateChatCompletionRequest_function_call*> (&function_call);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *functionsKey = "functions";
	node = json_object_get_member(pJsonObject, functionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ChatCompletionFunctions> new_list;
			ChatCompletionFunctions inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ChatCompletionFunctions")) {
					jsonToValue(&inst, temp_json, "ChatCompletionFunctions", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			functions = new_list;
		}
		
	}
}

CreateChatCompletionRequest::CreateChatCompletionRequest(char* json)
{
	this->fromJson(json);
}

char*
CreateChatCompletionRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ChatCompletionRequestMessage")) {
		list<ChatCompletionRequestMessage> new_list = static_cast<list <ChatCompletionRequestMessage> > (getMessages());
		node = converttoJson(&new_list, "ChatCompletionRequestMessage", "array");
	} else {
		node = json_node_alloc();
		list<ChatCompletionRequestMessage> new_list = static_cast<list <ChatCompletionRequestMessage> > (getMessages());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ChatCompletionRequestMessage>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ChatCompletionRequestMessage obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *messagesKey = "messages";
	json_object_set_member(pJsonObject, messagesKey, node);
	if (isprimitive("CreateChatCompletionRequest_model")) {
		CreateChatCompletionRequest_model obj = getModel();
		node = converttoJson(&obj, "CreateChatCompletionRequest_model", "");
	}
	else {
		
		CreateChatCompletionRequest_model obj = static_cast<CreateChatCompletionRequest_model> (getModel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *modelKey = "model";
	json_object_set_member(pJsonObject, modelKey, node);
	if (isprimitive("bool")) {
		bool obj = getStore();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *storeKey = "store";
	json_object_set_member(pJsonObject, storeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getReasoningEffort();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *reasoning_effortKey = "reasoning_effort";
	json_object_set_member(pJsonObject, reasoning_effortKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getMetadata());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *metadataKey = "metadata";
	json_object_set_member(pJsonObject, metadataKey, node);
	if (isprimitive("long long")) {
		long long obj = getFrequencyPenalty();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getFrequencyPenalty());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *frequency_penaltyKey = "frequency_penalty";
	json_object_set_member(pJsonObject, frequency_penaltyKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getLogitBias());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *logit_biasKey = "logit_bias";
	json_object_set_member(pJsonObject, logit_biasKey, node);
	if (isprimitive("bool")) {
		bool obj = getLogprobs();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *logprobsKey = "logprobs";
	json_object_set_member(pJsonObject, logprobsKey, node);
	if (isprimitive("int")) {
		int obj = getTopLogprobs();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *top_logprobsKey = "top_logprobs";
	json_object_set_member(pJsonObject, top_logprobsKey, node);
	if (isprimitive("int")) {
		int obj = getMaxTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *max_tokensKey = "max_tokens";
	json_object_set_member(pJsonObject, max_tokensKey, node);
	if (isprimitive("int")) {
		int obj = getMaxCompletionTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *max_completion_tokensKey = "max_completion_tokens";
	json_object_set_member(pJsonObject, max_completion_tokensKey, node);
	if (isprimitive("int")) {
		int obj = getN();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *nKey = "n";
	json_object_set_member(pJsonObject, nKey, node);
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
	if (isprimitive("PredictionContent")) {
		PredictionContent obj = getPrediction();
		node = converttoJson(&obj, "PredictionContent", "");
	}
	else {
		
		PredictionContent obj = static_cast<PredictionContent> (getPrediction());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *predictionKey = "prediction";
	json_object_set_member(pJsonObject, predictionKey, node);
	if (isprimitive("CreateChatCompletionRequest_audio")) {
		CreateChatCompletionRequest_audio obj = getAudio();
		node = converttoJson(&obj, "CreateChatCompletionRequest_audio", "");
	}
	else {
		
		CreateChatCompletionRequest_audio obj = static_cast<CreateChatCompletionRequest_audio> (getAudio());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *audioKey = "audio";
	json_object_set_member(pJsonObject, audioKey, node);
	if (isprimitive("long long")) {
		long long obj = getPresencePenalty();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getPresencePenalty());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *presence_penaltyKey = "presence_penalty";
	json_object_set_member(pJsonObject, presence_penaltyKey, node);
	if (isprimitive("CreateChatCompletionRequest_response_format")) {
		CreateChatCompletionRequest_response_format obj = getResponseFormat();
		node = converttoJson(&obj, "CreateChatCompletionRequest_response_format", "");
	}
	else {
		
		CreateChatCompletionRequest_response_format obj = static_cast<CreateChatCompletionRequest_response_format> (getResponseFormat());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *response_formatKey = "response_format";
	json_object_set_member(pJsonObject, response_formatKey, node);
	if (isprimitive("int")) {
		int obj = getSeed();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *seedKey = "seed";
	json_object_set_member(pJsonObject, seedKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getServiceTier();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *service_tierKey = "service_tier";
	json_object_set_member(pJsonObject, service_tierKey, node);
	if (isprimitive("CreateChatCompletionRequest_stop")) {
		CreateChatCompletionRequest_stop obj = getStop();
		node = converttoJson(&obj, "CreateChatCompletionRequest_stop", "");
	}
	else {
		
		CreateChatCompletionRequest_stop obj = static_cast<CreateChatCompletionRequest_stop> (getStop());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *stopKey = "stop";
	json_object_set_member(pJsonObject, stopKey, node);
	if (isprimitive("bool")) {
		bool obj = getStream();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *streamKey = "stream";
	json_object_set_member(pJsonObject, streamKey, node);
	if (isprimitive("ChatCompletionStreamOptions")) {
		ChatCompletionStreamOptions obj = getStreamOptions();
		node = converttoJson(&obj, "ChatCompletionStreamOptions", "");
	}
	else {
		
		ChatCompletionStreamOptions obj = static_cast<ChatCompletionStreamOptions> (getStreamOptions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *stream_optionsKey = "stream_options";
	json_object_set_member(pJsonObject, stream_optionsKey, node);
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
	if (isprimitive("long long")) {
		long long obj = getTopP();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getTopP());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *top_pKey = "top_p";
	json_object_set_member(pJsonObject, top_pKey, node);
	if (isprimitive("ChatCompletionTool")) {
		list<ChatCompletionTool> new_list = static_cast<list <ChatCompletionTool> > (getTools());
		node = converttoJson(&new_list, "ChatCompletionTool", "array");
	} else {
		node = json_node_alloc();
		list<ChatCompletionTool> new_list = static_cast<list <ChatCompletionTool> > (getTools());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ChatCompletionTool>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ChatCompletionTool obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *toolsKey = "tools";
	json_object_set_member(pJsonObject, toolsKey, node);
	if (isprimitive("ChatCompletionToolChoiceOption")) {
		ChatCompletionToolChoiceOption obj = getToolChoice();
		node = converttoJson(&obj, "ChatCompletionToolChoiceOption", "");
	}
	else {
		
		ChatCompletionToolChoiceOption obj = static_cast<ChatCompletionToolChoiceOption> (getToolChoice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tool_choiceKey = "tool_choice";
	json_object_set_member(pJsonObject, tool_choiceKey, node);
	if (isprimitive("bool")) {
		bool obj = getParallelToolCalls();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *parallel_tool_callsKey = "parallel_tool_calls";
	json_object_set_member(pJsonObject, parallel_tool_callsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUser();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *userKey = "user";
	json_object_set_member(pJsonObject, userKey, node);
	if (isprimitive("CreateChatCompletionRequest_function_call")) {
		CreateChatCompletionRequest_function_call obj = getFunctionCall();
		node = converttoJson(&obj, "CreateChatCompletionRequest_function_call", "");
	}
	else {
		
		CreateChatCompletionRequest_function_call obj = static_cast<CreateChatCompletionRequest_function_call> (getFunctionCall());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *function_callKey = "function_call";
	json_object_set_member(pJsonObject, function_callKey, node);
	if (isprimitive("ChatCompletionFunctions")) {
		list<ChatCompletionFunctions> new_list = static_cast<list <ChatCompletionFunctions> > (getFunctions());
		node = converttoJson(&new_list, "ChatCompletionFunctions", "array");
	} else {
		node = json_node_alloc();
		list<ChatCompletionFunctions> new_list = static_cast<list <ChatCompletionFunctions> > (getFunctions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ChatCompletionFunctions>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ChatCompletionFunctions obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *functionsKey = "functions";
	json_object_set_member(pJsonObject, functionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<ChatCompletionRequestMessage>
CreateChatCompletionRequest::getMessages()
{
	return messages;
}

void
CreateChatCompletionRequest::setMessages(std::list <ChatCompletionRequestMessage> messages)
{
	this->messages = messages;
}

CreateChatCompletionRequest_model
CreateChatCompletionRequest::getModel()
{
	return model;
}

void
CreateChatCompletionRequest::setModel(CreateChatCompletionRequest_model  model)
{
	this->model = model;
}

bool
CreateChatCompletionRequest::getStore()
{
	return store;
}

void
CreateChatCompletionRequest::setStore(bool  store)
{
	this->store = store;
}

std::string
CreateChatCompletionRequest::getReasoningEffort()
{
	return reasoning_effort;
}

void
CreateChatCompletionRequest::setReasoningEffort(std::string  reasoning_effort)
{
	this->reasoning_effort = reasoning_effort;
}

std::map<string, string>
CreateChatCompletionRequest::getMetadata()
{
	return metadata;
}

void
CreateChatCompletionRequest::setMetadata(std::map <string, string> metadata)
{
	this->metadata = metadata;
}

long long
CreateChatCompletionRequest::getFrequencyPenalty()
{
	return frequency_penalty;
}

void
CreateChatCompletionRequest::setFrequencyPenalty(long long  frequency_penalty)
{
	this->frequency_penalty = frequency_penalty;
}

std::map<string, string>
CreateChatCompletionRequest::getLogitBias()
{
	return logit_bias;
}

void
CreateChatCompletionRequest::setLogitBias(std::map <string, string> logit_bias)
{
	this->logit_bias = logit_bias;
}

bool
CreateChatCompletionRequest::getLogprobs()
{
	return logprobs;
}

void
CreateChatCompletionRequest::setLogprobs(bool  logprobs)
{
	this->logprobs = logprobs;
}

int
CreateChatCompletionRequest::getTopLogprobs()
{
	return top_logprobs;
}

void
CreateChatCompletionRequest::setTopLogprobs(int  top_logprobs)
{
	this->top_logprobs = top_logprobs;
}

int
CreateChatCompletionRequest::getMaxTokens()
{
	return max_tokens;
}

void
CreateChatCompletionRequest::setMaxTokens(int  max_tokens)
{
	this->max_tokens = max_tokens;
}

int
CreateChatCompletionRequest::getMaxCompletionTokens()
{
	return max_completion_tokens;
}

void
CreateChatCompletionRequest::setMaxCompletionTokens(int  max_completion_tokens)
{
	this->max_completion_tokens = max_completion_tokens;
}

int
CreateChatCompletionRequest::getN()
{
	return n;
}

void
CreateChatCompletionRequest::setN(int  n)
{
	this->n = n;
}

std::list<std::string>
CreateChatCompletionRequest::getModalities()
{
	return modalities;
}

void
CreateChatCompletionRequest::setModalities(std::list <std::string> modalities)
{
	this->modalities = modalities;
}

PredictionContent
CreateChatCompletionRequest::getPrediction()
{
	return prediction;
}

void
CreateChatCompletionRequest::setPrediction(PredictionContent  prediction)
{
	this->prediction = prediction;
}

CreateChatCompletionRequest_audio
CreateChatCompletionRequest::getAudio()
{
	return audio;
}

void
CreateChatCompletionRequest::setAudio(CreateChatCompletionRequest_audio  audio)
{
	this->audio = audio;
}

long long
CreateChatCompletionRequest::getPresencePenalty()
{
	return presence_penalty;
}

void
CreateChatCompletionRequest::setPresencePenalty(long long  presence_penalty)
{
	this->presence_penalty = presence_penalty;
}

CreateChatCompletionRequest_response_format
CreateChatCompletionRequest::getResponseFormat()
{
	return response_format;
}

void
CreateChatCompletionRequest::setResponseFormat(CreateChatCompletionRequest_response_format  response_format)
{
	this->response_format = response_format;
}

int
CreateChatCompletionRequest::getSeed()
{
	return seed;
}

void
CreateChatCompletionRequest::setSeed(int  seed)
{
	this->seed = seed;
}

std::string
CreateChatCompletionRequest::getServiceTier()
{
	return service_tier;
}

void
CreateChatCompletionRequest::setServiceTier(std::string  service_tier)
{
	this->service_tier = service_tier;
}

CreateChatCompletionRequest_stop
CreateChatCompletionRequest::getStop()
{
	return stop;
}

void
CreateChatCompletionRequest::setStop(CreateChatCompletionRequest_stop  stop)
{
	this->stop = stop;
}

bool
CreateChatCompletionRequest::getStream()
{
	return stream;
}

void
CreateChatCompletionRequest::setStream(bool  stream)
{
	this->stream = stream;
}

ChatCompletionStreamOptions
CreateChatCompletionRequest::getStreamOptions()
{
	return stream_options;
}

void
CreateChatCompletionRequest::setStreamOptions(ChatCompletionStreamOptions  stream_options)
{
	this->stream_options = stream_options;
}

long long
CreateChatCompletionRequest::getTemperature()
{
	return temperature;
}

void
CreateChatCompletionRequest::setTemperature(long long  temperature)
{
	this->temperature = temperature;
}

long long
CreateChatCompletionRequest::getTopP()
{
	return top_p;
}

void
CreateChatCompletionRequest::setTopP(long long  top_p)
{
	this->top_p = top_p;
}

std::list<ChatCompletionTool>
CreateChatCompletionRequest::getTools()
{
	return tools;
}

void
CreateChatCompletionRequest::setTools(std::list <ChatCompletionTool> tools)
{
	this->tools = tools;
}

ChatCompletionToolChoiceOption
CreateChatCompletionRequest::getToolChoice()
{
	return tool_choice;
}

void
CreateChatCompletionRequest::setToolChoice(ChatCompletionToolChoiceOption  tool_choice)
{
	this->tool_choice = tool_choice;
}

bool
CreateChatCompletionRequest::getParallelToolCalls()
{
	return parallel_tool_calls;
}

void
CreateChatCompletionRequest::setParallelToolCalls(bool  parallel_tool_calls)
{
	this->parallel_tool_calls = parallel_tool_calls;
}

std::string
CreateChatCompletionRequest::getUser()
{
	return user;
}

void
CreateChatCompletionRequest::setUser(std::string  user)
{
	this->user = user;
}

CreateChatCompletionRequest_function_call
CreateChatCompletionRequest::getFunctionCall()
{
	return function_call;
}

void
CreateChatCompletionRequest::setFunctionCall(CreateChatCompletionRequest_function_call  function_call)
{
	this->function_call = function_call;
}

std::list<ChatCompletionFunctions>
CreateChatCompletionRequest::getFunctions()
{
	return functions;
}

void
CreateChatCompletionRequest::setFunctions(std::list <ChatCompletionFunctions> functions)
{
	this->functions = functions;
}


