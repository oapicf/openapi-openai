#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateEmbeddingRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateEmbeddingRequest::CreateEmbeddingRequest()
{
	//__init();
}

CreateEmbeddingRequest::~CreateEmbeddingRequest()
{
	//__cleanup();
}

void
CreateEmbeddingRequest::__init()
{
	//input = new CreateEmbeddingRequest_input();
	//model = new CreateEmbeddingRequest_model();
	//encoding_format = std::string();
	//dimensions = int(0);
	//user = std::string();
}

void
CreateEmbeddingRequest::__cleanup()
{
	//if(input != NULL) {
	//
	//delete input;
	//input = NULL;
	//}
	//if(model != NULL) {
	//
	//delete model;
	//model = NULL;
	//}
	//if(encoding_format != NULL) {
	//
	//delete encoding_format;
	//encoding_format = NULL;
	//}
	//if(dimensions != NULL) {
	//
	//delete dimensions;
	//dimensions = NULL;
	//}
	//if(user != NULL) {
	//
	//delete user;
	//user = NULL;
	//}
	//
}

void
CreateEmbeddingRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *inputKey = "input";
	node = json_object_get_member(pJsonObject, inputKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateEmbeddingRequest_input")) {
			jsonToValue(&input, node, "CreateEmbeddingRequest_input", "CreateEmbeddingRequest_input");
		} else {
			
			CreateEmbeddingRequest_input* obj = static_cast<CreateEmbeddingRequest_input*> (&input);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *modelKey = "model";
	node = json_object_get_member(pJsonObject, modelKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateEmbeddingRequest_model")) {
			jsonToValue(&model, node, "CreateEmbeddingRequest_model", "CreateEmbeddingRequest_model");
		} else {
			
			CreateEmbeddingRequest_model* obj = static_cast<CreateEmbeddingRequest_model*> (&model);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *encoding_formatKey = "encoding_format";
	node = json_object_get_member(pJsonObject, encoding_formatKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&encoding_format, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *dimensionsKey = "dimensions";
	node = json_object_get_member(pJsonObject, dimensionsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&dimensions, node, "int", "");
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
}

CreateEmbeddingRequest::CreateEmbeddingRequest(char* json)
{
	this->fromJson(json);
}

char*
CreateEmbeddingRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CreateEmbeddingRequest_input")) {
		CreateEmbeddingRequest_input obj = getInput();
		node = converttoJson(&obj, "CreateEmbeddingRequest_input", "");
	}
	else {
		
		CreateEmbeddingRequest_input obj = static_cast<CreateEmbeddingRequest_input> (getInput());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *inputKey = "input";
	json_object_set_member(pJsonObject, inputKey, node);
	if (isprimitive("CreateEmbeddingRequest_model")) {
		CreateEmbeddingRequest_model obj = getModel();
		node = converttoJson(&obj, "CreateEmbeddingRequest_model", "");
	}
	else {
		
		CreateEmbeddingRequest_model obj = static_cast<CreateEmbeddingRequest_model> (getModel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *modelKey = "model";
	json_object_set_member(pJsonObject, modelKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEncodingFormat();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *encoding_formatKey = "encoding_format";
	json_object_set_member(pJsonObject, encoding_formatKey, node);
	if (isprimitive("int")) {
		int obj = getDimensions();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *dimensionsKey = "dimensions";
	json_object_set_member(pJsonObject, dimensionsKey, node);
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

CreateEmbeddingRequest_input
CreateEmbeddingRequest::getInput()
{
	return input;
}

void
CreateEmbeddingRequest::setInput(CreateEmbeddingRequest_input  input)
{
	this->input = input;
}

CreateEmbeddingRequest_model
CreateEmbeddingRequest::getModel()
{
	return model;
}

void
CreateEmbeddingRequest::setModel(CreateEmbeddingRequest_model  model)
{
	this->model = model;
}

std::string
CreateEmbeddingRequest::getEncodingFormat()
{
	return encoding_format;
}

void
CreateEmbeddingRequest::setEncodingFormat(std::string  encoding_format)
{
	this->encoding_format = encoding_format;
}

int
CreateEmbeddingRequest::getDimensions()
{
	return dimensions;
}

void
CreateEmbeddingRequest::setDimensions(int  dimensions)
{
	this->dimensions = dimensions;
}

std::string
CreateEmbeddingRequest::getUser()
{
	return user;
}

void
CreateEmbeddingRequest::setUser(std::string  user)
{
	this->user = user;
}


