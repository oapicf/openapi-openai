#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FileSearchRankingOptions.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FileSearchRankingOptions::FileSearchRankingOptions()
{
	//__init();
}

FileSearchRankingOptions::~FileSearchRankingOptions()
{
	//__cleanup();
}

void
FileSearchRankingOptions::__init()
{
	//ranker = std::string();
	//score_threshold = double(0);
}

void
FileSearchRankingOptions::__cleanup()
{
	//if(ranker != NULL) {
	//
	//delete ranker;
	//ranker = NULL;
	//}
	//if(score_threshold != NULL) {
	//
	//delete score_threshold;
	//score_threshold = NULL;
	//}
	//
}

void
FileSearchRankingOptions::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *rankerKey = "ranker";
	node = json_object_get_member(pJsonObject, rankerKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ranker, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *score_thresholdKey = "score_threshold";
	node = json_object_get_member(pJsonObject, score_thresholdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&score_threshold, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&score_threshold);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

FileSearchRankingOptions::FileSearchRankingOptions(char* json)
{
	this->fromJson(json);
}

char*
FileSearchRankingOptions::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getRanker();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *rankerKey = "ranker";
	json_object_set_member(pJsonObject, rankerKey, node);
	if (isprimitive("long long")) {
		long long obj = getScoreThreshold();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getScoreThreshold());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *score_thresholdKey = "score_threshold";
	json_object_set_member(pJsonObject, score_thresholdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
FileSearchRankingOptions::getRanker()
{
	return ranker;
}

void
FileSearchRankingOptions::setRanker(std::string  ranker)
{
	this->ranker = ranker;
}

long long
FileSearchRankingOptions::getScoreThreshold()
{
	return score_threshold;
}

void
FileSearchRankingOptions::setScoreThreshold(long long  score_threshold)
{
	this->score_threshold = score_threshold;
}


