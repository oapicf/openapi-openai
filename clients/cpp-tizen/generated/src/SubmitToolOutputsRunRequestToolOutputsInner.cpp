#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SubmitToolOutputsRunRequest_tool_outputs_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SubmitToolOutputsRunRequest_tool_outputs_inner::SubmitToolOutputsRunRequest_tool_outputs_inner()
{
	//__init();
}

SubmitToolOutputsRunRequest_tool_outputs_inner::~SubmitToolOutputsRunRequest_tool_outputs_inner()
{
	//__cleanup();
}

void
SubmitToolOutputsRunRequest_tool_outputs_inner::__init()
{
	//tool_call_id = std::string();
	//output = std::string();
}

void
SubmitToolOutputsRunRequest_tool_outputs_inner::__cleanup()
{
	//if(tool_call_id != NULL) {
	//
	//delete tool_call_id;
	//tool_call_id = NULL;
	//}
	//if(output != NULL) {
	//
	//delete output;
	//output = NULL;
	//}
	//
}

void
SubmitToolOutputsRunRequest_tool_outputs_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *tool_call_idKey = "tool_call_id";
	node = json_object_get_member(pJsonObject, tool_call_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&tool_call_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *outputKey = "output";
	node = json_object_get_member(pJsonObject, outputKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&output, node, "std::string", "");
		} else {
			
		}
	}
}

SubmitToolOutputsRunRequest_tool_outputs_inner::SubmitToolOutputsRunRequest_tool_outputs_inner(char* json)
{
	this->fromJson(json);
}

char*
SubmitToolOutputsRunRequest_tool_outputs_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getToolCallId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *tool_call_idKey = "tool_call_id";
	json_object_set_member(pJsonObject, tool_call_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOutput();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *outputKey = "output";
	json_object_set_member(pJsonObject, outputKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
SubmitToolOutputsRunRequest_tool_outputs_inner::getToolCallId()
{
	return tool_call_id;
}

void
SubmitToolOutputsRunRequest_tool_outputs_inner::setToolCallId(std::string  tool_call_id)
{
	this->tool_call_id = tool_call_id;
}

std::string
SubmitToolOutputsRunRequest_tool_outputs_inner::getOutput()
{
	return output;
}

void
SubmitToolOutputsRunRequest_tool_outputs_inner::setOutput(std::string  output)
{
	this->output = output;
}


