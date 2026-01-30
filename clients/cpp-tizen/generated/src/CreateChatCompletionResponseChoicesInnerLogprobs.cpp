#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateChatCompletionResponse_choices_inner_logprobs.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateChatCompletionResponse_choices_inner_logprobs::CreateChatCompletionResponse_choices_inner_logprobs()
{
	//__init();
}

CreateChatCompletionResponse_choices_inner_logprobs::~CreateChatCompletionResponse_choices_inner_logprobs()
{
	//__cleanup();
}

void
CreateChatCompletionResponse_choices_inner_logprobs::__init()
{
	//new std::list()std::list> content;
	//new std::list()std::list> refusal;
}

void
CreateChatCompletionResponse_choices_inner_logprobs::__cleanup()
{
	//if(content != NULL) {
	//content.RemoveAll(true);
	//delete content;
	//content = NULL;
	//}
	//if(refusal != NULL) {
	//refusal.RemoveAll(true);
	//delete refusal;
	//refusal = NULL;
	//}
	//
}

void
CreateChatCompletionResponse_choices_inner_logprobs::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *contentKey = "content";
	node = json_object_get_member(pJsonObject, contentKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ChatCompletionTokenLogprob> new_list;
			ChatCompletionTokenLogprob inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ChatCompletionTokenLogprob")) {
					jsonToValue(&inst, temp_json, "ChatCompletionTokenLogprob", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			content = new_list;
		}
		
	}
	const gchar *refusalKey = "refusal";
	node = json_object_get_member(pJsonObject, refusalKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ChatCompletionTokenLogprob> new_list;
			ChatCompletionTokenLogprob inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ChatCompletionTokenLogprob")) {
					jsonToValue(&inst, temp_json, "ChatCompletionTokenLogprob", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			refusal = new_list;
		}
		
	}
}

CreateChatCompletionResponse_choices_inner_logprobs::CreateChatCompletionResponse_choices_inner_logprobs(char* json)
{
	this->fromJson(json);
}

char*
CreateChatCompletionResponse_choices_inner_logprobs::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ChatCompletionTokenLogprob")) {
		list<ChatCompletionTokenLogprob> new_list = static_cast<list <ChatCompletionTokenLogprob> > (getContent());
		node = converttoJson(&new_list, "ChatCompletionTokenLogprob", "array");
	} else {
		node = json_node_alloc();
		list<ChatCompletionTokenLogprob> new_list = static_cast<list <ChatCompletionTokenLogprob> > (getContent());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ChatCompletionTokenLogprob>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ChatCompletionTokenLogprob obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *contentKey = "content";
	json_object_set_member(pJsonObject, contentKey, node);
	if (isprimitive("ChatCompletionTokenLogprob")) {
		list<ChatCompletionTokenLogprob> new_list = static_cast<list <ChatCompletionTokenLogprob> > (getRefusal());
		node = converttoJson(&new_list, "ChatCompletionTokenLogprob", "array");
	} else {
		node = json_node_alloc();
		list<ChatCompletionTokenLogprob> new_list = static_cast<list <ChatCompletionTokenLogprob> > (getRefusal());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ChatCompletionTokenLogprob>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ChatCompletionTokenLogprob obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *refusalKey = "refusal";
	json_object_set_member(pJsonObject, refusalKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<ChatCompletionTokenLogprob>
CreateChatCompletionResponse_choices_inner_logprobs::getContent()
{
	return content;
}

void
CreateChatCompletionResponse_choices_inner_logprobs::setContent(std::list <ChatCompletionTokenLogprob> content)
{
	this->content = content;
}

std::list<ChatCompletionTokenLogprob>
CreateChatCompletionResponse_choices_inner_logprobs::getRefusal()
{
	return refusal;
}

void
CreateChatCompletionResponse_choices_inner_logprobs::setRefusal(std::list <ChatCompletionTokenLogprob> refusal)
{
	this->refusal = refusal;
}


