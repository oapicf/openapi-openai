

#include "AssistantToolsFileSearch_file_search.h"

using namespace Tiny;

AssistantToolsFileSearch_file_search::AssistantToolsFileSearch_file_search()
{
	max_num_results = int(0);
	ranking_options = FileSearchRankingOptions();
}

AssistantToolsFileSearch_file_search::AssistantToolsFileSearch_file_search(std::string jsonString)
{
	this->fromJson(jsonString);
}

AssistantToolsFileSearch_file_search::~AssistantToolsFileSearch_file_search()
{

}

void
AssistantToolsFileSearch_file_search::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *max_num_resultsKey = "max_num_results";

    if(object.has_key(max_num_resultsKey))
    {
        bourne::json value = object[max_num_resultsKey];



        jsonToValue(&max_num_results, value, "int");


    }

    const char *ranking_optionsKey = "ranking_options";

    if(object.has_key(ranking_optionsKey))
    {
        bourne::json value = object[ranking_optionsKey];




        FileSearchRankingOptions* obj = &ranking_options;
		obj->fromJson(value.dump());

    }


}

bourne::json
AssistantToolsFileSearch_file_search::toJson()
{
    bourne::json object = bourne::json::object();





    object["max_num_results"] = getMaxNumResults();







	object["ranking_options"] = getRankingOptions().toJson();


    return object;

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



