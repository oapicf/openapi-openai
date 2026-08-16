
/*
 * UsageVectorStoresResult.h
 *
 * The aggregated vector stores usage details of the specific time bucket.
 */

#ifndef TINY_CPP_CLIENT_UsageVectorStoresResult_H_
#define TINY_CPP_CLIENT_UsageVectorStoresResult_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The aggregated vector stores usage details of the specific time bucket.
 *
 *  \ingroup Models
 *
 */

class UsageVectorStoresResult{
public:

    /*! \brief Constructor.
	 */
    UsageVectorStoresResult();
    UsageVectorStoresResult(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UsageVectorStoresResult();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);
	/*! \brief Get The vector stores usage in bytes.
	 */
	int getUsageBytes();

	/*! \brief Set The vector stores usage in bytes.
	 */
	void setUsageBytes(int  usage_bytes);
	/*! \brief Get When `group_by=project_id`, this field provides the project ID of the grouped usage result.
	 */
	std::string getProjectId();

	/*! \brief Set When `group_by=project_id`, this field provides the project ID of the grouped usage result.
	 */
	void setProjectId(std::string  project_id);


    private:
    std::string object{};
    int usage_bytes{};
    std::string project_id{};
};
}

#endif /* TINY_CPP_CLIENT_UsageVectorStoresResult_H_ */
