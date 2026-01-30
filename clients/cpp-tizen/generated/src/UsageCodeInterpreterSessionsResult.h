/*
 * UsageCodeInterpreterSessionsResult.h
 *
 * The aggregated code interpreter sessions usage details of the specific time bucket.
 */

#ifndef _UsageCodeInterpreterSessionsResult_H_
#define _UsageCodeInterpreterSessionsResult_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The aggregated code interpreter sessions usage details of the specific time bucket.
 *
 *  \ingroup Models
 *
 */

class UsageCodeInterpreterSessionsResult : public Object {
public:
	/*! \brief Constructor.
	 */
	UsageCodeInterpreterSessionsResult();
	UsageCodeInterpreterSessionsResult(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UsageCodeInterpreterSessionsResult();

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
	/*! \brief Get The number of code interpreter sessions.
	 */
	int getSessions();

	/*! \brief Set The number of code interpreter sessions.
	 */
	void setSessions(int  sessions);
	/*! \brief Get When `group_by=project_id`, this field provides the project ID of the grouped usage result.
	 */
	std::string getProjectId();

	/*! \brief Set When `group_by=project_id`, this field provides the project ID of the grouped usage result.
	 */
	void setProjectId(std::string  project_id);

private:
	std::string object;
	int sessions;
	std::string project_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UsageCodeInterpreterSessionsResult_H_ */
