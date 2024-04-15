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
 * MessageContentTextAnnotationsFilePathObject_file_path.h
 *
 * 
 */

#ifndef MessageContentTextAnnotationsFilePathObject_file_path_H_
#define MessageContentTextAnnotationsFilePathObject_file_path_H_



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
class  MessageContentTextAnnotationsFilePathObject_file_path 
{
public:
    MessageContentTextAnnotationsFilePathObject_file_path() = default;
    explicit MessageContentTextAnnotationsFilePathObject_file_path(boost::property_tree::ptree const& pt);
    virtual ~MessageContentTextAnnotationsFilePathObject_file_path() = default;

    MessageContentTextAnnotationsFilePathObject_file_path(const MessageContentTextAnnotationsFilePathObject_file_path& other) = default; // copy constructor
    MessageContentTextAnnotationsFilePathObject_file_path(MessageContentTextAnnotationsFilePathObject_file_path&& other) noexcept = default; // move constructor

    MessageContentTextAnnotationsFilePathObject_file_path& operator=(const MessageContentTextAnnotationsFilePathObject_file_path& other) = default; // copy assignment
    MessageContentTextAnnotationsFilePathObject_file_path& operator=(MessageContentTextAnnotationsFilePathObject_file_path&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// MessageContentTextAnnotationsFilePathObject_file_path members

    /// <summary>
    /// The ID of the file that was generated.
    /// </summary>
    std::string getFileId() const;
    void setFileId(std::string value);

protected:
    std::string m_File_id = "";
};

std::vector<MessageContentTextAnnotationsFilePathObject_file_path> createMessageContentTextAnnotationsFilePathObject_file_pathVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<MessageContentTextAnnotationsFilePathObject_file_path>(const MessageContentTextAnnotationsFilePathObject_file_path& val) {
    return val.toPropertyTree();
}

template<>
inline MessageContentTextAnnotationsFilePathObject_file_path fromPt<MessageContentTextAnnotationsFilePathObject_file_path>(const boost::property_tree::ptree& pt) {
    MessageContentTextAnnotationsFilePathObject_file_path ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* MessageContentTextAnnotationsFilePathObject_file_path_H_ */