#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SubmitToolOutputsRunRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SubmitToolOutputsRunRequest::SubmitToolOutputsRunRequest()
{
	//__init();
}

SubmitToolOutputsRunRequest::~SubmitToolOutputsRunRequest()
{
	//__cleanup();
}

void
SubmitToolOutputsRunRequest::__init()
{
	//new std::list()std::list> tool_outputs;
	//stream = bool(false);
}

void
SubmitToolOutputsRunRequest::__cleanup()
{
	//if(tool_outputs != NULL) {
	//tool_outputs.RemoveAll(true);
	//delete tool_outputs;
	//tool_outputs = NULL;
	//}
	//if(stream != NULL) {
	//
	//delete stream;
	//stream = NULL;
	//}
	//
}

void
SubmitToolOutputsRunRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *tool_outputsKey = "tool_outputs";
	node = json_object_get_member(pJsonObject, tool_outputsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<SubmitToolOutputsRunRequest_tool_outputs_inner> new_list;
			SubmitToolOutputsRunRequest_tool_outputs_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("SubmitToolOutputsRunRequest_tool_outputs_inner")) {
					jsonToValue(&inst, temp_json, "SubmitToolOutputsRunRequest_tool_outputs_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			tool_outputs = new_list;
		}
		
	}
	const gchar *streamKey = "stream";
	node = json_object_get_member(pJsonObject, streamKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&stream, node, "bool", "");
		} else {
			
		}
	}
}

SubmitToolOutputsRunRequest::SubmitToolOutputsRunRequest(char* json)
{
	this->fromJson(json);
}

char*
SubmitToolOutputsRunRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("SubmitToolOutputsRunRequest_tool_outputs_inner")) {
		list<SubmitToolOutputsRunRequest_tool_outputs_inner> new_list = static_cast<list <SubmitToolOutputsRunRequest_tool_outputs_inner> > (getToolOutputs());
		node = converttoJson(&new_list, "SubmitToolOutputsRunRequest_tool_outputs_inner", "array");
	} else {
		node = json_node_alloc();
		list<SubmitToolOutputsRunRequest_tool_outputs_inner> new_list = static_cast<list <SubmitToolOutputsRunRequest_tool_outputs_inner> > (getToolOutputs());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<SubmitToolOutputsRunRequest_tool_outputs_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			SubmitToolOutputsRunRequest_tool_outputs_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *tool_outputsKey = "tool_outputs";
	json_object_set_member(pJsonObject, tool_outputsKey, node);
	if (isprimitive("bool")) {
		bool obj = getStream();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *streamKey = "stream";
	json_object_set_member(pJsonObject, streamKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<SubmitToolOutputsRunRequest_tool_outputs_inner>
SubmitToolOutputsRunRequest::getToolOutputs()
{
	return tool_outputs;
}

void
SubmitToolOutputsRunRequest::setToolOutputs(std::list <SubmitToolOutputsRunRequest_tool_outputs_inner> tool_outputs)
{
	this->tool_outputs = tool_outputs;
}

bool
SubmitToolOutputsRunRequest::getStream()
{
	return stream;
}

void
SubmitToolOutputsRunRequest::setStream(bool  stream)
{
	this->stream = stream;
}


