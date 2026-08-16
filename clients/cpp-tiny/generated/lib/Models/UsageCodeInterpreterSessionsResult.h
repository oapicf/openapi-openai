
/*
 * UsageCodeInterpreterSessionsResult.h
 *
 * The aggregated code interpreter sessions usage details of the specific time bucket.
 */

#ifndef TINY_CPP_CLIENT_UsageCodeInterpreterSessionsResult_H_
#define TINY_CPP_CLIENT_UsageCodeInterpreterSessionsResult_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The aggregated code interpreter sessions usage details of the specific time bucket.
 *
 *  \ingroup Models
 *
 */

class UsageCodeInterpreterSessionsResult{
public:

    /*! \brief Constructor.
	 */
    UsageCodeInterpreterSessionsResult();
    UsageCodeInterpreterSessionsResult(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UsageCodeInterpreterSessionsResult();


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
    std::string object{};
    int sessions{};
    std::string project_id{};
};
}

#endif /* TINY_CPP_CLIENT_UsageCodeInterpreterSessionsResult_H_ */
