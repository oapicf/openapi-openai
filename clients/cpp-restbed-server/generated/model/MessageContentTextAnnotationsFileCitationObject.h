/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * MessageContentTextAnnotationsFileCitationObject.h
 *
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;retrieval\&quot; tool to search files.
 */

#ifndef MessageContentTextAnnotationsFileCitationObject_H_
#define MessageContentTextAnnotationsFileCitationObject_H_



#include <string>
#include "MessageContentTextAnnotationsFileCitationObject_file_citation.h"
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;retrieval\&quot; tool to search files.
/// </summary>
class  MessageContentTextAnnotationsFileCitationObject 
{
public:
    MessageContentTextAnnotationsFileCitationObject() = default;
    explicit MessageContentTextAnnotationsFileCitationObject(boost::property_tree::ptree const& pt);
    virtual ~MessageContentTextAnnotationsFileCitationObject() = default;

    MessageContentTextAnnotationsFileCitationObject(const MessageContentTextAnnotationsFileCitationObject& other) = default; // copy constructor
    MessageContentTextAnnotationsFileCitationObject(MessageContentTextAnnotationsFileCitationObject&& other) noexcept = default; // move constructor

    MessageContentTextAnnotationsFileCitationObject& operator=(const MessageContentTextAnnotationsFileCitationObject& other) = default; // copy assignment
    MessageContentTextAnnotationsFileCitationObject& operator=(MessageContentTextAnnotationsFileCitationObject&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// MessageContentTextAnnotationsFileCitationObject members

    /// <summary>
    /// Always &#x60;file_citation&#x60;.
    /// </summary>
    std::string getType() const;
    void setType(std::string value);

    /// <summary>
    /// The text in the message content that needs to be replaced.
    /// </summary>
    std::string getText() const;
    void setText(std::string value);

    /// <summary>
    /// 
    /// </summary>
    MessageContentTextAnnotationsFileCitationObject_file_citation getFileCitation() const;
    void setFileCitation(MessageContentTextAnnotationsFileCitationObject_file_citation value);

    /// <summary>
    /// 
    /// </summary>
    int32_t getStartIndex() const;
    void setStartIndex(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    int32_t getEndIndex() const;
    void setEndIndex(int32_t value);

protected:
    std::string m_Type = "";
    std::string m_Text = "";
    MessageContentTextAnnotationsFileCitationObject_file_citation m_File_citation;
    int32_t m_Start_index = 0;
    int32_t m_End_index = 0;
};

std::vector<MessageContentTextAnnotationsFileCitationObject> createMessageContentTextAnnotationsFileCitationObjectVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<MessageContentTextAnnotationsFileCitationObject>(const MessageContentTextAnnotationsFileCitationObject& val) {
    return val.toPropertyTree();
}

template<>
inline MessageContentTextAnnotationsFileCitationObject fromPt<MessageContentTextAnnotationsFileCitationObject>(const boost::property_tree::ptree& pt) {
    MessageContentTextAnnotationsFileCitationObject ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* MessageContentTextAnnotationsFileCitationObject_H_ */
