#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateImageRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateImageRequest::CreateImageRequest()
{
	//__init();
}

CreateImageRequest::~CreateImageRequest()
{
	//__cleanup();
}

void
CreateImageRequest::__init()
{
	//prompt = std::string();
	//n = int(0);
	//size = std::string();
	//response_format = std::string();
	//user = std::string();
}

void
CreateImageRequest::__cleanup()
{
	//if(prompt != NULL) {
	//
	//delete prompt;
	//prompt = NULL;
	//}
	//if(n != NULL) {
	//
	//delete n;
	//n = NULL;
	//}
	//if(size != NULL) {
	//
	//delete size;
	//size = NULL;
	//}
	//if(response_format != NULL) {
	//
	//delete response_format;
	//response_format = NULL;
	//}
	//if(user != NULL) {
	//
	//delete user;
	//user = NULL;
	//}
	//
}

void
CreateImageRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *promptKey = "prompt";
	node = json_object_get_member(pJsonObject, promptKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&prompt, node, "std::string", "");
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
	const gchar *sizeKey = "size";
	node = json_object_get_member(pJsonObject, sizeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&size, node, "std::string", "");
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
	const gchar *userKey = "user";
	node = json_object_get_member(pJsonObject, userKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&user, node, "std::string", "");
		} else {
			
		}
	}
}

CreateImageRequest::CreateImageRequest(char* json)
{
	this->fromJson(json);
}

char*
CreateImageRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getPrompt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *promptKey = "prompt";
	json_object_set_member(pJsonObject, promptKey, node);
	if (isprimitive("int")) {
		int obj = getN();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *nKey = "n";
	json_object_set_member(pJsonObject, nKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSize();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *sizeKey = "size";
	json_object_set_member(pJsonObject, sizeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getResponseFormat();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *response_formatKey = "response_format";
	json_object_set_member(pJsonObject, response_formatKey, node);
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

std::string
CreateImageRequest::getPrompt()
{
	return prompt;
}

void
CreateImageRequest::setPrompt(std::string  prompt)
{
	this->prompt = prompt;
}

int
CreateImageRequest::getN()
{
	return n;
}

void
CreateImageRequest::setN(int  n)
{
	this->n = n;
}

std::string
CreateImageRequest::getSize()
{
	return size;
}

void
CreateImageRequest::setSize(std::string  size)
{
	this->size = size;
}

std::string
CreateImageRequest::getResponseFormat()
{
	return response_format;
}

void
CreateImageRequest::setResponseFormat(std::string  response_format)
{
	this->response_format = response_format;
}

std::string
CreateImageRequest::getUser()
{
	return user;
}

void
CreateImageRequest::setUser(std::string  user)
{
	this->user = user;
}


