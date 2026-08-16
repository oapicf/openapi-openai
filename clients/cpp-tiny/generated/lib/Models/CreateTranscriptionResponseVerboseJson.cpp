

#include "CreateTranscriptionResponseVerboseJson.h"

using namespace Tiny;

CreateTranscriptionResponseVerboseJson::CreateTranscriptionResponseVerboseJson()
{
	language = std::string();
	duration = std::string();
	text = std::string();
	words = std::list<TranscriptionWord>();
	segments = std::list<TranscriptionSegment>();
}

CreateTranscriptionResponseVerboseJson::CreateTranscriptionResponseVerboseJson(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateTranscriptionResponseVerboseJson::~CreateTranscriptionResponseVerboseJson()
{

}

void
CreateTranscriptionResponseVerboseJson::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *languageKey = "language";

    if(object.has_key(languageKey))
    {
        bourne::json value = object[languageKey];



        jsonToValue(&language, value, "std::string");


    }

    const char *durationKey = "duration";

    if(object.has_key(durationKey))
    {
        bourne::json value = object[durationKey];



        jsonToValue(&duration, value, "std::string");


    }

    const char *textKey = "text";

    if(object.has_key(textKey))
    {
        bourne::json value = object[textKey];



        jsonToValue(&text, value, "std::string");


    }

    const char *wordsKey = "words";

    if(object.has_key(wordsKey))
    {
        bourne::json value = object[wordsKey];


        std::list<TranscriptionWord> words_list;
        TranscriptionWord element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            words_list.push_back(element);
        }
        words = words_list;


    }

    const char *segmentsKey = "segments";

    if(object.has_key(segmentsKey))
    {
        bourne::json value = object[segmentsKey];


        std::list<TranscriptionSegment> segments_list;
        TranscriptionSegment element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            segments_list.push_back(element);
        }
        segments = segments_list;


    }


}

bourne::json
CreateTranscriptionResponseVerboseJson::toJson()
{
    bourne::json object = bourne::json::object();





    object["language"] = getLanguage();






    object["duration"] = getDuration();






    object["text"] = getText();





    std::list<TranscriptionWord> words_list = getWords();
    bourne::json words_arr = bourne::json::array();

    for(auto& var : words_list)
    {
        TranscriptionWord obj = var;
        words_arr.append(obj.toJson());
    }
    object["words"] = words_arr;






    std::list<TranscriptionSegment> segments_list = getSegments();
    bourne::json segments_arr = bourne::json::array();

    for(auto& var : segments_list)
    {
        TranscriptionSegment obj = var;
        segments_arr.append(obj.toJson());
    }
    object["segments"] = segments_arr;




    return object;

}

std::string
CreateTranscriptionResponseVerboseJson::getLanguage()
{
	return language;
}

void
CreateTranscriptionResponseVerboseJson::setLanguage(std::string  language)
{
	this->language = language;
}

std::string
CreateTranscriptionResponseVerboseJson::getDuration()
{
	return duration;
}

void
CreateTranscriptionResponseVerboseJson::setDuration(std::string  duration)
{
	this->duration = duration;
}

std::string
CreateTranscriptionResponseVerboseJson::getText()
{
	return text;
}

void
CreateTranscriptionResponseVerboseJson::setText(std::string  text)
{
	this->text = text;
}

std::list<TranscriptionWord>
CreateTranscriptionResponseVerboseJson::getWords()
{
	return words;
}

void
CreateTranscriptionResponseVerboseJson::setWords(std::list <TranscriptionWord> words)
{
	this->words = words;
}

std::list<TranscriptionSegment>
CreateTranscriptionResponseVerboseJson::getSegments()
{
	return segments;
}

void
CreateTranscriptionResponseVerboseJson::setSegments(std::list <TranscriptionSegment> segments)
{
	this->segments = segments;
}



