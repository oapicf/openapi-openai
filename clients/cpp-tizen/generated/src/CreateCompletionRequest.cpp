#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateCompletionRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateCompletionRequest::CreateCompletionRequest()
{
	//__init();
}

CreateCompletionRequest::~CreateCompletionRequest()
{
	//__cleanup();
}

void
CreateCompletionRequest::__init()
{
	//model = new CreateCompletionRequest_model();
	//prompt = new CreateCompletionRequest_prompt();
	//best_of = int(0);
	//echo = bool(false);
	//frequency_penalty = double(0);
	//new std::map()std::map> logit_bias;
	//logprobs = int(0);
	//max_tokens = int(0);
	//n = int(0);
	//presence_penalty = double(0);
	//seed = int(0);
	//stop = new CreateCompletionRequest_stop();
	//stream = bool(false);
	//stream_options = new ChatCompletionStreamOptions();
	//suffix = std::string();
	//temperature = double(0);
	//top_p = double(0);
	//user = std::string();
}

void
CreateCompletionRequest::__cleanup()
{
	//if(model != NULL) {
	//
	//delete model;
	//model = NULL;
	//}
	//if(prompt != NULL) {
	//
	//delete prompt;
	//prompt = NULL;
	//}
	//if(best_of != NULL) {
	//
	//delete best_of;
	//best_of = NULL;
	//}
	//if(echo != NULL) {
	//
	//delete echo;
	//echo = NULL;
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
	//if(max_tokens != NULL) {
	//
	//delete max_tokens;
	//max_tokens = NULL;
	//}
	//if(n != NULL) {
	//
	//delete n;
	//n = NULL;
	//}
	//if(presence_penalty != NULL) {
	//
	//delete presence_penalty;
	//presence_penalty = NULL;
	//}
	//if(seed != NULL) {
	//
	//delete seed;
	//seed = NULL;
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
	//if(suffix != NULL) {
	//
	//delete suffix;
	//suffix = NULL;
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
	//if(user != NULL) {
	//
	//delete user;
	//user = NULL;
	//}
	//
}

void
CreateCompletionRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *modelKey = "model";
	node = json_object_get_member(pJsonObject, modelKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateCompletionRequest_model")) {
			jsonToValue(&model, node, "CreateCompletionRequest_model", "CreateCompletionRequest_model");
		} else {
			
			CreateCompletionRequest_model* obj = static_cast<CreateCompletionRequest_model*> (&model);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *promptKey = "prompt";
	node = json_object_get_member(pJsonObject, promptKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateCompletionRequest_prompt")) {
			jsonToValue(&prompt, node, "CreateCompletionRequest_prompt", "CreateCompletionRequest_prompt");
		} else {
			
			CreateCompletionRequest_prompt* obj = static_cast<CreateCompletionRequest_prompt*> (&prompt);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *best_ofKey = "best_of";
	node = json_object_get_member(pJsonObject, best_ofKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&best_of, node, "int", "");
		} else {
			
		}
	}
	const gchar *echoKey = "echo";
	node = json_object_get_member(pJsonObject, echoKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&echo, node, "bool", "");
		} else {
			
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
	

		if (isprimitive("int")) {
			jsonToValue(&logprobs, node, "int", "");
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
	const gchar *nKey = "n";
	node = json_object_get_member(pJsonObject, nKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&n, node, "int", "");
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
	const gchar *seedKey = "seed";
	node = json_object_get_member(pJsonObject, seedKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&seed, node, "int", "");
		} else {
			
		}
	}
	const gchar *stopKey = "stop";
	node = json_object_get_member(pJsonObject, stopKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateCompletionRequest_stop")) {
			jsonToValue(&stop, node, "CreateCompletionRequest_stop", "CreateCompletionRequest_stop");
		} else {
			
			CreateCompletionRequest_stop* obj = static_cast<CreateCompletionRequest_stop*> (&stop);
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
	const gchar *suffixKey = "suffix";
	node = json_object_get_member(pJsonObject, suffixKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&suffix, node, "std::string", "");
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
	const gchar *userKey = "user";
	node = json_object_get_member(pJsonObject, userKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&user, node, "std::string", "");
		} else {
			
		}
	}
}

CreateCompletionRequest::CreateCompletionRequest(char* json)
{
	this->fromJson(json);
}

char*
CreateCompletionRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CreateCompletionRequest_model")) {
		CreateCompletionRequest_model obj = getModel();
		node = converttoJson(&obj, "CreateCompletionRequest_model", "");
	}
	else {
		
		CreateCompletionRequest_model obj = static_cast<CreateCompletionRequest_model> (getModel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *modelKey = "model";
	json_object_set_member(pJsonObject, modelKey, node);
	if (isprimitive("CreateCompletionRequest_prompt")) {
		CreateCompletionRequest_prompt obj = getPrompt();
		node = converttoJson(&obj, "CreateCompletionRequest_prompt", "");
	}
	else {
		
		CreateCompletionRequest_prompt obj = static_cast<CreateCompletionRequest_prompt> (getPrompt());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *promptKey = "prompt";
	json_object_set_member(pJsonObject, promptKey, node);
	if (isprimitive("int")) {
		int obj = getBestOf();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *best_ofKey = "best_of";
	json_object_set_member(pJsonObject, best_ofKey, node);
	if (isprimitive("bool")) {
		bool obj = getEcho();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *echoKey = "echo";
	json_object_set_member(pJsonObject, echoKey, node);
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
	if (isprimitive("int")) {
		int obj = getLogprobs();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *logprobsKey = "logprobs";
	json_object_set_member(pJsonObject, logprobsKey, node);
	if (isprimitive("int")) {
		int obj = getMaxTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *max_tokensKey = "max_tokens";
	json_object_set_member(pJsonObject, max_tokensKey, node);
	if (isprimitive("int")) {
		int obj = getN();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *nKey = "n";
	json_object_set_member(pJsonObject, nKey, node);
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
	if (isprimitive("int")) {
		int obj = getSeed();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *seedKey = "seed";
	json_object_set_member(pJsonObject, seedKey, node);
	if (isprimitive("CreateCompletionRequest_stop")) {
		CreateCompletionRequest_stop obj = getStop();
		node = converttoJson(&obj, "CreateCompletionRequest_stop", "");
	}
	else {
		
		CreateCompletionRequest_stop obj = static_cast<CreateCompletionRequest_stop> (getStop());
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
	if (isprimitive("std::string")) {
		std::string obj = getSuffix();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *suffixKey = "suffix";
	json_object_set_member(pJsonObject, suffixKey, node);
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

CreateCompletionRequest_model
CreateCompletionRequest::getModel()
{
	return model;
}

void
CreateCompletionRequest::setModel(CreateCompletionRequest_model  model)
{
	this->model = model;
}

CreateCompletionRequest_prompt
CreateCompletionRequest::getPrompt()
{
	return prompt;
}

void
CreateCompletionRequest::setPrompt(CreateCompletionRequest_prompt  prompt)
{
	this->prompt = prompt;
}

int
CreateCompletionRequest::getBestOf()
{
	return best_of;
}

void
CreateCompletionRequest::setBestOf(int  best_of)
{
	this->best_of = best_of;
}

bool
CreateCompletionRequest::getEcho()
{
	return echo;
}

void
CreateCompletionRequest::setEcho(bool  echo)
{
	this->echo = echo;
}

long long
CreateCompletionRequest::getFrequencyPenalty()
{
	return frequency_penalty;
}

void
CreateCompletionRequest::setFrequencyPenalty(long long  frequency_penalty)
{
	this->frequency_penalty = frequency_penalty;
}

std::map<string, string>
CreateCompletionRequest::getLogitBias()
{
	return logit_bias;
}

void
CreateCompletionRequest::setLogitBias(std::map <string, string> logit_bias)
{
	this->logit_bias = logit_bias;
}

int
CreateCompletionRequest::getLogprobs()
{
	return logprobs;
}

void
CreateCompletionRequest::setLogprobs(int  logprobs)
{
	this->logprobs = logprobs;
}

int
CreateCompletionRequest::getMaxTokens()
{
	return max_tokens;
}

void
CreateCompletionRequest::setMaxTokens(int  max_tokens)
{
	this->max_tokens = max_tokens;
}

int
CreateCompletionRequest::getN()
{
	return n;
}

void
CreateCompletionRequest::setN(int  n)
{
	this->n = n;
}

long long
CreateCompletionRequest::getPresencePenalty()
{
	return presence_penalty;
}

void
CreateCompletionRequest::setPresencePenalty(long long  presence_penalty)
{
	this->presence_penalty = presence_penalty;
}

int
CreateCompletionRequest::getSeed()
{
	return seed;
}

void
CreateCompletionRequest::setSeed(int  seed)
{
	this->seed = seed;
}

CreateCompletionRequest_stop
CreateCompletionRequest::getStop()
{
	return stop;
}

void
CreateCompletionRequest::setStop(CreateCompletionRequest_stop  stop)
{
	this->stop = stop;
}

bool
CreateCompletionRequest::getStream()
{
	return stream;
}

void
CreateCompletionRequest::setStream(bool  stream)
{
	this->stream = stream;
}

ChatCompletionStreamOptions
CreateCompletionRequest::getStreamOptions()
{
	return stream_options;
}

void
CreateCompletionRequest::setStreamOptions(ChatCompletionStreamOptions  stream_options)
{
	this->stream_options = stream_options;
}

std::string
CreateCompletionRequest::getSuffix()
{
	return suffix;
}

void
CreateCompletionRequest::setSuffix(std::string  suffix)
{
	this->suffix = suffix;
}

long long
CreateCompletionRequest::getTemperature()
{
	return temperature;
}

void
CreateCompletionRequest::setTemperature(long long  temperature)
{
	this->temperature = temperature;
}

long long
CreateCompletionRequest::getTopP()
{
	return top_p;
}

void
CreateCompletionRequest::setTopP(long long  top_p)
{
	this->top_p = top_p;
}

std::string
CreateCompletionRequest::getUser()
{
	return user;
}

void
CreateCompletionRequest::setUser(std::string  user)
{
	this->user = user;
}


