

#include "RunStepDetailsToolCallsFileSearchObject_file_search.h"

using namespace Tiny;

RunStepDetailsToolCallsFileSearchObject_file_search::RunStepDetailsToolCallsFileSearchObject_file_search()
{
	ranking_options = RunStepDetailsToolCallsFileSearchRankingOptionsObject();
	results = std::list<RunStepDetailsToolCallsFileSearchResultObject>();
}

RunStepDetailsToolCallsFileSearchObject_file_search::RunStepDetailsToolCallsFileSearchObject_file_search(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDetailsToolCallsFileSearchObject_file_search::~RunStepDetailsToolCallsFileSearchObject_file_search()
{

}

void
RunStepDetailsToolCallsFileSearchObject_file_search::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ranking_optionsKey = "ranking_options";

    if(object.has_key(ranking_optionsKey))
    {
        bourne::json value = object[ranking_optionsKey];




        RunStepDetailsToolCallsFileSearchRankingOptionsObject* obj = &ranking_options;
		obj->fromJson(value.dump());

    }

    const char *resultsKey = "results";

    if(object.has_key(resultsKey))
    {
        bourne::json value = object[resultsKey];


        std::list<RunStepDetailsToolCallsFileSearchResultObject> results_list;
        RunStepDetailsToolCallsFileSearchResultObject element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
RunStepDetailsToolCallsFileSearchObject_file_search::toJson()
{
    bourne::json object = bourne::json::object();






	object["ranking_options"] = getRankingOptions().toJson();




    std::list<RunStepDetailsToolCallsFileSearchResultObject> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        RunStepDetailsToolCallsFileSearchResultObject obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

RunStepDetailsToolCallsFileSearchRankingOptionsObject
RunStepDetailsToolCallsFileSearchObject_file_search::getRankingOptions()
{
	return ranking_options;
}

void
RunStepDetailsToolCallsFileSearchObject_file_search::setRankingOptions(RunStepDetailsToolCallsFileSearchRankingOptionsObject  ranking_options)
{
	this->ranking_options = ranking_options;
}

std::list<RunStepDetailsToolCallsFileSearchResultObject>
RunStepDetailsToolCallsFileSearchObject_file_search::getResults()
{
	return results;
}

void
RunStepDetailsToolCallsFileSearchObject_file_search::setResults(std::list <RunStepDetailsToolCallsFileSearchResultObject> results)
{
	this->results = results;
}



