#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateEditResponse_choices_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateEditResponse_choices_inner::CreateEditResponse_choices_inner()
{
	//__init();
}

CreateEditResponse_choices_inner::~CreateEditResponse_choices_inner()
{
	//__cleanup();
}

void
CreateEditResponse_choices_inner::__init()
{
	//text = std::string();
	//index = int(0);
	//logprobs = new CreateCompletionResponse_choices_inner_logprobs();
	//finish_reason = std::string();
}

void
CreateEditResponse_choices_inner::__cleanup()
{
	//if(text != NULL) {
	//
	//delete text;
	//text = NULL;
	//}
	//if(index != NULL) {
	//
	//delete index;
	//index = NULL;
	//}
	//if(logprobs != NULL) {
	//
	//delete logprobs;
	//logprobs = NULL;
	//}
	//if(finish_reason != NULL) {
	//
	//delete finish_reason;
	//finish_reason = NULL;
	//}
	//
}

void
CreateEditResponse_choices_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *textKey = "text";
	node = json_object_get_member(pJsonObject, textKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&text, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *indexKey = "index";
	node = json_object_get_member(pJsonObject, indexKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&index, node, "int", "");
		} else {
			
		}
	}
	const gchar *logprobsKey = "logprobs";
	node = json_object_get_member(pJsonObject, logprobsKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateCompletionResponse_choices_inner_logprobs")) {
			jsonToValue(&logprobs, node, "CreateCompletionResponse_choices_inner_logprobs", "CreateCompletionResponse_choices_inner_logprobs");
		} else {
			
			CreateCompletionResponse_choices_inner_logprobs* obj = static_cast<CreateCompletionResponse_choices_inner_logprobs*> (&logprobs);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *finish_reasonKey = "finish_reason";
	node = json_object_get_member(pJsonObject, finish_reasonKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&finish_reason, node, "std::string", "");
		} else {
			
		}
	}
}

CreateEditResponse_choices_inner::CreateEditResponse_choices_inner(char* json)
{
	this->fromJson(json);
}

char*
CreateEditResponse_choices_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getText();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *textKey = "text";
	json_object_set_member(pJsonObject, textKey, node);
	if (isprimitive("int")) {
		int obj = getIndex();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *indexKey = "index";
	json_object_set_member(pJsonObject, indexKey, node);
	if (isprimitive("CreateCompletionResponse_choices_inner_logprobs")) {
		CreateCompletionResponse_choices_inner_logprobs obj = getLogprobs();
		node = converttoJson(&obj, "CreateCompletionResponse_choices_inner_logprobs", "");
	}
	else {
		
		CreateCompletionResponse_choices_inner_logprobs obj = static_cast<CreateCompletionResponse_choices_inner_logprobs> (getLogprobs());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *logprobsKey = "logprobs";
	json_object_set_member(pJsonObject, logprobsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFinishReason();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *finish_reasonKey = "finish_reason";
	json_object_set_member(pJsonObject, finish_reasonKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CreateEditResponse_choices_inner::getText()
{
	return text;
}

void
CreateEditResponse_choices_inner::setText(std::string  text)
{
	this->text = text;
}

int
CreateEditResponse_choices_inner::getIndex()
{
	return index;
}

void
CreateEditResponse_choices_inner::setIndex(int  index)
{
	this->index = index;
}

CreateCompletionResponse_choices_inner_logprobs
CreateEditResponse_choices_inner::getLogprobs()
{
	return logprobs;
}

void
CreateEditResponse_choices_inner::setLogprobs(CreateCompletionResponse_choices_inner_logprobs  logprobs)
{
	this->logprobs = logprobs;
}

std::string
CreateEditResponse_choices_inner::getFinishReason()
{
	return finish_reason;
}

void
CreateEditResponse_choices_inner::setFinishReason(std::string  finish_reason)
{
	this->finish_reason = finish_reason;
}


