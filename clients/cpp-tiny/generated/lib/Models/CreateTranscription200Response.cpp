

#include "CreateTranscription_200_response.h"

using namespace Tiny;

CreateTranscription_200_response::CreateTranscription_200_response()
{
	text = std::string();
	language = std::string();
	duration = std::string();
	words = std::list<TranscriptionWord>();
	segments = std::list<TranscriptionSegment>();
}

CreateTranscription_200_response::CreateTranscription_200_response(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateTranscription_200_response::~CreateTranscription_200_response()
{

}

void
CreateTranscription_200_response::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *textKey = "text";

    if(object.has_key(textKey))
    {
        bourne::json value = object[textKey];



        jsonToValue(&text, value, "std::string");


    }

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
CreateTranscription_200_response::toJson()
{
    bourne::json object = bourne::json::object();





    object["text"] = getText();






    object["language"] = getLanguage();






    object["duration"] = getDuration();





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
CreateTranscription_200_response::getText()
{
	return text;
}

void
CreateTranscription_200_response::setText(std::string  text)
{
	this->text = text;
}

std::string
CreateTranscription_200_response::getLanguage()
{
	return language;
}

void
CreateTranscription_200_response::setLanguage(std::string  language)
{
	this->language = language;
}

std::string
CreateTranscription_200_response::getDuration()
{
	return duration;
}

void
CreateTranscription_200_response::setDuration(std::string  duration)
{
	this->duration = duration;
}

std::list<TranscriptionWord>
CreateTranscription_200_response::getWords()
{
	return words;
}

void
CreateTranscription_200_response::setWords(std::list <TranscriptionWord> words)
{
	this->words = words;
}

std::list<TranscriptionSegment>
CreateTranscription_200_response::getSegments()
{
	return segments;
}

void
CreateTranscription_200_response::setSegments(std::list <TranscriptionSegment> segments)
{
	this->segments = segments;
}



