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

/*
 * MessageDeltaContentTextObject_text.h
 *
 * 
 */

#ifndef MessageDeltaContentTextObject_text_H_
#define MessageDeltaContentTextObject_text_H_



#include <string>
#include "MessageDeltaContentTextObject_text_annotations_inner.h"
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  MessageDeltaContentTextObject_text 
{
public:
    MessageDeltaContentTextObject_text() = default;
    explicit MessageDeltaContentTextObject_text(boost::property_tree::ptree const& pt);
    virtual ~MessageDeltaContentTextObject_text() = default;

    MessageDeltaContentTextObject_text(const MessageDeltaContentTextObject_text& other) = default; // copy constructor
    MessageDeltaContentTextObject_text(MessageDeltaContentTextObject_text&& other) noexcept = default; // move constructor

    MessageDeltaContentTextObject_text& operator=(const MessageDeltaContentTextObject_text& other) = default; // copy assignment
    MessageDeltaContentTextObject_text& operator=(MessageDeltaContentTextObject_text&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// MessageDeltaContentTextObject_text members

    /// <summary>
    /// The data that makes up the text.
    /// </summary>
    std::string getValue() const;
    void setValue(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::vector<MessageDeltaContentTextObject_text_annotations_inner> getAnnotations() const;
    void setAnnotations(std::vector<MessageDeltaContentTextObject_text_annotations_inner> value);

protected:
    std::string m_Value = "";
    std::vector<MessageDeltaContentTextObject_text_annotations_inner> m_Annotations;
};

std::vector<MessageDeltaContentTextObject_text> createMessageDeltaContentTextObject_textVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<MessageDeltaContentTextObject_text>(const MessageDeltaContentTextObject_text& val) {
    return val.toPropertyTree();
}

template<>
inline MessageDeltaContentTextObject_text fromPt<MessageDeltaContentTextObject_text>(const boost::property_tree::ptree& pt) {
    MessageDeltaContentTextObject_text ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* MessageDeltaContentTextObject_text_H_ */
