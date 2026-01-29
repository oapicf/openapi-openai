#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateSpeechRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateSpeechRequest::CreateSpeechRequest()
{
	//__init();
}

CreateSpeechRequest::~CreateSpeechRequest()
{
	//__cleanup();
}

void
CreateSpeechRequest::__init()
{
	//model = new CreateSpeechRequest_model();
	//input = std::string();
	//voice = std::string();
	//response_format = std::string();
	//speed = double(0);
}

void
CreateSpeechRequest::__cleanup()
{
	//if(model != NULL) {
	//
	//delete model;
	//model = NULL;
	//}
	//if(input != NULL) {
	//
	//delete input;
	//input = NULL;
	//}
	//if(voice != NULL) {
	//
	//delete voice;
	//voice = NULL;
	//}
	//if(response_format != NULL) {
	//
	//delete response_format;
	//response_format = NULL;
	//}
	//if(speed != NULL) {
	//
	//delete speed;
	//speed = NULL;
	//}
	//
}

void
CreateSpeechRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *modelKey = "model";
	node = json_object_get_member(pJsonObject, modelKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateSpeechRequest_model")) {
			jsonToValue(&model, node, "CreateSpeechRequest_model", "CreateSpeechRequest_model");
		} else {
			
			CreateSpeechRequest_model* obj = static_cast<CreateSpeechRequest_model*> (&model);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *inputKey = "input";
	node = json_object_get_member(pJsonObject, inputKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&input, node, "std::string", "");
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
	const gchar *response_formatKey = "response_format";
	node = json_object_get_member(pJsonObject, response_formatKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&response_format, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *speedKey = "speed";
	node = json_object_get_member(pJsonObject, speedKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&speed, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&speed);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CreateSpeechRequest::CreateSpeechRequest(char* json)
{
	this->fromJson(json);
}

char*
CreateSpeechRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CreateSpeechRequest_model")) {
		CreateSpeechRequest_model obj = getModel();
		node = converttoJson(&obj, "CreateSpeechRequest_model", "");
	}
	else {
		
		CreateSpeechRequest_model obj = static_cast<CreateSpeechRequest_model> (getModel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *modelKey = "model";
	json_object_set_member(pJsonObject, modelKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getInput();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *inputKey = "input";
	json_object_set_member(pJsonObject, inputKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVoice();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *voiceKey = "voice";
	json_object_set_member(pJsonObject, voiceKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getResponseFormat();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *response_formatKey = "response_format";
	json_object_set_member(pJsonObject, response_formatKey, node);
	if (isprimitive("long long")) {
		long long obj = getSpeed();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getSpeed());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *speedKey = "speed";
	json_object_set_member(pJsonObject, speedKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CreateSpeechRequest_model
CreateSpeechRequest::getModel()
{
	return model;
}

void
CreateSpeechRequest::setModel(CreateSpeechRequest_model  model)
{
	this->model = model;
}

std::string
CreateSpeechRequest::getInput()
{
	return input;
}

void
CreateSpeechRequest::setInput(std::string  input)
{
	this->input = input;
}

std::string
CreateSpeechRequest::getVoice()
{
	return voice;
}

void
CreateSpeechRequest::setVoice(std::string  voice)
{
	this->voice = voice;
}

std::string
CreateSpeechRequest::getResponseFormat()
{
	return response_format;
}

void
CreateSpeechRequest::setResponseFormat(std::string  response_format)
{
	this->response_format = response_format;
}

long long
CreateSpeechRequest::getSpeed()
{
	return speed;
}

void
CreateSpeechRequest::setSpeed(long long  speed)
{
	this->speed = speed;
}


