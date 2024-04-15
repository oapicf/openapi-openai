/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/CreateTranscriptionResponseVerboseJson.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CreateTranscriptionResponseVerboseJson::CreateTranscriptionResponseVerboseJson()
{
    m_Language = utility::conversions::to_string_t("");
    m_LanguageIsSet = false;
    m_Duration = utility::conversions::to_string_t("");
    m_DurationIsSet = false;
    m_Text = utility::conversions::to_string_t("");
    m_TextIsSet = false;
    m_WordsIsSet = false;
    m_SegmentsIsSet = false;
}

CreateTranscriptionResponseVerboseJson::~CreateTranscriptionResponseVerboseJson()
{
}

void CreateTranscriptionResponseVerboseJson::validate()
{
    // TODO: implement validation
}

web::json::value CreateTranscriptionResponseVerboseJson::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_LanguageIsSet)
    {
        val[utility::conversions::to_string_t(U("language"))] = ModelBase::toJson(m_Language);
    }
    if(m_DurationIsSet)
    {
        val[utility::conversions::to_string_t(U("duration"))] = ModelBase::toJson(m_Duration);
    }
    if(m_TextIsSet)
    {
        val[utility::conversions::to_string_t(U("text"))] = ModelBase::toJson(m_Text);
    }
    if(m_WordsIsSet)
    {
        val[utility::conversions::to_string_t(U("words"))] = ModelBase::toJson(m_Words);
    }
    if(m_SegmentsIsSet)
    {
        val[utility::conversions::to_string_t(U("segments"))] = ModelBase::toJson(m_Segments);
    }

    return val;
}

bool CreateTranscriptionResponseVerboseJson::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("language"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("language")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setLanguage;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLanguage);
            setLanguage(refVal_setLanguage);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("duration"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("duration")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setDuration;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDuration);
            setDuration(refVal_setDuration);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("text"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("text")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setText;
            ok &= ModelBase::fromJson(fieldValue, refVal_setText);
            setText(refVal_setText);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("words"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("words")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<TranscriptionWord>> refVal_setWords;
            ok &= ModelBase::fromJson(fieldValue, refVal_setWords);
            setWords(refVal_setWords);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("segments"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("segments")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<TranscriptionSegment>> refVal_setSegments;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSegments);
            setSegments(refVal_setSegments);
        }
    }
    return ok;
}

void CreateTranscriptionResponseVerboseJson::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_LanguageIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("language")), m_Language));
    }
    if(m_DurationIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("duration")), m_Duration));
    }
    if(m_TextIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("text")), m_Text));
    }
    if(m_WordsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("words")), m_Words));
    }
    if(m_SegmentsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("segments")), m_Segments));
    }
}

bool CreateTranscriptionResponseVerboseJson::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("language"))))
    {
        utility::string_t refVal_setLanguage;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("language"))), refVal_setLanguage );
        setLanguage(refVal_setLanguage);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("duration"))))
    {
        utility::string_t refVal_setDuration;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("duration"))), refVal_setDuration );
        setDuration(refVal_setDuration);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("text"))))
    {
        utility::string_t refVal_setText;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("text"))), refVal_setText );
        setText(refVal_setText);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("words"))))
    {
        std::vector<std::shared_ptr<TranscriptionWord>> refVal_setWords;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("words"))), refVal_setWords );
        setWords(refVal_setWords);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("segments"))))
    {
        std::vector<std::shared_ptr<TranscriptionSegment>> refVal_setSegments;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("segments"))), refVal_setSegments );
        setSegments(refVal_setSegments);
    }
    return ok;
}

utility::string_t CreateTranscriptionResponseVerboseJson::getLanguage() const
{
    return m_Language;
}

void CreateTranscriptionResponseVerboseJson::setLanguage(const utility::string_t& value)
{
    m_Language = value;
    m_LanguageIsSet = true;
}

bool CreateTranscriptionResponseVerboseJson::languageIsSet() const
{
    return m_LanguageIsSet;
}

void CreateTranscriptionResponseVerboseJson::unsetLanguage()
{
    m_LanguageIsSet = false;
}
utility::string_t CreateTranscriptionResponseVerboseJson::getDuration() const
{
    return m_Duration;
}

void CreateTranscriptionResponseVerboseJson::setDuration(const utility::string_t& value)
{
    m_Duration = value;
    m_DurationIsSet = true;
}

bool CreateTranscriptionResponseVerboseJson::durationIsSet() const
{
    return m_DurationIsSet;
}

void CreateTranscriptionResponseVerboseJson::unsetDuration()
{
    m_DurationIsSet = false;
}
utility::string_t CreateTranscriptionResponseVerboseJson::getText() const
{
    return m_Text;
}

void CreateTranscriptionResponseVerboseJson::setText(const utility::string_t& value)
{
    m_Text = value;
    m_TextIsSet = true;
}

bool CreateTranscriptionResponseVerboseJson::textIsSet() const
{
    return m_TextIsSet;
}

void CreateTranscriptionResponseVerboseJson::unsetText()
{
    m_TextIsSet = false;
}
std::vector<std::shared_ptr<TranscriptionWord>>& CreateTranscriptionResponseVerboseJson::getWords()
{
    return m_Words;
}

void CreateTranscriptionResponseVerboseJson::setWords(const std::vector<std::shared_ptr<TranscriptionWord>>& value)
{
    m_Words = value;
    m_WordsIsSet = true;
}

bool CreateTranscriptionResponseVerboseJson::wordsIsSet() const
{
    return m_WordsIsSet;
}

void CreateTranscriptionResponseVerboseJson::unsetWords()
{
    m_WordsIsSet = false;
}
std::vector<std::shared_ptr<TranscriptionSegment>>& CreateTranscriptionResponseVerboseJson::getSegments()
{
    return m_Segments;
}

void CreateTranscriptionResponseVerboseJson::setSegments(const std::vector<std::shared_ptr<TranscriptionSegment>>& value)
{
    m_Segments = value;
    m_SegmentsIsSet = true;
}

bool CreateTranscriptionResponseVerboseJson::segmentsIsSet() const
{
    return m_SegmentsIsSet;
}

void CreateTranscriptionResponseVerboseJson::unsetSegments()
{
    m_SegmentsIsSet = false;
}
}
}
}
}

