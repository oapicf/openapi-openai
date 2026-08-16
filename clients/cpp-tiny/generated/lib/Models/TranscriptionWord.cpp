

#include "TranscriptionWord.h"

using namespace Tiny;

TranscriptionWord::TranscriptionWord()
{
	word = std::string();
	start = float(0);
	end = float(0);
}

TranscriptionWord::TranscriptionWord(std::string jsonString)
{
	this->fromJson(jsonString);
}

TranscriptionWord::~TranscriptionWord()
{

}

void
TranscriptionWord::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *wordKey = "word";

    if(object.has_key(wordKey))
    {
        bourne::json value = object[wordKey];



        jsonToValue(&word, value, "std::string");


    }

    const char *startKey = "start";

    if(object.has_key(startKey))
    {
        bourne::json value = object[startKey];



        jsonToValue(&start, value, "float");


    }

    const char *endKey = "end";

    if(object.has_key(endKey))
    {
        bourne::json value = object[endKey];



        jsonToValue(&end, value, "float");


    }


}

bourne::json
TranscriptionWord::toJson()
{
    bourne::json object = bourne::json::object();





    object["word"] = getWord();






    object["start"] = getStart();






    object["end"] = getEnd();



    return object;

}

std::string
TranscriptionWord::getWord()
{
	return word;
}

void
TranscriptionWord::setWord(std::string  word)
{
	this->word = word;
}

float
TranscriptionWord::getStart()
{
	return start;
}

void
TranscriptionWord::setStart(float  start)
{
	this->start = start;
}

float
TranscriptionWord::getEnd()
{
	return end;
}

void
TranscriptionWord::setEnd(float  end)
{
	this->end = end;
}



