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
 * MessageContentTextAnnotationsFilePathObject.h
 *
 * A URL for the file that&#39;s generated when the assistant used the &#x60;code_interpreter&#x60; tool to generate a file.
 */

#ifndef MessageContentTextAnnotationsFilePathObject_H_
#define MessageContentTextAnnotationsFilePathObject_H_



#include <string>
#include "MessageContentTextAnnotationsFilePathObject_file_path.h"
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
/// A URL for the file that&#39;s generated when the assistant used the &#x60;code_interpreter&#x60; tool to generate a file.
/// </summary>
class  MessageContentTextAnnotationsFilePathObject 
{
public:
    MessageContentTextAnnotationsFilePathObject() = default;
    explicit MessageContentTextAnnotationsFilePathObject(boost::property_tree::ptree const& pt);
    virtual ~MessageContentTextAnnotationsFilePathObject() = default;

    MessageContentTextAnnotationsFilePathObject(const MessageContentTextAnnotationsFilePathObject& other) = default; // copy constructor
    MessageContentTextAnnotationsFilePathObject(MessageContentTextAnnotationsFilePathObject&& other) noexcept = default; // move constructor

    MessageContentTextAnnotationsFilePathObject& operator=(const MessageContentTextAnnotationsFilePathObject& other) = default; // copy assignment
    MessageContentTextAnnotationsFilePathObject& operator=(MessageContentTextAnnotationsFilePathObject&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// MessageContentTextAnnotationsFilePathObject members

    /// <summary>
    /// Always &#x60;file_path&#x60;.
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
    MessageContentTextAnnotationsFilePathObject_file_path getFilePath() const;
    void setFilePath(MessageContentTextAnnotationsFilePathObject_file_path value);

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
    MessageContentTextAnnotationsFilePathObject_file_path m_File_path;
    int32_t m_Start_index = 0;
    int32_t m_End_index = 0;
};

std::vector<MessageContentTextAnnotationsFilePathObject> createMessageContentTextAnnotationsFilePathObjectVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<MessageContentTextAnnotationsFilePathObject>(const MessageContentTextAnnotationsFilePathObject& val) {
    return val.toPropertyTree();
}

template<>
inline MessageContentTextAnnotationsFilePathObject fromPt<MessageContentTextAnnotationsFilePathObject>(const boost::property_tree::ptree& pt) {
    MessageContentTextAnnotationsFilePathObject ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* MessageContentTextAnnotationsFilePathObject_H_ */
