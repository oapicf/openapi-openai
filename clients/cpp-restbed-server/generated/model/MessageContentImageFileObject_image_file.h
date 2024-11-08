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
 * MessageContentImageFileObject_image_file.h
 *
 * 
 */

#ifndef MessageContentImageFileObject_image_file_H_
#define MessageContentImageFileObject_image_file_H_



#include <string>
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
class  MessageContentImageFileObject_image_file 
{
public:
    MessageContentImageFileObject_image_file() = default;
    explicit MessageContentImageFileObject_image_file(boost::property_tree::ptree const& pt);
    virtual ~MessageContentImageFileObject_image_file() = default;

    MessageContentImageFileObject_image_file(const MessageContentImageFileObject_image_file& other) = default; // copy constructor
    MessageContentImageFileObject_image_file(MessageContentImageFileObject_image_file&& other) noexcept = default; // move constructor

    MessageContentImageFileObject_image_file& operator=(const MessageContentImageFileObject_image_file& other) = default; // copy assignment
    MessageContentImageFileObject_image_file& operator=(MessageContentImageFileObject_image_file&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// MessageContentImageFileObject_image_file members

    /// <summary>
    /// The [File](/docs/api-reference/files) ID of the image in the message content.
    /// </summary>
    std::string getFileId() const;
    void setFileId(std::string value);

protected:
    std::string m_File_id = "";
};

std::vector<MessageContentImageFileObject_image_file> createMessageContentImageFileObject_image_fileVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<MessageContentImageFileObject_image_file>(const MessageContentImageFileObject_image_file& val) {
    return val.toPropertyTree();
}

template<>
inline MessageContentImageFileObject_image_file fromPt<MessageContentImageFileObject_image_file>(const boost::property_tree::ptree& pt) {
    MessageContentImageFileObject_image_file ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* MessageContentImageFileObject_image_file_H_ */
