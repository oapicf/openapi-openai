

#include "CreateTranslationResponseVerboseJson.h"

using namespace Tiny;

CreateTranslationResponseVerboseJson::CreateTranslationResponseVerboseJson()
{
	language = std::string();
	duration = std::string();
	text = std::string();
	segments = std::list<TranscriptionSegment>();
}

CreateTranslationResponseVerboseJson::CreateTranslationResponseVerboseJson(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateTranslationResponseVerboseJson::~CreateTranslationResponseVerboseJson()
{

}

void
CreateTranslationResponseVerboseJson::fromJson(std::string jsonObj)
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
CreateTranslationResponseVerboseJson::toJson()
{
    bourne::json object = bourne::json::object();





    object["language"] = getLanguage();






    object["duration"] = getDuration();






    object["text"] = getText();





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
CreateTranslationResponseVerboseJson::getLanguage()
{
	return language;
}

void
CreateTranslationResponseVerboseJson::setLanguage(std::string  language)
{
	this->language = language;
}

std::string
CreateTranslationResponseVerboseJson::getDuration()
{
	return duration;
}

void
CreateTranslationResponseVerboseJson::setDuration(std::string  duration)
{
	this->duration = duration;
}

std::string
CreateTranslationResponseVerboseJson::getText()
{
	return text;
}

void
CreateTranslationResponseVerboseJson::setText(std::string  text)
{
	this->text = text;
}

std::list<TranscriptionSegment>
CreateTranslationResponseVerboseJson::getSegments()
{
	return segments;
}

void
CreateTranslationResponseVerboseJson::setSegments(std::list <TranscriptionSegment> segments)
{
	this->segments = segments;
}



