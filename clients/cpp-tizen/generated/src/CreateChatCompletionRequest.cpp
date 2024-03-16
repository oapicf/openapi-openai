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
	//model = new CreateChatCompletionRequest_model();
	//new std::list()std::list> messages;
	//new std::list()std::list> functions;
	//function_call = new CreateChatCompletionRequest_function_call();
	//temperature = double(0);
	//top_p = double(0);
	//n = int(0);
	//stream = bool(false);
	//stop = new CreateChatCompletionRequest_stop();
	//max_tokens = int(0);
	//presence_penalty = double(0);
	//frequency_penalty = double(0);
	//logit_bias = null;
	//user = std::string();
}

void
CreateChatCompletionRequest::__cleanup()
{
	//if(model != NULL) {
	//
	//delete model;
	//model = NULL;
	//}
	//if(messages != NULL) {
	//messages.RemoveAll(true);
	//delete messages;
	//messages = NULL;
	//}
	//if(functions != NULL) {
	//functions.RemoveAll(true);
	//delete functions;
	//functions = NULL;
	//}
	//if(function_call != NULL) {
	//
	//delete function_call;
	//function_call = NULL;
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
	//if(n != NULL) {
	//
	//delete n;
	//n = NULL;
	//}
	//if(stream != NULL) {
	//
	//delete stream;
	//stream = NULL;
	//}
	//if(stop != NULL) {
	//
	//delete stop;
	//stop = NULL;
	//}
	//if(max_tokens != NULL) {
	//
	//delete max_tokens;
	//max_tokens = NULL;
	//}
	//if(presence_penalty != NULL) {
	//
	//delete presence_penalty;
	//presence_penalty = NULL;
	//}
	//if(frequency_penalty != NULL) {
	//
	//delete frequency_penalty;
	//frequency_penalty = NULL;
	//}
	//if(logit_bias != NULL) {
	//
	//delete logit_bias;
	//logit_bias = NULL;
	//}
	//if(user != NULL) {
	//
	//delete user;
	//user = NULL;
	//}
	//
}

void
CreateChatCompletionRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *nKey = "n";
	node = json_object_get_member(pJsonObject, nKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&n, node, "int", "");
		} else {
			
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
	const gchar *max_tokensKey = "max_tokens";
	node = json_object_get_member(pJsonObject, max_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&max_tokens, node, "int", "");
		} else {
			
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
	

		if (isprimitive("std::string")) {
			jsonToValue(&logit_bias, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&logit_bias);
			obj->fromJson(json_to_string(node, false));
			
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
	if (isprimitive("int")) {
		int obj = getN();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *nKey = "n";
	json_object_set_member(pJsonObject, nKey, node);
	if (isprimitive("bool")) {
		bool obj = getStream();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *streamKey = "stream";
	json_object_set_member(pJsonObject, streamKey, node);
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
	if (isprimitive("int")) {
		int obj = getMaxTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *max_tokensKey = "max_tokens";
	json_object_set_member(pJsonObject, max_tokensKey, node);
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
	if (isprimitive("std::string")) {
		std::string obj = getLogitBias();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getLogitBias());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *logit_biasKey = "logit_bias";
	json_object_set_member(pJsonObject, logit_biasKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUser();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *userKey = "user";
	json_object_set_member(pJsonObject, userKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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

std::string
CreateChatCompletionRequest::getLogitBias()
{
	return logit_bias;
}

void
CreateChatCompletionRequest::setLogitBias(std::string  logit_bias)
{
	this->logit_bias = logit_bias;
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


