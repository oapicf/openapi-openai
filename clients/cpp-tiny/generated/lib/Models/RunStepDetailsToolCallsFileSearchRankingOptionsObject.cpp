

#include "RunStepDetailsToolCallsFileSearchRankingOptionsObject.h"

using namespace Tiny;

RunStepDetailsToolCallsFileSearchRankingOptionsObject::RunStepDetailsToolCallsFileSearchRankingOptionsObject()
{
	ranker = std::string();
	score_threshold = float(0);
}

RunStepDetailsToolCallsFileSearchRankingOptionsObject::RunStepDetailsToolCallsFileSearchRankingOptionsObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDetailsToolCallsFileSearchRankingOptionsObject::~RunStepDetailsToolCallsFileSearchRankingOptionsObject()
{

}

void
RunStepDetailsToolCallsFileSearchRankingOptionsObject::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *rankerKey = "ranker";

    if(object.has_key(rankerKey))
    {
        bourne::json value = object[rankerKey];



        jsonToValue(&ranker, value, "std::string");


    }

    const char *score_thresholdKey = "score_threshold";

    if(object.has_key(score_thresholdKey))
    {
        bourne::json value = object[score_thresholdKey];



        jsonToValue(&score_threshold, value, "long");


    }


}

bourne::json
RunStepDetailsToolCallsFileSearchRankingOptionsObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["ranker"] = getRanker();






    object["score_threshold"] = getScoreThreshold();



    return object;

}

std::string
RunStepDetailsToolCallsFileSearchRankingOptionsObject::getRanker()
{
	return ranker;
}

void
RunStepDetailsToolCallsFileSearchRankingOptionsObject::setRanker(std::string  ranker)
{
	this->ranker = ranker;
}

long
RunStepDetailsToolCallsFileSearchRankingOptionsObject::getScoreThreshold()
{
	return score_threshold;
}

void
RunStepDetailsToolCallsFileSearchRankingOptionsObject::setScoreThreshold(long  score_threshold)
{
	this->score_threshold = score_threshold;
}



