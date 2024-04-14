/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OpenAIFile.h
 *
 * 
 */

#ifndef OpenAIFile_H_
#define OpenAIFile_H_



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
class  OpenAIFile 
{
public:
    OpenAIFile() = default;
    explicit OpenAIFile(boost::property_tree::ptree const& pt);
    virtual ~OpenAIFile() = default;

    OpenAIFile(const OpenAIFile& other) = default; // copy constructor
    OpenAIFile(OpenAIFile&& other) noexcept = default; // move constructor

    OpenAIFile& operator=(const OpenAIFile& other) = default; // copy assignment
    OpenAIFile& operator=(OpenAIFile&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// OpenAIFile members

    /// <summary>
    /// 
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getObject() const;
    void setObject(std::string value);

    /// <summary>
    /// 
    /// </summary>
    int32_t getBytes() const;
    void setBytes(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    int32_t getCreatedAt() const;
    void setCreatedAt(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    std::string getFilename() const;
    void setFilename(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getPurpose() const;
    void setPurpose(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getStatus() const;
    void setStatus(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getStatusDetails() const;
    void setStatusDetails(std::string value);

protected:
    std::string m_Id = "";
    std::string m_object = "";
    int32_t m_Bytes = 0;
    int32_t m_Created_at = 0;
    std::string m_Filename = "";
    std::string m_Purpose = "";
    std::string m_Status = "";
    std::string m_Status_details = std::string{};
};

std::vector<OpenAIFile> createOpenAIFileVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<OpenAIFile>(const OpenAIFile& val) {
    return val.toPropertyTree();
}

template<>
inline OpenAIFile fromPt<OpenAIFile>(const boost::property_tree::ptree& pt) {
    OpenAIFile ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* OpenAIFile_H_ */