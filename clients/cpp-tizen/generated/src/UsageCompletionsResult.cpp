#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UsageCompletionsResult.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UsageCompletionsResult::UsageCompletionsResult()
{
	//__init();
}

UsageCompletionsResult::~UsageCompletionsResult()
{
	//__cleanup();
}

void
UsageCompletionsResult::__init()
{
	//object = std::string();
	//input_tokens = int(0);
	//input_cached_tokens = int(0);
	//output_tokens = int(0);
	//input_audio_tokens = int(0);
	//output_audio_tokens = int(0);
	//num_model_requests = int(0);
	//project_id = std::string();
	//user_id = std::string();
	//api_key_id = std::string();
	//model = std::string();
	//batch = bool(false);
}

void
UsageCompletionsResult::__cleanup()
{
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
	//}
	//if(input_tokens != NULL) {
	//
	//delete input_tokens;
	//input_tokens = NULL;
	//}
	//if(input_cached_tokens != NULL) {
	//
	//delete input_cached_tokens;
	//input_cached_tokens = NULL;
	//}
	//if(output_tokens != NULL) {
	//
	//delete output_tokens;
	//output_tokens = NULL;
	//}
	//if(input_audio_tokens != NULL) {
	//
	//delete input_audio_tokens;
	//input_audio_tokens = NULL;
	//}
	//if(output_audio_tokens != NULL) {
	//
	//delete output_audio_tokens;
	//output_audio_tokens = NULL;
	//}
	//if(num_model_requests != NULL) {
	//
	//delete num_model_requests;
	//num_model_requests = NULL;
	//}
	//if(project_id != NULL) {
	//
	//delete project_id;
	//project_id = NULL;
	//}
	//if(user_id != NULL) {
	//
	//delete user_id;
	//user_id = NULL;
	//}
	//if(api_key_id != NULL) {
	//
	//delete api_key_id;
	//api_key_id = NULL;
	//}
	//if(model != NULL) {
	//
	//delete model;
	//model = NULL;
	//}
	//if(batch != NULL) {
	//
	//delete batch;
	//batch = NULL;
	//}
	//
}

void
UsageCompletionsResult::fromJson(char* jsonStr)
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
	const gchar *input_tokensKey = "input_tokens";
	node = json_object_get_member(pJsonObject, input_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&input_tokens, node, "int", "");
		} else {
			
		}
	}
	const gchar *input_cached_tokensKey = "input_cached_tokens";
	node = json_object_get_member(pJsonObject, input_cached_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&input_cached_tokens, node, "int", "");
		} else {
			
		}
	}
	const gchar *output_tokensKey = "output_tokens";
	node = json_object_get_member(pJsonObject, output_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&output_tokens, node, "int", "");
		} else {
			
		}
	}
	const gchar *input_audio_tokensKey = "input_audio_tokens";
	node = json_object_get_member(pJsonObject, input_audio_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&input_audio_tokens, node, "int", "");
		} else {
			
		}
	}
	const gchar *output_audio_tokensKey = "output_audio_tokens";
	node = json_object_get_member(pJsonObject, output_audio_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&output_audio_tokens, node, "int", "");
		} else {
			
		}
	}
	const gchar *num_model_requestsKey = "num_model_requests";
	node = json_object_get_member(pJsonObject, num_model_requestsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&num_model_requests, node, "int", "");
		} else {
			
		}
	}
	const gchar *project_idKey = "project_id";
	node = json_object_get_member(pJsonObject, project_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&project_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *user_idKey = "user_id";
	node = json_object_get_member(pJsonObject, user_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&user_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *api_key_idKey = "api_key_id";
	node = json_object_get_member(pJsonObject, api_key_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&api_key_id, node, "std::string", "");
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
	const gchar *batchKey = "batch";
	node = json_object_get_member(pJsonObject, batchKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&batch, node, "bool", "");
		} else {
			
		}
	}
}

UsageCompletionsResult::UsageCompletionsResult(char* json)
{
	this->fromJson(json);
}

char*
UsageCompletionsResult::toJson()
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
	if (isprimitive("int")) {
		int obj = getInputTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *input_tokensKey = "input_tokens";
	json_object_set_member(pJsonObject, input_tokensKey, node);
	if (isprimitive("int")) {
		int obj = getInputCachedTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *input_cached_tokensKey = "input_cached_tokens";
	json_object_set_member(pJsonObject, input_cached_tokensKey, node);
	if (isprimitive("int")) {
		int obj = getOutputTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *output_tokensKey = "output_tokens";
	json_object_set_member(pJsonObject, output_tokensKey, node);
	if (isprimitive("int")) {
		int obj = getInputAudioTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *input_audio_tokensKey = "input_audio_tokens";
	json_object_set_member(pJsonObject, input_audio_tokensKey, node);
	if (isprimitive("int")) {
		int obj = getOutputAudioTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *output_audio_tokensKey = "output_audio_tokens";
	json_object_set_member(pJsonObject, output_audio_tokensKey, node);
	if (isprimitive("int")) {
		int obj = getNumModelRequests();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *num_model_requestsKey = "num_model_requests";
	json_object_set_member(pJsonObject, num_model_requestsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getProjectId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *project_idKey = "project_id";
	json_object_set_member(pJsonObject, project_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUserId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *user_idKey = "user_id";
	json_object_set_member(pJsonObject, user_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getApiKeyId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *api_key_idKey = "api_key_id";
	json_object_set_member(pJsonObject, api_key_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getModel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *modelKey = "model";
	json_object_set_member(pJsonObject, modelKey, node);
	if (isprimitive("bool")) {
		bool obj = getBatch();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *batchKey = "batch";
	json_object_set_member(pJsonObject, batchKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
UsageCompletionsResult::getObject()
{
	return object;
}

void
UsageCompletionsResult::setObject(std::string  object)
{
	this->object = object;
}

int
UsageCompletionsResult::getInputTokens()
{
	return input_tokens;
}

void
UsageCompletionsResult::setInputTokens(int  input_tokens)
{
	this->input_tokens = input_tokens;
}

int
UsageCompletionsResult::getInputCachedTokens()
{
	return input_cached_tokens;
}

void
UsageCompletionsResult::setInputCachedTokens(int  input_cached_tokens)
{
	this->input_cached_tokens = input_cached_tokens;
}

int
UsageCompletionsResult::getOutputTokens()
{
	return output_tokens;
}

void
UsageCompletionsResult::setOutputTokens(int  output_tokens)
{
	this->output_tokens = output_tokens;
}

int
UsageCompletionsResult::getInputAudioTokens()
{
	return input_audio_tokens;
}

void
UsageCompletionsResult::setInputAudioTokens(int  input_audio_tokens)
{
	this->input_audio_tokens = input_audio_tokens;
}

int
UsageCompletionsResult::getOutputAudioTokens()
{
	return output_audio_tokens;
}

void
UsageCompletionsResult::setOutputAudioTokens(int  output_audio_tokens)
{
	this->output_audio_tokens = output_audio_tokens;
}

int
UsageCompletionsResult::getNumModelRequests()
{
	return num_model_requests;
}

void
UsageCompletionsResult::setNumModelRequests(int  num_model_requests)
{
	this->num_model_requests = num_model_requests;
}

std::string
UsageCompletionsResult::getProjectId()
{
	return project_id;
}

void
UsageCompletionsResult::setProjectId(std::string  project_id)
{
	this->project_id = project_id;
}

std::string
UsageCompletionsResult::getUserId()
{
	return user_id;
}

void
UsageCompletionsResult::setUserId(std::string  user_id)
{
	this->user_id = user_id;
}

std::string
UsageCompletionsResult::getApiKeyId()
{
	return api_key_id;
}

void
UsageCompletionsResult::setApiKeyId(std::string  api_key_id)
{
	this->api_key_id = api_key_id;
}

std::string
UsageCompletionsResult::getModel()
{
	return model;
}

void
UsageCompletionsResult::setModel(std::string  model)
{
	this->model = model;
}

bool
UsageCompletionsResult::getBatch()
{
	return batch;
}

void
UsageCompletionsResult::setBatch(bool  batch)
{
	this->batch = batch;
}


