

#include "FileSearchRankingOptions.h"

using namespace Tiny;

FileSearchRankingOptions::FileSearchRankingOptions()
{
	ranker = std::string();
	score_threshold = float(0);
}

FileSearchRankingOptions::FileSearchRankingOptions(std::string jsonString)
{
	this->fromJson(jsonString);
}

FileSearchRankingOptions::~FileSearchRankingOptions()
{

}

void
FileSearchRankingOptions::fromJson(std::string jsonObj)
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
FileSearchRankingOptions::toJson()
{
    bourne::json object = bourne::json::object();





    object["ranker"] = getRanker();






    object["score_threshold"] = getScoreThreshold();



    return object;

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

long
FileSearchRankingOptions::getScoreThreshold()
{
	return score_threshold;
}

void
FileSearchRankingOptions::setScoreThreshold(long  score_threshold)
{
	this->score_threshold = score_threshold;
}



