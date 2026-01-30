#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FineTuneCompletionRequestInput.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FineTuneCompletionRequestInput::FineTuneCompletionRequestInput()
{
	//__init();
}

FineTuneCompletionRequestInput::~FineTuneCompletionRequestInput()
{
	//__cleanup();
}

void
FineTuneCompletionRequestInput::__init()
{
	//prompt = std::string();
	//completion = std::string();
}

void
FineTuneCompletionRequestInput::__cleanup()
{
	//if(prompt != NULL) {
	//
	//delete prompt;
	//prompt = NULL;
	//}
	//if(completion != NULL) {
	//
	//delete completion;
	//completion = NULL;
	//}
	//
}

void
FineTuneCompletionRequestInput::fromJson(char* jsonStr)
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
	const gchar *completionKey = "completion";
	node = json_object_get_member(pJsonObject, completionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&completion, node, "std::string", "");
		} else {
			
		}
	}
}

FineTuneCompletionRequestInput::FineTuneCompletionRequestInput(char* json)
{
	this->fromJson(json);
}

char*
FineTuneCompletionRequestInput::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getCompletion();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *completionKey = "completion";
	json_object_set_member(pJsonObject, completionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
FineTuneCompletionRequestInput::getPrompt()
{
	return prompt;
}

void
FineTuneCompletionRequestInput::setPrompt(std::string  prompt)
{
	this->prompt = prompt;
}

std::string
FineTuneCompletionRequestInput::getCompletion()
{
	return completion;
}

void
FineTuneCompletionRequestInput::setCompletion(std::string  completion)
{
	this->completion = completion;
}


