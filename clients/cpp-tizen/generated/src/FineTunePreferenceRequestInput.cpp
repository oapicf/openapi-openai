#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FineTunePreferenceRequestInput.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FineTunePreferenceRequestInput::FineTunePreferenceRequestInput()
{
	//__init();
}

FineTunePreferenceRequestInput::~FineTunePreferenceRequestInput()
{
	//__cleanup();
}

void
FineTunePreferenceRequestInput::__init()
{
	//input = new FineTunePreferenceRequestInput_input();
	//new std::list()std::list> preferred_completion;
	//new std::list()std::list> non_preferred_completion;
}

void
FineTunePreferenceRequestInput::__cleanup()
{
	//if(input != NULL) {
	//
	//delete input;
	//input = NULL;
	//}
	//if(preferred_completion != NULL) {
	//preferred_completion.RemoveAll(true);
	//delete preferred_completion;
	//preferred_completion = NULL;
	//}
	//if(non_preferred_completion != NULL) {
	//non_preferred_completion.RemoveAll(true);
	//delete non_preferred_completion;
	//non_preferred_completion = NULL;
	//}
	//
}

void
FineTunePreferenceRequestInput::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *inputKey = "input";
	node = json_object_get_member(pJsonObject, inputKey);
	if (node !=NULL) {
	

		if (isprimitive("FineTunePreferenceRequestInput_input")) {
			jsonToValue(&input, node, "FineTunePreferenceRequestInput_input", "FineTunePreferenceRequestInput_input");
		} else {
			
			FineTunePreferenceRequestInput_input* obj = static_cast<FineTunePreferenceRequestInput_input*> (&input);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *preferred_completionKey = "preferred_completion";
	node = json_object_get_member(pJsonObject, preferred_completionKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<FineTunePreferenceRequestInput_preferred_completion_inner> new_list;
			FineTunePreferenceRequestInput_preferred_completion_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("FineTunePreferenceRequestInput_preferred_completion_inner")) {
					jsonToValue(&inst, temp_json, "FineTunePreferenceRequestInput_preferred_completion_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			preferred_completion = new_list;
		}
		
	}
	const gchar *non_preferred_completionKey = "non_preferred_completion";
	node = json_object_get_member(pJsonObject, non_preferred_completionKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<FineTunePreferenceRequestInput_preferred_completion_inner> new_list;
			FineTunePreferenceRequestInput_preferred_completion_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("FineTunePreferenceRequestInput_preferred_completion_inner")) {
					jsonToValue(&inst, temp_json, "FineTunePreferenceRequestInput_preferred_completion_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			non_preferred_completion = new_list;
		}
		
	}
}

FineTunePreferenceRequestInput::FineTunePreferenceRequestInput(char* json)
{
	this->fromJson(json);
}

char*
FineTunePreferenceRequestInput::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("FineTunePreferenceRequestInput_input")) {
		FineTunePreferenceRequestInput_input obj = getInput();
		node = converttoJson(&obj, "FineTunePreferenceRequestInput_input", "");
	}
	else {
		
		FineTunePreferenceRequestInput_input obj = static_cast<FineTunePreferenceRequestInput_input> (getInput());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *inputKey = "input";
	json_object_set_member(pJsonObject, inputKey, node);
	if (isprimitive("FineTunePreferenceRequestInput_preferred_completion_inner")) {
		list<FineTunePreferenceRequestInput_preferred_completion_inner> new_list = static_cast<list <FineTunePreferenceRequestInput_preferred_completion_inner> > (getPreferredCompletion());
		node = converttoJson(&new_list, "FineTunePreferenceRequestInput_preferred_completion_inner", "array");
	} else {
		node = json_node_alloc();
		list<FineTunePreferenceRequestInput_preferred_completion_inner> new_list = static_cast<list <FineTunePreferenceRequestInput_preferred_completion_inner> > (getPreferredCompletion());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<FineTunePreferenceRequestInput_preferred_completion_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			FineTunePreferenceRequestInput_preferred_completion_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *preferred_completionKey = "preferred_completion";
	json_object_set_member(pJsonObject, preferred_completionKey, node);
	if (isprimitive("FineTunePreferenceRequestInput_preferred_completion_inner")) {
		list<FineTunePreferenceRequestInput_preferred_completion_inner> new_list = static_cast<list <FineTunePreferenceRequestInput_preferred_completion_inner> > (getNonPreferredCompletion());
		node = converttoJson(&new_list, "FineTunePreferenceRequestInput_preferred_completion_inner", "array");
	} else {
		node = json_node_alloc();
		list<FineTunePreferenceRequestInput_preferred_completion_inner> new_list = static_cast<list <FineTunePreferenceRequestInput_preferred_completion_inner> > (getNonPreferredCompletion());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<FineTunePreferenceRequestInput_preferred_completion_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			FineTunePreferenceRequestInput_preferred_completion_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *non_preferred_completionKey = "non_preferred_completion";
	json_object_set_member(pJsonObject, non_preferred_completionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

FineTunePreferenceRequestInput_input
FineTunePreferenceRequestInput::getInput()
{
	return input;
}

void
FineTunePreferenceRequestInput::setInput(FineTunePreferenceRequestInput_input  input)
{
	this->input = input;
}

std::list<FineTunePreferenceRequestInput_preferred_completion_inner>
FineTunePreferenceRequestInput::getPreferredCompletion()
{
	return preferred_completion;
}

void
FineTunePreferenceRequestInput::setPreferredCompletion(std::list <FineTunePreferenceRequestInput_preferred_completion_inner> preferred_completion)
{
	this->preferred_completion = preferred_completion;
}

std::list<FineTunePreferenceRequestInput_preferred_completion_inner>
FineTunePreferenceRequestInput::getNonPreferredCompletion()
{
	return non_preferred_completion;
}

void
FineTunePreferenceRequestInput::setNonPreferredCompletion(std::list <FineTunePreferenceRequestInput_preferred_completion_inner> non_preferred_completion)
{
	this->non_preferred_completion = non_preferred_completion;
}


