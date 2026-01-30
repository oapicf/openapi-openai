#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UsageAudioSpeechesResult.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UsageAudioSpeechesResult::UsageAudioSpeechesResult()
{
	//__init();
}

UsageAudioSpeechesResult::~UsageAudioSpeechesResult()
{
	//__cleanup();
}

void
UsageAudioSpeechesResult::__init()
{
	//object = std::string();
	//characters = int(0);
	//num_model_requests = int(0);
	//project_id = std::string();
	//user_id = std::string();
	//api_key_id = std::string();
	//model = std::string();
}

void
UsageAudioSpeechesResult::__cleanup()
{
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
	//}
	//if(characters != NULL) {
	//
	//delete characters;
	//characters = NULL;
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
	//
}

void
UsageAudioSpeechesResult::fromJson(char* jsonStr)
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
	const gchar *charactersKey = "characters";
	node = json_object_get_member(pJsonObject, charactersKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&characters, node, "int", "");
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
}

UsageAudioSpeechesResult::UsageAudioSpeechesResult(char* json)
{
	this->fromJson(json);
}

char*
UsageAudioSpeechesResult::toJson()
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
		int obj = getCharacters();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *charactersKey = "characters";
	json_object_set_member(pJsonObject, charactersKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
UsageAudioSpeechesResult::getObject()
{
	return object;
}

void
UsageAudioSpeechesResult::setObject(std::string  object)
{
	this->object = object;
}

int
UsageAudioSpeechesResult::getCharacters()
{
	return characters;
}

void
UsageAudioSpeechesResult::setCharacters(int  characters)
{
	this->characters = characters;
}

int
UsageAudioSpeechesResult::getNumModelRequests()
{
	return num_model_requests;
}

void
UsageAudioSpeechesResult::setNumModelRequests(int  num_model_requests)
{
	this->num_model_requests = num_model_requests;
}

std::string
UsageAudioSpeechesResult::getProjectId()
{
	return project_id;
}

void
UsageAudioSpeechesResult::setProjectId(std::string  project_id)
{
	this->project_id = project_id;
}

std::string
UsageAudioSpeechesResult::getUserId()
{
	return user_id;
}

void
UsageAudioSpeechesResult::setUserId(std::string  user_id)
{
	this->user_id = user_id;
}

std::string
UsageAudioSpeechesResult::getApiKeyId()
{
	return api_key_id;
}

void
UsageAudioSpeechesResult::setApiKeyId(std::string  api_key_id)
{
	this->api_key_id = api_key_id;
}

std::string
UsageAudioSpeechesResult::getModel()
{
	return model;
}

void
UsageAudioSpeechesResult::setModel(std::string  model)
{
	this->model = model;
}


