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
 * DeleteFileResponse.h
 *
 * 
 */

#ifndef DeleteFileResponse_H_
#define DeleteFileResponse_H_



#include <string>
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
/// 
/// </summary>
class  DeleteFileResponse 
{
public:
    DeleteFileResponse() = default;
    explicit DeleteFileResponse(boost::property_tree::ptree const& pt);
    virtual ~DeleteFileResponse() = default;

    DeleteFileResponse(const DeleteFileResponse& other) = default; // copy constructor
    DeleteFileResponse(DeleteFileResponse&& other) noexcept = default; // move constructor

    DeleteFileResponse& operator=(const DeleteFileResponse& other) = default; // copy assignment
    DeleteFileResponse& operator=(DeleteFileResponse&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// DeleteFileResponse members

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
    bool isDeleted() const;
    void setDeleted(bool value);

protected:
    std::string m_Id = "";
    std::string m_object = "";
    bool m_Deleted = false;
};

std::vector<DeleteFileResponse> createDeleteFileResponseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<DeleteFileResponse>(const DeleteFileResponse& val) {
    return val.toPropertyTree();
}

template<>
inline DeleteFileResponse fromPt<DeleteFileResponse>(const boost::property_tree::ptree& pt) {
    DeleteFileResponse ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* DeleteFileResponse_H_ */
