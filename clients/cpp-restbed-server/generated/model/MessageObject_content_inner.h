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
 * MessageObject_content_inner.h
 *
 * 
 */

#ifndef MessageObject_content_inner_H_
#define MessageObject_content_inner_H_



#include "MessageContentImageFileObject_image_file.h"
#include "MessageContentImageFileObject.h"
#include <string>
#include "MessageContentTextObject.h"
#include "MessageContentTextObject_text.h"
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "MessageContentImageFileObject.h"
#include "MessageContentTextObject.h"
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  MessageObject_content_inner : public MessageContentImageFileObject, public MessageContentTextObject
{
public:
    MessageObject_content_inner() = default;
    explicit MessageObject_content_inner(boost::property_tree::ptree const& pt);
    virtual ~MessageObject_content_inner() = default;

    MessageObject_content_inner(const MessageObject_content_inner& other) = default; // copy constructor
    MessageObject_content_inner(MessageObject_content_inner&& other) noexcept = default; // move constructor

    MessageObject_content_inner& operator=(const MessageObject_content_inner& other) = default; // copy assignment
    MessageObject_content_inner& operator=(MessageObject_content_inner&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// MessageObject_content_inner members

    /// <summary>
    /// Always &#x60;image_file&#x60;.
    /// </summary>
    std::string getType() const;
    void setType(std::string value);

    /// <summary>
    /// 
    /// </summary>
    MessageContentImageFileObject_image_file getImageFile() const;
    void setImageFile(MessageContentImageFileObject_image_file value);

    /// <summary>
    /// 
    /// </summary>
    MessageContentTextObject_text getText() const;
    void setText(MessageContentTextObject_text value);

protected:
    std::string m_Type = "";
    MessageContentImageFileObject_image_file m_Image_file;
    MessageContentTextObject_text m_Text;
};

std::vector<MessageObject_content_inner> createMessageObject_content_innerVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<MessageObject_content_inner>(const MessageObject_content_inner& val) {
    return val.toPropertyTree();
}

template<>
inline MessageObject_content_inner fromPt<MessageObject_content_inner>(const boost::property_tree::ptree& pt) {
    MessageObject_content_inner ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* MessageObject_content_inner_H_ */
