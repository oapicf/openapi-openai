#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ModifyAssistantRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ModifyAssistantRequest::ModifyAssistantRequest()
{
	//__init();
}

ModifyAssistantRequest::~ModifyAssistantRequest()
{
	//__cleanup();
}

void
ModifyAssistantRequest::__init()
{
	//model = std::string();
	//name = std::string();
	//description = std::string();
	//instructions = std::string();
	//new std::list()std::list> tools;
	//tool_resources = new ModifyAssistantRequest_tool_resources();
	//metadata = null;
	//temperature = double(0);
	//top_p = double(0);
	//response_format = new AssistantsApiResponseFormatOption();
}

void
ModifyAssistantRequest::__cleanup()
{
	//if(model != NULL) {
	//
	//delete model;
	//model = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(instructions != NULL) {
	//
	//delete instructions;
	//instructions = NULL;
	//}
	//if(tools != NULL) {
	//tools.RemoveAll(true);
	//delete tools;
	//tools = NULL;
	//}
	//if(tool_resources != NULL) {
	//
	//delete tool_resources;
	//tool_resources = NULL;
	//}
	//if(metadata != NULL) {
	//
	//delete metadata;
	//metadata = NULL;
	//}
	//if(temperature != NULL) {
	//
	//delete temperature;
	//temperature = NULL;
	//}
	//if(top_p != NULL) {
	//
	//delete top_p;
	//top_p = NULL;
	//}
	//if(response_format != NULL) {
	//
	//delete response_format;
	//response_format = NULL;
	//}
	//
}

void
ModifyAssistantRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *modelKey = "model";
	node = json_object_get_member(pJsonObject, modelKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&model, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *instructionsKey = "instructions";
	node = json_object_get_member(pJsonObject, instructionsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&instructions, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *toolsKey = "tools";
	node = json_object_get_member(pJsonObject, toolsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AssistantObject_tools_inner> new_list;
			AssistantObject_tools_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AssistantObject_tools_inner")) {
					jsonToValue(&inst, temp_json, "AssistantObject_tools_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			tools = new_list;
		}
		
	}
	const gchar *tool_resourcesKey = "tool_resources";
	node = json_object_get_member(pJsonObject, tool_resourcesKey);
	if (node !=NULL) {
	

		if (isprimitive("ModifyAssistantRequest_tool_resources")) {
			jsonToValue(&tool_resources, node, "ModifyAssistantRequest_tool_resources", "ModifyAssistantRequest_tool_resources");
		} else {
			
			ModifyAssistantRequest_tool_resources* obj = static_cast<ModifyAssistantRequest_tool_resources*> (&tool_resources);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *metadataKey = "metadata";
	node = json_object_get_member(pJsonObject, metadataKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&metadata, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&metadata);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *temperatureKey = "temperature";
	node = json_object_get_member(pJsonObject, temperatureKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&temperature, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&temperature);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *top_pKey = "top_p";
	node = json_object_get_member(pJsonObject, top_pKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&top_p, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&top_p);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *response_formatKey = "response_format";
	node = json_object_get_member(pJsonObject, response_formatKey);
	if (node !=NULL) {
	

		if (isprimitive("AssistantsApiResponseFormatOption")) {
			jsonToValue(&response_format, node, "AssistantsApiResponseFormatOption", "AssistantsApiResponseFormatOption");
		} else {
			
			AssistantsApiResponseFormatOption* obj = static_cast<AssistantsApiResponseFormatOption*> (&response_format);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ModifyAssistantRequest::ModifyAssistantRequest(char* json)
{
	this->fromJson(json);
}

char*
ModifyAssistantRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getModel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *modelKey = "model";
	json_object_set_member(pJsonObject, modelKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getInstructions();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *instructionsKey = "instructions";
	json_object_set_member(pJsonObject, instructionsKey, node);
	if (isprimitive("AssistantObject_tools_inner")) {
		list<AssistantObject_tools_inner> new_list = static_cast<list <AssistantObject_tools_inner> > (getTools());
		node = converttoJson(&new_list, "AssistantObject_tools_inner", "array");
	} else {
		node = json_node_alloc();
		list<AssistantObject_tools_inner> new_list = static_cast<list <AssistantObject_tools_inner> > (getTools());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AssistantObject_tools_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AssistantObject_tools_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *toolsKey = "tools";
	json_object_set_member(pJsonObject, toolsKey, node);
	if (isprimitive("ModifyAssistantRequest_tool_resources")) {
		ModifyAssistantRequest_tool_resources obj = getToolResources();
		node = converttoJson(&obj, "ModifyAssistantRequest_tool_resources", "");
	}
	else {
		
		ModifyAssistantRequest_tool_resources obj = static_cast<ModifyAssistantRequest_tool_resources> (getToolResources());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tool_resourcesKey = "tool_resources";
	json_object_set_member(pJsonObject, tool_resourcesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMetadata();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getMetadata());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *metadataKey = "metadata";
	json_object_set_member(pJsonObject, metadataKey, node);
	if (isprimitive("long long")) {
		long long obj = getTemperature();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getTemperature());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *temperatureKey = "temperature";
	json_object_set_member(pJsonObject, temperatureKey, node);
	if (isprimitive("long long")) {
		long long obj = getTopP();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getTopP());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *top_pKey = "top_p";
	json_object_set_member(pJsonObject, top_pKey, node);
	if (isprimitive("AssistantsApiResponseFormatOption")) {
		AssistantsApiResponseFormatOption obj = getResponseFormat();
		node = converttoJson(&obj, "AssistantsApiResponseFormatOption", "");
	}
	else {
		
		AssistantsApiResponseFormatOption obj = static_cast<AssistantsApiResponseFormatOption> (getResponseFormat());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *response_formatKey = "response_format";
	json_object_set_member(pJsonObject, response_formatKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ModifyAssistantRequest::getModel()
{
	return model;
}

void
ModifyAssistantRequest::setModel(std::string  model)
{
	this->model = model;
}

std::string
ModifyAssistantRequest::getName()
{
	return name;
}

void
ModifyAssistantRequest::setName(std::string  name)
{
	this->name = name;
}

std::string
ModifyAssistantRequest::getDescription()
{
	return description;
}

void
ModifyAssistantRequest::setDescription(std::string  description)
{
	this->description = description;
}

std::string
ModifyAssistantRequest::getInstructions()
{
	return instructions;
}

void
ModifyAssistantRequest::setInstructions(std::string  instructions)
{
	this->instructions = instructions;
}

std::list<AssistantObject_tools_inner>
ModifyAssistantRequest::getTools()
{
	return tools;
}

void
ModifyAssistantRequest::setTools(std::list <AssistantObject_tools_inner> tools)
{
	this->tools = tools;
}

ModifyAssistantRequest_tool_resources
ModifyAssistantRequest::getToolResources()
{
	return tool_resources;
}

void
ModifyAssistantRequest::setToolResources(ModifyAssistantRequest_tool_resources  tool_resources)
{
	this->tool_resources = tool_resources;
}

std::string
ModifyAssistantRequest::getMetadata()
{
	return metadata;
}

void
ModifyAssistantRequest::setMetadata(std::string  metadata)
{
	this->metadata = metadata;
}

long long
ModifyAssistantRequest::getTemperature()
{
	return temperature;
}

void
ModifyAssistantRequest::setTemperature(long long  temperature)
{
	this->temperature = temperature;
}

long long
ModifyAssistantRequest::getTopP()
{
	return top_p;
}

void
ModifyAssistantRequest::setTopP(long long  top_p)
{
	this->top_p = top_p;
}

AssistantsApiResponseFormatOption
ModifyAssistantRequest::getResponseFormat()
{
	return response_format;
}

void
ModifyAssistantRequest::setResponseFormat(AssistantsApiResponseFormatOption  response_format)
{
	this->response_format = response_format;
}


