/*
 * UsageVectorStoresResult.h
 *
 * The aggregated vector stores usage details of the specific time bucket.
 */

#ifndef _UsageVectorStoresResult_H_
#define _UsageVectorStoresResult_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The aggregated vector stores usage details of the specific time bucket.
 *
 *  \ingroup Models
 *
 */

class UsageVectorStoresResult : public Object {
public:
	/*! \brief Constructor.
	 */
	UsageVectorStoresResult();
	UsageVectorStoresResult(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UsageVectorStoresResult();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string object;
	int usage_bytes;
	std::string project_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UsageVectorStoresResult_H_ */
