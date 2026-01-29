#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter()
{
	//__init();
}

RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::~RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter()
{
	//__cleanup();
}

void
RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::__init()
{
	//input = std::string();
	//new std::list()std::list> outputs;
}

void
RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::__cleanup()
{
	//if(input != NULL) {
	//
	//delete input;
	//input = NULL;
	//}
	//if(outputs != NULL) {
	//outputs.RemoveAll(true);
	//delete outputs;
	//outputs = NULL;
	//}
	//
}

void
RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *inputKey = "input";
	node = json_object_get_member(pJsonObject, inputKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&input, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *outputsKey = "outputs";
	node = json_object_get_member(pJsonObject, outputsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner> new_list;
			RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner")) {
					jsonToValue(&inst, temp_json, "RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			outputs = new_list;
		}
		
	}
}

RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter(char* json)
{
	this->fromJson(json);
}

char*
RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getInput();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *inputKey = "input";
	json_object_set_member(pJsonObject, inputKey, node);
	if (isprimitive("RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner")) {
		list<RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner> new_list = static_cast<list <RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner> > (getOutputs());
		node = converttoJson(&new_list, "RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner", "array");
	} else {
		node = json_node_alloc();
		list<RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner> new_list = static_cast<list <RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner> > (getOutputs());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *outputsKey = "outputs";
	json_object_set_member(pJsonObject, outputsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::getInput()
{
	return input;
}

void
RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::setInput(std::string  input)
{
	this->input = input;
}

std::list<RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner>
RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::getOutputs()
{
	return outputs;
}

void
RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::setOutputs(std::list <RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner> outputs)
{
	this->outputs = outputs;
}


