#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AssistantToolsFileSearch_file_search.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AssistantToolsFileSearch_file_search::AssistantToolsFileSearch_file_search()
{
	//__init();
}

AssistantToolsFileSearch_file_search::~AssistantToolsFileSearch_file_search()
{
	//__cleanup();
}

void
AssistantToolsFileSearch_file_search::__init()
{
	//max_num_results = int(0);
	//ranking_options = new FileSearchRankingOptions();
}

void
AssistantToolsFileSearch_file_search::__cleanup()
{
	//if(max_num_results != NULL) {
	//
	//delete max_num_results;
	//max_num_results = NULL;
	//}
	//if(ranking_options != NULL) {
	//
	//delete ranking_options;
	//ranking_options = NULL;
	//}
	//
}

void
AssistantToolsFileSearch_file_search::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *max_num_resultsKey = "max_num_results";
	node = json_object_get_member(pJsonObject, max_num_resultsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&max_num_results, node, "int", "");
		} else {
			
		}
	}
	const gchar *ranking_optionsKey = "ranking_options";
	node = json_object_get_member(pJsonObject, ranking_optionsKey);
	if (node !=NULL) {
	

		if (isprimitive("FileSearchRankingOptions")) {
			jsonToValue(&ranking_options, node, "FileSearchRankingOptions", "FileSearchRankingOptions");
		} else {
			
			FileSearchRankingOptions* obj = static_cast<FileSearchRankingOptions*> (&ranking_options);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AssistantToolsFileSearch_file_search::AssistantToolsFileSearch_file_search(char* json)
{
	this->fromJson(json);
}

char*
AssistantToolsFileSearch_file_search::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getMaxNumResults();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *max_num_resultsKey = "max_num_results";
	json_object_set_member(pJsonObject, max_num_resultsKey, node);
	if (isprimitive("FileSearchRankingOptions")) {
		FileSearchRankingOptions obj = getRankingOptions();
		node = converttoJson(&obj, "FileSearchRankingOptions", "");
	}
	else {
		
		FileSearchRankingOptions obj = static_cast<FileSearchRankingOptions> (getRankingOptions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ranking_optionsKey = "ranking_options";
	json_object_set_member(pJsonObject, ranking_optionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
AssistantToolsFileSearch_file_search::getMaxNumResults()
{
	return max_num_results;
}

void
AssistantToolsFileSearch_file_search::setMaxNumResults(int  max_num_results)
{
	this->max_num_results = max_num_results;
}

FileSearchRankingOptions
AssistantToolsFileSearch_file_search::getRankingOptions()
{
	return ranking_options;
}

void
AssistantToolsFileSearch_file_search::setRankingOptions(FileSearchRankingOptions  ranking_options)
{
	this->ranking_options = ranking_options;
}


